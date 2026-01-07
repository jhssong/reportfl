{
  "filepath": "/tmp/Math-21b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java",
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
      "end_line": 1348,
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
      "begin_line": 275,
      "end_line": 283,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 280,col 9)-(line 282,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 300,
      "end_line": 315,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 23)",
        "(line 306,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 307,col 84)",
        "(line 308,col 9)-(line 308,col 43)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 39)",
        "(line 311,col 9)-(line 311,col 41)",
        "(line 312,col 9)-(line 312,col 53)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 314,col 9)-(line 314,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 346,
      "end_line": 491,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 26)",
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 351,col 61)",
        "(line 352,col 9)-(line 352,col 62)",
        "(line 354,col 9)-(line 354,col 33)",
        "(line 355,col 9)-(line 355,col 29)",
        "(line 356,col 9)-(line 356,col 23)",
        "(line 357,col 9)-(line 357,col 47)",
        "(line 358,col 9)-(line 358,col 40)",
        "(line 359,col 9)-(line 360,col 53)",
        "(line 361,col 9)-(line 361,col 41)",
        "(line 365,col 9)-(line 489,col 13)",
        "(line 490,col 9)-(line 490,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 496,
      "end_line": 551,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 46)",
        "(line 498,col 9)-(line 498,col 44)",
        "(line 499,col 9)-(line 499,col 44)",
        "(line 502,col 9)-(line 502,col 40)",
        "(line 503,col 9)-(line 509,col 9)",
        "(line 511,col 9)-(line 511,col 42)",
        "(line 512,col 9)-(line 534,col 9)",
        "(line 536,col 9)-(line 550,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 558,
      "end_line": 625,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 561,col 9)",
        "(line 563,col 9)-(line 563,col 60)",
        "(line 564,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 73)",
        "(line 569,col 9)-(line 569,col 29)",
        "(line 572,col 9)-(line 572,col 40)",
        "(line 573,col 9)-(line 573,col 40)",
        "(line 574,col 9)-(line 574,col 27)",
        "(line 575,col 9)-(line 575,col 31)",
        "(line 578,col 9)-(line 578,col 24)",
        "(line 579,col 9)-(line 579,col 36)",
        "(line 580,col 9)-(line 580,col 80)",
        "(line 581,col 9)-(line 581,col 24)",
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 588,col 52)",
        "(line 589,col 9)-(line 589,col 36)",
        "(line 592,col 9)-(line 593,col 58)",
        "(line 594,col 9)-(line 594,col 53)",
        "(line 595,col 9)-(line 599,col 47)",
        "(line 600,col 9)-(line 600,col 69)",
        "(line 601,col 9)-(line 602,col 63)",
        "(line 603,col 9)-(line 603,col 63)",
        "(line 604,col 9)-(line 604,col 73)",
        "(line 605,col 9)-(line 606,col 81)",
        "(line 608,col 9)-(line 608,col 58)",
        "(line 610,col 9)-(line 610,col 51)",
        "(line 611,col 9)-(line 611,col 30)",
        "(line 612,col 9)-(line 612,col 33)",
        "(line 613,col 9)-(line 613,col 33)",
        "(line 614,col 9)-(line 614,col 39)",
        "(line 616,col 9)-(line 616,col 38)",
        "(line 617,col 9)-(line 617,col 31)",
        "(line 618,col 9)-(line 618,col 63)",
        "(line 619,col 9)-(line 619,col 64)",
        "(line 620,col 9)-(line 620,col 65)",
        "(line 621,col 9)-(line 621,col 49)",
        "(line 622,col 9)-(line 624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 635,
      "end_line": 649,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 638,col 60)",
        "(line 639,col 9)-(line 639,col 39)",
        "(line 640,col 9)-(line 642,col 51)",
        "(line 643,col 9)-(line 643,col 40)",
        "(line 644,col 9)-(line 647,col 9)",
        "(line 648,col 9)-(line 648,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 659,
      "end_line": 679,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 61)",
        "(line 664,col 9)-(line 664,col 44)",
        "(line 665,col 9)-(line 670,col 52)",
        "(line 671,col 9)-(line 671,col 28)",
        "(line 672,col 9)-(line 678,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 692,
      "end_line": 758,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 27)",
        "(line 695,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 765,
      "end_line": 794,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(double[], double)",
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 815,
      "end_line": 826,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 60)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 820,col 9)-(line 820,col 25)",
        "(line 821,col 9)-(line 821,col 48)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 825,col 9)-(line 825,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 832,
      "end_line": 875,
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
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
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 848,
      "end_line": 850,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 853,
      "end_line": 866,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 13)-(line 858,col 13)",
        "(line 860,col 13)-(line 862,col 13)",
        "(line 864,col 13)-(line 864,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 869,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 871,col 13)-(line 871,col 55)",
        "(line 872,col 13)-(line 872,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 882,
      "end_line": 1005,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 884,
      "end_line": 884,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 889,
      "end_line": 889,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 893,
      "end_line": 896,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 894,col 13)-(line 894,col 29)",
        "(line 895,col 13)-(line 895,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 902,
      "end_line": 912,
      "comment": "\n         * @param x Original objective variables.\n         * @return the normalized objective variables.\n         ",
      "child_ranges": [
        "(line 903,col 13)-(line 905,col 13)",
        "(line 906,col 13)-(line 906,col 48)",
        "(line 907,col 13)-(line 910,col 13)",
        "(line 911,col 13)-(line 911,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 918,
      "end_line": 928,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the original objective variables.\n         ",
      "child_ranges": [
        "(line 919,col 13)-(line 921,col 13)",
        "(line 922,col 13)-(line 922,col 48)",
        "(line 923,col 13)-(line 926,col 13)",
        "(line 927,col 13)-(line 927,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 934,
      "end_line": 946,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 935,col 13)-(line 935,col 25)",
        "(line 936,col 13)-(line 944,col 13)",
        "(line 945,col 13)-(line 945,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 952,
      "end_line": 965,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 953,col 13)-(line 955,col 13)",
        "(line 956,col 13)-(line 963,col 13)",
        "(line 964,col 13)-(line 964,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 970,
      "end_line": 972,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 971,col 13)-(line 971,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 978,
      "end_line": 990,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 979,col 13)-(line 979,col 53)",
        "(line 980,col 13)-(line 988,col 13)",
        "(line 989,col 13)-(line 989,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 997,
      "end_line": 1004,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 998,col 13)-(line 998,col 31)",
        "(line 999,col 13)-(line 1002,col 13)",
        "(line 1003,col 13)-(line 1003,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1013,
      "end_line": 1021,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 79)",
        "(line 1015,col 9)-(line 1019,col 9)",
        "(line 1020,col 9)-(line 1020,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1028,
      "end_line": 1036,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 79)",
        "(line 1030,col 9)-(line 1034,col 9)",
        "(line 1035,col 9)-(line 1035,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1042,
      "end_line": 1051,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1043,col 9)-(line 1043,col 79)",
        "(line 1044,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1058,
      "end_line": 1066,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 79)",
        "(line 1060,col 9)-(line 1064,col 9)",
        "(line 1065,col 9)-(line 1065,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1073,
      "end_line": 1081,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 79)",
        "(line 1075,col 9)-(line 1079,col 9)",
        "(line 1080,col 9)-(line 1080,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1088,
      "end_line": 1096,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1089,col 68)",
        "(line 1090,col 9)-(line 1094,col 9)",
        "(line 1095,col 9)-(line 1095,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1103,
      "end_line": 1111,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1104,col 9)-(line 1104,col 79)",
        "(line 1105,col 9)-(line 1109,col 9)",
        "(line 1110,col 9)-(line 1110,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1117,
      "end_line": 1127,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1118,col 9)-(line 1118,col 61)",
        "(line 1119,col 9)-(line 1125,col 9)",
        "(line 1126,col 9)-(line 1126,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1134,
      "end_line": 1148,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1135,col 9)-(line 1147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1158,
      "end_line": 1162,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix 1.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1159,col 9)-(line 1161,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1169,
      "end_line": 1175,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 40)",
        "(line 1171,col 9)-(line 1173,col 9)",
        "(line 1174,col 9)-(line 1174,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1182,
      "end_line": 1190,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1183,col 9)-(line 1183,col 40)",
        "(line 1184,col 9)-(line 1188,col 9)",
        "(line 1189,col 9)-(line 1189,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1197,
      "end_line": 1199,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1207,
      "end_line": 1217,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1208,col 9)-(line 1208,col 39)",
        "(line 1209,col 9)-(line 1209,col 42)",
        "(line 1210,col 9)-(line 1210,col 50)",
        "(line 1211,col 9)-(line 1215,col 9)",
        "(line 1216,col 9)-(line 1216,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1225,
      "end_line": 1234,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1226,col 9)-(line 1226,col 52)",
        "(line 1227,col 9)-(line 1227,col 43)",
        "(line 1228,col 9)-(line 1228,col 29)",
        "(line 1229,col 9)-(line 1232,col 9)",
        "(line 1233,col 9)-(line 1233,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1240,
      "end_line": 1251,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1241,col 9)-(line 1241,col 39)",
        "(line 1242,col 9)-(line 1249,col 9)",
        "(line 1250,col 9)-(line 1250,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1257,
      "end_line": 1268,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 38)",
        "(line 1259,col 9)-(line 1266,col 9)",
        "(line 1267,col 9)-(line 1267,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1274,
      "end_line": 1282,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 39)",
        "(line 1276,col 9)-(line 1280,col 9)",
        "(line 1281,col 9)-(line 1281,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1288,
      "end_line": 1296,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1289,col 9)-(line 1289,col 38)",
        "(line 1290,col 9)-(line 1294,col 9)",
        "(line 1295,col 9)-(line 1295,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1302,
      "end_line": 1308,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1303,col 9)-(line 1303,col 48)",
        "(line 1304,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1307,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1314,
      "end_line": 1320,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1315,col 9)-(line 1315,col 48)",
        "(line 1316,col 9)-(line 1318,col 9)",
        "(line 1319,col 9)-(line 1319,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1326,
      "end_line": 1332,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1327,col 9)-(line 1327,col 42)",
        "(line 1328,col 9)-(line 1330,col 9)",
        "(line 1331,col 9)-(line 1331,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1339,
      "end_line": 1347,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1340,col 9)-(line 1340,col 49)",
        "(line 1341,col 9)-(line 1345,col 9)",
        "(line 1346,col 9)-(line 1346,col 50)"
      ]
    }
  ]
}
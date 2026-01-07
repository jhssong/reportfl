{
  "filepath": "/tmp/Math-19b/src/main/java/org/apache/commons/math3/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.optimization.direct.BaseAbstractMultivariateSimpleBoundsOptimizer\u003corg.apache.commons.math3.analysis.MultivariateFunction\u003e",
        "org.apache.commons.math3.optimization.MultivariateOptimizer"
      ],
      "begin_line": 91,
      "end_line": 1368,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHECKFEASABLECOUNT"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Default value for {@link #checkFeasableCount}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPFITNESS"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Default value for {@link #stopFitness}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ISACTIVECMA"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Default value for {@link #isActiveCMA}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXITERATIONS"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Default value for {@link #maxIterations}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAGONALONLY"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Default value for {@link #diagonalOnly}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANDOMGENERATOR"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Default value for {@link #random}. "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0. Only relevant if\n     * boundaries !\u003d null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundaries"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Lower and upper boundaries of the objective variables. boundaries \u003d\u003d null\n     * means no boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": "\n     * Individual sigma values - initial search volume. inputSigma determines\n     * the initial coordinate wise standard deviations for the search. Setting\n     * SIGMA one third of the initial search region is appropriate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopFitness"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 173,
      "end_line": 173,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 187,
      "end_line": 187,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 189,
      "end_line": 189,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 193,
      "end_line": 193,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 195,
      "end_line": 195,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 199,
      "end_line": 199,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 205,
      "end_line": 205,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 207,
      "end_line": 207,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 211,
      "end_line": 211,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 223,
      "end_line": 223,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 226,
      "end_line": 226,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 228,
      "end_line": 228,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 234,
      "end_line": 234,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 236,
      "end_line": 236,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 238,
      "end_line": 238,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 240,
      "end_line": 240,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Default constructor, uses default parameters\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 252,
      "end_line": 256,
      "comment": "\n     * @param lambda Population size.\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 255,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[])",
      "begin_line": 262,
      "end_line": 266,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 73)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean)",
      "begin_line": 283,
      "end_line": 291,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @deprecated See {@link SimpleValueChecker#SimpleValueChecker()}\n     ",
      "child_ranges": [
        "(line 288,col 9)-(line 290,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], int, double, boolean, int, int, org.apache.commons.math3.random.RandomGenerator, boolean, org.apache.commons.math3.optimization.ConvergenceChecker\u003corg.apache.commons.math3.optimization.PointValuePair\u003e)",
      "begin_line": 308,
      "end_line": 323,
      "comment": "\n     * @param lambda Population size.\n     * @param inputSigma Initial search volume; sigma of offspring objective variables.\n     * @param maxIterations Maximal number of iterations.\n     * @param stopFitness Whether to stop if objective function value is smaller than\n     * {@code stopFitness}.\n     * @param isActiveCMA Chooses the covariance matrix update method.\n     * @param diagonalOnly Number of initial iterations, where the covariance matrix\n     * remains diagonal.\n     * @param checkFeasableCount Determines how often new random objective variables are\n     * generated in case they are out of bounds.\n     * @param random Random generator.\n     * @param generateStatistics Whether statistic data is collected.\n     * @param checker Convergence checker.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 23)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 84)",
        "(line 316,col 9)-(line 316,col 43)",
        "(line 317,col 9)-(line 317,col 39)",
        "(line 318,col 9)-(line 318,col 39)",
        "(line 319,col 9)-(line 319,col 41)",
        "(line 320,col 9)-(line 320,col 53)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 322,col 9)-(line 322,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 354,
      "end_line": 499,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 26)",
        "(line 358,col 9)-(line 358,col 61)",
        "(line 359,col 9)-(line 359,col 61)",
        "(line 360,col 9)-(line 360,col 62)",
        "(line 362,col 9)-(line 362,col 33)",
        "(line 363,col 9)-(line 363,col 29)",
        "(line 364,col 9)-(line 364,col 23)",
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 366,col 40)",
        "(line 367,col 9)-(line 368,col 53)",
        "(line 369,col 9)-(line 369,col 41)",
        "(line 373,col 9)-(line 497,col 13)",
        "(line 498,col 9)-(line 498,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 504,
      "end_line": 561,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 46)",
        "(line 506,col 9)-(line 506,col 44)",
        "(line 507,col 9)-(line 507,col 44)",
        "(line 510,col 9)-(line 510,col 40)",
        "(line 511,col 9)-(line 517,col 9)",
        "(line 519,col 9)-(line 519,col 42)",
        "(line 520,col 9)-(line 544,col 9)",
        "(line 546,col 9)-(line 560,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 568,
      "end_line": 635,
      "comment": "\n     * Initialization of the dynamic search parameters\n     *\n     * @param guess Initial guess for the arguments of the fitness function.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 571,col 9)",
        "(line 573,col 9)-(line 573,col 60)",
        "(line 574,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 73)",
        "(line 579,col 9)-(line 579,col 29)",
        "(line 582,col 9)-(line 582,col 40)",
        "(line 583,col 9)-(line 583,col 40)",
        "(line 584,col 9)-(line 584,col 27)",
        "(line 585,col 9)-(line 585,col 31)",
        "(line 588,col 9)-(line 588,col 24)",
        "(line 589,col 9)-(line 589,col 36)",
        "(line 590,col 9)-(line 590,col 80)",
        "(line 591,col 9)-(line 591,col 24)",
        "(line 592,col 9)-(line 592,col 25)",
        "(line 593,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 52)",
        "(line 599,col 9)-(line 599,col 36)",
        "(line 602,col 9)-(line 603,col 58)",
        "(line 604,col 9)-(line 604,col 53)",
        "(line 605,col 9)-(line 609,col 47)",
        "(line 610,col 9)-(line 610,col 69)",
        "(line 611,col 9)-(line 612,col 63)",
        "(line 613,col 9)-(line 613,col 63)",
        "(line 614,col 9)-(line 614,col 73)",
        "(line 615,col 9)-(line 616,col 81)",
        "(line 618,col 9)-(line 618,col 58)",
        "(line 620,col 9)-(line 620,col 51)",
        "(line 621,col 9)-(line 621,col 30)",
        "(line 622,col 9)-(line 622,col 33)",
        "(line 623,col 9)-(line 623,col 33)",
        "(line 624,col 9)-(line 624,col 39)",
        "(line 626,col 9)-(line 626,col 38)",
        "(line 627,col 9)-(line 627,col 31)",
        "(line 628,col 9)-(line 628,col 63)",
        "(line 629,col 9)-(line 629,col 64)",
        "(line 630,col 9)-(line 630,col 65)",
        "(line 631,col 9)-(line 631,col 49)",
        "(line 632,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 645,
      "end_line": 659,
      "comment": "\n     * Update of the evolution paths ps and pc.\n     *\n     * @param zmean Weighted row matrix of the gaussian random numbers generating\n     * the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     * @return hsig flag indicating a small correction.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 60)",
        "(line 649,col 9)-(line 649,col 39)",
        "(line 650,col 9)-(line 652,col 51)",
        "(line 653,col 9)-(line 653,col 40)",
        "(line 654,col 9)-(line 657,col 9)",
        "(line 658,col 9)-(line 658,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 669,
      "end_line": 689,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArz Fitness-sorted matrix of the gaussian random values of the\n     * current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 61)",
        "(line 674,col 9)-(line 674,col 44)",
        "(line 675,col 9)-(line 680,col 52)",
        "(line 681,col 9)-(line 681,col 28)",
        "(line 682,col 9)-(line 688,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix, int[], org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 702,
      "end_line": 768,
      "comment": "\n     * Update of the covariance matrix C.\n     *\n     * @param hsig Flag indicating a small correction.\n     * @param bestArx Fitness-sorted matrix of the argument vectors producing the\n     * current offspring.\n     * @param arz Unsorted matrix containing the gaussian random values of the\n     * current offspring.\n     * @param arindex Indices indicating the fitness-order of the current offspring.\n     * @param xold xmean matrix of the previous generation.\n     ",
      "child_ranges": [
        "(line 704,col 9)-(line 704,col 27)",
        "(line 705,col 9)-(line 766,col 9)",
        "(line 767,col 9)-(line 767,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 775,
      "end_line": 804,
      "comment": "\n     * Update B and D from C.\n     *\n     * @param negccov Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 776,col 9)-(line 803,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 812,
      "end_line": 817,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals History queue.\n     * @param val Current best fitness value.\n     ",
      "child_ranges": [
        "(line 813,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 825,
      "end_line": 836,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles Array of values to be sorted.\n     * @return a sorted array of indices pointing into doubles.\n     ",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 60)",
        "(line 827,col 9)-(line 829,col 9)",
        "(line 830,col 9)-(line 830,col 25)",
        "(line 831,col 9)-(line 831,col 48)",
        "(line 832,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 842,
      "end_line": 885,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 844,
      "end_line": 844,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 846,
      "end_line": 846,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 852,
      "end_line": 855,
      "comment": "\n         * @param value Value to compare.\n         * @param index Index into sorted array.\n         ",
      "child_ranges": [
        "(line 853,col 13)-(line 853,col 31)",
        "(line 854,col 13)-(line 854,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 858,
      "end_line": 860,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 859,col 13)-(line 859,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 863,
      "end_line": 876,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 866,col 13)-(line 868,col 13)",
        "(line 870,col 13)-(line 872,col 13)",
        "(line 874,col 13)-(line 874,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 879,
      "end_line": 883,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 881,col 13)-(line 881,col 55)",
        "(line 882,col 13)-(line 882,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 892,
      "end_line": 1025,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 894,
      "end_line": 894,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 899,
      "end_line": 899,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 903,
      "end_line": 906,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 904,col 13)-(line 904,col 29)",
        "(line 905,col 13)-(line 905,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 912,
      "end_line": 922,
      "comment": "\n         * @param x Original objective variables.\n         * @return the normalized objective variables.\n         ",
      "child_ranges": [
        "(line 913,col 13)-(line 915,col 13)",
        "(line 916,col 13)-(line 916,col 48)",
        "(line 917,col 13)-(line 920,col 13)",
        "(line 921,col 13)-(line 921,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repairAndDecode(double[])",
      "begin_line": 928,
      "end_line": 932,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the original objective variables, possibly repaired.\n         ",
      "child_ranges": [
        "(line 929,col 13)-(line 931,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 938,
      "end_line": 948,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the original objective variables.\n         ",
      "child_ranges": [
        "(line 939,col 13)-(line 941,col 13)",
        "(line 942,col 13)-(line 942,col 48)",
        "(line 943,col 13)-(line 946,col 13)",
        "(line 947,col 13)-(line 947,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 954,
      "end_line": 966,
      "comment": "\n         * @param point Normalized objective variables.\n         * @return the objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 955,col 13)-(line 955,col 25)",
        "(line 956,col 13)-(line 964,col 13)",
        "(line 965,col 13)-(line 965,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 972,
      "end_line": 985,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return {@code true} if in bounds.\n         ",
      "child_ranges": [
        "(line 973,col 13)-(line 975,col 13)",
        "(line 976,col 13)-(line 983,col 13)",
        "(line 984,col 13)-(line 984,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 990,
      "end_line": 992,
      "comment": "\n         * @param valueRange Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 991,col 13)-(line 991,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 998,
      "end_line": 1010,
      "comment": "\n         * @param x Normalized objective variables.\n         * @return the repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 999,col 13)-(line 999,col 53)",
        "(line 1000,col 13)-(line 1008,col 13)",
        "(line 1009,col 13)-(line 1009,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 1017,
      "end_line": 1024,
      "comment": "\n         * @param x Normalized objective variables.\n         * @param repaired Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1018,col 13)-(line 1018,col 31)",
        "(line 1019,col 13)-(line 1022,col 13)",
        "(line 1023,col 13)-(line 1023,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.log(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1033,
      "end_line": 1041,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1034,col 79)",
        "(line 1035,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1040,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1048,
      "end_line": 1056,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element-wise square root of m.\n     ",
      "child_ranges": [
        "(line 1049,col 9)-(line 1049,col 79)",
        "(line 1050,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.square(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1062,
      "end_line": 1071,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element-wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1063,col 9)-(line 1063,col 79)",
        "(line 1064,col 9)-(line 1069,col 9)",
        "(line 1070,col 9)-(line 1070,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.times(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1078,
      "end_line": 1086,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return the matrix where the elements of m and n are element-wise multiplied.\n     ",
      "child_ranges": [
        "(line 1079,col 9)-(line 1079,col 79)",
        "(line 1080,col 9)-(line 1084,col 9)",
        "(line 1085,col 9)-(line 1085,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math3.linear.RealMatrix, org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1093,
      "end_line": 1101,
      "comment": "\n     * @param m Input matrix 1.\n     * @param n Input matrix 2.\n     * @return Matrix where the elements of m and n are element-wise divided.\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 79)",
        "(line 1095,col 9)-(line 1099,col 9)",
        "(line 1100,col 9)-(line 1100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math3.linear.RealMatrix, int[])",
      "begin_line": 1108,
      "end_line": 1116,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1109,col 9)-(line 1109,col 68)",
        "(line 1110,col 9)-(line 1114,col 9)",
        "(line 1115,col 9)-(line 1115,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1123,
      "end_line": 1131,
      "comment": "\n     * @param m Input matrix.\n     * @param k Diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 79)",
        "(line 1125,col 9)-(line 1129,col 9)",
        "(line 1130,col 9)-(line 1130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1137,
      "end_line": 1147,
      "comment": "\n     * @param m Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1138,col 9)-(line 1138,col 61)",
        "(line 1139,col 9)-(line 1145,col 9)",
        "(line 1146,col 9)-(line 1146,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1154,
      "end_line": 1168,
      "comment": "\n     * @param m Input matrix.\n     * @return the diagonal n-by-n matrix if m is a column matrix or the column\n     * matrix representing the diagonal if m is a n-by-n matrix.\n     ",
      "child_ranges": [
        "(line 1155,col 9)-(line 1167,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math3.linear.RealMatrix, int, org.apache.commons.math3.linear.RealMatrix, int)",
      "begin_line": 1178,
      "end_line": 1182,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1 Source matrix 1.\n     * @param col1 Source column.\n     * @param m2 Target matrix.\n     * @param col2 Target column.\n     ",
      "child_ranges": [
        "(line 1179,col 9)-(line 1181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1189,
      "end_line": 1195,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix filled with 1.\n     ",
      "child_ranges": [
        "(line 1190,col 9)-(line 1190,col 40)",
        "(line 1191,col 9)-(line 1193,col 9)",
        "(line 1194,col 9)-(line 1194,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1202,
      "end_line": 1210,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1203,col 9)-(line 1203,col 40)",
        "(line 1204,col 9)-(line 1208,col 9)",
        "(line 1209,col 9)-(line 1209,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1217,
      "end_line": 1219,
      "comment": "\n     * @param n Number of rows.\n     * @param m Number of columns.\n     * @return n-by-m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math3.linear.RealMatrix, int, int)",
      "begin_line": 1227,
      "end_line": 1237,
      "comment": "\n     * @param mat Input matrix.\n     * @param n Number of row replicates.\n     * @param m Number of column replicates.\n     * @return a matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1228,col 9)-(line 1228,col 39)",
        "(line 1229,col 9)-(line 1229,col 42)",
        "(line 1230,col 9)-(line 1230,col 50)",
        "(line 1231,col 9)-(line 1235,col 9)",
        "(line 1236,col 9)-(line 1236,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1245,
      "end_line": 1254,
      "comment": "\n     * @param start Start value.\n     * @param end End value.\n     * @param step Step size.\n     * @return a sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 52)",
        "(line 1247,col 9)-(line 1247,col 43)",
        "(line 1248,col 9)-(line 1248,col 29)",
        "(line 1249,col 9)-(line 1252,col 9)",
        "(line 1253,col 9)-(line 1253,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1260,
      "end_line": 1271,
      "comment": "\n     * @param m Input matrix.\n     * @return the maximum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 39)",
        "(line 1262,col 9)-(line 1269,col 9)",
        "(line 1270,col 9)-(line 1270,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(org.apache.commons.math3.linear.RealMatrix)",
      "begin_line": 1277,
      "end_line": 1288,
      "comment": "\n     * @param m Input matrix.\n     * @return the minimum of the matrix element values.\n     ",
      "child_ranges": [
        "(line 1278,col 9)-(line 1278,col 38)",
        "(line 1279,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1287,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1294,
      "end_line": 1302,
      "comment": "\n     * @param m Input array.\n     * @return the maximum of the array values.\n     ",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 39)",
        "(line 1296,col 9)-(line 1300,col 9)",
        "(line 1301,col 9)-(line 1301,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1308,
      "end_line": 1316,
      "comment": "\n     * @param m Input array.\n     * @return the minimum of the array values.\n     ",
      "child_ranges": [
        "(line 1309,col 9)-(line 1309,col 38)",
        "(line 1310,col 9)-(line 1314,col 9)",
        "(line 1315,col 9)-(line 1315,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1322,
      "end_line": 1328,
      "comment": "\n     * @param indices Input index array.\n     * @return the inverse of the mapping defined by indices.\n     ",
      "child_ranges": [
        "(line 1323,col 9)-(line 1323,col 48)",
        "(line 1324,col 9)-(line 1326,col 9)",
        "(line 1327,col 9)-(line 1327,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1334,
      "end_line": 1340,
      "comment": "\n     * @param indices Input index array.\n     * @return the indices in inverse order (last is first).\n     ",
      "child_ranges": [
        "(line 1335,col 9)-(line 1335,col 48)",
        "(line 1336,col 9)-(line 1338,col 9)",
        "(line 1339,col 9)-(line 1339,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1346,
      "end_line": 1352,
      "comment": "\n     * @param size Length of random array.\n     * @return an array of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1347,col 9)-(line 1347,col 42)",
        "(line 1348,col 9)-(line 1350,col 9)",
        "(line 1351,col 9)-(line 1351,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1359,
      "end_line": 1367,
      "comment": "\n     * @param size Number of rows.\n     * @param popSize Population size.\n     * @return a 2-dimensional matrix of Gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 49)",
        "(line 1361,col 9)-(line 1365,col 9)",
        "(line 1366,col 9)-(line 1366,col 50)"
      ]
    }
  ]
}
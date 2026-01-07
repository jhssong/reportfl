{
  "filepath": "/tmp/Math-49b/src/main/java/org/apache/commons/math/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 82,
      "end_line": 1396,
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
      "comment": " Default value for {@link #stopfitness}: {@value}. "
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
        "stopfitness"
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
      "begin_line": 245,
      "end_line": 249,
      "comment": "\n     * @param lambda\n     *            Population size.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 248,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][])",
      "begin_line": 260,
      "end_line": 265,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 264,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][], int, double, boolean, int, int, org.apache.commons.math.random.RandomGenerator, boolean)",
      "begin_line": 292,
      "end_line": 315,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     * @param maxIterations\n     *            Maximal number of iterations.\n     * @param stopfitness\n     *            stop if objective function value \u003c stopfitness.\n     * @param isActiveCMA\n     *            Chooses the covariance matrix update method.\n     * @param diagonalOnly\n     *            Number of initial iterations, where the covariance matrix\n     *            remains diagonal.\n     * @param checkFeasableCount\n     *            Determines how often new. random objective variables are\n     *            generated in case they are out of bounds.\n     * @param random\n     *            Used random generator.\n     * @param generateStatistics\n     *            Indicates whether statistic data is collected.\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 29)",
        "(line 297,col 9)-(line 297,col 84)",
        "(line 298,col 9)-(line 307,col 9)",
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
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 341,
      "end_line": 343,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.doOptimize()",
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
        "(line 361,col 9)-(line 361,col 45)",
        "(line 365,col 9)-(line 489,col 13)",
        "(line 490,col 9)-(line 490,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 496,
      "end_line": 541,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 40)",
        "(line 498,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 540,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 550,
      "end_line": 616,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 553,col 9)",
        "(line 555,col 9)-(line 555,col 60)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 73)",
        "(line 560,col 9)-(line 560,col 29)",
        "(line 563,col 9)-(line 563,col 40)",
        "(line 564,col 9)-(line 564,col 40)",
        "(line 565,col 9)-(line 565,col 27)",
        "(line 566,col 9)-(line 566,col 31)",
        "(line 569,col 9)-(line 569,col 24)",
        "(line 570,col 9)-(line 570,col 36)",
        "(line 571,col 9)-(line 571,col 80)",
        "(line 572,col 9)-(line 572,col 24)",
        "(line 573,col 9)-(line 573,col 25)",
        "(line 574,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 579,col 52)",
        "(line 580,col 9)-(line 580,col 36)",
        "(line 583,col 9)-(line 584,col 58)",
        "(line 585,col 9)-(line 585,col 53)",
        "(line 586,col 9)-(line 590,col 47)",
        "(line 591,col 9)-(line 591,col 69)",
        "(line 592,col 9)-(line 593,col 63)",
        "(line 594,col 9)-(line 594,col 63)",
        "(line 595,col 9)-(line 595,col 73)",
        "(line 596,col 9)-(line 597,col 81)",
        "(line 599,col 9)-(line 599,col 58)",
        "(line 601,col 9)-(line 601,col 51)",
        "(line 602,col 9)-(line 602,col 30)",
        "(line 603,col 9)-(line 603,col 33)",
        "(line 604,col 9)-(line 604,col 33)",
        "(line 605,col 9)-(line 605,col 39)",
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 31)",
        "(line 609,col 9)-(line 609,col 63)",
        "(line 610,col 9)-(line 610,col 64)",
        "(line 611,col 9)-(line 611,col 65)",
        "(line 612,col 9)-(line 612,col 49)",
        "(line 613,col 9)-(line 615,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 628,
      "end_line": 642,
      "comment": "\n     * Update of the evolution paths ps and pc\n     *\n     * @param zmean\n     *            weighted row matrix of the gaussian random numbers generating\n     *            the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     * @return hsig flag indicating a small correction\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 631,col 60)",
        "(line 632,col 9)-(line 632,col 39)",
        "(line 633,col 9)-(line 635,col 51)",
        "(line 636,col 9)-(line 636,col 40)",
        "(line 637,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 655,
      "end_line": 674,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArz\n     *            fitness-sorted matrix of the gaussian random values of the\n     *            current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 61)",
        "(line 659,col 9)-(line 659,col 44)",
        "(line 660,col 9)-(line 665,col 52)",
        "(line 666,col 9)-(line 666,col 28)",
        "(line 667,col 9)-(line 673,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, int[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 692,
      "end_line": 758,
      "comment": "\n     * Update of the covariance matrix C\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArx\n     *            fitness-sorted matrix of the argument vectors producing the\n     *            current offspring\n     * @param arz\n     *            unsorted matrix containing the gaussian random values of the\n     *            current offspring\n     * @param arindex\n     *            indices indicating the fitness-order of the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 27)",
        "(line 695,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 766,
      "end_line": 795,
      "comment": "\n     * Update B and D from C\n     *\n     * @param negccov\n     *            Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 767,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 805,
      "end_line": 810,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals\n     *            the history queue\n     * @param val\n     *            current best fitness value\n     ",
      "child_ranges": [
        "(line 806,col 9)-(line 808,col 9)",
        "(line 809,col 9)-(line 809,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 819,
      "end_line": 830,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles\n     *            array of values to be sorted\n     * @return sorted array of indices pointing into doubles\n     ",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 60)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 25)",
        "(line 825,col 9)-(line 825,col 48)",
        "(line 826,col 9)-(line 828,col 9)",
        "(line 829,col 9)-(line 829,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 836,
      "end_line": 882,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 839,
      "end_line": 839,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 841,
      "end_line": 841,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 849,
      "end_line": 852,
      "comment": "\n         * @param value\n         *            Value to compare.\n         * @param index\n         *            Index into sorted array.\n         ",
      "child_ranges": [
        "(line 850,col 13)-(line 850,col 31)",
        "(line 851,col 13)-(line 851,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 855,
      "end_line": 857,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 856,col 13)-(line 856,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 860,
      "end_line": 873,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 863,col 13)-(line 865,col 13)",
        "(line 867,col 13)-(line 869,col 13)",
        "(line 871,col 13)-(line 871,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 876,
      "end_line": 880,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 878,col 13)-(line 878,col 55)",
        "(line 879,col 13)-(line 879,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 889,
      "end_line": 1021,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 892,
      "end_line": 892,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 897,
      "end_line": 897,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 901,
      "end_line": 904,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 902,col 13)-(line 902,col 29)",
        "(line 903,col 13)-(line 903,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 911,
      "end_line": 921,
      "comment": "\n         * @param x\n         *            Original objective variables.\n         * @return Normalized objective variables.\n         ",
      "child_ranges": [
        "(line 912,col 13)-(line 914,col 13)",
        "(line 915,col 13)-(line 915,col 48)",
        "(line 916,col 13)-(line 919,col 13)",
        "(line 920,col 13)-(line 920,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 928,
      "end_line": 938,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Original objective variables.\n         ",
      "child_ranges": [
        "(line 929,col 13)-(line 931,col 13)",
        "(line 932,col 13)-(line 932,col 48)",
        "(line 933,col 13)-(line 936,col 13)",
        "(line 937,col 13)-(line 937,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 945,
      "end_line": 957,
      "comment": "\n         * @param point\n         *            Normalized objective variables.\n         * @return Objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 946,col 13)-(line 946,col 25)",
        "(line 947,col 13)-(line 955,col 13)",
        "(line 956,col 13)-(line 956,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 964,
      "end_line": 977,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return True if in bounds\n         ",
      "child_ranges": [
        "(line 965,col 13)-(line 967,col 13)",
        "(line 968,col 13)-(line 975,col 13)",
        "(line 976,col 13)-(line 976,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 983,
      "end_line": 985,
      "comment": "\n         * @param valueRange\n         *            Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 984,col 13)-(line 984,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 992,
      "end_line": 1004,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 993,col 13)-(line 993,col 53)",
        "(line 994,col 13)-(line 1002,col 13)",
        "(line 1003,col 13)-(line 1003,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 1013,
      "end_line": 1020,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @param repaired\n         *            Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1014,col 13)-(line 1014,col 31)",
        "(line 1015,col 13)-(line 1018,col 13)",
        "(line 1019,col 13)-(line 1019,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1030,
      "end_line": 1038,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 79)",
        "(line 1032,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1045,
      "end_line": 1053,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise square root of m.\n     ",
      "child_ranges": [
        "(line 1046,col 9)-(line 1046,col 79)",
        "(line 1047,col 9)-(line 1051,col 9)",
        "(line 1052,col 9)-(line 1052,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.square(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1059,
      "end_line": 1068,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 79)",
        "(line 1061,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1067,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1077,
      "end_line": 1085,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise multiplied.\n     ",
      "child_ranges": [
        "(line 1078,col 9)-(line 1078,col 79)",
        "(line 1079,col 9)-(line 1083,col 9)",
        "(line 1084,col 9)-(line 1084,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1094,
      "end_line": 1102,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise divided.\n     ",
      "child_ranges": [
        "(line 1095,col 9)-(line 1095,col 79)",
        "(line 1096,col 9)-(line 1100,col 9)",
        "(line 1101,col 9)-(line 1101,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math.linear.RealMatrix, int[])",
      "begin_line": 1109,
      "end_line": 1117,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1110,col 9)-(line 1110,col 68)",
        "(line 1111,col 9)-(line 1115,col 9)",
        "(line 1116,col 9)-(line 1116,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1124,
      "end_line": 1132,
      "comment": "\n     * @param m Input matrix.\n     * @param k diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 79)",
        "(line 1126,col 9)-(line 1130,col 9)",
        "(line 1131,col 9)-(line 1131,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1139,
      "end_line": 1149,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1140,col 9)-(line 1140,col 61)",
        "(line 1141,col 9)-(line 1147,col 9)",
        "(line 1148,col 9)-(line 1148,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1157,
      "end_line": 1171,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Diagonal n X n matrix if m is a column matrix, Column matrix\n     *         representing the diagonal if m is a nXn matrix.\n     ",
      "child_ranges": [
        "(line 1158,col 9)-(line 1170,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math.linear.RealMatrix, int, org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1185,
      "end_line": 1189,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1\n     *            Source matrix 1.\n     * @param col1\n     *            Source column.\n     * @param m2\n     *            Target matrix.\n     * @param col2\n     *            Target column.\n     ",
      "child_ranges": [
        "(line 1186,col 9)-(line 1188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1198,
      "end_line": 1204,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 1.0-values.\n     ",
      "child_ranges": [
        "(line 1199,col 9)-(line 1199,col 40)",
        "(line 1200,col 9)-(line 1202,col 9)",
        "(line 1203,col 9)-(line 1203,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1213,
      "end_line": 1221,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1214,col 9)-(line 1214,col 40)",
        "(line 1215,col 9)-(line 1219,col 9)",
        "(line 1220,col 9)-(line 1220,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1230,
      "end_line": 1232,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1231,col 9)-(line 1231,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math.linear.RealMatrix, int, int)",
      "begin_line": 1243,
      "end_line": 1253,
      "comment": "\n     * @param mat\n     *            Input matrix.\n     * @param n\n     *            Number of row replicates.\n     * @param m\n     *            Number of column replicates.\n     * @return Matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1244,col 9)-(line 1244,col 39)",
        "(line 1245,col 9)-(line 1245,col 42)",
        "(line 1246,col 9)-(line 1246,col 50)",
        "(line 1247,col 9)-(line 1251,col 9)",
        "(line 1252,col 9)-(line 1252,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1264,
      "end_line": 1273,
      "comment": "\n     * @param start\n     *            Start value.\n     * @param end\n     *            End value.\n     * @param step\n     *            Step size.\n     * @return Sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1265,col 9)-(line 1265,col 52)",
        "(line 1266,col 9)-(line 1266,col 43)",
        "(line 1267,col 9)-(line 1267,col 29)",
        "(line 1268,col 9)-(line 1271,col 9)",
        "(line 1272,col 9)-(line 1272,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1280,
      "end_line": 1291,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Maximum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1281,col 9)-(line 1281,col 39)",
        "(line 1282,col 9)-(line 1289,col 9)",
        "(line 1290,col 9)-(line 1290,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1298,
      "end_line": 1309,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Minimum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1299,col 9)-(line 1299,col 38)",
        "(line 1300,col 9)-(line 1307,col 9)",
        "(line 1308,col 9)-(line 1308,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1316,
      "end_line": 1324,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Maximum of array values.\n     ",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 39)",
        "(line 1318,col 9)-(line 1322,col 9)",
        "(line 1323,col 9)-(line 1323,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1331,
      "end_line": 1339,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Minimum of array values.\n     ",
      "child_ranges": [
        "(line 1332,col 9)-(line 1332,col 38)",
        "(line 1333,col 9)-(line 1337,col 9)",
        "(line 1338,col 9)-(line 1338,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1346,
      "end_line": 1352,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Inverse of the mapping defined by indices\n     ",
      "child_ranges": [
        "(line 1347,col 9)-(line 1347,col 48)",
        "(line 1348,col 9)-(line 1350,col 9)",
        "(line 1351,col 9)-(line 1351,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1359,
      "end_line": 1365,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Indices in inverse order (last is first)\n     ",
      "child_ranges": [
        "(line 1360,col 9)-(line 1360,col 48)",
        "(line 1361,col 9)-(line 1363,col 9)",
        "(line 1364,col 9)-(line 1364,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1372,
      "end_line": 1378,
      "comment": "\n     * @param size\n     *            Length of random array.\n     * @return Array of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 42)",
        "(line 1374,col 9)-(line 1376,col 9)",
        "(line 1377,col 9)-(line 1377,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1387,
      "end_line": 1395,
      "comment": "\n     * @param size\n     *            Number of rows.\n     * @param popSize\n     *            Population size.\n     * @return 2-dimensional matrix of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 49)",
        "(line 1389,col 9)-(line 1393,col 9)",
        "(line 1394,col 9)-(line 1394,col 50)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-57b/src/main/java/org/apache/commons/math/optimization/direct/CMAESOptimizer.java",
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
      "end_line": 1299,
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
      "comment": " Default value for {@link #stopfitness}: {@value}. "
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
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0. Only relevant if\n     * boundaries !\u003d null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundaries"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": "\n     * Lower and upper boundaries of the objective variables. boundaries \u003d\u003d null\n     * means no boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": "\n     * Individual sigma values - initial search volume. inputSigma determines\n     * the initial coordinate wise standard deviations for the search. Setting\n     * SIGMA one third of the initial search region is appropriate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopfitness"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 192,
      "end_line": 192,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 216,
      "end_line": 216,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 233,
      "end_line": 233,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Default constructor, uses default parameters\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 246,
      "end_line": 250,
      "comment": "\n     * @param lambda\n     *            Population size.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][])",
      "begin_line": 261,
      "end_line": 266,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 265,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][], int, double, boolean, int, int, org.apache.commons.math.random.RandomGenerator, boolean)",
      "begin_line": 293,
      "end_line": 307,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     * @param maxIterations\n     *            Maximal number of iterations.\n     * @param stopfitness\n     *            stop if objective function value \u003c stopfitness.\n     * @param isActiveCMA\n     *            Chooses the covariance matrix update method.\n     * @param diagonalOnly\n     *            Number of initial iterations, where the covariance matrix\n     *            remains diagonal.\n     * @param checkFeasableCount\n     *            Determines how often new. random objective variables are\n     *            generated in case they are out of bounds.\n     * @param random\n     *            Used random generator.\n     * @param generateStatistics\n     *            Indicates whether statistic data is collected.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 29)",
        "(line 298,col 9)-(line 298,col 37)",
        "(line 299,col 9)-(line 299,col 37)",
        "(line 300,col 9)-(line 300,col 43)",
        "(line 301,col 9)-(line 301,col 39)",
        "(line 302,col 9)-(line 302,col 39)",
        "(line 303,col 9)-(line 303,col 41)",
        "(line 304,col 9)-(line 304,col 53)",
        "(line 305,col 9)-(line 305,col 29)",
        "(line 306,col 9)-(line 306,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 338,
      "end_line": 470,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 26)",
        "(line 342,col 9)-(line 342,col 61)",
        "(line 343,col 9)-(line 343,col 61)",
        "(line 344,col 9)-(line 344,col 62)",
        "(line 346,col 9)-(line 346,col 33)",
        "(line 347,col 9)-(line 347,col 29)",
        "(line 348,col 9)-(line 348,col 23)",
        "(line 349,col 9)-(line 349,col 47)",
        "(line 350,col 9)-(line 350,col 40)",
        "(line 351,col 9)-(line 352,col 53)",
        "(line 353,col 9)-(line 353,col 45)",
        "(line 357,col 9)-(line 468,col 13)",
        "(line 469,col 9)-(line 469,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 475,
      "end_line": 512,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 40)",
        "(line 477,col 9)-(line 497,col 9)",
        "(line 498,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 521,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 523,col 58)",
        "(line 525,col 9)-(line 525,col 60)",
        "(line 526,col 9)-(line 527,col 72)",
        "(line 528,col 9)-(line 528,col 73)",
        "(line 529,col 9)-(line 529,col 29)",
        "(line 532,col 9)-(line 532,col 40)",
        "(line 533,col 9)-(line 533,col 40)",
        "(line 534,col 9)-(line 534,col 27)",
        "(line 535,col 9)-(line 535,col 31)",
        "(line 538,col 9)-(line 538,col 24)",
        "(line 539,col 9)-(line 539,col 36)",
        "(line 540,col 9)-(line 540,col 80)",
        "(line 541,col 9)-(line 541,col 24)",
        "(line 542,col 9)-(line 542,col 25)",
        "(line 543,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 52)",
        "(line 549,col 9)-(line 549,col 36)",
        "(line 552,col 9)-(line 553,col 58)",
        "(line 554,col 9)-(line 554,col 53)",
        "(line 555,col 9)-(line 559,col 47)",
        "(line 560,col 9)-(line 560,col 69)",
        "(line 561,col 9)-(line 562,col 63)",
        "(line 563,col 9)-(line 563,col 63)",
        "(line 564,col 9)-(line 564,col 73)",
        "(line 565,col 9)-(line 566,col 81)",
        "(line 568,col 9)-(line 568,col 58)",
        "(line 570,col 9)-(line 570,col 51)",
        "(line 571,col 9)-(line 571,col 30)",
        "(line 572,col 9)-(line 572,col 33)",
        "(line 573,col 9)-(line 573,col 33)",
        "(line 574,col 9)-(line 574,col 26)",
        "(line 576,col 9)-(line 576,col 38)",
        "(line 577,col 9)-(line 577,col 31)",
        "(line 578,col 9)-(line 578,col 63)",
        "(line 579,col 9)-(line 579,col 64)",
        "(line 580,col 9)-(line 580,col 65)",
        "(line 581,col 9)-(line 581,col 49)",
        "(line 582,col 9)-(line 583,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 596,
      "end_line": 609,
      "comment": "\n     * Update of the evolution paths ps and pc\n     *\n     * @param zmean\n     *            weighted row matrix of the gaussian random numbers generating\n     *            the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     * @return hsig flag indicating a small correction\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 599,col 60)",
        "(line 600,col 9)-(line 600,col 26)",
        "(line 601,col 9)-(line 603,col 51)",
        "(line 604,col 9)-(line 604,col 40)",
        "(line 605,col 9)-(line 607,col 64)",
        "(line 608,col 9)-(line 608,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 622,
      "end_line": 641,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArz\n     *            fitness-sorted matrix of the gaussian random values of the\n     *            current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 61)",
        "(line 626,col 9)-(line 626,col 44)",
        "(line 627,col 9)-(line 632,col 52)",
        "(line 633,col 9)-(line 633,col 28)",
        "(line 634,col 9)-(line 640,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, int[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 659,
      "end_line": 724,
      "comment": "\n     * Update of the covariance matrix C\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArx\n     *            fitness-sorted matrix of the argument vectors producing the\n     *            current offspring\n     * @param arz\n     *            unsorted matrix containing the gaussian random values of the\n     *            current offspring\n     * @param arindex\n     *            indices indicating the fitness-order of the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 661,col 27)",
        "(line 662,col 9)-(line 722,col 9)",
        "(line 723,col 9)-(line 723,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 732,
      "end_line": 759,
      "comment": "\n     * Update B and D from C\n     *\n     * @param negccov\n     *            Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 758,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 769,
      "end_line": 773,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals\n     *            the history queue\n     * @param val\n     *            current best fitness value\n     ",
      "child_ranges": [
        "(line 770,col 9)-(line 771,col 32)",
        "(line 772,col 9)-(line 772,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 782,
      "end_line": 791,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles\n     *            array of values to be sorted\n     * @return sorted array of indices pointing into doubles\n     ",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 60)",
        "(line 784,col 9)-(line 785,col 52)",
        "(line 786,col 9)-(line 786,col 25)",
        "(line 787,col 9)-(line 787,col 48)",
        "(line 788,col 9)-(line 789,col 38)",
        "(line 790,col 9)-(line 790,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 797,
      "end_line": 819,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 800,
      "end_line": 800,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 802,
      "end_line": 802,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 810,
      "end_line": 813,
      "comment": "\n         * @param value\n         *            Value to compare.\n         * @param index\n         *            Index into sorted array.\n         ",
      "child_ranges": [
        "(line 811,col 13)-(line 811,col 31)",
        "(line 812,col 13)-(line 812,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 816,
      "end_line": 818,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 817,col 13)-(line 817,col 50)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 826,
      "end_line": 944,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 829,
      "end_line": 829,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 834,
      "end_line": 834,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 841,
      "end_line": 850,
      "comment": "\n         * @param x\n         *            Original objective variables.\n         * @return Normalized objective variables.\n         ",
      "child_ranges": [
        "(line 842,col 13)-(line 843,col 25)",
        "(line 844,col 13)-(line 844,col 48)",
        "(line 845,col 13)-(line 848,col 13)",
        "(line 849,col 13)-(line 849,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 857,
      "end_line": 866,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Original objective variables.\n         ",
      "child_ranges": [
        "(line 858,col 13)-(line 859,col 25)",
        "(line 860,col 13)-(line 860,col 48)",
        "(line 861,col 13)-(line 864,col 13)",
        "(line 865,col 13)-(line 865,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 873,
      "end_line": 884,
      "comment": "\n         * @param point\n         *            Normalized objective variables.\n         * @return Objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 874,col 13)-(line 874,col 25)",
        "(line 875,col 13)-(line 882,col 62)",
        "(line 883,col 13)-(line 883,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 891,
      "end_line": 901,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return True if in bounds\n         ",
      "child_ranges": [
        "(line 892,col 13)-(line 893,col 28)",
        "(line 894,col 13)-(line 899,col 13)",
        "(line 900,col 13)-(line 900,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 907,
      "end_line": 909,
      "comment": "\n         * @param valueRange\n         *            Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 908,col 13)-(line 908,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 916,
      "end_line": 927,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 917,col 13)-(line 917,col 53)",
        "(line 918,col 13)-(line 925,col 13)",
        "(line 926,col 13)-(line 926,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 936,
      "end_line": 943,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @param repaired\n         *            Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 937,col 13)-(line 937,col 31)",
        "(line 938,col 13)-(line 941,col 13)",
        "(line 942,col 13)-(line 942,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 953,
      "end_line": 959,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 79)",
        "(line 955,col 9)-(line 957,col 53)",
        "(line 958,col 9)-(line 958,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 966,
      "end_line": 972,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise square root of m.\n     ",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 79)",
        "(line 968,col 9)-(line 970,col 54)",
        "(line 971,col 9)-(line 971,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.square(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 978,
      "end_line": 986,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 79)",
        "(line 980,col 9)-(line 984,col 13)",
        "(line 985,col 9)-(line 985,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 995,
      "end_line": 1001,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise multiplied.\n     ",
      "child_ranges": [
        "(line 996,col 9)-(line 996,col 79)",
        "(line 997,col 9)-(line 999,col 60)",
        "(line 1000,col 9)-(line 1000,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1010,
      "end_line": 1016,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise divided.\n     ",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 79)",
        "(line 1012,col 9)-(line 1014,col 60)",
        "(line 1015,col 9)-(line 1015,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math.linear.RealMatrix, int[])",
      "begin_line": 1023,
      "end_line": 1029,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1024,col 9)-(line 1024,col 68)",
        "(line 1025,col 9)-(line 1027,col 49)",
        "(line 1028,col 9)-(line 1028,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1036,
      "end_line": 1042,
      "comment": "\n     * @param m Input matrix.\n     * @param k diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 79)",
        "(line 1038,col 9)-(line 1040,col 60)",
        "(line 1041,col 17)-(line 1041,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.norm(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1049,
      "end_line": 1057,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Norm of the matrix.\n     ",
      "child_ranges": [
        "(line 1050,col 9)-(line 1050,col 23)",
        "(line 1051,col 9)-(line 1055,col 13)",
        "(line 1056,col 9)-(line 1056,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1064,
      "end_line": 1073,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1065,col 9)-(line 1065,col 61)",
        "(line 1066,col 9)-(line 1071,col 9)",
        "(line 1072,col 9)-(line 1072,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1081,
      "end_line": 1093,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Diagonal n X n matrix if m is a column matrix, Rolumn matrix\n     *         representing the diagonal if m is a nXn matrix.\n     ",
      "child_ranges": [
        "(line 1082,col 9)-(line 1092,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math.linear.RealMatrix, int, org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1107,
      "end_line": 1110,
      "comment": "\n     * Copies a row from m1 to m2.\n     *\n     * @param m1\n     *            Source matrix 1.\n     * @param col1\n     *            Source column.\n     * @param m2\n     *            Target matrix.\n     * @param col2\n     *            Target column.\n     ",
      "child_ranges": [
        "(line 1108,col 9)-(line 1109,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1119,
      "end_line": 1124,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 1.0-values.\n     ",
      "child_ranges": [
        "(line 1120,col 9)-(line 1120,col 40)",
        "(line 1121,col 9)-(line 1122,col 35)",
        "(line 1123,col 9)-(line 1123,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1133,
      "end_line": 1139,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1134,col 9)-(line 1134,col 40)",
        "(line 1135,col 9)-(line 1137,col 28)",
        "(line 1138,col 9)-(line 1138,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1148,
      "end_line": 1150,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1149,col 9)-(line 1149,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math.linear.RealMatrix, int, int)",
      "begin_line": 1161,
      "end_line": 1169,
      "comment": "\n     * @param mat\n     *            Input matrix.\n     * @param n\n     *            Number of row replicates.\n     * @param m\n     *            Number of column replicates.\n     * @return Matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 39)",
        "(line 1163,col 9)-(line 1163,col 42)",
        "(line 1164,col 9)-(line 1164,col 50)",
        "(line 1165,col 9)-(line 1167,col 55)",
        "(line 1168,col 9)-(line 1168,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1180,
      "end_line": 1189,
      "comment": "\n     * @param start\n     *            Start value.\n     * @param end\n     *            End value.\n     * @param step\n     *            Step size.\n     * @return Sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1181,col 9)-(line 1181,col 52)",
        "(line 1182,col 9)-(line 1182,col 43)",
        "(line 1183,col 9)-(line 1183,col 29)",
        "(line 1184,col 9)-(line 1187,col 9)",
        "(line 1188,col 9)-(line 1188,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1196,
      "end_line": 1205,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Maximum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1197,col 9)-(line 1197,col 39)",
        "(line 1198,col 9)-(line 1203,col 13)",
        "(line 1204,col 9)-(line 1204,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1212,
      "end_line": 1221,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Minimum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 38)",
        "(line 1214,col 9)-(line 1219,col 13)",
        "(line 1220,col 9)-(line 1220,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1228,
      "end_line": 1234,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Maximum of array values.\n     ",
      "child_ranges": [
        "(line 1229,col 9)-(line 1229,col 39)",
        "(line 1230,col 9)-(line 1232,col 27)",
        "(line 1233,col 9)-(line 1233,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1241,
      "end_line": 1247,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Minimum of array values.\n     ",
      "child_ranges": [
        "(line 1242,col 9)-(line 1242,col 38)",
        "(line 1243,col 9)-(line 1245,col 27)",
        "(line 1246,col 9)-(line 1246,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1254,
      "end_line": 1259,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Inverse of the mapping defined by indices\n     ",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 48)",
        "(line 1256,col 9)-(line 1257,col 36)",
        "(line 1258,col 9)-(line 1258,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1266,
      "end_line": 1271,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Indices in inverse order (last is first)\n     ",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 48)",
        "(line 1268,col 9)-(line 1269,col 57)",
        "(line 1270,col 9)-(line 1270,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1278,
      "end_line": 1283,
      "comment": "\n     * @param size\n     *            Length of random array.\n     * @return Array of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1279,col 9)-(line 1279,col 42)",
        "(line 1280,col 9)-(line 1281,col 45)",
        "(line 1282,col 9)-(line 1282,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1292,
      "end_line": 1298,
      "comment": "\n     * @param size\n     *            Number of rows.\n     * @param popSize\n     *            Population size.\n     * @return 2-dimensional matrix of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1293,col 9)-(line 1293,col 49)",
        "(line 1294,col 9)-(line 1296,col 48)",
        "(line 1297,col 9)-(line 1297,col 50)"
      ]
    }
  ]
}
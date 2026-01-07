{
  "filepath": "/tmp/Math-56b/src/main/java/org/apache/commons/math/optimization/direct/CMAESOptimizer.java",
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
      "end_line": 1306,
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
      "end_line": 951,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 838,
      "end_line": 841,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 839,col 13)-(line 839,col 29)",
        "(line 840,col 13)-(line 840,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 848,
      "end_line": 857,
      "comment": "\n         * @param x\n         *            Original objective variables.\n         * @return Normalized objective variables.\n         ",
      "child_ranges": [
        "(line 849,col 13)-(line 850,col 25)",
        "(line 851,col 13)-(line 851,col 48)",
        "(line 852,col 13)-(line 855,col 13)",
        "(line 856,col 13)-(line 856,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 864,
      "end_line": 873,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Original objective variables.\n         ",
      "child_ranges": [
        "(line 865,col 13)-(line 866,col 25)",
        "(line 867,col 13)-(line 867,col 48)",
        "(line 868,col 13)-(line 871,col 13)",
        "(line 872,col 13)-(line 872,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 880,
      "end_line": 891,
      "comment": "\n         * @param point\n         *            Normalized objective variables.\n         * @return Objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 881,col 13)-(line 881,col 25)",
        "(line 882,col 13)-(line 889,col 62)",
        "(line 890,col 13)-(line 890,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 898,
      "end_line": 908,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return True if in bounds\n         ",
      "child_ranges": [
        "(line 899,col 13)-(line 900,col 28)",
        "(line 901,col 13)-(line 906,col 13)",
        "(line 907,col 13)-(line 907,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 914,
      "end_line": 916,
      "comment": "\n         * @param valueRange\n         *            Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 915,col 13)-(line 915,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 923,
      "end_line": 934,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 924,col 13)-(line 924,col 53)",
        "(line 925,col 13)-(line 932,col 13)",
        "(line 933,col 13)-(line 933,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 943,
      "end_line": 950,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @param repaired\n         *            Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 944,col 13)-(line 944,col 31)",
        "(line 945,col 13)-(line 948,col 13)",
        "(line 949,col 13)-(line 949,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 960,
      "end_line": 966,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 79)",
        "(line 962,col 9)-(line 964,col 53)",
        "(line 965,col 9)-(line 965,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 973,
      "end_line": 979,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise square root of m.\n     ",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 79)",
        "(line 975,col 9)-(line 977,col 54)",
        "(line 978,col 9)-(line 978,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.square(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 985,
      "end_line": 993,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 79)",
        "(line 987,col 9)-(line 991,col 13)",
        "(line 992,col 9)-(line 992,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1002,
      "end_line": 1008,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise multiplied.\n     ",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 79)",
        "(line 1004,col 9)-(line 1006,col 60)",
        "(line 1007,col 9)-(line 1007,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1017,
      "end_line": 1023,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise divided.\n     ",
      "child_ranges": [
        "(line 1018,col 9)-(line 1018,col 79)",
        "(line 1019,col 9)-(line 1021,col 60)",
        "(line 1022,col 9)-(line 1022,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math.linear.RealMatrix, int[])",
      "begin_line": 1030,
      "end_line": 1036,
      "comment": "\n     * @param m Input matrix.\n     * @param cols Columns to select.\n     * @return Matrix representing the selected columns.\n     ",
      "child_ranges": [
        "(line 1031,col 9)-(line 1031,col 68)",
        "(line 1032,col 9)-(line 1034,col 49)",
        "(line 1035,col 9)-(line 1035,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1043,
      "end_line": 1049,
      "comment": "\n     * @param m Input matrix.\n     * @param k diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1044,col 9)-(line 1044,col 79)",
        "(line 1045,col 9)-(line 1047,col 60)",
        "(line 1048,col 17)-(line 1048,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.norm(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1056,
      "end_line": 1064,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Norm of the matrix.\n     ",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 23)",
        "(line 1058,col 9)-(line 1062,col 13)",
        "(line 1063,col 9)-(line 1063,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1071,
      "end_line": 1080,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1072,col 9)-(line 1072,col 61)",
        "(line 1073,col 9)-(line 1078,col 9)",
        "(line 1079,col 9)-(line 1079,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1088,
      "end_line": 1100,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Diagonal n X n matrix if m is a column matrix, Rolumn matrix\n     *         representing the diagonal if m is a nXn matrix.\n     ",
      "child_ranges": [
        "(line 1089,col 9)-(line 1099,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math.linear.RealMatrix, int, org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1114,
      "end_line": 1117,
      "comment": "\n     * Copies a row from m1 to m2.\n     *\n     * @param m1\n     *            Source matrix 1.\n     * @param col1\n     *            Source column.\n     * @param m2\n     *            Target matrix.\n     * @param col2\n     *            Target column.\n     ",
      "child_ranges": [
        "(line 1115,col 9)-(line 1116,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1126,
      "end_line": 1131,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 1.0-values.\n     ",
      "child_ranges": [
        "(line 1127,col 9)-(line 1127,col 40)",
        "(line 1128,col 9)-(line 1129,col 35)",
        "(line 1130,col 9)-(line 1130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1140,
      "end_line": 1146,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1141,col 9)-(line 1141,col 40)",
        "(line 1142,col 9)-(line 1144,col 28)",
        "(line 1145,col 9)-(line 1145,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1155,
      "end_line": 1157,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1156,col 9)-(line 1156,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math.linear.RealMatrix, int, int)",
      "begin_line": 1168,
      "end_line": 1176,
      "comment": "\n     * @param mat\n     *            Input matrix.\n     * @param n\n     *            Number of row replicates.\n     * @param m\n     *            Number of column replicates.\n     * @return Matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 39)",
        "(line 1170,col 9)-(line 1170,col 42)",
        "(line 1171,col 9)-(line 1171,col 50)",
        "(line 1172,col 9)-(line 1174,col 55)",
        "(line 1175,col 9)-(line 1175,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1187,
      "end_line": 1196,
      "comment": "\n     * @param start\n     *            Start value.\n     * @param end\n     *            End value.\n     * @param step\n     *            Step size.\n     * @return Sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1188,col 9)-(line 1188,col 52)",
        "(line 1189,col 9)-(line 1189,col 43)",
        "(line 1190,col 9)-(line 1190,col 29)",
        "(line 1191,col 9)-(line 1194,col 9)",
        "(line 1195,col 9)-(line 1195,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1203,
      "end_line": 1212,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Maximum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 39)",
        "(line 1205,col 9)-(line 1210,col 13)",
        "(line 1211,col 9)-(line 1211,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1219,
      "end_line": 1228,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Minimum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 38)",
        "(line 1221,col 9)-(line 1226,col 13)",
        "(line 1227,col 9)-(line 1227,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1235,
      "end_line": 1241,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Maximum of array values.\n     ",
      "child_ranges": [
        "(line 1236,col 9)-(line 1236,col 39)",
        "(line 1237,col 9)-(line 1239,col 27)",
        "(line 1240,col 9)-(line 1240,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1248,
      "end_line": 1254,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Minimum of array values.\n     ",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 38)",
        "(line 1250,col 9)-(line 1252,col 27)",
        "(line 1253,col 9)-(line 1253,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1261,
      "end_line": 1266,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Inverse of the mapping defined by indices\n     ",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 48)",
        "(line 1263,col 9)-(line 1264,col 36)",
        "(line 1265,col 9)-(line 1265,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1273,
      "end_line": 1278,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Indices in inverse order (last is first)\n     ",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 48)",
        "(line 1275,col 9)-(line 1276,col 57)",
        "(line 1277,col 9)-(line 1277,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1285,
      "end_line": 1290,
      "comment": "\n     * @param size\n     *            Length of random array.\n     * @return Array of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 42)",
        "(line 1287,col 9)-(line 1288,col 45)",
        "(line 1289,col 9)-(line 1289,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1299,
      "end_line": 1305,
      "comment": "\n     * @param size\n     *            Number of rows.\n     * @param popSize\n     *            Population size.\n     * @return 2-dimensional matrix of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 49)",
        "(line 1301,col 9)-(line 1303,col 48)",
        "(line 1304,col 9)-(line 1304,col 50)"
      ]
    }
  ]
}
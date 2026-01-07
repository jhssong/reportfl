{
  "filepath": "/tmp/Math-45b/src/main/java/org/apache/commons/math/optimization/direct/CMAESOptimizer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CMAESOptimizer",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.optimization.direct.BaseAbstractScalarOptimizer\u003corg.apache.commons.math.analysis.MultivariateRealFunction\u003e",
        "org.apache.commons.math.optimization.MultivariateRealOptimizer"
      ],
      "begin_line": 81,
      "end_line": 1395,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_CHECKFEASABLECOUNT"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " Default value for {@link #checkFeasableCount}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_STOPFITNESS"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Default value for {@link #stopfitness}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_ISACTIVECMA"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Default value for {@link #isActiveCMA}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_MAXITERATIONS"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " Default value for {@link #maxIterations}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIAGONALONLY"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Default value for {@link #diagonalOnly}: {@value}. "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_RANDOMGENERATOR"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Default value for {@link #random}. "
    },
    {
      "type": "field",
      "varNames": [
        "lambda"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " population size"
    },
    {
      "type": "field",
      "varNames": [
        "isActiveCMA"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Covariance update mechanism, default is active CMA. isActiveCMA \u003d true\n     * turns on \"active CMA\" with a negative update of the covariance matrix and\n     * checks for positive definiteness. OPTS.CMA.active \u003d 2 does not check for\n     * pos. def. and is numerically faster. Active CMA usually speeds up the\n     * adaptation.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "checkFeasableCount"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Determines how often a new random offspring is generated in case it is\n     * not feasible / beyond the defined limits, default is 0. Only relevant if\n     * boundaries !\u003d null.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "boundaries"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Lower and upper boundaries of the objective variables. boundaries \u003d\u003d null\n     * means no boundaries.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "inputSigma"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": "\n     * Individual sigma values - initial search volume. inputSigma determines\n     * the initial coordinate wise standard deviations for the search. Setting\n     * SIGMA one third of the initial search region is appropriate.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "dimension"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "diagonalOnly"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": "\n     * Defines the number of initial iterations, where the covariance matrix\n     * remains diagonal and the algorithm has internally linear time complexity.\n     * diagonalOnly \u003d 1 means keeping the covariance matrix always diagonal and\n     * this setting also exhibits linear space complexity. This can be\n     * particularly useful for dimension \u003e 100.\n     * @see \u003ca href\u003d\"http://hal.archives-ouvertes.fr/inria-00287367/en\"\u003eA Simple Modification in CMA-ES\u003c/a\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "isMinimize"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": " Number of objective variables/problem dimension "
    },
    {
      "type": "field",
      "varNames": [
        "generateStatistics"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " Indicates whether statistic data is collected. "
    },
    {
      "type": "field",
      "varNames": [
        "maxIterations"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " Maximal number of iterations allowed. "
    },
    {
      "type": "field",
      "varNames": [
        "stopfitness"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " Limit for fitness value. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolUpX"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " Stop if x-changes larger stopTolUpX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolX"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " Stop if x-change smaller stopTolX. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolFun"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " Stop if fun-changes smaller stopTolFun. "
    },
    {
      "type": "field",
      "varNames": [
        "stopTolHistFun"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " Stop if back fun-changes smaller stopTolHistFun. "
    },
    {
      "type": "field",
      "varNames": [
        "mu"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "logMu2"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " log(mu + 0.5), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "weights"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " Array for weighted recombination. "
    },
    {
      "type": "field",
      "varNames": [
        "mueff"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sigma"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Overall standard deviation - search volume. "
    },
    {
      "type": "field",
      "varNames": [
        "cc"
      ],
      "begin_line": 176,
      "end_line": 176,
      "comment": " Cumulation constant. "
    },
    {
      "type": "field",
      "varNames": [
        "cs"
      ],
      "begin_line": 178,
      "end_line": 178,
      "comment": " Cumulation constant for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "damps"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Damping for step-size. "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " Learning rate for rank-one update. "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmu"
      ],
      "begin_line": 184,
      "end_line": 184,
      "comment": " Learning rate for rank-mu update\u0027 "
    },
    {
      "type": "field",
      "varNames": [
        "chiN"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": " Expectation of ||N(0,I)|| \u003d\u003d norm(randn(N,1)). "
    },
    {
      "type": "field",
      "varNames": [
        "ccov1Sep"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " Learning rate for rank-one update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "ccovmuSep"
      ],
      "begin_line": 190,
      "end_line": 190,
      "comment": " Learning rate for rank-mu update - diagonalOnly "
    },
    {
      "type": "field",
      "varNames": [
        "xmean"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " Objective variables. "
    },
    {
      "type": "field",
      "varNames": [
        "pc"
      ],
      "begin_line": 196,
      "end_line": 196,
      "comment": " Evolution path. "
    },
    {
      "type": "field",
      "varNames": [
        "ps"
      ],
      "begin_line": 198,
      "end_line": 198,
      "comment": " Evolution path for sigma. "
    },
    {
      "type": "field",
      "varNames": [
        "normps"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " Norm of ps, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "B"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": " Coordinate system. "
    },
    {
      "type": "field",
      "varNames": [
        "D"
      ],
      "begin_line": 204,
      "end_line": 204,
      "comment": " Scaling. "
    },
    {
      "type": "field",
      "varNames": [
        "BD"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " B*D, stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "diagD"
      ],
      "begin_line": 208,
      "end_line": 208,
      "comment": " Diagonal of sqrt(D), stored for efficiency. "
    },
    {
      "type": "field",
      "varNames": [
        "C"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": " Covariance matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "diagC"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " Diagonal of C, used for diagonalOnly. "
    },
    {
      "type": "field",
      "varNames": [
        "iterations"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": " Number of iterations already performed. "
    },
    {
      "type": "field",
      "varNames": [
        "fitnessHistory"
      ],
      "begin_line": 217,
      "end_line": 217,
      "comment": " History queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "historySize"
      ],
      "begin_line": 219,
      "end_line": 219,
      "comment": " Size of history queue of best values. "
    },
    {
      "type": "field",
      "varNames": [
        "random"
      ],
      "begin_line": 222,
      "end_line": 222,
      "comment": " Random generator. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsSigmaHistory"
      ],
      "begin_line": 225,
      "end_line": 225,
      "comment": " History of sigma values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsMeanHistory"
      ],
      "begin_line": 227,
      "end_line": 227,
      "comment": " History of mean matrix. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsFitnessHistory"
      ],
      "begin_line": 229,
      "end_line": 229,
      "comment": " History of fitness values. "
    },
    {
      "type": "field",
      "varNames": [
        "statisticsDHistory"
      ],
      "begin_line": 231,
      "end_line": 231,
      "comment": " History of D matrix. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * Default constructor, uses default parameters\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int)",
      "begin_line": 244,
      "end_line": 248,
      "comment": "\n     * @param lambda\n     *            Population size.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 247,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][])",
      "begin_line": 259,
      "end_line": 264,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 263,col 76)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.CMAESOptimizer(int, double[], double[][], int, double, boolean, int, int, org.apache.commons.math.random.RandomGenerator, boolean)",
      "begin_line": 291,
      "end_line": 314,
      "comment": "\n     * @param lambda\n     *            Population size.\n     * @param inputSigma\n     *            Initial search volume - sigma of offspring objective\n     *            variables.\n     * @param boundaries\n     *            Boundaries for objective variables.\n     * @param maxIterations\n     *            Maximal number of iterations.\n     * @param stopfitness\n     *            stop if objective function value \u003c stopfitness.\n     * @param isActiveCMA\n     *            Chooses the covariance matrix update method.\n     * @param diagonalOnly\n     *            Number of initial iterations, where the covariance matrix\n     *            remains diagonal.\n     * @param checkFeasableCount\n     *            Determines how often new. random objective variables are\n     *            generated in case they are out of bounds.\n     * @param random\n     *            Used random generator.\n     * @param generateStatistics\n     *            Indicates whether statistic data is collected.\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 29)",
        "(line 296,col 9)-(line 296,col 84)",
        "(line 297,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 43)",
        "(line 308,col 9)-(line 308,col 39)",
        "(line 309,col 9)-(line 309,col 39)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 311,col 9)-(line 311,col 53)",
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 313,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsSigmaHistory()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * @return History of sigma values.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsMeanHistory()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * @return History of mean matrix.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsFitnessHistory()",
      "begin_line": 333,
      "end_line": 335,
      "comment": "\n     * @return History of fitness values.\n     ",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.getStatisticsDHistory()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * @return History of D matrix.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.doOptimize()",
      "begin_line": 345,
      "end_line": 490,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 26)",
        "(line 349,col 9)-(line 349,col 61)",
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 351,col 62)",
        "(line 353,col 9)-(line 353,col 33)",
        "(line 354,col 9)-(line 354,col 29)",
        "(line 355,col 9)-(line 355,col 23)",
        "(line 356,col 9)-(line 356,col 47)",
        "(line 357,col 9)-(line 357,col 40)",
        "(line 358,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 360,col 45)",
        "(line 364,col 9)-(line 488,col 13)",
        "(line 489,col 9)-(line 489,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.checkParameters()",
      "begin_line": 495,
      "end_line": 540,
      "comment": "\n     * Checks dimensions and values of boundaries and inputSigma if defined.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 40)",
        "(line 497,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 539,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.initializeCMA(double[])",
      "begin_line": 549,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 552,col 9)",
        "(line 554,col 9)-(line 554,col 60)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 73)",
        "(line 559,col 9)-(line 559,col 29)",
        "(line 562,col 9)-(line 562,col 40)",
        "(line 563,col 9)-(line 563,col 40)",
        "(line 564,col 9)-(line 564,col 27)",
        "(line 565,col 9)-(line 565,col 31)",
        "(line 568,col 9)-(line 568,col 24)",
        "(line 569,col 9)-(line 569,col 36)",
        "(line 570,col 9)-(line 570,col 80)",
        "(line 571,col 9)-(line 571,col 24)",
        "(line 572,col 9)-(line 572,col 25)",
        "(line 573,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 578,col 52)",
        "(line 579,col 9)-(line 579,col 36)",
        "(line 582,col 9)-(line 583,col 58)",
        "(line 584,col 9)-(line 584,col 53)",
        "(line 585,col 9)-(line 589,col 47)",
        "(line 590,col 9)-(line 590,col 69)",
        "(line 591,col 9)-(line 592,col 63)",
        "(line 593,col 9)-(line 593,col 63)",
        "(line 594,col 9)-(line 594,col 73)",
        "(line 595,col 9)-(line 596,col 81)",
        "(line 598,col 9)-(line 598,col 58)",
        "(line 600,col 9)-(line 600,col 51)",
        "(line 601,col 9)-(line 601,col 30)",
        "(line 602,col 9)-(line 602,col 33)",
        "(line 603,col 9)-(line 603,col 33)",
        "(line 604,col 9)-(line 604,col 39)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 31)",
        "(line 608,col 9)-(line 608,col 63)",
        "(line 609,col 9)-(line 609,col 64)",
        "(line 610,col 9)-(line 610,col 65)",
        "(line 611,col 9)-(line 611,col 49)",
        "(line 612,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateEvolutionPaths(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 627,
      "end_line": 641,
      "comment": "\n     * Update of the evolution paths ps and pc\n     *\n     * @param zmean\n     *            weighted row matrix of the gaussian random numbers generating\n     *            the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     * @return hsig flag indicating a small correction\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 60)",
        "(line 631,col 9)-(line 631,col 39)",
        "(line 632,col 9)-(line 634,col 51)",
        "(line 635,col 9)-(line 635,col 40)",
        "(line 636,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 640,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovarianceDiagonalOnly(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 654,
      "end_line": 673,
      "comment": "\n     * Update of the covariance matrix C for diagonalOnly \u003e 0\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArz\n     *            fitness-sorted matrix of the gaussian random values of the\n     *            current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 61)",
        "(line 658,col 9)-(line 658,col 44)",
        "(line 659,col 9)-(line 664,col 52)",
        "(line 665,col 9)-(line 665,col 28)",
        "(line 666,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateCovariance(boolean, org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix, int[], org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 691,
      "end_line": 757,
      "comment": "\n     * Update of the covariance matrix C\n     *\n     * @param hsig\n     *            flag indicating a small correction\n     * @param bestArx\n     *            fitness-sorted matrix of the argument vectors producing the\n     *            current offspring\n     * @param arz\n     *            unsorted matrix containing the gaussian random values of the\n     *            current offspring\n     * @param arindex\n     *            indices indicating the fitness-order of the current offspring\n     * @param xold\n     *            xmean matrix of the previous generation\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 27)",
        "(line 694,col 9)-(line 755,col 9)",
        "(line 756,col 9)-(line 756,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.updateBD(double)",
      "begin_line": 765,
      "end_line": 794,
      "comment": "\n     * Update B and D from C\n     *\n     * @param negccov\n     *            Negative covariance factor.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 793,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.push(double[], double)",
      "begin_line": 804,
      "end_line": 809,
      "comment": "\n     * Pushes the current best fitness value in a history queue.\n     *\n     * @param vals\n     *            the history queue\n     * @param val\n     *            current best fitness value\n     ",
      "child_ranges": [
        "(line 805,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sortedIndices(double[])",
      "begin_line": 818,
      "end_line": 829,
      "comment": "\n     * Sorts fitness values.\n     *\n     * @param doubles\n     *            array of values to be sorted\n     * @return sorted array of indices pointing into doubles\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 60)",
        "(line 820,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 25)",
        "(line 824,col 9)-(line 824,col 48)",
        "(line 825,col 9)-(line 827,col 9)",
        "(line 828,col 9)-(line 828,col 23)"
      ]
    },
    {
      "type": "class_interface",
      "name": "DoubleIndex",
      "is_interface": false,
      "parent_types": [
        "java.lang.Comparable\u003corg.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex\u003e"
      ],
      "begin_line": 835,
      "end_line": 881,
      "comment": "\n     * Used to sort fitness values. Sorting is always in lower value first\n     * order.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "value"
      ],
      "begin_line": 838,
      "end_line": 838,
      "comment": " Value to compare. "
    },
    {
      "type": "field",
      "varNames": [
        "index"
      ],
      "begin_line": 840,
      "end_line": 840,
      "comment": " Index into sorted array. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.DoubleIndex(double, int)",
      "begin_line": 848,
      "end_line": 851,
      "comment": "\n         * @param value\n         *            Value to compare.\n         * @param index\n         *            Index into sorted array.\n         ",
      "child_ranges": [
        "(line 849,col 13)-(line 849,col 31)",
        "(line 850,col 13)-(line 850,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.compareTo(org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex)",
      "begin_line": 854,
      "end_line": 856,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 855,col 13)-(line 855,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.equals(java.lang.Object)",
      "begin_line": 859,
      "end_line": 872,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 862,col 13)-(line 864,col 13)",
        "(line 866,col 13)-(line 868,col 13)",
        "(line 870,col 13)-(line 870,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.DoubleIndex.hashCode()",
      "begin_line": 875,
      "end_line": 879,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 877,col 13)-(line 877,col 55)",
        "(line 878,col 13)-(line 878,col 73)"
      ]
    },
    {
      "type": "class_interface",
      "name": "FitnessFunction",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 888,
      "end_line": 1020,
      "comment": "\n     * Normalizes fitness values to the range [0,1]. Adds a penalty to the\n     * fitness value if out of range. The penalty is adjusted by calling\n     * setValueRange().\n     "
    },
    {
      "type": "field",
      "varNames": [
        "valueRange"
      ],
      "begin_line": 891,
      "end_line": 891,
      "comment": " Determines the penalty for boundary violations "
    },
    {
      "type": "field",
      "varNames": [
        "isRepairMode"
      ],
      "begin_line": 896,
      "end_line": 896,
      "comment": "\n         * Flag indicating whether the objective variables are forced into their\n         * bounds if defined\n         "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.FitnessFunction()",
      "begin_line": 900,
      "end_line": 903,
      "comment": " Simple constructor.\n         ",
      "child_ranges": [
        "(line 901,col 13)-(line 901,col 29)",
        "(line 902,col 13)-(line 902,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.encode(double[])",
      "begin_line": 910,
      "end_line": 920,
      "comment": "\n         * @param x\n         *            Original objective variables.\n         * @return Normalized objective variables.\n         ",
      "child_ranges": [
        "(line 911,col 13)-(line 913,col 13)",
        "(line 914,col 13)-(line 914,col 48)",
        "(line 915,col 13)-(line 918,col 13)",
        "(line 919,col 13)-(line 919,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.decode(double[])",
      "begin_line": 927,
      "end_line": 937,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Original objective variables.\n         ",
      "child_ranges": [
        "(line 928,col 13)-(line 930,col 13)",
        "(line 931,col 13)-(line 931,col 48)",
        "(line 932,col 13)-(line 935,col 13)",
        "(line 936,col 13)-(line 936,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.value(double[])",
      "begin_line": 944,
      "end_line": 956,
      "comment": "\n         * @param point\n         *            Normalized objective variables.\n         * @return Objective value + penalty for violated bounds.\n         ",
      "child_ranges": [
        "(line 945,col 13)-(line 945,col 25)",
        "(line 946,col 13)-(line 954,col 13)",
        "(line 955,col 13)-(line 955,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.isFeasible(double[])",
      "begin_line": 963,
      "end_line": 976,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return True if in bounds\n         ",
      "child_ranges": [
        "(line 964,col 13)-(line 966,col 13)",
        "(line 967,col 13)-(line 974,col 13)",
        "(line 975,col 13)-(line 975,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.setValueRange(double)",
      "begin_line": 982,
      "end_line": 984,
      "comment": "\n         * @param valueRange\n         *            Adjusts the penalty computation.\n         ",
      "child_ranges": [
        "(line 983,col 13)-(line 983,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.repair(double[])",
      "begin_line": 991,
      "end_line": 1003,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @return Repaired objective variables - all in bounds.\n         ",
      "child_ranges": [
        "(line 992,col 13)-(line 992,col 53)",
        "(line 993,col 13)-(line 1001,col 13)",
        "(line 1002,col 13)-(line 1002,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.FitnessFunction.penalty(double[], double[])",
      "begin_line": 1012,
      "end_line": 1019,
      "comment": "\n         * @param x\n         *            Normalized objective variables.\n         * @param repaired\n         *            Repaired objective variables.\n         * @return Penalty value according to the violation of the bounds.\n         ",
      "child_ranges": [
        "(line 1013,col 13)-(line 1013,col 31)",
        "(line 1014,col 13)-(line 1017,col 13)",
        "(line 1018,col 13)-(line 1018,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.log(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1029,
      "end_line": 1037,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise logarithm of m.\n     ",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 79)",
        "(line 1031,col 9)-(line 1035,col 9)",
        "(line 1036,col 9)-(line 1036,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sqrt(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1044,
      "end_line": 1052,
      "comment": "\n     * @param m\n     *            Input matrix\n     * @return Matrix representing the element wise square root of m.\n     ",
      "child_ranges": [
        "(line 1045,col 9)-(line 1045,col 79)",
        "(line 1046,col 9)-(line 1050,col 9)",
        "(line 1051,col 9)-(line 1051,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.square(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1058,
      "end_line": 1067,
      "comment": "\n     * @param m Input matrix\n     * @return Matrix representing the element wise square (^2) of m.\n     ",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 79)",
        "(line 1060,col 9)-(line 1065,col 9)",
        "(line 1066,col 9)-(line 1066,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.times(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1076,
      "end_line": 1084,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise multiplied.\n     ",
      "child_ranges": [
        "(line 1077,col 9)-(line 1077,col 79)",
        "(line 1078,col 9)-(line 1082,col 9)",
        "(line 1083,col 9)-(line 1083,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.divide(org.apache.commons.math.linear.RealMatrix, org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1093,
      "end_line": 1101,
      "comment": "\n     * @param m\n     *            Input matrix 1.\n     * @param n\n     *            Input matrix 2.\n     * @return Matrix where the elements of m and m are element wise divided.\n     ",
      "child_ranges": [
        "(line 1094,col 9)-(line 1094,col 79)",
        "(line 1095,col 9)-(line 1099,col 9)",
        "(line 1100,col 9)-(line 1100,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.selectColumns(org.apache.commons.math.linear.RealMatrix, int[])",
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
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.triu(org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1123,
      "end_line": 1131,
      "comment": "\n     * @param m Input matrix.\n     * @param k diagonal position.\n     * @return Upper triangular part of matrix.\n     ",
      "child_ranges": [
        "(line 1124,col 9)-(line 1124,col 79)",
        "(line 1125,col 9)-(line 1129,col 9)",
        "(line 1130,col 9)-(line 1130,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sumRows(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1138,
      "end_line": 1148,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Row matrix representing the sums of the rows.\n     ",
      "child_ranges": [
        "(line 1139,col 9)-(line 1139,col 61)",
        "(line 1140,col 9)-(line 1146,col 9)",
        "(line 1147,col 9)-(line 1147,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.diag(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1156,
      "end_line": 1170,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Diagonal n X n matrix if m is a column matrix, Column matrix\n     *         representing the diagonal if m is a nXn matrix.\n     ",
      "child_ranges": [
        "(line 1157,col 9)-(line 1169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.copyColumn(org.apache.commons.math.linear.RealMatrix, int, org.apache.commons.math.linear.RealMatrix, int)",
      "begin_line": 1184,
      "end_line": 1188,
      "comment": "\n     * Copies a column from m1 to m2.\n     *\n     * @param m1\n     *            Source matrix 1.\n     * @param col1\n     *            Source column.\n     * @param m2\n     *            Target matrix.\n     * @param col2\n     *            Target column.\n     ",
      "child_ranges": [
        "(line 1185,col 9)-(line 1187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.ones(int, int)",
      "begin_line": 1197,
      "end_line": 1203,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 1.0-values.\n     ",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 40)",
        "(line 1199,col 9)-(line 1201,col 9)",
        "(line 1202,col 9)-(line 1202,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.eye(int, int)",
      "begin_line": 1212,
      "end_line": 1220,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values, diagonal has values 1.0.\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1213,col 40)",
        "(line 1214,col 9)-(line 1218,col 9)",
        "(line 1219,col 9)-(line 1219,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.zeros(int, int)",
      "begin_line": 1229,
      "end_line": 1231,
      "comment": "\n     * @param n\n     *            Number of rows.\n     * @param m\n     *            Number of columns.\n     * @return n X m matrix of 0.0-values.\n     ",
      "child_ranges": [
        "(line 1230,col 9)-(line 1230,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.repmat(org.apache.commons.math.linear.RealMatrix, int, int)",
      "begin_line": 1242,
      "end_line": 1252,
      "comment": "\n     * @param mat\n     *            Input matrix.\n     * @param n\n     *            Number of row replicates.\n     * @param m\n     *            Number of column replicates.\n     * @return Matrix which replicates the input matrix in both directions.\n     ",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 39)",
        "(line 1244,col 9)-(line 1244,col 42)",
        "(line 1245,col 9)-(line 1245,col 50)",
        "(line 1246,col 9)-(line 1250,col 9)",
        "(line 1251,col 9)-(line 1251,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.sequence(double, double, double)",
      "begin_line": 1263,
      "end_line": 1272,
      "comment": "\n     * @param start\n     *            Start value.\n     * @param end\n     *            End value.\n     * @param step\n     *            Step size.\n     * @return Sequence as column matrix.\n     ",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 52)",
        "(line 1265,col 9)-(line 1265,col 43)",
        "(line 1266,col 9)-(line 1266,col 29)",
        "(line 1267,col 9)-(line 1270,col 9)",
        "(line 1271,col 9)-(line 1271,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1279,
      "end_line": 1290,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Maximum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 39)",
        "(line 1281,col 9)-(line 1288,col 9)",
        "(line 1289,col 9)-(line 1289,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(org.apache.commons.math.linear.RealMatrix)",
      "begin_line": 1297,
      "end_line": 1308,
      "comment": "\n     * @param m\n     *            Input matrix.\n     * @return Minimum of matrix element values.\n     ",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 38)",
        "(line 1299,col 9)-(line 1306,col 9)",
        "(line 1307,col 9)-(line 1307,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.max(double[])",
      "begin_line": 1315,
      "end_line": 1323,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Maximum of array values.\n     ",
      "child_ranges": [
        "(line 1316,col 9)-(line 1316,col 39)",
        "(line 1317,col 9)-(line 1321,col 9)",
        "(line 1322,col 9)-(line 1322,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.min(double[])",
      "begin_line": 1330,
      "end_line": 1338,
      "comment": "\n     * @param m\n     *            Input array.\n     * @return Minimum of array values.\n     ",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 38)",
        "(line 1332,col 9)-(line 1336,col 9)",
        "(line 1337,col 9)-(line 1337,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.inverse(int[])",
      "begin_line": 1345,
      "end_line": 1351,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Inverse of the mapping defined by indices\n     ",
      "child_ranges": [
        "(line 1346,col 9)-(line 1346,col 48)",
        "(line 1347,col 9)-(line 1349,col 9)",
        "(line 1350,col 9)-(line 1350,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.reverse(int[])",
      "begin_line": 1358,
      "end_line": 1364,
      "comment": "\n     * @param indices\n     *            Input index array.\n     * @return Indices in inverse order (last is first)\n     ",
      "child_ranges": [
        "(line 1359,col 9)-(line 1359,col 48)",
        "(line 1360,col 9)-(line 1362,col 9)",
        "(line 1363,col 9)-(line 1363,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn(int)",
      "begin_line": 1371,
      "end_line": 1377,
      "comment": "\n     * @param size\n     *            Length of random array.\n     * @return Array of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1372,col 9)-(line 1372,col 42)",
        "(line 1373,col 9)-(line 1375,col 9)",
        "(line 1376,col 9)-(line 1376,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.optimization.direct.CMAESOptimizer.randn1(int, int)",
      "begin_line": 1386,
      "end_line": 1394,
      "comment": "\n     * @param size\n     *            Number of rows.\n     * @param popSize\n     *            Population size.\n     * @return 2-dimensional matrix of gaussian random numbers.\n     ",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 49)",
        "(line 1388,col 9)-(line 1392,col 9)",
        "(line 1393,col 9)-(line 1393,col 50)"
      ]
    }
  ]
}
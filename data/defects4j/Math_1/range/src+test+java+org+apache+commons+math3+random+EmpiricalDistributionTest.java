{
  "filepath": "/tmp/Math-1b/src/test/java/org/apache/commons/math3/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 49,
      "end_line": 587,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "empiricalDistribution2"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "url"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "dataArray"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.setUp()",
      "begin_line": 58,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 22)",
        "(line 62,col 9)-(line 62,col 63)",
        "(line 64,col 9)-(line 64,col 53)",
        "(line 65,col 9)-(line 65,col 63)",
        "(line 66,col 9)-(line 80,col 9)",
        "(line 82,col 9)-(line 82,col 44)",
        "(line 83,col 9)-(line 83,col 18)",
        "(line 84,col 9)-(line 87,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 95,
      "end_line": 105,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file. Also verify that load is idempotent.\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 28)",
        "(line 102,col 9)-(line 102,col 42)",
        "(line 103,col 9)-(line 103,col 41)",
        "(line 104,col 9)-(line 104,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.checkDistribution()",
      "begin_line": 107,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 86)",
        "(line 112,col 9)-(line 113,col 41)",
        "(line 114,col 9)-(line 115,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 124,
      "end_line": 140,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 47)",
        "(line 129,col 9)-(line 129,col 87)",
        "(line 131,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 134,col 42)",
        "(line 136,col 9)-(line 136,col 75)",
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 147,
      "end_line": 151,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 20)",
        "(line 150,col 9)-(line 150,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 157,
      "end_line": 166,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 165,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 171,
      "end_line": 177,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 64)",
        "(line 174,col 9)-(line 174,col 20)",
        "(line 175,col 9)-(line 175,col 65)",
        "(line 176,col 9)-(line 176,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 182,
      "end_line": 189,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 61)",
        "(line 185,col 9)-(line 185,col 18)",
        "(line 187,col 9)-(line 187,col 62)",
        "(line 188,col 9)-(line 188,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 194,
      "end_line": 198,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 73)",
        "(line 197,col 9)-(line 197,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 200,
      "end_line": 211,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 65)",
        "(line 204,col 9)-(line 204,col 98)",
        "(line 205,col 9)-(line 205,col 32)",
        "(line 208,col 9)-(line 208,col 47)",
        "(line 209,col 9)-(line 209,col 94)",
        "(line 210,col 9)-(line 210,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 215,col 8)-(line 215,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 218,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 223,
      "end_line": 226,
      "comment": "",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 231,
      "end_line": 241,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 69)",
        "(line 234,col 9)-(line 234,col 66)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 59)",
        "(line 237,col 9)-(line 237,col 85)",
        "(line 238,col 9)-(line 238,col 28)",
        "(line 239,col 9)-(line 239,col 83)",
        "(line 240,col 9)-(line 240,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig()",
      "begin_line": 243,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 246,col 81)",
        "(line 248,col 9)-(line 248,col 77)",
        "(line 249,col 9)-(line 249,col 28)",
        "(line 250,col 9)-(line 252,col 9)",
        "(line 255,col 9)-(line 255,col 68)",
        "(line 256,col 9)-(line 256,col 28)",
        "(line 257,col 9)-(line 257,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed()",
      "begin_line": 260,
      "end_line": 272,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 42)",
        "(line 264,col 9)-(line 264,col 48)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 42)",
        "(line 269,col 9)-(line 271,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math3.random.EmpiricalDistribution, org.apache.commons.math3.random.EmpiricalDistribution)",
      "begin_line": 274,
      "end_line": 284,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 58)",
        "(line 276,col 9)-(line 276,col 64)",
        "(line 277,col 9)-(line 277,col 70)",
        "(line 278,col 9)-(line 283,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 286,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 40)",
        "(line 288,col 9)-(line 288,col 43)",
        "(line 289,col 9)-(line 289,col 58)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 82)",
        "(line 294,col 9)-(line 294,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 297,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 47)",
        "(line 299,col 9)-(line 299,col 44)",
        "(line 300,col 9)-(line 300,col 58)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 83)",
        "(line 305,col 9)-(line 305,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDistribution()",
      "begin_line": 310,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 54)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 65)",
        "(line 318,col 9)-(line 318,col 30)",
        "(line 319,col 9)-(line 319,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binMass"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": " Uniform bin mass \u003d 10/10001 \u003d\u003d mass of all but the first bin "
    },
    {
      "type": "field",
      "varNames": [
        "firstBinMass"
      ],
      "begin_line": 326,
      "end_line": 326,
      "comment": " Mass of first bin \u003d 11/10001 "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 328,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 330,col 8)-(line 330,col 78)",
        "(line 331,col 8)-(line 331,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 335,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 62)",
        "(line 343,col 9)-(line 343,col 65)",
        "(line 344,col 9)-(line 344,col 103)",
        "(line 345,col 9)-(line 345,col 74)",
        "(line 346,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDensityTestValues()",
      "begin_line": 362,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 62)",
        "(line 365,col 9)-(line 365,col 69)",
        "(line 366,col 9)-(line 366,col 103)",
        "(line 367,col 9)-(line 367,col 74)",
        "(line 368,col 9)-(line 377,col 9)",
        "(line 378,col 9)-(line 378,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDensityIntegrals()",
      "begin_line": 387,
      "end_line": 409,
      "comment": " \n     * Modify test integration bounds from the default. Because the distribution\n     * has discontinuities at bin boundaries, integrals spanning multiple bins\n     * will face convergence problems.  Only test within-bin integrals and spans\n     * across no more than 3 bin boundaries.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 65)",
        "(line 391,col 9)-(line 391,col 34)",
        "(line 392,col 9)-(line 393,col 70)",
        "(line 394,col 9)-(line 398,col 10)",
        "(line 399,col 9)-(line 399,col 56)",
        "(line 400,col 9)-(line 400,col 58)",
        "(line 401,col 9)-(line 408,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.Anonymous-0fa7b44a-5d7e-4de2-8e5d-fbd78fbcb4d6.value(double)",
      "begin_line": 395,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 396,col 17)-(line 396,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findBin(double)",
      "begin_line": 414,
      "end_line": 420,
      "comment": "\n     * Find the bin that x belongs (relative to {@link #makeDistribution()}).\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 49)",
        "(line 417,col 9)-(line 417,col 50)",
        "(line 419,col 9)-(line 419,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findKernel(double, double)",
      "begin_line": 429,
      "end_line": 435,
      "comment": "\n     * Find the within-bin kernel for the bin with lower bound lower\n     * and upper bound upper. All bins other than the first contain 10 points\n     * exclusive of the lower bound and are centered at (lower + upper + 1) / 2.\n     * The first bin includes its lower bound, 0, so has different mean and\n     * standard deviation.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideConstant()",
      "begin_line": 437,
      "end_line": 461,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 86)",
        "(line 440,col 9)-(line 440,col 87)",
        "(line 441,col 9)-(line 441,col 24)",
        "(line 443,col 9)-(line 443,col 49)",
        "(line 444,col 9)-(line 446,col 9)",
        "(line 447,col 9)-(line 447,col 34)",
        "(line 448,col 9)-(line 448,col 69)",
        "(line 449,col 9)-(line 449,col 69)",
        "(line 450,col 9)-(line 450,col 70)",
        "(line 451,col 9)-(line 451,col 70)",
        "(line 452,col 9)-(line 452,col 70)",
        "(line 453,col 9)-(line 453,col 70)",
        "(line 455,col 9)-(line 455,col 78)",
        "(line 456,col 9)-(line 456,col 78)",
        "(line 457,col 9)-(line 457,col 78)",
        "(line 458,col 9)-(line 458,col 78)",
        "(line 459,col 9)-(line 459,col 78)",
        "(line 460,col 9)-(line 460,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideUniform()",
      "begin_line": 463,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 85)",
        "(line 466,col 9)-(line 466,col 87)",
        "(line 467,col 9)-(line 467,col 24)",
        "(line 469,col 9)-(line 469,col 50)",
        "(line 470,col 9)-(line 470,col 34)",
        "(line 471,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 478,col 69)",
        "(line 479,col 9)-(line 479,col 69)",
        "(line 480,col 9)-(line 480,col 70)",
        "(line 481,col 9)-(line 481,col 70)",
        "(line 482,col 9)-(line 482,col 70)",
        "(line 483,col 9)-(line 483,col 70)",
        "(line 485,col 9)-(line 485,col 78)",
        "(line 486,col 9)-(line 486,col 78)",
        "(line 487,col 9)-(line 487,col 78)",
        "(line 488,col 9)-(line 488,col 78)",
        "(line 489,col 9)-(line 489,col 78)",
        "(line 490,col 9)-(line 490,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantKernelEmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution"
      ],
      "begin_line": 497,
      "end_line": 507,
      "comment": "\n     * Empirical distribution using a constant smoothing kernel.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 498,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantKernelEmpiricalDistribution.ConstantKernelEmpiricalDistribution(int)",
      "begin_line": 499,
      "end_line": 501,
      "comment": "",
      "child_ranges": [
        "(line 500,col 13)-(line 500,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantKernelEmpiricalDistribution.getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 503,
      "end_line": 506,
      "comment": " Use constant distribution equal to bin mean within bin",
      "child_ranges": [
        "(line 505,col 13)-(line 505,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UniformKernelEmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution"
      ],
      "begin_line": 512,
      "end_line": 522,
      "comment": "\n     * Empirical distribution using a uniform smoothing kernel.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 513,
      "end_line": 513,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.UniformKernelEmpiricalDistribution.UniformKernelEmpiricalDistribution(int)",
      "begin_line": 514,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 515,col 13)-(line 515,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.UniformKernelEmpiricalDistribution.getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 517,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 519,col 13)-(line 520,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 527,
      "end_line": 586,
      "comment": "\n     * Distribution that takes just one value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 528,
      "end_line": 528,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 531,
      "end_line": 531,
      "comment": " Singleton value in the sample space "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.ConstantDistribution(double)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.density(double)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 13)-(line 538,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.cumulativeProbability(double)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 542,col 13)-(line 542,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.inverseCumulativeProbability(double)",
      "begin_line": 545,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 547,col 13)-(line 549,col 13)",
        "(line 550,col 13)-(line 550,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getNumericalMean()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 13)-(line 554,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getNumericalVariance()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 13)-(line 558,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getSupportLowerBound()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getSupportUpperBound()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportConnected()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 578,col 13)-(line 578,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.sample()",
      "begin_line": 581,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 583,col 13)-(line 583,col 21)"
      ]
    }
  ]
}
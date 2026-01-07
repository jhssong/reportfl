{
  "filepath": "/tmp/Math-3b/src/test/java/org/apache/commons/math3/random/EmpiricalDistributionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EmpiricalDistributionTest",
      "is_interface": false,
      "parent_types": [
        "RealDistributionAbstractTest"
      ],
      "begin_line": 49,
      "end_line": 583,
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
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 22)",
        "(line 61,col 9)-(line 61,col 63)",
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 64,col 63)",
        "(line 65,col 9)-(line 79,col 9)",
        "(line 81,col 9)-(line 81,col 44)",
        "(line 82,col 9)-(line 82,col 18)",
        "(line 83,col 9)-(line 86,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoad()",
      "begin_line": 94,
      "end_line": 104,
      "comment": "\n     * Test EmpiricalDistrbution.load() using sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file. Also verify that load is idempotent.\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 28)",
        "(line 101,col 9)-(line 101,col 42)",
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.checkDistribution()",
      "begin_line": 106,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 86)",
        "(line 111,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 114,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDoubleLoad()",
      "begin_line": 123,
      "end_line": 139,
      "comment": "\n     * Test EmpiricalDistrbution.load(double[]) using data taken from\n     * sample data file.\u003cbr\u003e\n     * Check that the sampleCount, mu and sigma match data in\n     * the sample data file.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 47)",
        "(line 128,col 9)-(line 128,col 87)",
        "(line 130,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 133,col 42)",
        "(line 135,col 9)-(line 135,col 75)",
        "(line 136,col 9)-(line 136,col 48)",
        "(line 137,col 9)-(line 137,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNext()",
      "begin_line": 146,
      "end_line": 150,
      "comment": "\n      * Generate 1000 random values and make sure they look OK.\u003cbr\u003e\n      * Note that there is a non-zero (but very small) probability that\n      * these tests will fail even if the code is working as designed.\n      ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 20)",
        "(line 149,col 9)-(line 149,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testNexFail()",
      "begin_line": 156,
      "end_line": 165,
      "comment": "\n      * Make sure exception thrown if digest getNext is attempted\n      * before loading empiricalDistribution.\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 164,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFine()",
      "begin_line": 170,
      "end_line": 176,
      "comment": "\n     * Make sure we can handle a grid size that is too fine\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 64)",
        "(line 173,col 9)-(line 173,col 20)",
        "(line 174,col 9)-(line 174,col 65)",
        "(line 175,col 9)-(line 175,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGridTooFat()",
      "begin_line": 181,
      "end_line": 188,
      "comment": "\n     * How about too fat?\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 61)",
        "(line 184,col 9)-(line 184,col 18)",
        "(line 186,col 9)-(line 186,col 62)",
        "(line 187,col 9)-(line 187,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testBinIndexOverflow()",
      "begin_line": 193,
      "end_line": 197,
      "comment": "\n     * Test bin index overflow problem (BZ 36450)\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 73)",
        "(line 196,col 9)-(line 196,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testSerialization()",
      "begin_line": 199,
      "end_line": 210,
      "comment": "",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 65)",
        "(line 203,col 9)-(line 203,col 98)",
        "(line 204,col 9)-(line 204,col 32)",
        "(line 207,col 9)-(line 207,col 47)",
        "(line 208,col 9)-(line 208,col 94)",
        "(line 209,col 9)-(line 209,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullDoubleArray()",
      "begin_line": 212,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 214,col 8)-(line 214,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullURL()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testLoadNullFile()",
      "begin_line": 222,
      "end_line": 225,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGetBinUpperBounds()",
      "begin_line": 230,
      "end_line": 240,
      "comment": "\n     * MATH-298\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 69)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 28)",
        "(line 235,col 9)-(line 235,col 59)",
        "(line 236,col 9)-(line 236,col 85)",
        "(line 237,col 9)-(line 237,col 28)",
        "(line 238,col 9)-(line 238,col 83)",
        "(line 239,col 9)-(line 239,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testGeneratorConfig()",
      "begin_line": 242,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 81)",
        "(line 247,col 9)-(line 247,col 77)",
        "(line 248,col 9)-(line 248,col 28)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 254,col 9)-(line 254,col 68)",
        "(line 255,col 9)-(line 255,col 28)",
        "(line 256,col 9)-(line 256,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testReSeed()",
      "begin_line": 259,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)",
        "(line 262,col 9)-(line 262,col 42)",
        "(line 263,col 9)-(line 263,col 48)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 42)",
        "(line 268,col 9)-(line 270,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.verifySame(org.apache.commons.math3.random.EmpiricalDistribution, org.apache.commons.math3.random.EmpiricalDistribution)",
      "begin_line": 273,
      "end_line": 283,
      "comment": "",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 58)",
        "(line 275,col 9)-(line 275,col 64)",
        "(line 276,col 9)-(line 276,col 70)",
        "(line 277,col 9)-(line 282,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstGen(double)",
      "begin_line": 285,
      "end_line": 294,
      "comment": "",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 40)",
        "(line 287,col 9)-(line 287,col 43)",
        "(line 288,col 9)-(line 288,col 58)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 82)",
        "(line 293,col 9)-(line 293,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.tstDoubleGen(double)",
      "begin_line": 296,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 47)",
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 83)",
        "(line 304,col 9)-(line 304,col 100)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDistribution()",
      "begin_line": 309,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 54)",
        "(line 313,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 316,col 65)",
        "(line 317,col 9)-(line 317,col 30)",
        "(line 318,col 9)-(line 318,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binMass"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": " Uniform bin mass \u003d 10/10001 \u003d\u003d mass of all but the first bin "
    },
    {
      "type": "field",
      "varNames": [
        "firstBinMass"
      ],
      "begin_line": 325,
      "end_line": 325,
      "comment": " Mass of first bin \u003d 11/10001 "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestPoints()",
      "begin_line": 327,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 329,col 8)-(line 329,col 78)",
        "(line 330,col 8)-(line 330,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeCumulativeTestValues()",
      "begin_line": 334,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 62)",
        "(line 342,col 9)-(line 342,col 65)",
        "(line 343,col 9)-(line 343,col 103)",
        "(line 344,col 9)-(line 344,col 74)",
        "(line 345,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.makeDensityTestValues()",
      "begin_line": 361,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 62)",
        "(line 364,col 9)-(line 364,col 69)",
        "(line 365,col 9)-(line 365,col 103)",
        "(line 366,col 9)-(line 366,col 74)",
        "(line 367,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testDensityIntegrals()",
      "begin_line": 386,
      "end_line": 408,
      "comment": " \n     * Modify test integration bounds from the default. Because the distribution\n     * has discontinuities at bin boundaries, integrals spanning multiple bins\n     * will face convergence problems.  Only test within-bin integrals and spans\n     * across no more than 3 bin boundaries.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 65)",
        "(line 390,col 9)-(line 390,col 34)",
        "(line 391,col 9)-(line 392,col 70)",
        "(line 393,col 9)-(line 397,col 10)",
        "(line 398,col 9)-(line 398,col 56)",
        "(line 399,col 9)-(line 399,col 58)",
        "(line 400,col 9)-(line 407,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.Anonymous-28473b7d-b1b9-46c8-861b-feb48480c2bc.value(double)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 395,col 17)-(line 395,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findBin(double)",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * Find the bin that x belongs (relative to {@link #makeDistribution()}).\n     ",
      "child_ranges": [
        "(line 415,col 9)-(line 415,col 49)",
        "(line 416,col 9)-(line 416,col 50)",
        "(line 418,col 9)-(line 418,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.findKernel(double, double)",
      "begin_line": 428,
      "end_line": 434,
      "comment": "\n     * Find the within-bin kernel for the bin with lower bound lower\n     * and upper bound upper. All bins other than the first contain 10 points\n     * exclusive of the lower bound and are centered at (lower + upper + 1) / 2.\n     * The first bin includes its lower bound, 0, so has different mean and\n     * standard deviation.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 433,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideConstant()",
      "begin_line": 436,
      "end_line": 460,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 86)",
        "(line 439,col 9)-(line 439,col 87)",
        "(line 440,col 9)-(line 440,col 24)",
        "(line 442,col 9)-(line 442,col 49)",
        "(line 443,col 9)-(line 445,col 9)",
        "(line 446,col 9)-(line 446,col 34)",
        "(line 447,col 9)-(line 447,col 69)",
        "(line 448,col 9)-(line 448,col 69)",
        "(line 449,col 9)-(line 449,col 70)",
        "(line 450,col 9)-(line 450,col 70)",
        "(line 451,col 9)-(line 451,col 70)",
        "(line 452,col 9)-(line 452,col 70)",
        "(line 454,col 9)-(line 454,col 78)",
        "(line 455,col 9)-(line 455,col 78)",
        "(line 456,col 9)-(line 456,col 78)",
        "(line 457,col 9)-(line 457,col 78)",
        "(line 458,col 9)-(line 458,col 78)",
        "(line 459,col 9)-(line 459,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.testKernelOverrideUniform()",
      "begin_line": 462,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 85)",
        "(line 465,col 9)-(line 465,col 87)",
        "(line 466,col 9)-(line 466,col 24)",
        "(line 468,col 9)-(line 468,col 50)",
        "(line 469,col 9)-(line 469,col 34)",
        "(line 470,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 69)",
        "(line 478,col 9)-(line 478,col 69)",
        "(line 479,col 9)-(line 479,col 70)",
        "(line 480,col 9)-(line 480,col 70)",
        "(line 481,col 9)-(line 481,col 70)",
        "(line 482,col 9)-(line 482,col 70)",
        "(line 484,col 9)-(line 484,col 78)",
        "(line 485,col 9)-(line 485,col 78)",
        "(line 486,col 9)-(line 486,col 78)",
        "(line 487,col 9)-(line 487,col 78)",
        "(line 488,col 9)-(line 488,col 78)",
        "(line 489,col 9)-(line 489,col 78)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantKernelEmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution"
      ],
      "begin_line": 496,
      "end_line": 505,
      "comment": "\n     * Empirical distribution using a constant smoothing kernel.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 497,
      "end_line": 497,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantKernelEmpiricalDistribution.ConstantKernelEmpiricalDistribution(int)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "",
      "child_ranges": [
        "(line 499,col 13)-(line 499,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantKernelEmpiricalDistribution.getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 502,
      "end_line": 504,
      "comment": " Use constant distribution equal to bin mean within bin",
      "child_ranges": [
        "(line 503,col 13)-(line 503,col 62)"
      ]
    },
    {
      "type": "class_interface",
      "name": "UniformKernelEmpiricalDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.random.EmpiricalDistribution"
      ],
      "begin_line": 510,
      "end_line": 518,
      "comment": "\n     * Empirical distribution using a uniform smoothing kernel.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.UniformKernelEmpiricalDistribution.UniformKernelEmpiricalDistribution(int)",
      "begin_line": 511,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 512,col 13)-(line 512,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.UniformKernelEmpiricalDistribution.getKernel(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 514,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 515,col 13)-(line 516,col 79)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ConstantDistribution",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.distribution.AbstractRealDistribution"
      ],
      "begin_line": 523,
      "end_line": 582,
      "comment": "\n     * Distribution that takes just one value.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 524,
      "end_line": 524,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "c"
      ],
      "begin_line": 527,
      "end_line": 527,
      "comment": " Singleton value in the sample space "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.ConstantDistribution(double)",
      "begin_line": 529,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 530,col 13)-(line 530,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.density(double)",
      "begin_line": 533,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 534,col 13)-(line 534,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.cumulativeProbability(double)",
      "begin_line": 537,
      "end_line": 539,
      "comment": "",
      "child_ranges": [
        "(line 538,col 13)-(line 538,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.inverseCumulativeProbability(double)",
      "begin_line": 541,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 543,col 13)-(line 545,col 13)",
        "(line 546,col 13)-(line 546,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getNumericalMean()",
      "begin_line": 549,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 550,col 13)-(line 550,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getNumericalVariance()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 554,col 13)-(line 554,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getSupportLowerBound()",
      "begin_line": 557,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 558,col 13)-(line 558,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.getSupportUpperBound()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 562,col 13)-(line 562,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportLowerBoundInclusive()",
      "begin_line": 565,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 566,col 13)-(line 566,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportUpperBoundInclusive()",
      "begin_line": 569,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 570,col 13)-(line 570,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.isSupportConnected()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 13)-(line 574,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.random.EmpiricalDistributionTest.ConstantDistribution.sample()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 13)-(line 579,col 21)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 58,
      "end_line": 990,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 60,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 20)",
        "(line 62,col 9)-(line 62,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 68,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 73,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 73)",
        "(line 75,col 9)-(line 75,col 73)",
        "(line 76,col 9)-(line 76,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 69)",
        "(line 81,col 9)-(line 81,col 69)",
        "(line 82,col 9)-(line 82,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 86,
      "end_line": 111,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 87,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 41)",
        "(line 94,col 9)-(line 94,col 22)",
        "(line 95,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 38)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 109,col 9)-(line 110,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 114,
      "end_line": 139,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 115,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 41)",
        "(line 122,col 9)-(line 122,col 23)",
        "(line 123,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 38)",
        "(line 129,col 9)-(line 131,col 9)",
        "(line 137,col 9)-(line 138,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 142,
      "end_line": 167,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 143,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 41)",
        "(line 150,col 9)-(line 150,col 23)",
        "(line 151,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 38)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 165,col 9)-(line 166,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 170,
      "end_line": 195,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 171,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 41)",
        "(line 178,col 9)-(line 178,col 22)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 38)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 193,col 9)-(line 194,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 203,
      "end_line": 233,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 213,col 9)",
        "(line 214,col 9)-(line 215,col 64)",
        "(line 216,col 9)-(line 216,col 38)",
        "(line 217,col 9)-(line 218,col 56)",
        "(line 219,col 9)-(line 219,col 60)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 231,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 235,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 32)",
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 250,col 9)-(line 252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 264,
      "end_line": 385,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 36)",
        "(line 267,col 9)-(line 267,col 39)",
        "(line 268,col 9)-(line 268,col 34)",
        "(line 269,col 9)-(line 269,col 35)",
        "(line 270,col 9)-(line 270,col 46)",
        "(line 271,col 9)-(line 277,col 9)",
        "(line 285,col 9)-(line 285,col 84)",
        "(line 286,col 9)-(line 286,col 22)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 37)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 296,col 9)-(line 296,col 25)",
        "(line 297,col 9)-(line 297,col 40)",
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 299,col 32)",
        "(line 300,col 9)-(line 305,col 9)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 314,col 29)",
        "(line 315,col 9)-(line 315,col 37)",
        "(line 316,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 29)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 324,col 9)-(line 324,col 50)",
        "(line 325,col 9)-(line 325,col 45)",
        "(line 326,col 9)-(line 326,col 49)",
        "(line 329,col 9)-(line 329,col 24)",
        "(line 330,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 88)",
        "(line 336,col 9)-(line 336,col 35)",
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 105)",
        "(line 343,col 9)-(line 350,col 9)",
        "(line 353,col 9)-(line 353,col 62)",
        "(line 354,col 9)-(line 384,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 388,
      "end_line": 440,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 389,col 9)-(line 394,col 9)",
        "(line 395,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 55)",
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 48)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 38)",
        "(line 419,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 43)",
        "(line 429,col 9)-(line 429,col 39)",
        "(line 430,col 9)-(line 433,col 9)",
        "(line 438,col 9)-(line 439,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 443,
      "end_line": 495,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 444,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 61)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 54)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 38)",
        "(line 474,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 483,col 43)",
        "(line 484,col 9)-(line 484,col 39)",
        "(line 485,col 9)-(line 488,col 9)",
        "(line 493,col 9)-(line 494,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 498,
      "end_line": 534,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 499,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 511,col 41)",
        "(line 512,col 9)-(line 512,col 35)",
        "(line 513,col 9)-(line 513,col 27)",
        "(line 514,col 9)-(line 514,col 27)",
        "(line 515,col 9)-(line 515,col 47)",
        "(line 516,col 9)-(line 516,col 26)",
        "(line 517,col 9)-(line 527,col 9)",
        "(line 532,col 9)-(line 533,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 537,
      "end_line": 542,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 538,col 9)-(line 541,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 545,
      "end_line": 564,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 546,col 9)-(line 551,col 9)",
        "(line 552,col 9)-(line 552,col 54)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 34)",
        "(line 557,col 9)-(line 557,col 44)",
        "(line 558,col 9)-(line 558,col 28)",
        "(line 563,col 9)-(line 563,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 567,
      "end_line": 595,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 568,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 579,col 9)",
        "(line 580,col 9)-(line 580,col 25)",
        "(line 581,col 9)-(line 581,col 21)",
        "(line 582,col 9)-(line 587,col 9)",
        "(line 593,col 9)-(line 594,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 598,
      "end_line": 644,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 599,col 9)-(line 599,col 32)",
        "(line 600,col 9)-(line 600,col 48)",
        "(line 601,col 9)-(line 601,col 28)",
        "(line 602,col 9)-(line 603,col 65)",
        "(line 604,col 9)-(line 604,col 32)",
        "(line 605,col 9)-(line 605,col 76)",
        "(line 606,col 9)-(line 606,col 38)",
        "(line 607,col 9)-(line 607,col 56)",
        "(line 608,col 9)-(line 608,col 34)",
        "(line 609,col 9)-(line 610,col 43)",
        "(line 611,col 9)-(line 611,col 38)",
        "(line 612,col 9)-(line 613,col 61)",
        "(line 632,col 9)-(line 632,col 49)",
        "(line 633,col 9)-(line 633,col 23)",
        "(line 634,col 9)-(line 634,col 26)",
        "(line 635,col 9)-(line 635,col 50)",
        "(line 636,col 9)-(line 636,col 31)",
        "(line 637,col 9)-(line 637,col 33)",
        "(line 638,col 9)-(line 638,col 34)",
        "(line 639,col 9)-(line 639,col 20)",
        "(line 640,col 9)-(line 640,col 26)",
        "(line 641,col 9)-(line 641,col 35)",
        "(line 642,col 9)-(line 642,col 27)",
        "(line 643,col 9)-(line 643,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 647,
      "end_line": 704,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 648,col 9)-(line 650,col 59)",
        "(line 651,col 9)-(line 651,col 59)",
        "(line 652,col 9)-(line 652,col 81)",
        "(line 654,col 9)-(line 654,col 53)",
        "(line 655,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 659,col 39)",
        "(line 660,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 670,col 9)",
        "(line 676,col 9)-(line 677,col 69)",
        "(line 680,col 9)-(line 680,col 51)",
        "(line 681,col 9)-(line 681,col 22)",
        "(line 682,col 9)-(line 682,col 52)",
        "(line 683,col 9)-(line 683,col 43)",
        "(line 684,col 9)-(line 686,col 9)",
        "(line 689,col 9)-(line 694,col 9)",
        "(line 697,col 9)-(line 703,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 706,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 708,col 9)-(line 717,col 9)",
        "(line 718,col 9)-(line 718,col 67)",
        "(line 719,col 9)-(line 719,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 723,
      "end_line": 771,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 724,col 9)-(line 725,col 43)",
        "(line 726,col 9)-(line 726,col 47)",
        "(line 727,col 9)-(line 727,col 61)",
        "(line 729,col 9)-(line 732,col 9)",
        "(line 738,col 9)-(line 739,col 69)",
        "(line 742,col 9)-(line 742,col 54)",
        "(line 743,col 9)-(line 770,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 778,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 789,col 9)",
        "(line 790,col 9)-(line 790,col 38)",
        "(line 791,col 9)-(line 791,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 794,
      "end_line": 813,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 31)",
        "(line 797,col 9)-(line 797,col 44)",
        "(line 798,col 9)-(line 800,col 9)",
        "(line 802,col 9)-(line 802,col 31)",
        "(line 803,col 9)-(line 803,col 79)",
        "(line 809,col 9)-(line 812,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 815,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 95)",
        "(line 817,col 9)-(line 817,col 36)",
        "(line 818,col 9)-(line 818,col 32)",
        "(line 819,col 9)-(line 822,col 9)",
        "(line 823,col 9)-(line 823,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 826,
      "end_line": 835,
      "comment": "",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 102)",
        "(line 828,col 9)-(line 828,col 36)",
        "(line 829,col 9)-(line 829,col 32)",
        "(line 830,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 837,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 100)",
        "(line 839,col 9)-(line 839,col 36)",
        "(line 840,col 9)-(line 840,col 32)",
        "(line 841,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 848,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 94)",
        "(line 850,col 9)-(line 850,col 36)",
        "(line 851,col 9)-(line 851,col 32)",
        "(line 852,col 9)-(line 855,col 9)",
        "(line 856,col 9)-(line 856,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 859,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 97)",
        "(line 861,col 9)-(line 861,col 36)",
        "(line 862,col 9)-(line 862,col 32)",
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 870,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 871,col 9)-(line 871,col 91)",
        "(line 872,col 9)-(line 872,col 36)",
        "(line 873,col 9)-(line 873,col 32)",
        "(line 874,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 881,
      "end_line": 890,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 103)",
        "(line 883,col 9)-(line 883,col 36)",
        "(line 884,col 9)-(line 884,col 32)",
        "(line 885,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 892,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 81)",
        "(line 894,col 9)-(line 894,col 67)",
        "(line 895,col 9)-(line 895,col 70)",
        "(line 896,col 9)-(line 896,col 30)",
        "(line 897,col 9)-(line 897,col 85)",
        "(line 898,col 9)-(line 898,col 107)",
        "(line 899,col 9)-(line 899,col 53)",
        "(line 900,col 9)-(line 900,col 49)",
        "(line 901,col 9)-(line 903,col 9)",
        "(line 904,col 9)-(line 904,col 32)",
        "(line 905,col 9)-(line 913,col 9)",
        "(line 914,col 9)-(line 914,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 917,
      "end_line": 940,
      "comment": "",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 93)",
        "(line 919,col 9)-(line 919,col 67)",
        "(line 920,col 9)-(line 920,col 70)",
        "(line 921,col 9)-(line 921,col 30)",
        "(line 922,col 9)-(line 922,col 85)",
        "(line 923,col 9)-(line 923,col 119)",
        "(line 924,col 9)-(line 924,col 53)",
        "(line 925,col 9)-(line 925,col 49)",
        "(line 926,col 9)-(line 928,col 9)",
        "(line 929,col 9)-(line 929,col 32)",
        "(line 930,col 9)-(line 938,col 9)",
        "(line 939,col 9)-(line 939,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 942,
      "end_line": 964,
      "comment": "",
      "child_ranges": [
        "(line 943,col 9)-(line 943,col 77)",
        "(line 944,col 9)-(line 944,col 67)",
        "(line 945,col 9)-(line 945,col 70)",
        "(line 946,col 9)-(line 946,col 30)",
        "(line 947,col 9)-(line 947,col 85)",
        "(line 948,col 9)-(line 948,col 103)",
        "(line 949,col 9)-(line 949,col 53)",
        "(line 950,col 9)-(line 950,col 49)",
        "(line 951,col 9)-(line 953,col 9)",
        "(line 954,col 9)-(line 954,col 32)",
        "(line 955,col 9)-(line 962,col 9)",
        "(line 963,col 9)-(line 963,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 966,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 73)",
        "(line 968,col 9)-(line 968,col 67)",
        "(line 969,col 9)-(line 969,col 70)",
        "(line 970,col 9)-(line 970,col 30)",
        "(line 971,col 9)-(line 971,col 85)",
        "(line 972,col 9)-(line 972,col 99)",
        "(line 973,col 9)-(line 973,col 53)",
        "(line 974,col 9)-(line 974,col 49)",
        "(line 975,col 9)-(line 977,col 9)",
        "(line 978,col 9)-(line 978,col 32)",
        "(line 979,col 9)-(line 986,col 9)",
        "(line 987,col 9)-(line 987,col 93)"
      ]
    }
  ]
}
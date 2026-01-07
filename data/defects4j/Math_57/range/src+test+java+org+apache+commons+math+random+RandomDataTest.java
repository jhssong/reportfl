{
  "filepath": "/tmp/Math-57b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 59,
      "end_line": 991,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 61,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 20)",
        "(line 63,col 9)-(line 63,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 69,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 74,
      "end_line": 78,
      "comment": "",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 73)",
        "(line 76,col 9)-(line 76,col 73)",
        "(line 77,col 9)-(line 77,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 80,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 69)",
        "(line 82,col 9)-(line 82,col 69)",
        "(line 83,col 9)-(line 83,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 87,
      "end_line": 112,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 88,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 41)",
        "(line 95,col 9)-(line 95,col 22)",
        "(line 96,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 38)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 110,col 9)-(line 111,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 115,
      "end_line": 140,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 116,col 9)-(line 121,col 9)",
        "(line 122,col 9)-(line 122,col 41)",
        "(line 123,col 9)-(line 123,col 23)",
        "(line 124,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 38)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 138,col 9)-(line 139,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 143,
      "end_line": 168,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 144,col 9)-(line 149,col 9)",
        "(line 150,col 9)-(line 150,col 41)",
        "(line 151,col 9)-(line 151,col 23)",
        "(line 152,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 38)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 166,col 9)-(line 167,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 171,
      "end_line": 196,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 172,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 41)",
        "(line 179,col 9)-(line 179,col 22)",
        "(line 180,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 38)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 194,col 9)-(line 195,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 204,
      "end_line": 234,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 38)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 216,col 64)",
        "(line 217,col 9)-(line 217,col 38)",
        "(line 218,col 9)-(line 219,col 56)",
        "(line 220,col 9)-(line 220,col 60)",
        "(line 221,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 236,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 32)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 251,col 9)-(line 253,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 265,
      "end_line": 386,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 36)",
        "(line 268,col 9)-(line 268,col 39)",
        "(line 269,col 9)-(line 269,col 34)",
        "(line 270,col 9)-(line 270,col 35)",
        "(line 271,col 9)-(line 271,col 46)",
        "(line 272,col 9)-(line 278,col 9)",
        "(line 286,col 9)-(line 286,col 84)",
        "(line 287,col 9)-(line 287,col 22)",
        "(line 288,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 37)",
        "(line 292,col 9)-(line 294,col 9)",
        "(line 297,col 9)-(line 297,col 25)",
        "(line 298,col 9)-(line 298,col 40)",
        "(line 299,col 9)-(line 299,col 32)",
        "(line 300,col 9)-(line 300,col 32)",
        "(line 301,col 9)-(line 306,col 9)",
        "(line 314,col 9)-(line 314,col 59)",
        "(line 315,col 9)-(line 315,col 29)",
        "(line 316,col 9)-(line 316,col 37)",
        "(line 317,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 29)",
        "(line 322,col 9)-(line 322,col 29)",
        "(line 325,col 9)-(line 325,col 50)",
        "(line 326,col 9)-(line 326,col 45)",
        "(line 327,col 9)-(line 327,col 49)",
        "(line 330,col 9)-(line 330,col 24)",
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 88)",
        "(line 337,col 9)-(line 337,col 35)",
        "(line 338,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 341,col 105)",
        "(line 344,col 9)-(line 351,col 9)",
        "(line 354,col 9)-(line 354,col 62)",
        "(line 355,col 9)-(line 385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 389,
      "end_line": 441,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 48)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 419,col 38)",
        "(line 420,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 43)",
        "(line 430,col 9)-(line 430,col 39)",
        "(line 431,col 9)-(line 434,col 9)",
        "(line 439,col 9)-(line 440,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 444,
      "end_line": 496,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 445,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 61)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 461,col 54)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 38)",
        "(line 475,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 43)",
        "(line 485,col 9)-(line 485,col 39)",
        "(line 486,col 9)-(line 489,col 9)",
        "(line 494,col 9)-(line 495,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 499,
      "end_line": 535,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 500,col 9)-(line 505,col 9)",
        "(line 506,col 9)-(line 511,col 9)",
        "(line 512,col 9)-(line 512,col 41)",
        "(line 513,col 9)-(line 513,col 35)",
        "(line 514,col 9)-(line 514,col 27)",
        "(line 515,col 9)-(line 515,col 27)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 517,col 26)",
        "(line 518,col 9)-(line 528,col 9)",
        "(line 533,col 9)-(line 534,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 538,
      "end_line": 543,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 539,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 546,
      "end_line": 565,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 547,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 553,col 54)",
        "(line 554,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 34)",
        "(line 558,col 9)-(line 558,col 44)",
        "(line 559,col 9)-(line 559,col 28)",
        "(line 564,col 9)-(line 564,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 568,
      "end_line": 596,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 569,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 581,col 25)",
        "(line 582,col 9)-(line 582,col 21)",
        "(line 583,col 9)-(line 588,col 9)",
        "(line 594,col 9)-(line 595,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 599,
      "end_line": 645,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 600,col 9)-(line 600,col 32)",
        "(line 601,col 9)-(line 601,col 48)",
        "(line 602,col 9)-(line 602,col 28)",
        "(line 603,col 9)-(line 604,col 65)",
        "(line 605,col 9)-(line 605,col 32)",
        "(line 606,col 9)-(line 606,col 76)",
        "(line 607,col 9)-(line 607,col 38)",
        "(line 608,col 9)-(line 608,col 56)",
        "(line 609,col 9)-(line 609,col 34)",
        "(line 610,col 9)-(line 611,col 43)",
        "(line 612,col 9)-(line 612,col 38)",
        "(line 613,col 9)-(line 614,col 61)",
        "(line 633,col 9)-(line 633,col 49)",
        "(line 634,col 9)-(line 634,col 23)",
        "(line 635,col 9)-(line 635,col 26)",
        "(line 636,col 9)-(line 636,col 50)",
        "(line 637,col 9)-(line 637,col 31)",
        "(line 638,col 9)-(line 638,col 33)",
        "(line 639,col 9)-(line 639,col 34)",
        "(line 640,col 9)-(line 640,col 20)",
        "(line 641,col 9)-(line 641,col 26)",
        "(line 642,col 9)-(line 642,col 35)",
        "(line 643,col 9)-(line 643,col 27)",
        "(line 644,col 9)-(line 644,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 648,
      "end_line": 705,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 649,col 9)-(line 651,col 59)",
        "(line 652,col 9)-(line 652,col 59)",
        "(line 653,col 9)-(line 653,col 81)",
        "(line 655,col 9)-(line 655,col 53)",
        "(line 656,col 9)-(line 658,col 9)",
        "(line 660,col 9)-(line 660,col 39)",
        "(line 661,col 9)-(line 666,col 9)",
        "(line 668,col 9)-(line 671,col 9)",
        "(line 677,col 9)-(line 678,col 69)",
        "(line 681,col 9)-(line 681,col 51)",
        "(line 682,col 9)-(line 682,col 22)",
        "(line 683,col 9)-(line 683,col 52)",
        "(line 684,col 9)-(line 684,col 43)",
        "(line 685,col 9)-(line 687,col 9)",
        "(line 690,col 9)-(line 695,col 9)",
        "(line 698,col 9)-(line 704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 707,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 718,col 9)",
        "(line 719,col 9)-(line 719,col 67)",
        "(line 720,col 9)-(line 720,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 724,
      "end_line": 772,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 725,col 9)-(line 726,col 43)",
        "(line 727,col 9)-(line 727,col 47)",
        "(line 728,col 9)-(line 728,col 61)",
        "(line 730,col 9)-(line 733,col 9)",
        "(line 739,col 9)-(line 740,col 69)",
        "(line 743,col 9)-(line 743,col 54)",
        "(line 744,col 9)-(line 771,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 779,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 780,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 791,col 38)",
        "(line 792,col 9)-(line 792,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 795,
      "end_line": 814,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 31)",
        "(line 798,col 9)-(line 798,col 44)",
        "(line 799,col 9)-(line 801,col 9)",
        "(line 803,col 9)-(line 803,col 31)",
        "(line 804,col 9)-(line 804,col 79)",
        "(line 810,col 9)-(line 813,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 816,
      "end_line": 825,
      "comment": "",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 95)",
        "(line 818,col 9)-(line 818,col 36)",
        "(line 819,col 9)-(line 819,col 32)",
        "(line 820,col 9)-(line 823,col 9)",
        "(line 824,col 9)-(line 824,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 827,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 828,col 9)-(line 828,col 102)",
        "(line 829,col 9)-(line 829,col 36)",
        "(line 830,col 9)-(line 830,col 32)",
        "(line 831,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 838,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 839,col 9)-(line 839,col 100)",
        "(line 840,col 9)-(line 840,col 36)",
        "(line 841,col 9)-(line 841,col 32)",
        "(line 842,col 9)-(line 845,col 9)",
        "(line 846,col 9)-(line 846,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 849,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 94)",
        "(line 851,col 9)-(line 851,col 36)",
        "(line 852,col 9)-(line 852,col 32)",
        "(line 853,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 860,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 861,col 9)-(line 861,col 97)",
        "(line 862,col 9)-(line 862,col 36)",
        "(line 863,col 9)-(line 863,col 32)",
        "(line 864,col 9)-(line 867,col 9)",
        "(line 868,col 9)-(line 868,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 871,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 91)",
        "(line 873,col 9)-(line 873,col 36)",
        "(line 874,col 9)-(line 874,col 32)",
        "(line 875,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 882,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 103)",
        "(line 884,col 9)-(line 884,col 36)",
        "(line 885,col 9)-(line 885,col 32)",
        "(line 886,col 9)-(line 889,col 9)",
        "(line 890,col 9)-(line 890,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 893,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 81)",
        "(line 895,col 9)-(line 895,col 67)",
        "(line 896,col 9)-(line 896,col 70)",
        "(line 897,col 9)-(line 897,col 30)",
        "(line 898,col 9)-(line 898,col 85)",
        "(line 899,col 9)-(line 899,col 107)",
        "(line 900,col 9)-(line 900,col 53)",
        "(line 901,col 9)-(line 901,col 49)",
        "(line 902,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 32)",
        "(line 906,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 918,
      "end_line": 941,
      "comment": "",
      "child_ranges": [
        "(line 919,col 9)-(line 919,col 93)",
        "(line 920,col 9)-(line 920,col 67)",
        "(line 921,col 9)-(line 921,col 70)",
        "(line 922,col 9)-(line 922,col 30)",
        "(line 923,col 9)-(line 923,col 85)",
        "(line 924,col 9)-(line 924,col 119)",
        "(line 925,col 9)-(line 925,col 53)",
        "(line 926,col 9)-(line 926,col 49)",
        "(line 927,col 9)-(line 929,col 9)",
        "(line 930,col 9)-(line 930,col 32)",
        "(line 931,col 9)-(line 939,col 9)",
        "(line 940,col 9)-(line 940,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 943,
      "end_line": 965,
      "comment": "",
      "child_ranges": [
        "(line 944,col 9)-(line 944,col 77)",
        "(line 945,col 9)-(line 945,col 67)",
        "(line 946,col 9)-(line 946,col 70)",
        "(line 947,col 9)-(line 947,col 30)",
        "(line 948,col 9)-(line 948,col 85)",
        "(line 949,col 9)-(line 949,col 103)",
        "(line 950,col 9)-(line 950,col 53)",
        "(line 951,col 9)-(line 951,col 49)",
        "(line 952,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 32)",
        "(line 956,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 967,
      "end_line": 989,
      "comment": "",
      "child_ranges": [
        "(line 968,col 9)-(line 968,col 73)",
        "(line 969,col 9)-(line 969,col 67)",
        "(line 970,col 9)-(line 970,col 70)",
        "(line 971,col 9)-(line 971,col 30)",
        "(line 972,col 9)-(line 972,col 85)",
        "(line 973,col 9)-(line 973,col 99)",
        "(line 974,col 9)-(line 974,col 53)",
        "(line 975,col 9)-(line 975,col 49)",
        "(line 976,col 9)-(line 978,col 9)",
        "(line 979,col 9)-(line 979,col 32)",
        "(line 980,col 9)-(line 987,col 9)",
        "(line 988,col 9)-(line 988,col 93)"
      ]
    }
  ]
}
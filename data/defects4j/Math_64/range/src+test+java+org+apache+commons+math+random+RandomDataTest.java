{
  "filepath": "/tmp/Math-64b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 57,
      "end_line": 993,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 59,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 20)",
        "(line 61,col 9)-(line 61,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 67,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 72,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 73)",
        "(line 74,col 9)-(line 74,col 73)",
        "(line 75,col 9)-(line 75,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 78,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 69)",
        "(line 80,col 9)-(line 80,col 69)",
        "(line 81,col 9)-(line 81,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 85,
      "end_line": 110,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 86,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 41)",
        "(line 93,col 9)-(line 93,col 22)",
        "(line 94,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 102,col 9)",
        "(line 108,col 9)-(line 109,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 113,
      "end_line": 138,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 114,col 9)-(line 119,col 9)",
        "(line 120,col 9)-(line 120,col 41)",
        "(line 121,col 9)-(line 121,col 23)",
        "(line 122,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 38)",
        "(line 128,col 9)-(line 130,col 9)",
        "(line 136,col 9)-(line 137,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 141,
      "end_line": 166,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 142,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 149,col 9)-(line 149,col 23)",
        "(line 150,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 38)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 164,col 9)-(line 165,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 169,
      "end_line": 194,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 170,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 41)",
        "(line 177,col 9)-(line 177,col 22)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 38)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 192,col 9)-(line 193,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 202,
      "end_line": 236,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 209,col 38)",
        "(line 210,col 9)-(line 216,col 9)",
        "(line 217,col 9)-(line 218,col 64)",
        "(line 219,col 9)-(line 219,col 38)",
        "(line 220,col 9)-(line 221,col 56)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 228,col 9)",
        "(line 229,col 9)-(line 234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 238,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 32)",
        "(line 244,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 253,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 267,
      "end_line": 388,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 36)",
        "(line 270,col 9)-(line 270,col 39)",
        "(line 271,col 9)-(line 271,col 34)",
        "(line 272,col 9)-(line 272,col 35)",
        "(line 273,col 9)-(line 273,col 46)",
        "(line 274,col 9)-(line 280,col 9)",
        "(line 288,col 9)-(line 288,col 84)",
        "(line 289,col 9)-(line 289,col 22)",
        "(line 290,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 293,col 37)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 299,col 9)-(line 299,col 25)",
        "(line 300,col 9)-(line 300,col 40)",
        "(line 301,col 9)-(line 301,col 32)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 308,col 9)",
        "(line 316,col 9)-(line 316,col 59)",
        "(line 317,col 9)-(line 317,col 29)",
        "(line 318,col 9)-(line 318,col 37)",
        "(line 319,col 9)-(line 322,col 9)",
        "(line 323,col 9)-(line 323,col 29)",
        "(line 324,col 9)-(line 324,col 29)",
        "(line 327,col 9)-(line 327,col 50)",
        "(line 328,col 9)-(line 328,col 45)",
        "(line 329,col 9)-(line 329,col 49)",
        "(line 332,col 9)-(line 332,col 24)",
        "(line 333,col 9)-(line 335,col 9)",
        "(line 336,col 9)-(line 336,col 88)",
        "(line 339,col 9)-(line 339,col 35)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 105)",
        "(line 346,col 9)-(line 353,col 9)",
        "(line 356,col 9)-(line 356,col 62)",
        "(line 357,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 391,
      "end_line": 443,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 392,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 55)",
        "(line 405,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 408,col 48)",
        "(line 409,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 421,col 38)",
        "(line 422,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 43)",
        "(line 432,col 9)-(line 432,col 39)",
        "(line 433,col 9)-(line 436,col 9)",
        "(line 441,col 9)-(line 442,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 446,
      "end_line": 498,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 447,col 9)-(line 452,col 9)",
        "(line 453,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 459,col 61)",
        "(line 460,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 463,col 54)",
        "(line 464,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 476,col 38)",
        "(line 477,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 43)",
        "(line 487,col 9)-(line 487,col 39)",
        "(line 488,col 9)-(line 491,col 9)",
        "(line 496,col 9)-(line 497,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 501,
      "end_line": 537,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 502,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 514,col 41)",
        "(line 515,col 9)-(line 515,col 35)",
        "(line 516,col 9)-(line 516,col 27)",
        "(line 517,col 9)-(line 517,col 27)",
        "(line 518,col 9)-(line 518,col 47)",
        "(line 519,col 9)-(line 519,col 26)",
        "(line 520,col 9)-(line 530,col 9)",
        "(line 535,col 9)-(line 536,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 540,
      "end_line": 545,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 541,col 9)-(line 544,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 548,
      "end_line": 567,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 549,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 54)",
        "(line 556,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 34)",
        "(line 560,col 9)-(line 560,col 44)",
        "(line 561,col 9)-(line 561,col 28)",
        "(line 566,col 9)-(line 566,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 570,
      "end_line": 598,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 571,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 582,col 9)",
        "(line 583,col 9)-(line 583,col 25)",
        "(line 584,col 9)-(line 584,col 21)",
        "(line 585,col 9)-(line 590,col 9)",
        "(line 596,col 9)-(line 597,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 601,
      "end_line": 647,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 32)",
        "(line 603,col 9)-(line 603,col 48)",
        "(line 604,col 9)-(line 604,col 28)",
        "(line 605,col 9)-(line 606,col 65)",
        "(line 607,col 9)-(line 607,col 32)",
        "(line 608,col 9)-(line 608,col 76)",
        "(line 609,col 9)-(line 609,col 38)",
        "(line 610,col 9)-(line 610,col 56)",
        "(line 611,col 9)-(line 611,col 34)",
        "(line 612,col 9)-(line 613,col 43)",
        "(line 614,col 9)-(line 614,col 38)",
        "(line 615,col 9)-(line 616,col 61)",
        "(line 635,col 9)-(line 635,col 49)",
        "(line 636,col 9)-(line 636,col 23)",
        "(line 637,col 9)-(line 637,col 26)",
        "(line 638,col 9)-(line 638,col 50)",
        "(line 639,col 9)-(line 639,col 31)",
        "(line 640,col 9)-(line 640,col 33)",
        "(line 641,col 9)-(line 641,col 34)",
        "(line 642,col 9)-(line 642,col 20)",
        "(line 643,col 9)-(line 643,col 26)",
        "(line 644,col 9)-(line 644,col 35)",
        "(line 645,col 9)-(line 645,col 27)",
        "(line 646,col 9)-(line 646,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 650,
      "end_line": 707,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 651,col 9)-(line 653,col 59)",
        "(line 654,col 9)-(line 654,col 59)",
        "(line 655,col 9)-(line 655,col 81)",
        "(line 657,col 9)-(line 657,col 53)",
        "(line 658,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 662,col 39)",
        "(line 663,col 9)-(line 668,col 9)",
        "(line 670,col 9)-(line 673,col 9)",
        "(line 679,col 9)-(line 680,col 69)",
        "(line 683,col 9)-(line 683,col 51)",
        "(line 684,col 9)-(line 684,col 22)",
        "(line 685,col 9)-(line 685,col 52)",
        "(line 686,col 9)-(line 686,col 43)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 692,col 9)-(line 697,col 9)",
        "(line 700,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 709,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 711,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 67)",
        "(line 722,col 9)-(line 722,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 726,
      "end_line": 774,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 727,col 9)-(line 728,col 43)",
        "(line 729,col 9)-(line 729,col 47)",
        "(line 730,col 9)-(line 730,col 61)",
        "(line 732,col 9)-(line 735,col 9)",
        "(line 741,col 9)-(line 742,col 69)",
        "(line 745,col 9)-(line 745,col 54)",
        "(line 746,col 9)-(line 773,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 781,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 782,col 9)-(line 792,col 9)",
        "(line 793,col 9)-(line 793,col 38)",
        "(line 794,col 9)-(line 794,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 797,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 31)",
        "(line 800,col 9)-(line 800,col 44)",
        "(line 801,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 31)",
        "(line 806,col 9)-(line 806,col 79)",
        "(line 812,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 818,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 95)",
        "(line 820,col 9)-(line 820,col 36)",
        "(line 821,col 9)-(line 821,col 32)",
        "(line 822,col 9)-(line 825,col 9)",
        "(line 826,col 9)-(line 826,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 829,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 102)",
        "(line 831,col 9)-(line 831,col 36)",
        "(line 832,col 9)-(line 832,col 32)",
        "(line 833,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 840,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 100)",
        "(line 842,col 9)-(line 842,col 36)",
        "(line 843,col 9)-(line 843,col 32)",
        "(line 844,col 9)-(line 847,col 9)",
        "(line 848,col 9)-(line 848,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 851,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 852,col 9)-(line 852,col 94)",
        "(line 853,col 9)-(line 853,col 36)",
        "(line 854,col 9)-(line 854,col 32)",
        "(line 855,col 9)-(line 858,col 9)",
        "(line 859,col 9)-(line 859,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 862,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 97)",
        "(line 864,col 9)-(line 864,col 36)",
        "(line 865,col 9)-(line 865,col 32)",
        "(line 866,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 873,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 91)",
        "(line 875,col 9)-(line 875,col 36)",
        "(line 876,col 9)-(line 876,col 32)",
        "(line 877,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 884,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 885,col 9)-(line 885,col 103)",
        "(line 886,col 9)-(line 886,col 36)",
        "(line 887,col 9)-(line 887,col 32)",
        "(line 888,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 895,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 81)",
        "(line 897,col 9)-(line 897,col 67)",
        "(line 898,col 9)-(line 898,col 70)",
        "(line 899,col 9)-(line 899,col 30)",
        "(line 900,col 9)-(line 900,col 85)",
        "(line 901,col 9)-(line 901,col 107)",
        "(line 902,col 9)-(line 902,col 53)",
        "(line 903,col 9)-(line 903,col 49)",
        "(line 904,col 9)-(line 906,col 9)",
        "(line 907,col 9)-(line 907,col 32)",
        "(line 908,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 920,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 93)",
        "(line 922,col 9)-(line 922,col 67)",
        "(line 923,col 9)-(line 923,col 70)",
        "(line 924,col 9)-(line 924,col 30)",
        "(line 925,col 9)-(line 925,col 85)",
        "(line 926,col 9)-(line 926,col 119)",
        "(line 927,col 9)-(line 927,col 53)",
        "(line 928,col 9)-(line 928,col 49)",
        "(line 929,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 32)",
        "(line 933,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 945,
      "end_line": 967,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 77)",
        "(line 947,col 9)-(line 947,col 67)",
        "(line 948,col 9)-(line 948,col 70)",
        "(line 949,col 9)-(line 949,col 30)",
        "(line 950,col 9)-(line 950,col 85)",
        "(line 951,col 9)-(line 951,col 103)",
        "(line 952,col 9)-(line 952,col 53)",
        "(line 953,col 9)-(line 953,col 49)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 32)",
        "(line 958,col 9)-(line 965,col 9)",
        "(line 966,col 9)-(line 966,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 969,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 970,col 9)-(line 970,col 73)",
        "(line 971,col 9)-(line 971,col 67)",
        "(line 972,col 9)-(line 972,col 70)",
        "(line 973,col 9)-(line 973,col 30)",
        "(line 974,col 9)-(line 974,col 85)",
        "(line 975,col 9)-(line 975,col 99)",
        "(line 976,col 9)-(line 976,col 53)",
        "(line 977,col 9)-(line 977,col 49)",
        "(line 978,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 32)",
        "(line 982,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 990,col 93)"
      ]
    }
  ]
}
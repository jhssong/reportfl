{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 58,
      "end_line": 994,
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
      "end_line": 237,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 38)",
        "(line 211,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 219,col 64)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 222,col 56)",
        "(line 223,col 9)-(line 223,col 60)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 239,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 32)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 254,col 9)-(line 256,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 268,
      "end_line": 389,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 36)",
        "(line 271,col 9)-(line 271,col 39)",
        "(line 272,col 9)-(line 272,col 34)",
        "(line 273,col 9)-(line 273,col 35)",
        "(line 274,col 9)-(line 274,col 46)",
        "(line 275,col 9)-(line 281,col 9)",
        "(line 289,col 9)-(line 289,col 84)",
        "(line 290,col 9)-(line 290,col 22)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 294,col 37)",
        "(line 295,col 9)-(line 297,col 9)",
        "(line 300,col 9)-(line 300,col 25)",
        "(line 301,col 9)-(line 301,col 40)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 303,col 32)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 317,col 9)-(line 317,col 59)",
        "(line 318,col 9)-(line 318,col 29)",
        "(line 319,col 9)-(line 319,col 37)",
        "(line 320,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 29)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 328,col 9)-(line 328,col 50)",
        "(line 329,col 9)-(line 329,col 45)",
        "(line 330,col 9)-(line 330,col 49)",
        "(line 333,col 9)-(line 333,col 24)",
        "(line 334,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 88)",
        "(line 340,col 9)-(line 340,col 35)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 105)",
        "(line 347,col 9)-(line 354,col 9)",
        "(line 357,col 9)-(line 357,col 62)",
        "(line 358,col 9)-(line 388,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 392,
      "end_line": 444,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 393,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 55)",
        "(line 406,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 409,col 48)",
        "(line 410,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 38)",
        "(line 423,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 43)",
        "(line 433,col 9)-(line 433,col 39)",
        "(line 434,col 9)-(line 437,col 9)",
        "(line 442,col 9)-(line 443,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 447,
      "end_line": 499,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 448,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 459,col 9)",
        "(line 460,col 9)-(line 460,col 61)",
        "(line 461,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 464,col 54)",
        "(line 465,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 477,col 38)",
        "(line 478,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 43)",
        "(line 488,col 9)-(line 488,col 39)",
        "(line 489,col 9)-(line 492,col 9)",
        "(line 497,col 9)-(line 498,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 502,
      "end_line": 538,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 503,col 9)-(line 508,col 9)",
        "(line 509,col 9)-(line 514,col 9)",
        "(line 515,col 9)-(line 515,col 41)",
        "(line 516,col 9)-(line 516,col 35)",
        "(line 517,col 9)-(line 517,col 27)",
        "(line 518,col 9)-(line 518,col 27)",
        "(line 519,col 9)-(line 519,col 47)",
        "(line 520,col 9)-(line 520,col 26)",
        "(line 521,col 9)-(line 531,col 9)",
        "(line 536,col 9)-(line 537,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 541,
      "end_line": 546,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 542,col 9)-(line 545,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 549,
      "end_line": 568,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 550,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 556,col 54)",
        "(line 557,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 560,col 34)",
        "(line 561,col 9)-(line 561,col 44)",
        "(line 562,col 9)-(line 562,col 28)",
        "(line 567,col 9)-(line 567,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 571,
      "end_line": 599,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 572,col 9)-(line 577,col 9)",
        "(line 578,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 25)",
        "(line 585,col 9)-(line 585,col 21)",
        "(line 586,col 9)-(line 591,col 9)",
        "(line 597,col 9)-(line 598,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 602,
      "end_line": 648,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 32)",
        "(line 604,col 9)-(line 604,col 48)",
        "(line 605,col 9)-(line 605,col 28)",
        "(line 606,col 9)-(line 607,col 65)",
        "(line 608,col 9)-(line 608,col 32)",
        "(line 609,col 9)-(line 609,col 76)",
        "(line 610,col 9)-(line 610,col 38)",
        "(line 611,col 9)-(line 611,col 56)",
        "(line 612,col 9)-(line 612,col 34)",
        "(line 613,col 9)-(line 614,col 43)",
        "(line 615,col 9)-(line 615,col 38)",
        "(line 616,col 9)-(line 617,col 61)",
        "(line 636,col 9)-(line 636,col 49)",
        "(line 637,col 9)-(line 637,col 23)",
        "(line 638,col 9)-(line 638,col 26)",
        "(line 639,col 9)-(line 639,col 50)",
        "(line 640,col 9)-(line 640,col 31)",
        "(line 641,col 9)-(line 641,col 33)",
        "(line 642,col 9)-(line 642,col 34)",
        "(line 643,col 9)-(line 643,col 20)",
        "(line 644,col 9)-(line 644,col 26)",
        "(line 645,col 9)-(line 645,col 35)",
        "(line 646,col 9)-(line 646,col 27)",
        "(line 647,col 9)-(line 647,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 651,
      "end_line": 708,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 652,col 9)-(line 654,col 59)",
        "(line 655,col 9)-(line 655,col 59)",
        "(line 656,col 9)-(line 656,col 81)",
        "(line 658,col 9)-(line 658,col 53)",
        "(line 659,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 663,col 39)",
        "(line 664,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 674,col 9)",
        "(line 680,col 9)-(line 681,col 69)",
        "(line 684,col 9)-(line 684,col 51)",
        "(line 685,col 9)-(line 685,col 22)",
        "(line 686,col 9)-(line 686,col 52)",
        "(line 687,col 9)-(line 687,col 43)",
        "(line 688,col 9)-(line 690,col 9)",
        "(line 693,col 9)-(line 698,col 9)",
        "(line 701,col 9)-(line 707,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 710,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 712,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 67)",
        "(line 723,col 9)-(line 723,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 727,
      "end_line": 775,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 728,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 730,col 47)",
        "(line 731,col 9)-(line 731,col 61)",
        "(line 733,col 9)-(line 736,col 9)",
        "(line 742,col 9)-(line 743,col 69)",
        "(line 746,col 9)-(line 746,col 54)",
        "(line 747,col 9)-(line 774,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 782,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 783,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 38)",
        "(line 795,col 9)-(line 795,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 798,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 31)",
        "(line 801,col 9)-(line 801,col 44)",
        "(line 802,col 9)-(line 804,col 9)",
        "(line 806,col 9)-(line 806,col 31)",
        "(line 807,col 9)-(line 807,col 79)",
        "(line 813,col 9)-(line 816,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 819,
      "end_line": 828,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 95)",
        "(line 821,col 9)-(line 821,col 36)",
        "(line 822,col 9)-(line 822,col 32)",
        "(line 823,col 9)-(line 826,col 9)",
        "(line 827,col 9)-(line 827,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 830,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 831,col 9)-(line 831,col 102)",
        "(line 832,col 9)-(line 832,col 36)",
        "(line 833,col 9)-(line 833,col 32)",
        "(line 834,col 9)-(line 837,col 9)",
        "(line 838,col 9)-(line 838,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 841,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 100)",
        "(line 843,col 9)-(line 843,col 36)",
        "(line 844,col 9)-(line 844,col 32)",
        "(line 845,col 9)-(line 848,col 9)",
        "(line 849,col 9)-(line 849,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 852,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 94)",
        "(line 854,col 9)-(line 854,col 36)",
        "(line 855,col 9)-(line 855,col 32)",
        "(line 856,col 9)-(line 859,col 9)",
        "(line 860,col 9)-(line 860,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 863,
      "end_line": 872,
      "comment": "",
      "child_ranges": [
        "(line 864,col 9)-(line 864,col 97)",
        "(line 865,col 9)-(line 865,col 36)",
        "(line 866,col 9)-(line 866,col 32)",
        "(line 867,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 871,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 874,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 91)",
        "(line 876,col 9)-(line 876,col 36)",
        "(line 877,col 9)-(line 877,col 32)",
        "(line 878,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 885,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 103)",
        "(line 887,col 9)-(line 887,col 36)",
        "(line 888,col 9)-(line 888,col 32)",
        "(line 889,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 896,
      "end_line": 919,
      "comment": "",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 81)",
        "(line 898,col 9)-(line 898,col 67)",
        "(line 899,col 9)-(line 899,col 70)",
        "(line 900,col 9)-(line 900,col 30)",
        "(line 901,col 9)-(line 901,col 85)",
        "(line 902,col 9)-(line 902,col 107)",
        "(line 903,col 9)-(line 903,col 53)",
        "(line 904,col 9)-(line 904,col 49)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 32)",
        "(line 909,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 921,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 93)",
        "(line 923,col 9)-(line 923,col 67)",
        "(line 924,col 9)-(line 924,col 70)",
        "(line 925,col 9)-(line 925,col 30)",
        "(line 926,col 9)-(line 926,col 85)",
        "(line 927,col 9)-(line 927,col 119)",
        "(line 928,col 9)-(line 928,col 53)",
        "(line 929,col 9)-(line 929,col 49)",
        "(line 930,col 9)-(line 932,col 9)",
        "(line 933,col 9)-(line 933,col 32)",
        "(line 934,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 946,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 77)",
        "(line 948,col 9)-(line 948,col 67)",
        "(line 949,col 9)-(line 949,col 70)",
        "(line 950,col 9)-(line 950,col 30)",
        "(line 951,col 9)-(line 951,col 85)",
        "(line 952,col 9)-(line 952,col 103)",
        "(line 953,col 9)-(line 953,col 53)",
        "(line 954,col 9)-(line 954,col 49)",
        "(line 955,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 958,col 32)",
        "(line 959,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 970,
      "end_line": 992,
      "comment": "",
      "child_ranges": [
        "(line 971,col 9)-(line 971,col 73)",
        "(line 972,col 9)-(line 972,col 67)",
        "(line 973,col 9)-(line 973,col 70)",
        "(line 974,col 9)-(line 974,col 30)",
        "(line 975,col 9)-(line 975,col 85)",
        "(line 976,col 9)-(line 976,col 99)",
        "(line 977,col 9)-(line 977,col 53)",
        "(line 978,col 9)-(line 978,col 49)",
        "(line 979,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 32)",
        "(line 983,col 9)-(line 990,col 9)",
        "(line 991,col 9)-(line 991,col 93)"
      ]
    }
  ]
}
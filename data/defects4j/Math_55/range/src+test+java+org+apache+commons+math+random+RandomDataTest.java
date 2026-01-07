{
  "filepath": "/tmp/Math-55b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1022,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest()",
      "begin_line": 65,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 72,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 77,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 73)",
        "(line 80,col 9)-(line 80,col 73)",
        "(line 81,col 9)-(line 81,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 84,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 69)",
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 88,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 92,
      "end_line": 118,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 94,col 9)-(line 99,col 9)",
        "(line 100,col 9)-(line 100,col 41)",
        "(line 101,col 9)-(line 101,col 22)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 38)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 116,col 9)-(line 117,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 121,
      "end_line": 147,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 123,col 9)-(line 128,col 9)",
        "(line 129,col 9)-(line 129,col 41)",
        "(line 130,col 9)-(line 130,col 23)",
        "(line 131,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 38)",
        "(line 137,col 9)-(line 139,col 9)",
        "(line 145,col 9)-(line 146,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 150,
      "end_line": 176,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 41)",
        "(line 159,col 9)-(line 159,col 23)",
        "(line 160,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 38)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 174,col 9)-(line 175,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 179,
      "end_line": 205,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 181,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 41)",
        "(line 188,col 9)-(line 188,col 22)",
        "(line 189,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 38)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 203,col 9)-(line 204,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 213,
      "end_line": 244,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 221,col 38)",
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 226,col 64)",
        "(line 227,col 9)-(line 227,col 38)",
        "(line 228,col 9)-(line 229,col 56)",
        "(line 230,col 9)-(line 230,col 67)",
        "(line 231,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 246,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 32)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 259,col 9)",
        "(line 262,col 9)-(line 264,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 276,
      "end_line": 395,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 36)",
        "(line 279,col 9)-(line 279,col 39)",
        "(line 280,col 9)-(line 280,col 34)",
        "(line 281,col 9)-(line 281,col 35)",
        "(line 282,col 9)-(line 282,col 46)",
        "(line 283,col 9)-(line 289,col 9)",
        "(line 297,col 9)-(line 297,col 84)",
        "(line 298,col 9)-(line 298,col 22)",
        "(line 299,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 37)",
        "(line 303,col 9)-(line 305,col 9)",
        "(line 308,col 9)-(line 308,col 25)",
        "(line 309,col 9)-(line 309,col 40)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 317,col 9)",
        "(line 325,col 9)-(line 325,col 59)",
        "(line 326,col 9)-(line 326,col 29)",
        "(line 327,col 9)-(line 327,col 37)",
        "(line 328,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 29)",
        "(line 333,col 9)-(line 333,col 29)",
        "(line 336,col 9)-(line 336,col 50)",
        "(line 337,col 9)-(line 337,col 45)",
        "(line 338,col 9)-(line 338,col 49)",
        "(line 341,col 9)-(line 341,col 24)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 88)",
        "(line 348,col 9)-(line 348,col 35)",
        "(line 349,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 105)",
        "(line 355,col 9)-(line 362,col 9)",
        "(line 365,col 9)-(line 365,col 62)",
        "(line 367,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 398,
      "end_line": 452,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 401,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 55)",
        "(line 414,col 9)-(line 416,col 9)",
        "(line 417,col 9)-(line 417,col 48)",
        "(line 418,col 9)-(line 420,col 9)",
        "(line 421,col 9)-(line 426,col 9)",
        "(line 427,col 9)-(line 429,col 9)",
        "(line 430,col 9)-(line 430,col 38)",
        "(line 431,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 43)",
        "(line 441,col 9)-(line 441,col 39)",
        "(line 442,col 9)-(line 445,col 9)",
        "(line 450,col 9)-(line 451,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 455,
      "end_line": 508,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 457,col 9)-(line 462,col 9)",
        "(line 463,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 469,col 61)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 473,col 54)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 482,col 9)",
        "(line 483,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 38)",
        "(line 487,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 43)",
        "(line 497,col 9)-(line 497,col 39)",
        "(line 498,col 9)-(line 501,col 9)",
        "(line 506,col 9)-(line 507,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 511,
      "end_line": 548,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 513,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 41)",
        "(line 526,col 9)-(line 526,col 35)",
        "(line 527,col 9)-(line 527,col 27)",
        "(line 528,col 9)-(line 528,col 27)",
        "(line 529,col 9)-(line 529,col 47)",
        "(line 530,col 9)-(line 530,col 26)",
        "(line 531,col 9)-(line 541,col 9)",
        "(line 546,col 9)-(line 547,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 551,
      "end_line": 557,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 553,col 9)-(line 556,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 560,
      "end_line": 580,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 562,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 568,col 54)",
        "(line 569,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 34)",
        "(line 573,col 9)-(line 573,col 44)",
        "(line 574,col 9)-(line 574,col 28)",
        "(line 579,col 9)-(line 579,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 583,
      "end_line": 612,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 585,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 25)",
        "(line 598,col 9)-(line 598,col 21)",
        "(line 599,col 9)-(line 604,col 9)",
        "(line 610,col 9)-(line 611,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 615,
      "end_line": 662,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 32)",
        "(line 618,col 9)-(line 618,col 48)",
        "(line 619,col 9)-(line 619,col 28)",
        "(line 620,col 9)-(line 621,col 65)",
        "(line 622,col 9)-(line 622,col 32)",
        "(line 623,col 9)-(line 623,col 83)",
        "(line 624,col 9)-(line 624,col 38)",
        "(line 625,col 9)-(line 625,col 56)",
        "(line 626,col 9)-(line 626,col 34)",
        "(line 627,col 9)-(line 628,col 43)",
        "(line 629,col 9)-(line 629,col 38)",
        "(line 630,col 9)-(line 631,col 61)",
        "(line 650,col 9)-(line 650,col 49)",
        "(line 651,col 9)-(line 651,col 23)",
        "(line 652,col 9)-(line 652,col 26)",
        "(line 653,col 9)-(line 653,col 50)",
        "(line 654,col 9)-(line 654,col 31)",
        "(line 655,col 9)-(line 655,col 33)",
        "(line 656,col 9)-(line 656,col 34)",
        "(line 657,col 9)-(line 657,col 20)",
        "(line 658,col 9)-(line 658,col 26)",
        "(line 659,col 9)-(line 659,col 35)",
        "(line 660,col 9)-(line 660,col 27)",
        "(line 661,col 9)-(line 661,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 665,
      "end_line": 723,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 59)",
        "(line 670,col 9)-(line 670,col 59)",
        "(line 671,col 9)-(line 671,col 81)",
        "(line 673,col 9)-(line 673,col 53)",
        "(line 674,col 9)-(line 676,col 9)",
        "(line 678,col 9)-(line 678,col 39)",
        "(line 679,col 9)-(line 684,col 9)",
        "(line 686,col 9)-(line 689,col 9)",
        "(line 695,col 9)-(line 696,col 69)",
        "(line 699,col 9)-(line 699,col 51)",
        "(line 700,col 9)-(line 700,col 22)",
        "(line 701,col 9)-(line 701,col 52)",
        "(line 702,col 9)-(line 702,col 43)",
        "(line 703,col 9)-(line 705,col 9)",
        "(line 708,col 9)-(line 713,col 9)",
        "(line 716,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 725,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 74)",
        "(line 738,col 9)-(line 738,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 742,
      "end_line": 791,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 744,col 9)-(line 745,col 43)",
        "(line 746,col 9)-(line 746,col 47)",
        "(line 747,col 9)-(line 747,col 61)",
        "(line 749,col 9)-(line 752,col 9)",
        "(line 758,col 9)-(line 759,col 69)",
        "(line 762,col 9)-(line 762,col 54)",
        "(line 763,col 9)-(line 790,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 798,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 809,col 9)",
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 814,
      "end_line": 834,
      "comment": "",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 31)",
        "(line 818,col 9)-(line 818,col 44)",
        "(line 819,col 9)-(line 821,col 9)",
        "(line 823,col 9)-(line 823,col 31)",
        "(line 824,col 9)-(line 824,col 79)",
        "(line 830,col 9)-(line 833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 836,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 838,col 9)-(line 838,col 95)",
        "(line 839,col 9)-(line 839,col 36)",
        "(line 840,col 9)-(line 840,col 32)",
        "(line 841,col 9)-(line 844,col 9)",
        "(line 845,col 9)-(line 845,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 848,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 102)",
        "(line 851,col 9)-(line 851,col 36)",
        "(line 852,col 9)-(line 852,col 32)",
        "(line 853,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 860,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 100)",
        "(line 863,col 9)-(line 863,col 36)",
        "(line 864,col 9)-(line 864,col 32)",
        "(line 865,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 872,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 94)",
        "(line 875,col 9)-(line 875,col 36)",
        "(line 876,col 9)-(line 876,col 32)",
        "(line 877,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 884,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 97)",
        "(line 887,col 9)-(line 887,col 36)",
        "(line 888,col 9)-(line 888,col 32)",
        "(line 889,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 896,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 91)",
        "(line 899,col 9)-(line 899,col 36)",
        "(line 900,col 9)-(line 900,col 32)",
        "(line 901,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 908,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 103)",
        "(line 911,col 9)-(line 911,col 36)",
        "(line 912,col 9)-(line 912,col 32)",
        "(line 913,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 917,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 920,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 79)",
        "(line 923,col 9)-(line 923,col 67)",
        "(line 924,col 9)-(line 924,col 70)",
        "(line 925,col 9)-(line 925,col 30)",
        "(line 926,col 9)-(line 926,col 85)",
        "(line 927,col 9)-(line 927,col 107)",
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
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 946,
      "end_line": 970,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 91)",
        "(line 949,col 9)-(line 949,col 67)",
        "(line 950,col 9)-(line 950,col 70)",
        "(line 951,col 9)-(line 951,col 30)",
        "(line 952,col 9)-(line 952,col 85)",
        "(line 953,col 9)-(line 953,col 119)",
        "(line 954,col 9)-(line 954,col 53)",
        "(line 955,col 9)-(line 955,col 49)",
        "(line 956,col 9)-(line 958,col 9)",
        "(line 959,col 9)-(line 959,col 32)",
        "(line 960,col 9)-(line 968,col 9)",
        "(line 969,col 9)-(line 969,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 972,
      "end_line": 995,
      "comment": "",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 75)",
        "(line 975,col 9)-(line 975,col 67)",
        "(line 976,col 9)-(line 976,col 70)",
        "(line 977,col 9)-(line 977,col 30)",
        "(line 978,col 9)-(line 978,col 85)",
        "(line 979,col 9)-(line 979,col 103)",
        "(line 980,col 9)-(line 980,col 53)",
        "(line 981,col 9)-(line 981,col 49)",
        "(line 982,col 9)-(line 984,col 9)",
        "(line 985,col 9)-(line 985,col 32)",
        "(line 986,col 9)-(line 993,col 9)",
        "(line 994,col 9)-(line 994,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 997,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 71)",
        "(line 1000,col 9)-(line 1000,col 67)",
        "(line 1001,col 9)-(line 1001,col 70)",
        "(line 1002,col 9)-(line 1002,col 30)",
        "(line 1003,col 9)-(line 1003,col 85)",
        "(line 1004,col 9)-(line 1004,col 99)",
        "(line 1005,col 9)-(line 1005,col 53)",
        "(line 1006,col 9)-(line 1006,col 49)",
        "(line 1007,col 9)-(line 1009,col 9)",
        "(line 1010,col 9)-(line 1010,col 32)",
        "(line 1011,col 9)-(line 1018,col 9)",
        "(line 1019,col 9)-(line 1019,col 93)"
      ]
    }
  ]
}
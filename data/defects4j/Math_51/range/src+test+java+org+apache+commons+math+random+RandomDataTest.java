{
  "filepath": "/tmp/Math-51b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 1061,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest()",
      "begin_line": 66,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 42)",
        "(line 68,col 9)-(line 68,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 74,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 79,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 73)",
        "(line 82,col 9)-(line 82,col 73)",
        "(line 83,col 9)-(line 83,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 86,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 69)",
        "(line 89,col 9)-(line 89,col 69)",
        "(line 90,col 9)-(line 90,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 94,
      "end_line": 120,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 96,col 9)-(line 101,col 9)",
        "(line 102,col 9)-(line 102,col 41)",
        "(line 103,col 9)-(line 103,col 22)",
        "(line 104,col 9)-(line 108,col 9)",
        "(line 109,col 9)-(line 109,col 38)",
        "(line 110,col 9)-(line 112,col 9)",
        "(line 118,col 9)-(line 119,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 123,
      "end_line": 149,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 125,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 41)",
        "(line 132,col 9)-(line 132,col 23)",
        "(line 133,col 9)-(line 137,col 9)",
        "(line 138,col 9)-(line 138,col 38)",
        "(line 139,col 9)-(line 141,col 9)",
        "(line 147,col 9)-(line 148,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 152,
      "end_line": 178,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 41)",
        "(line 161,col 9)-(line 161,col 23)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 176,col 9)-(line 177,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 181,
      "end_line": 207,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 183,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 41)",
        "(line 190,col 9)-(line 190,col 22)",
        "(line 191,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 196,col 38)",
        "(line 197,col 9)-(line 199,col 9)",
        "(line 205,col 9)-(line 206,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 215,
      "end_line": 246,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 223,col 38)",
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 228,col 64)",
        "(line 229,col 9)-(line 229,col 38)",
        "(line 230,col 9)-(line 231,col 56)",
        "(line 232,col 9)-(line 232,col 67)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 248,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 261,col 9)-(line 263,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 275,
      "end_line": 394,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 36)",
        "(line 278,col 9)-(line 278,col 39)",
        "(line 279,col 9)-(line 279,col 34)",
        "(line 280,col 9)-(line 280,col 35)",
        "(line 281,col 9)-(line 281,col 46)",
        "(line 282,col 9)-(line 288,col 9)",
        "(line 296,col 9)-(line 296,col 84)",
        "(line 297,col 9)-(line 297,col 22)",
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 37)",
        "(line 302,col 9)-(line 304,col 9)",
        "(line 307,col 9)-(line 307,col 25)",
        "(line 308,col 9)-(line 308,col 40)",
        "(line 309,col 9)-(line 309,col 32)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 316,col 9)",
        "(line 324,col 9)-(line 324,col 59)",
        "(line 325,col 9)-(line 325,col 29)",
        "(line 326,col 9)-(line 326,col 37)",
        "(line 327,col 9)-(line 330,col 9)",
        "(line 331,col 9)-(line 331,col 29)",
        "(line 332,col 9)-(line 332,col 29)",
        "(line 335,col 9)-(line 335,col 50)",
        "(line 336,col 9)-(line 336,col 45)",
        "(line 337,col 9)-(line 337,col 49)",
        "(line 340,col 9)-(line 340,col 24)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 344,col 88)",
        "(line 347,col 9)-(line 347,col 35)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 105)",
        "(line 354,col 9)-(line 361,col 9)",
        "(line 364,col 9)-(line 364,col 62)",
        "(line 366,col 9)-(line 393,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 397,
      "end_line": 451,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 400,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 55)",
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 48)",
        "(line 417,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 38)",
        "(line 430,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 439,col 43)",
        "(line 440,col 9)-(line 440,col 39)",
        "(line 441,col 9)-(line 444,col 9)",
        "(line 449,col 9)-(line 450,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 454,
      "end_line": 507,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 456,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 61)",
        "(line 469,col 9)-(line 471,col 9)",
        "(line 472,col 9)-(line 472,col 54)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 481,col 9)",
        "(line 482,col 9)-(line 484,col 9)",
        "(line 485,col 9)-(line 485,col 38)",
        "(line 486,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 43)",
        "(line 496,col 9)-(line 496,col 39)",
        "(line 497,col 9)-(line 500,col 9)",
        "(line 505,col 9)-(line 506,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 510,
      "end_line": 547,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 512,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 41)",
        "(line 525,col 9)-(line 525,col 35)",
        "(line 526,col 9)-(line 526,col 27)",
        "(line 527,col 9)-(line 527,col 27)",
        "(line 528,col 9)-(line 528,col 47)",
        "(line 529,col 9)-(line 529,col 26)",
        "(line 530,col 9)-(line 540,col 9)",
        "(line 545,col 9)-(line 546,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 550,
      "end_line": 556,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 552,col 9)-(line 555,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 559,
      "end_line": 579,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 561,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 567,col 54)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 34)",
        "(line 572,col 9)-(line 572,col 44)",
        "(line 573,col 9)-(line 573,col 28)",
        "(line 578,col 9)-(line 578,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 582,
      "end_line": 637,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 584,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 25)",
        "(line 597,col 9)-(line 597,col 21)",
        "(line 598,col 9)-(line 603,col 9)",
        "(line 609,col 9)-(line 610,col 68)",
        "(line 615,col 9)-(line 615,col 27)",
        "(line 616,col 9)-(line 616,col 22)",
        "(line 619,col 9)-(line 619,col 91)",
        "(line 620,col 9)-(line 620,col 29)",
        "(line 621,col 9)-(line 621,col 32)",
        "(line 622,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 626,col 65)",
        "(line 629,col 9)-(line 629,col 91)",
        "(line 630,col 9)-(line 630,col 29)",
        "(line 631,col 9)-(line 631,col 32)",
        "(line 632,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 640,
      "end_line": 687,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 32)",
        "(line 643,col 9)-(line 643,col 48)",
        "(line 644,col 9)-(line 644,col 28)",
        "(line 645,col 9)-(line 646,col 65)",
        "(line 647,col 9)-(line 647,col 32)",
        "(line 648,col 9)-(line 648,col 83)",
        "(line 649,col 9)-(line 649,col 38)",
        "(line 650,col 9)-(line 650,col 56)",
        "(line 651,col 9)-(line 651,col 34)",
        "(line 652,col 9)-(line 653,col 43)",
        "(line 654,col 9)-(line 654,col 38)",
        "(line 655,col 9)-(line 656,col 61)",
        "(line 675,col 9)-(line 675,col 49)",
        "(line 676,col 9)-(line 676,col 23)",
        "(line 677,col 9)-(line 677,col 26)",
        "(line 678,col 9)-(line 678,col 50)",
        "(line 679,col 9)-(line 679,col 31)",
        "(line 680,col 9)-(line 680,col 33)",
        "(line 681,col 9)-(line 681,col 34)",
        "(line 682,col 9)-(line 682,col 20)",
        "(line 683,col 9)-(line 683,col 26)",
        "(line 684,col 9)-(line 684,col 35)",
        "(line 685,col 9)-(line 685,col 27)",
        "(line 686,col 9)-(line 686,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 690,
      "end_line": 748,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 692,col 9)-(line 694,col 59)",
        "(line 695,col 9)-(line 695,col 59)",
        "(line 696,col 9)-(line 696,col 81)",
        "(line 698,col 9)-(line 698,col 53)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 703,col 9)-(line 703,col 39)",
        "(line 704,col 9)-(line 709,col 9)",
        "(line 711,col 9)-(line 714,col 9)",
        "(line 720,col 9)-(line 721,col 69)",
        "(line 724,col 9)-(line 724,col 51)",
        "(line 725,col 9)-(line 725,col 22)",
        "(line 726,col 9)-(line 726,col 52)",
        "(line 727,col 9)-(line 727,col 43)",
        "(line 728,col 9)-(line 730,col 9)",
        "(line 733,col 9)-(line 738,col 9)",
        "(line 741,col 9)-(line 747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 750,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 761,col 9)",
        "(line 762,col 9)-(line 762,col 74)",
        "(line 763,col 9)-(line 763,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 767,
      "end_line": 816,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 769,col 9)-(line 770,col 43)",
        "(line 771,col 9)-(line 771,col 47)",
        "(line 772,col 9)-(line 772,col 61)",
        "(line 774,col 9)-(line 777,col 9)",
        "(line 783,col 9)-(line 784,col 69)",
        "(line 787,col 9)-(line 787,col 54)",
        "(line 788,col 9)-(line 815,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 823,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 824,col 9)-(line 834,col 9)",
        "(line 835,col 9)-(line 835,col 45)",
        "(line 836,col 9)-(line 836,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 839,
      "end_line": 859,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 31)",
        "(line 843,col 9)-(line 843,col 44)",
        "(line 844,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 848,col 31)",
        "(line 849,col 9)-(line 849,col 79)",
        "(line 855,col 9)-(line 858,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 861,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 95)",
        "(line 864,col 9)-(line 864,col 36)",
        "(line 865,col 9)-(line 865,col 32)",
        "(line 866,col 9)-(line 869,col 9)",
        "(line 870,col 9)-(line 870,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 873,
      "end_line": 883,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 102)",
        "(line 876,col 9)-(line 876,col 36)",
        "(line 877,col 9)-(line 877,col 32)",
        "(line 878,col 9)-(line 881,col 9)",
        "(line 882,col 9)-(line 882,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 885,
      "end_line": 895,
      "comment": "",
      "child_ranges": [
        "(line 887,col 9)-(line 887,col 100)",
        "(line 888,col 9)-(line 888,col 36)",
        "(line 889,col 9)-(line 889,col 32)",
        "(line 890,col 9)-(line 893,col 9)",
        "(line 894,col 9)-(line 894,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 897,
      "end_line": 907,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 94)",
        "(line 900,col 9)-(line 900,col 36)",
        "(line 901,col 9)-(line 901,col 32)",
        "(line 902,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 909,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 27)",
        "(line 912,col 9)-(line 912,col 22)",
        "(line 915,col 9)-(line 915,col 88)",
        "(line 916,col 9)-(line 916,col 29)",
        "(line 917,col 9)-(line 917,col 32)",
        "(line 918,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 65)",
        "(line 925,col 9)-(line 925,col 90)",
        "(line 926,col 9)-(line 926,col 29)",
        "(line 927,col 9)-(line 927,col 32)",
        "(line 928,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 935,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 91)",
        "(line 938,col 9)-(line 938,col 36)",
        "(line 939,col 9)-(line 939,col 32)",
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 947,
      "end_line": 957,
      "comment": "",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 103)",
        "(line 950,col 9)-(line 950,col 36)",
        "(line 951,col 9)-(line 951,col 32)",
        "(line 952,col 9)-(line 955,col 9)",
        "(line 956,col 9)-(line 956,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 959,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 961,col 9)-(line 961,col 79)",
        "(line 962,col 9)-(line 962,col 67)",
        "(line 963,col 9)-(line 963,col 70)",
        "(line 964,col 9)-(line 964,col 30)",
        "(line 965,col 9)-(line 965,col 85)",
        "(line 966,col 9)-(line 966,col 107)",
        "(line 967,col 9)-(line 967,col 53)",
        "(line 968,col 9)-(line 968,col 49)",
        "(line 969,col 9)-(line 971,col 9)",
        "(line 972,col 9)-(line 972,col 32)",
        "(line 973,col 9)-(line 981,col 9)",
        "(line 982,col 9)-(line 982,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 985,
      "end_line": 1009,
      "comment": "",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 91)",
        "(line 988,col 9)-(line 988,col 67)",
        "(line 989,col 9)-(line 989,col 70)",
        "(line 990,col 9)-(line 990,col 30)",
        "(line 991,col 9)-(line 991,col 85)",
        "(line 992,col 9)-(line 992,col 119)",
        "(line 993,col 9)-(line 993,col 53)",
        "(line 994,col 9)-(line 994,col 49)",
        "(line 995,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 32)",
        "(line 999,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 1011,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 75)",
        "(line 1014,col 9)-(line 1014,col 67)",
        "(line 1015,col 9)-(line 1015,col 70)",
        "(line 1016,col 9)-(line 1016,col 30)",
        "(line 1017,col 9)-(line 1017,col 85)",
        "(line 1018,col 9)-(line 1018,col 103)",
        "(line 1019,col 9)-(line 1019,col 53)",
        "(line 1020,col 9)-(line 1020,col 49)",
        "(line 1021,col 9)-(line 1023,col 9)",
        "(line 1024,col 9)-(line 1024,col 32)",
        "(line 1025,col 9)-(line 1032,col 9)",
        "(line 1033,col 9)-(line 1033,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 1036,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 9)-(line 1038,col 71)",
        "(line 1039,col 9)-(line 1039,col 67)",
        "(line 1040,col 9)-(line 1040,col 70)",
        "(line 1041,col 9)-(line 1041,col 30)",
        "(line 1042,col 9)-(line 1042,col 85)",
        "(line 1043,col 9)-(line 1043,col 99)",
        "(line 1044,col 9)-(line 1044,col 53)",
        "(line 1045,col 9)-(line 1045,col 49)",
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 32)",
        "(line 1050,col 9)-(line 1057,col 9)",
        "(line 1058,col 9)-(line 1058,col 93)"
      ]
    }
  ]
}
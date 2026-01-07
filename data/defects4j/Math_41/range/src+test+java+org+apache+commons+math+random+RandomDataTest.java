{
  "filepath": "/tmp/Math-41b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 62,
      "end_line": 1060,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest()",
      "begin_line": 65,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 42)",
        "(line 67,col 9)-(line 67,col 32)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 73,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 78,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 73)",
        "(line 81,col 9)-(line 81,col 73)",
        "(line 82,col 9)-(line 82,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 85,
      "end_line": 90,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 69)",
        "(line 88,col 9)-(line 88,col 69)",
        "(line 89,col 9)-(line 89,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 93,
      "end_line": 119,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 95,col 9)-(line 100,col 9)",
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 102,col 22)",
        "(line 103,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 108,col 38)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 117,col 9)-(line 118,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 122,
      "end_line": 148,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 124,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 130,col 41)",
        "(line 131,col 9)-(line 131,col 23)",
        "(line 132,col 9)-(line 136,col 9)",
        "(line 137,col 9)-(line 137,col 38)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 146,col 9)-(line 147,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 151,
      "end_line": 177,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 159,col 41)",
        "(line 160,col 9)-(line 160,col 23)",
        "(line 161,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 38)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 175,col 9)-(line 176,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 180,
      "end_line": 206,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 189,col 22)",
        "(line 190,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 195,col 38)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 204,col 9)-(line 205,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 214,
      "end_line": 245,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 222,col 38)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 227,col 64)",
        "(line 228,col 9)-(line 228,col 38)",
        "(line 229,col 9)-(line 230,col 56)",
        "(line 231,col 9)-(line 231,col 67)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 243,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 247,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 260,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 274,
      "end_line": 393,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 36)",
        "(line 277,col 9)-(line 277,col 39)",
        "(line 278,col 9)-(line 278,col 34)",
        "(line 279,col 9)-(line 279,col 35)",
        "(line 280,col 9)-(line 280,col 46)",
        "(line 281,col 9)-(line 287,col 9)",
        "(line 295,col 9)-(line 295,col 80)",
        "(line 296,col 9)-(line 296,col 22)",
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 37)",
        "(line 301,col 9)-(line 303,col 9)",
        "(line 306,col 9)-(line 306,col 25)",
        "(line 307,col 9)-(line 307,col 40)",
        "(line 308,col 9)-(line 308,col 32)",
        "(line 309,col 9)-(line 309,col 32)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 323,col 9)-(line 323,col 59)",
        "(line 324,col 9)-(line 324,col 29)",
        "(line 325,col 9)-(line 325,col 37)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 330,col 29)",
        "(line 331,col 9)-(line 331,col 29)",
        "(line 334,col 9)-(line 334,col 50)",
        "(line 335,col 9)-(line 335,col 45)",
        "(line 336,col 9)-(line 336,col 49)",
        "(line 339,col 9)-(line 339,col 24)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 343,col 88)",
        "(line 346,col 9)-(line 346,col 35)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 105)",
        "(line 353,col 9)-(line 360,col 9)",
        "(line 363,col 9)-(line 363,col 62)",
        "(line 365,col 9)-(line 392,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 396,
      "end_line": 450,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 399,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 411,col 55)",
        "(line 412,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 48)",
        "(line 416,col 9)-(line 418,col 9)",
        "(line 419,col 9)-(line 424,col 9)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 38)",
        "(line 429,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 438,col 43)",
        "(line 439,col 9)-(line 439,col 39)",
        "(line 440,col 9)-(line 443,col 9)",
        "(line 448,col 9)-(line 449,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 453,
      "end_line": 506,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 455,col 9)-(line 460,col 9)",
        "(line 461,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 61)",
        "(line 468,col 9)-(line 470,col 9)",
        "(line 471,col 9)-(line 471,col 54)",
        "(line 472,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 484,col 38)",
        "(line 485,col 9)-(line 493,col 9)",
        "(line 494,col 9)-(line 494,col 43)",
        "(line 495,col 9)-(line 495,col 39)",
        "(line 496,col 9)-(line 499,col 9)",
        "(line 504,col 9)-(line 505,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 509,
      "end_line": 546,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 511,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 41)",
        "(line 524,col 9)-(line 524,col 35)",
        "(line 525,col 9)-(line 525,col 27)",
        "(line 526,col 9)-(line 526,col 27)",
        "(line 527,col 9)-(line 527,col 47)",
        "(line 528,col 9)-(line 528,col 26)",
        "(line 529,col 9)-(line 539,col 9)",
        "(line 544,col 9)-(line 545,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 549,
      "end_line": 555,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 551,col 9)-(line 554,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 558,
      "end_line": 578,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 560,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 566,col 54)",
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 34)",
        "(line 571,col 9)-(line 571,col 44)",
        "(line 572,col 9)-(line 572,col 28)",
        "(line 577,col 9)-(line 577,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 581,
      "end_line": 636,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 583,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 25)",
        "(line 596,col 9)-(line 596,col 21)",
        "(line 597,col 9)-(line 602,col 9)",
        "(line 608,col 9)-(line 609,col 68)",
        "(line 614,col 9)-(line 614,col 27)",
        "(line 615,col 9)-(line 615,col 22)",
        "(line 618,col 9)-(line 618,col 87)",
        "(line 619,col 9)-(line 619,col 29)",
        "(line 620,col 9)-(line 620,col 32)",
        "(line 621,col 9)-(line 624,col 9)",
        "(line 625,col 9)-(line 625,col 65)",
        "(line 628,col 9)-(line 628,col 87)",
        "(line 629,col 9)-(line 629,col 29)",
        "(line 630,col 9)-(line 630,col 32)",
        "(line 631,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 639,
      "end_line": 686,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 32)",
        "(line 642,col 9)-(line 642,col 48)",
        "(line 643,col 9)-(line 643,col 28)",
        "(line 644,col 9)-(line 645,col 65)",
        "(line 646,col 9)-(line 646,col 32)",
        "(line 647,col 9)-(line 647,col 83)",
        "(line 648,col 9)-(line 648,col 38)",
        "(line 649,col 9)-(line 649,col 56)",
        "(line 650,col 9)-(line 650,col 34)",
        "(line 651,col 9)-(line 652,col 43)",
        "(line 653,col 9)-(line 653,col 38)",
        "(line 654,col 9)-(line 655,col 61)",
        "(line 674,col 9)-(line 674,col 49)",
        "(line 675,col 9)-(line 675,col 23)",
        "(line 676,col 9)-(line 676,col 26)",
        "(line 677,col 9)-(line 677,col 50)",
        "(line 678,col 9)-(line 678,col 31)",
        "(line 679,col 9)-(line 679,col 33)",
        "(line 680,col 9)-(line 680,col 34)",
        "(line 681,col 9)-(line 681,col 20)",
        "(line 682,col 9)-(line 682,col 26)",
        "(line 683,col 9)-(line 683,col 35)",
        "(line 684,col 9)-(line 684,col 27)",
        "(line 685,col 9)-(line 685,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 689,
      "end_line": 747,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 691,col 9)-(line 693,col 59)",
        "(line 694,col 9)-(line 694,col 59)",
        "(line 695,col 9)-(line 695,col 81)",
        "(line 697,col 9)-(line 697,col 53)",
        "(line 698,col 9)-(line 700,col 9)",
        "(line 702,col 9)-(line 702,col 39)",
        "(line 703,col 9)-(line 708,col 9)",
        "(line 710,col 9)-(line 713,col 9)",
        "(line 719,col 9)-(line 720,col 69)",
        "(line 723,col 9)-(line 723,col 51)",
        "(line 724,col 9)-(line 724,col 22)",
        "(line 725,col 9)-(line 725,col 52)",
        "(line 726,col 9)-(line 726,col 43)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 732,col 9)-(line 737,col 9)",
        "(line 740,col 9)-(line 746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 749,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 760,col 9)",
        "(line 761,col 9)-(line 761,col 74)",
        "(line 762,col 9)-(line 762,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 766,
      "end_line": 815,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 768,col 9)-(line 769,col 43)",
        "(line 770,col 9)-(line 770,col 47)",
        "(line 771,col 9)-(line 771,col 61)",
        "(line 773,col 9)-(line 776,col 9)",
        "(line 782,col 9)-(line 783,col 69)",
        "(line 786,col 9)-(line 786,col 54)",
        "(line 787,col 9)-(line 814,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 822,
      "end_line": 836,
      "comment": "",
      "child_ranges": [
        "(line 823,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 834,col 45)",
        "(line 835,col 9)-(line 835,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 838,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 31)",
        "(line 842,col 9)-(line 842,col 44)",
        "(line 843,col 9)-(line 845,col 9)",
        "(line 847,col 9)-(line 847,col 31)",
        "(line 848,col 9)-(line 848,col 71)",
        "(line 854,col 9)-(line 857,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 860,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 91)",
        "(line 863,col 9)-(line 863,col 36)",
        "(line 864,col 9)-(line 864,col 32)",
        "(line 865,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 872,
      "end_line": 882,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 98)",
        "(line 875,col 9)-(line 875,col 36)",
        "(line 876,col 9)-(line 876,col 32)",
        "(line 877,col 9)-(line 880,col 9)",
        "(line 881,col 9)-(line 881,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 884,
      "end_line": 894,
      "comment": "",
      "child_ranges": [
        "(line 886,col 9)-(line 886,col 96)",
        "(line 887,col 9)-(line 887,col 36)",
        "(line 888,col 9)-(line 888,col 32)",
        "(line 889,col 9)-(line 892,col 9)",
        "(line 893,col 9)-(line 893,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 896,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 90)",
        "(line 899,col 9)-(line 899,col 36)",
        "(line 900,col 9)-(line 900,col 32)",
        "(line 901,col 9)-(line 904,col 9)",
        "(line 905,col 9)-(line 905,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 908,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 27)",
        "(line 911,col 9)-(line 911,col 22)",
        "(line 914,col 9)-(line 914,col 84)",
        "(line 915,col 9)-(line 915,col 29)",
        "(line 916,col 9)-(line 916,col 32)",
        "(line 917,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 65)",
        "(line 924,col 9)-(line 924,col 86)",
        "(line 925,col 9)-(line 925,col 29)",
        "(line 926,col 9)-(line 926,col 32)",
        "(line 927,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 931,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 934,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 87)",
        "(line 937,col 9)-(line 937,col 36)",
        "(line 938,col 9)-(line 938,col 32)",
        "(line 939,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 946,
      "end_line": 956,
      "comment": "",
      "child_ranges": [
        "(line 948,col 9)-(line 948,col 99)",
        "(line 949,col 9)-(line 949,col 36)",
        "(line 950,col 9)-(line 950,col 32)",
        "(line 951,col 9)-(line 954,col 9)",
        "(line 955,col 9)-(line 955,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 958,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 960,col 9)-(line 960,col 79)",
        "(line 961,col 9)-(line 961,col 67)",
        "(line 962,col 9)-(line 962,col 70)",
        "(line 963,col 9)-(line 963,col 30)",
        "(line 964,col 9)-(line 964,col 85)",
        "(line 965,col 9)-(line 965,col 99)",
        "(line 966,col 9)-(line 966,col 53)",
        "(line 967,col 9)-(line 967,col 49)",
        "(line 968,col 9)-(line 970,col 9)",
        "(line 971,col 9)-(line 971,col 32)",
        "(line 972,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 984,
      "end_line": 1008,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 91)",
        "(line 987,col 9)-(line 987,col 67)",
        "(line 988,col 9)-(line 988,col 70)",
        "(line 989,col 9)-(line 989,col 30)",
        "(line 990,col 9)-(line 990,col 85)",
        "(line 991,col 9)-(line 991,col 111)",
        "(line 992,col 9)-(line 992,col 53)",
        "(line 993,col 9)-(line 993,col 49)",
        "(line 994,col 9)-(line 996,col 9)",
        "(line 997,col 9)-(line 997,col 32)",
        "(line 998,col 9)-(line 1006,col 9)",
        "(line 1007,col 9)-(line 1007,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 1010,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1012,col 9)-(line 1012,col 75)",
        "(line 1013,col 9)-(line 1013,col 67)",
        "(line 1014,col 9)-(line 1014,col 70)",
        "(line 1015,col 9)-(line 1015,col 30)",
        "(line 1016,col 9)-(line 1016,col 85)",
        "(line 1017,col 9)-(line 1017,col 95)",
        "(line 1018,col 9)-(line 1018,col 53)",
        "(line 1019,col 9)-(line 1019,col 49)",
        "(line 1020,col 9)-(line 1022,col 9)",
        "(line 1023,col 9)-(line 1023,col 32)",
        "(line 1024,col 9)-(line 1031,col 9)",
        "(line 1032,col 9)-(line 1032,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 1035,
      "end_line": 1058,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 71)",
        "(line 1038,col 9)-(line 1038,col 67)",
        "(line 1039,col 9)-(line 1039,col 70)",
        "(line 1040,col 9)-(line 1040,col 30)",
        "(line 1041,col 9)-(line 1041,col 85)",
        "(line 1042,col 9)-(line 1042,col 91)",
        "(line 1043,col 9)-(line 1043,col 53)",
        "(line 1044,col 9)-(line 1044,col 49)",
        "(line 1045,col 9)-(line 1047,col 9)",
        "(line 1048,col 9)-(line 1048,col 32)",
        "(line 1049,col 9)-(line 1056,col 9)",
        "(line 1057,col 9)-(line 1057,col 93)"
      ]
    }
  ]
}
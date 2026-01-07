{
  "filepath": "/tmp/Math-56b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 1020,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest()",
      "begin_line": 64,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 71,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 76,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 73)",
        "(line 79,col 9)-(line 79,col 73)",
        "(line 80,col 9)-(line 80,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 83,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 69)",
        "(line 86,col 9)-(line 86,col 69)",
        "(line 87,col 9)-(line 87,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 91,
      "end_line": 117,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 93,col 9)-(line 98,col 9)",
        "(line 99,col 9)-(line 99,col 41)",
        "(line 100,col 9)-(line 100,col 22)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 106,col 38)",
        "(line 107,col 9)-(line 109,col 9)",
        "(line 115,col 9)-(line 116,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 120,
      "end_line": 146,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 122,col 9)-(line 127,col 9)",
        "(line 128,col 9)-(line 128,col 41)",
        "(line 129,col 9)-(line 129,col 23)",
        "(line 130,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 38)",
        "(line 136,col 9)-(line 138,col 9)",
        "(line 144,col 9)-(line 145,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 149,
      "end_line": 175,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 151,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 41)",
        "(line 158,col 9)-(line 158,col 23)",
        "(line 159,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 38)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 173,col 9)-(line 174,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 178,
      "end_line": 204,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 180,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 41)",
        "(line 187,col 9)-(line 187,col 22)",
        "(line 188,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 38)",
        "(line 194,col 9)-(line 196,col 9)",
        "(line 202,col 9)-(line 203,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 212,
      "end_line": 243,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probability and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 38)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 225,col 64)",
        "(line 226,col 9)-(line 226,col 38)",
        "(line 227,col 9)-(line 228,col 56)",
        "(line 229,col 9)-(line 229,col 67)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 245,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 32)",
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
      "end_line": 610,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 583,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 25)",
        "(line 596,col 9)-(line 596,col 21)",
        "(line 597,col 9)-(line 602,col 9)",
        "(line 608,col 9)-(line 609,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 613,
      "end_line": 660,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 615,col 9)-(line 615,col 32)",
        "(line 616,col 9)-(line 616,col 48)",
        "(line 617,col 9)-(line 617,col 28)",
        "(line 618,col 9)-(line 619,col 65)",
        "(line 620,col 9)-(line 620,col 32)",
        "(line 621,col 9)-(line 621,col 83)",
        "(line 622,col 9)-(line 622,col 38)",
        "(line 623,col 9)-(line 623,col 56)",
        "(line 624,col 9)-(line 624,col 34)",
        "(line 625,col 9)-(line 626,col 43)",
        "(line 627,col 9)-(line 627,col 38)",
        "(line 628,col 9)-(line 629,col 61)",
        "(line 648,col 9)-(line 648,col 49)",
        "(line 649,col 9)-(line 649,col 23)",
        "(line 650,col 9)-(line 650,col 26)",
        "(line 651,col 9)-(line 651,col 50)",
        "(line 652,col 9)-(line 652,col 31)",
        "(line 653,col 9)-(line 653,col 33)",
        "(line 654,col 9)-(line 654,col 34)",
        "(line 655,col 9)-(line 655,col 20)",
        "(line 656,col 9)-(line 656,col 26)",
        "(line 657,col 9)-(line 657,col 35)",
        "(line 658,col 9)-(line 658,col 27)",
        "(line 659,col 9)-(line 659,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 663,
      "end_line": 721,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 665,col 9)-(line 667,col 59)",
        "(line 668,col 9)-(line 668,col 59)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 671,col 9)-(line 671,col 53)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 676,col 9)-(line 676,col 39)",
        "(line 677,col 9)-(line 682,col 9)",
        "(line 684,col 9)-(line 687,col 9)",
        "(line 693,col 9)-(line 694,col 69)",
        "(line 697,col 9)-(line 697,col 51)",
        "(line 698,col 9)-(line 698,col 22)",
        "(line 699,col 9)-(line 699,col 52)",
        "(line 700,col 9)-(line 700,col 43)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 706,col 9)-(line 711,col 9)",
        "(line 714,col 9)-(line 720,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 723,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 734,col 9)",
        "(line 735,col 9)-(line 735,col 74)",
        "(line 736,col 9)-(line 736,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 740,
      "end_line": 789,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 742,col 9)-(line 743,col 43)",
        "(line 744,col 9)-(line 744,col 47)",
        "(line 745,col 9)-(line 745,col 61)",
        "(line 747,col 9)-(line 750,col 9)",
        "(line 756,col 9)-(line 757,col 69)",
        "(line 760,col 9)-(line 760,col 54)",
        "(line 761,col 9)-(line 788,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 796,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 807,col 9)",
        "(line 808,col 9)-(line 808,col 45)",
        "(line 809,col 9)-(line 809,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 812,
      "end_line": 832,
      "comment": "",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 31)",
        "(line 816,col 9)-(line 816,col 44)",
        "(line 817,col 9)-(line 819,col 9)",
        "(line 821,col 9)-(line 821,col 31)",
        "(line 822,col 9)-(line 822,col 79)",
        "(line 828,col 9)-(line 831,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 834,
      "end_line": 844,
      "comment": "",
      "child_ranges": [
        "(line 836,col 9)-(line 836,col 95)",
        "(line 837,col 9)-(line 837,col 36)",
        "(line 838,col 9)-(line 838,col 32)",
        "(line 839,col 9)-(line 842,col 9)",
        "(line 843,col 9)-(line 843,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 846,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 848,col 9)-(line 848,col 102)",
        "(line 849,col 9)-(line 849,col 36)",
        "(line 850,col 9)-(line 850,col 32)",
        "(line 851,col 9)-(line 854,col 9)",
        "(line 855,col 9)-(line 855,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 858,
      "end_line": 868,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 100)",
        "(line 861,col 9)-(line 861,col 36)",
        "(line 862,col 9)-(line 862,col 32)",
        "(line 863,col 9)-(line 866,col 9)",
        "(line 867,col 9)-(line 867,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 870,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 94)",
        "(line 873,col 9)-(line 873,col 36)",
        "(line 874,col 9)-(line 874,col 32)",
        "(line 875,col 9)-(line 878,col 9)",
        "(line 879,col 9)-(line 879,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 882,
      "end_line": 892,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 97)",
        "(line 885,col 9)-(line 885,col 36)",
        "(line 886,col 9)-(line 886,col 32)",
        "(line 887,col 9)-(line 890,col 9)",
        "(line 891,col 9)-(line 891,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 894,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 91)",
        "(line 897,col 9)-(line 897,col 36)",
        "(line 898,col 9)-(line 898,col 32)",
        "(line 899,col 9)-(line 902,col 9)",
        "(line 903,col 9)-(line 903,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 906,
      "end_line": 916,
      "comment": "",
      "child_ranges": [
        "(line 908,col 9)-(line 908,col 103)",
        "(line 909,col 9)-(line 909,col 36)",
        "(line 910,col 9)-(line 910,col 32)",
        "(line 911,col 9)-(line 914,col 9)",
        "(line 915,col 9)-(line 915,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 918,
      "end_line": 942,
      "comment": "",
      "child_ranges": [
        "(line 920,col 9)-(line 920,col 79)",
        "(line 921,col 9)-(line 921,col 67)",
        "(line 922,col 9)-(line 922,col 70)",
        "(line 923,col 9)-(line 923,col 30)",
        "(line 924,col 9)-(line 924,col 85)",
        "(line 925,col 9)-(line 925,col 107)",
        "(line 926,col 9)-(line 926,col 53)",
        "(line 927,col 9)-(line 927,col 49)",
        "(line 928,col 9)-(line 930,col 9)",
        "(line 931,col 9)-(line 931,col 32)",
        "(line 932,col 9)-(line 940,col 9)",
        "(line 941,col 9)-(line 941,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 944,
      "end_line": 968,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 91)",
        "(line 947,col 9)-(line 947,col 67)",
        "(line 948,col 9)-(line 948,col 70)",
        "(line 949,col 9)-(line 949,col 30)",
        "(line 950,col 9)-(line 950,col 85)",
        "(line 951,col 9)-(line 951,col 119)",
        "(line 952,col 9)-(line 952,col 53)",
        "(line 953,col 9)-(line 953,col 49)",
        "(line 954,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 32)",
        "(line 958,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 970,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 75)",
        "(line 973,col 9)-(line 973,col 67)",
        "(line 974,col 9)-(line 974,col 70)",
        "(line 975,col 9)-(line 975,col 30)",
        "(line 976,col 9)-(line 976,col 85)",
        "(line 977,col 9)-(line 977,col 103)",
        "(line 978,col 9)-(line 978,col 53)",
        "(line 979,col 9)-(line 979,col 49)",
        "(line 980,col 9)-(line 982,col 9)",
        "(line 983,col 9)-(line 983,col 32)",
        "(line 984,col 9)-(line 991,col 9)",
        "(line 992,col 9)-(line 992,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 995,
      "end_line": 1018,
      "comment": "",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 71)",
        "(line 998,col 9)-(line 998,col 67)",
        "(line 999,col 9)-(line 999,col 70)",
        "(line 1000,col 9)-(line 1000,col 30)",
        "(line 1001,col 9)-(line 1001,col 85)",
        "(line 1002,col 9)-(line 1002,col 99)",
        "(line 1003,col 9)-(line 1003,col 53)",
        "(line 1004,col 9)-(line 1004,col 49)",
        "(line 1005,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1008,col 32)",
        "(line 1009,col 9)-(line 1016,col 9)",
        "(line 1017,col 9)-(line 1017,col 93)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-53b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 63,
      "end_line": 1049,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest()",
      "begin_line": 66,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 42)"
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
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 32)",
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 263,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 277,
      "end_line": 396,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 36)",
        "(line 280,col 9)-(line 280,col 39)",
        "(line 281,col 9)-(line 281,col 34)",
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 46)",
        "(line 284,col 9)-(line 290,col 9)",
        "(line 298,col 9)-(line 298,col 84)",
        "(line 299,col 9)-(line 299,col 22)",
        "(line 300,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 37)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 309,col 9)-(line 309,col 25)",
        "(line 310,col 9)-(line 310,col 40)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 32)",
        "(line 313,col 9)-(line 318,col 9)",
        "(line 326,col 9)-(line 326,col 59)",
        "(line 327,col 9)-(line 327,col 29)",
        "(line 328,col 9)-(line 328,col 37)",
        "(line 329,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 333,col 29)",
        "(line 334,col 9)-(line 334,col 29)",
        "(line 337,col 9)-(line 337,col 50)",
        "(line 338,col 9)-(line 338,col 45)",
        "(line 339,col 9)-(line 339,col 49)",
        "(line 342,col 9)-(line 342,col 24)",
        "(line 343,col 9)-(line 345,col 9)",
        "(line 346,col 9)-(line 346,col 88)",
        "(line 349,col 9)-(line 349,col 35)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 105)",
        "(line 356,col 9)-(line 363,col 9)",
        "(line 366,col 9)-(line 366,col 62)",
        "(line 368,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 399,
      "end_line": 453,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 402,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 55)",
        "(line 415,col 9)-(line 417,col 9)",
        "(line 418,col 9)-(line 418,col 48)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 430,col 9)",
        "(line 431,col 9)-(line 431,col 38)",
        "(line 432,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 43)",
        "(line 442,col 9)-(line 442,col 39)",
        "(line 443,col 9)-(line 446,col 9)",
        "(line 451,col 9)-(line 452,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 456,
      "end_line": 509,
      "comment": " test dispersion and failure modes for nextHex() ",
      "child_ranges": [
        "(line 458,col 9)-(line 463,col 9)",
        "(line 464,col 9)-(line 469,col 9)",
        "(line 470,col 9)-(line 470,col 61)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 474,col 9)-(line 474,col 54)",
        "(line 475,col 9)-(line 477,col 9)",
        "(line 478,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 38)",
        "(line 488,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 497,col 43)",
        "(line 498,col 9)-(line 498,col 39)",
        "(line 499,col 9)-(line 502,col 9)",
        "(line 507,col 9)-(line 508,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 512,
      "end_line": 549,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 514,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 526,col 41)",
        "(line 527,col 9)-(line 527,col 35)",
        "(line 528,col 9)-(line 528,col 27)",
        "(line 529,col 9)-(line 529,col 27)",
        "(line 530,col 9)-(line 530,col 47)",
        "(line 531,col 9)-(line 531,col 26)",
        "(line 532,col 9)-(line 542,col 9)",
        "(line 547,col 9)-(line 548,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 552,
      "end_line": 558,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 554,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 561,
      "end_line": 581,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 563,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 54)",
        "(line 570,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 34)",
        "(line 574,col 9)-(line 574,col 44)",
        "(line 575,col 9)-(line 575,col 28)",
        "(line 580,col 9)-(line 580,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 584,
      "end_line": 639,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 586,col 9)-(line 591,col 9)",
        "(line 592,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 25)",
        "(line 599,col 9)-(line 599,col 21)",
        "(line 600,col 9)-(line 605,col 9)",
        "(line 611,col 9)-(line 612,col 68)",
        "(line 617,col 9)-(line 617,col 27)",
        "(line 618,col 9)-(line 618,col 22)",
        "(line 621,col 9)-(line 621,col 91)",
        "(line 622,col 9)-(line 622,col 29)",
        "(line 623,col 9)-(line 623,col 32)",
        "(line 624,col 9)-(line 627,col 9)",
        "(line 628,col 9)-(line 628,col 65)",
        "(line 631,col 9)-(line 631,col 91)",
        "(line 632,col 9)-(line 632,col 29)",
        "(line 633,col 9)-(line 633,col 32)",
        "(line 634,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 642,
      "end_line": 689,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 32)",
        "(line 645,col 9)-(line 645,col 48)",
        "(line 646,col 9)-(line 646,col 28)",
        "(line 647,col 9)-(line 648,col 65)",
        "(line 649,col 9)-(line 649,col 32)",
        "(line 650,col 9)-(line 650,col 83)",
        "(line 651,col 9)-(line 651,col 38)",
        "(line 652,col 9)-(line 652,col 56)",
        "(line 653,col 9)-(line 653,col 34)",
        "(line 654,col 9)-(line 655,col 43)",
        "(line 656,col 9)-(line 656,col 38)",
        "(line 657,col 9)-(line 658,col 61)",
        "(line 677,col 9)-(line 677,col 49)",
        "(line 678,col 9)-(line 678,col 23)",
        "(line 679,col 9)-(line 679,col 26)",
        "(line 680,col 9)-(line 680,col 50)",
        "(line 681,col 9)-(line 681,col 31)",
        "(line 682,col 9)-(line 682,col 33)",
        "(line 683,col 9)-(line 683,col 34)",
        "(line 684,col 9)-(line 684,col 20)",
        "(line 685,col 9)-(line 685,col 26)",
        "(line 686,col 9)-(line 686,col 35)",
        "(line 687,col 9)-(line 687,col 27)",
        "(line 688,col 9)-(line 688,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 692,
      "end_line": 750,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 59)",
        "(line 697,col 9)-(line 697,col 59)",
        "(line 698,col 9)-(line 698,col 81)",
        "(line 700,col 9)-(line 700,col 53)",
        "(line 701,col 9)-(line 703,col 9)",
        "(line 705,col 9)-(line 705,col 39)",
        "(line 706,col 9)-(line 711,col 9)",
        "(line 713,col 9)-(line 716,col 9)",
        "(line 722,col 9)-(line 723,col 69)",
        "(line 726,col 9)-(line 726,col 51)",
        "(line 727,col 9)-(line 727,col 22)",
        "(line 728,col 9)-(line 728,col 52)",
        "(line 729,col 9)-(line 729,col 43)",
        "(line 730,col 9)-(line 732,col 9)",
        "(line 735,col 9)-(line 740,col 9)",
        "(line 743,col 9)-(line 749,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 752,
      "end_line": 766,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 74)",
        "(line 765,col 9)-(line 765,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 769,
      "end_line": 818,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 771,col 9)-(line 772,col 43)",
        "(line 773,col 9)-(line 773,col 47)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 776,col 9)-(line 779,col 9)",
        "(line 785,col 9)-(line 786,col 69)",
        "(line 789,col 9)-(line 789,col 54)",
        "(line 790,col 9)-(line 817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 825,
      "end_line": 839,
      "comment": "",
      "child_ranges": [
        "(line 826,col 9)-(line 836,col 9)",
        "(line 837,col 9)-(line 837,col 45)",
        "(line 838,col 9)-(line 838,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInversionDeviate()",
      "begin_line": 841,
      "end_line": 861,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 31)",
        "(line 845,col 9)-(line 845,col 44)",
        "(line 846,col 9)-(line 848,col 9)",
        "(line 850,col 9)-(line 850,col 31)",
        "(line 851,col 9)-(line 851,col 79)",
        "(line 857,col 9)-(line 860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBeta()",
      "begin_line": 863,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 95)",
        "(line 866,col 9)-(line 866,col 36)",
        "(line 867,col 9)-(line 867,col 32)",
        "(line 868,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextCauchy()",
      "begin_line": 875,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 102)",
        "(line 878,col 9)-(line 878,col 36)",
        "(line 879,col 9)-(line 879,col 32)",
        "(line 880,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 884,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextChiSquare()",
      "begin_line": 887,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 100)",
        "(line 890,col 9)-(line 890,col 36)",
        "(line 891,col 9)-(line 891,col 32)",
        "(line 892,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 896,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextF()",
      "begin_line": 899,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 94)",
        "(line 902,col 9)-(line 902,col 36)",
        "(line 903,col 9)-(line 903,col 32)",
        "(line 904,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGamma()",
      "begin_line": 911,
      "end_line": 921,
      "comment": "",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 97)",
        "(line 914,col 9)-(line 914,col 36)",
        "(line 915,col 9)-(line 915,col 32)",
        "(line 916,col 9)-(line 919,col 9)",
        "(line 920,col 9)-(line 920,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextT()",
      "begin_line": 923,
      "end_line": 933,
      "comment": "",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 91)",
        "(line 926,col 9)-(line 926,col 36)",
        "(line 927,col 9)-(line 927,col 32)",
        "(line 928,col 9)-(line 931,col 9)",
        "(line 932,col 9)-(line 932,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextWeibull()",
      "begin_line": 935,
      "end_line": 945,
      "comment": "",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 103)",
        "(line 938,col 9)-(line 938,col 36)",
        "(line 939,col 9)-(line 939,col 32)",
        "(line 940,col 9)-(line 943,col 9)",
        "(line 944,col 9)-(line 944,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextBinomial()",
      "begin_line": 947,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 949,col 9)-(line 949,col 79)",
        "(line 950,col 9)-(line 950,col 67)",
        "(line 951,col 9)-(line 951,col 70)",
        "(line 952,col 9)-(line 952,col 30)",
        "(line 953,col 9)-(line 953,col 85)",
        "(line 954,col 9)-(line 954,col 107)",
        "(line 955,col 9)-(line 955,col 53)",
        "(line 956,col 9)-(line 956,col 49)",
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 32)",
        "(line 961,col 9)-(line 969,col 9)",
        "(line 970,col 9)-(line 970,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHypergeometric()",
      "begin_line": 973,
      "end_line": 997,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 91)",
        "(line 976,col 9)-(line 976,col 67)",
        "(line 977,col 9)-(line 977,col 70)",
        "(line 978,col 9)-(line 978,col 30)",
        "(line 979,col 9)-(line 979,col 85)",
        "(line 980,col 9)-(line 980,col 119)",
        "(line 981,col 9)-(line 981,col 53)",
        "(line 982,col 9)-(line 982,col 49)",
        "(line 983,col 9)-(line 985,col 9)",
        "(line 986,col 9)-(line 986,col 32)",
        "(line 987,col 9)-(line 995,col 9)",
        "(line 996,col 9)-(line 996,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPascal()",
      "begin_line": 999,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 75)",
        "(line 1002,col 9)-(line 1002,col 67)",
        "(line 1003,col 9)-(line 1003,col 70)",
        "(line 1004,col 9)-(line 1004,col 30)",
        "(line 1005,col 9)-(line 1005,col 85)",
        "(line 1006,col 9)-(line 1006,col 103)",
        "(line 1007,col 9)-(line 1007,col 53)",
        "(line 1008,col 9)-(line 1008,col 49)",
        "(line 1009,col 9)-(line 1011,col 9)",
        "(line 1012,col 9)-(line 1012,col 32)",
        "(line 1013,col 9)-(line 1020,col 9)",
        "(line 1021,col 9)-(line 1021,col 93)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextZipf()",
      "begin_line": 1024,
      "end_line": 1047,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 71)",
        "(line 1027,col 9)-(line 1027,col 67)",
        "(line 1028,col 9)-(line 1028,col 70)",
        "(line 1029,col 9)-(line 1029,col 30)",
        "(line 1030,col 9)-(line 1030,col 85)",
        "(line 1031,col 9)-(line 1031,col 99)",
        "(line 1032,col 9)-(line 1032,col 53)",
        "(line 1033,col 9)-(line 1033,col 49)",
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1037,col 9)-(line 1037,col 32)",
        "(line 1038,col 9)-(line 1045,col 9)",
        "(line 1046,col 9)-(line 1046,col 93)"
      ]
    }
  ]
}
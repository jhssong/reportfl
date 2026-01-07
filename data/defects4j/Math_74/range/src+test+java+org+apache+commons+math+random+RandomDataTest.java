{
  "filepath": "/tmp/Math-74b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 41,
      "end_line": 778,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 43,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 20)",
        "(line 45,col 9)-(line 45,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 51,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 56,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 73)",
        "(line 58,col 9)-(line 58,col 73)",
        "(line 59,col 9)-(line 59,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 62,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 69)",
        "(line 64,col 9)-(line 64,col 69)",
        "(line 65,col 9)-(line 65,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 69,
      "end_line": 94,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 70,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 41)",
        "(line 77,col 9)-(line 77,col 22)",
        "(line 78,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 38)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 92,col 9)-(line 93,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 97,
      "end_line": 122,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 98,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 105,col 23)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 38)",
        "(line 112,col 9)-(line 114,col 9)",
        "(line 120,col 9)-(line 121,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 125,
      "end_line": 150,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 126,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 41)",
        "(line 133,col 9)-(line 133,col 23)",
        "(line 134,col 9)-(line 138,col 9)",
        "(line 139,col 9)-(line 139,col 38)",
        "(line 140,col 9)-(line 142,col 9)",
        "(line 148,col 9)-(line 149,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 153,
      "end_line": 178,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 154,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 41)",
        "(line 161,col 9)-(line 161,col 22)",
        "(line 162,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 167,col 38)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 176,col 9)-(line 177,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 186,
      "end_line": 220,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probablity and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 193,col 38)",
        "(line 194,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 202,col 64)",
        "(line 203,col 9)-(line 203,col 38)",
        "(line 204,col 9)-(line 205,col 56)",
        "(line 206,col 9)-(line 206,col 60)",
        "(line 207,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 218,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 249,
      "end_line": 370,
      "comment": " \n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.  This check will fail randomly with probability alpha.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 30)",
        "(line 252,col 9)-(line 252,col 33)",
        "(line 253,col 9)-(line 253,col 34)",
        "(line 254,col 9)-(line 254,col 29)",
        "(line 255,col 9)-(line 255,col 46)",
        "(line 256,col 9)-(line 262,col 9)",
        "(line 270,col 9)-(line 270,col 84)",
        "(line 271,col 9)-(line 271,col 22)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 37)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 281,col 9)-(line 281,col 25)",
        "(line 282,col 9)-(line 282,col 40)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 298,col 9)-(line 298,col 59)",
        "(line 299,col 9)-(line 299,col 29)",
        "(line 300,col 9)-(line 300,col 37)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 29)",
        "(line 306,col 9)-(line 306,col 29)",
        "(line 309,col 9)-(line 309,col 50)",
        "(line 310,col 9)-(line 310,col 45)",
        "(line 311,col 9)-(line 311,col 49)",
        "(line 314,col 9)-(line 314,col 24)",
        "(line 315,col 9)-(line 317,col 9)",
        "(line 318,col 9)-(line 318,col 88)",
        "(line 321,col 9)-(line 321,col 35)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 105)",
        "(line 328,col 9)-(line 335,col 9)",
        "(line 338,col 9)-(line 338,col 62)",
        "(line 339,col 9)-(line 369,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 373,
      "end_line": 425,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 374,col 9)-(line 379,col 9)",
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 386,col 55)",
        "(line 387,col 9)-(line 389,col 9)",
        "(line 390,col 9)-(line 390,col 48)",
        "(line 391,col 9)-(line 393,col 9)",
        "(line 394,col 9)-(line 399,col 9)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 38)",
        "(line 404,col 9)-(line 412,col 9)",
        "(line 413,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 414,col 39)",
        "(line 415,col 9)-(line 418,col 9)",
        "(line 423,col 9)-(line 424,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 428,
      "end_line": 480,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 429,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 441,col 61)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 445,col 9)-(line 445,col 54)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 455,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 458,col 38)",
        "(line 459,col 9)-(line 467,col 9)",
        "(line 468,col 9)-(line 468,col 43)",
        "(line 469,col 9)-(line 469,col 39)",
        "(line 470,col 9)-(line 473,col 9)",
        "(line 478,col 9)-(line 479,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 483,
      "end_line": 519,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 484,col 9)-(line 489,col 9)",
        "(line 490,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 496,col 41)",
        "(line 497,col 9)-(line 497,col 35)",
        "(line 498,col 9)-(line 498,col 27)",
        "(line 499,col 9)-(line 499,col 27)",
        "(line 500,col 9)-(line 500,col 47)",
        "(line 501,col 9)-(line 501,col 26)",
        "(line 502,col 9)-(line 512,col 9)",
        "(line 517,col 9)-(line 518,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 522,
      "end_line": 527,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 523,col 9)-(line 526,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 530,
      "end_line": 549,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 531,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 54)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 34)",
        "(line 542,col 9)-(line 542,col 44)",
        "(line 543,col 9)-(line 543,col 28)",
        "(line 548,col 9)-(line 548,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 552,
      "end_line": 580,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 553,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 25)",
        "(line 566,col 9)-(line 566,col 21)",
        "(line 567,col 9)-(line 572,col 9)",
        "(line 578,col 9)-(line 579,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 583,
      "end_line": 629,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 32)",
        "(line 585,col 9)-(line 585,col 48)",
        "(line 586,col 9)-(line 586,col 28)",
        "(line 587,col 9)-(line 588,col 65)",
        "(line 589,col 9)-(line 589,col 32)",
        "(line 590,col 9)-(line 590,col 76)",
        "(line 591,col 9)-(line 591,col 38)",
        "(line 592,col 9)-(line 592,col 56)",
        "(line 593,col 9)-(line 593,col 34)",
        "(line 594,col 9)-(line 595,col 43)",
        "(line 596,col 9)-(line 596,col 38)",
        "(line 597,col 9)-(line 598,col 61)",
        "(line 617,col 9)-(line 617,col 49)",
        "(line 618,col 9)-(line 618,col 23)",
        "(line 619,col 9)-(line 619,col 26)",
        "(line 620,col 9)-(line 620,col 50)",
        "(line 621,col 9)-(line 621,col 31)",
        "(line 622,col 9)-(line 622,col 33)",
        "(line 623,col 9)-(line 623,col 34)",
        "(line 624,col 9)-(line 624,col 20)",
        "(line 625,col 9)-(line 625,col 26)",
        "(line 626,col 9)-(line 626,col 35)",
        "(line 627,col 9)-(line 627,col 27)",
        "(line 628,col 9)-(line 628,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 632,
      "end_line": 689,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 633,col 9)-(line 635,col 59)",
        "(line 636,col 9)-(line 636,col 59)",
        "(line 637,col 9)-(line 637,col 81)",
        "(line 639,col 9)-(line 639,col 53)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 644,col 9)-(line 644,col 39)",
        "(line 645,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 655,col 9)",
        "(line 661,col 9)-(line 662,col 69)",
        "(line 665,col 9)-(line 665,col 51)",
        "(line 666,col 9)-(line 666,col 22)",
        "(line 667,col 9)-(line 667,col 52)",
        "(line 668,col 9)-(line 668,col 43)",
        "(line 669,col 9)-(line 671,col 9)",
        "(line 674,col 9)-(line 679,col 9)",
        "(line 682,col 9)-(line 688,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 691,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 693,col 9)-(line 702,col 9)",
        "(line 703,col 9)-(line 703,col 67)",
        "(line 704,col 9)-(line 704,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 708,
      "end_line": 756,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 709,col 9)-(line 710,col 43)",
        "(line 711,col 9)-(line 711,col 47)",
        "(line 712,col 9)-(line 712,col 61)",
        "(line 714,col 9)-(line 717,col 9)",
        "(line 723,col 9)-(line 724,col 69)",
        "(line 727,col 9)-(line 727,col 54)",
        "(line 728,col 9)-(line 755,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 763,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 774,col 9)",
        "(line 775,col 9)-(line 775,col 38)",
        "(line 776,col 9)-(line 776,col 18)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 41,
      "end_line": 777,
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
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 222,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 53)",
        "(line 229,col 9)-(line 231,col 9)",
        "(line 234,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 248,
      "end_line": 369,
      "comment": "\n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.  This check will fail randomly with probability alpha.\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 30)",
        "(line 251,col 9)-(line 251,col 33)",
        "(line 252,col 9)-(line 252,col 34)",
        "(line 253,col 9)-(line 253,col 29)",
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 261,col 9)",
        "(line 269,col 9)-(line 269,col 84)",
        "(line 270,col 9)-(line 270,col 22)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 37)",
        "(line 275,col 9)-(line 277,col 9)",
        "(line 280,col 9)-(line 280,col 25)",
        "(line 281,col 9)-(line 281,col 40)",
        "(line 282,col 9)-(line 282,col 32)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 297,col 9)-(line 297,col 59)",
        "(line 298,col 9)-(line 298,col 29)",
        "(line 299,col 9)-(line 299,col 37)",
        "(line 300,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 29)",
        "(line 305,col 9)-(line 305,col 29)",
        "(line 308,col 9)-(line 308,col 50)",
        "(line 309,col 9)-(line 309,col 45)",
        "(line 310,col 9)-(line 310,col 49)",
        "(line 313,col 9)-(line 313,col 24)",
        "(line 314,col 9)-(line 316,col 9)",
        "(line 317,col 9)-(line 317,col 88)",
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 324,col 105)",
        "(line 327,col 9)-(line 334,col 9)",
        "(line 337,col 9)-(line 337,col 62)",
        "(line 338,col 9)-(line 368,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 372,
      "end_line": 424,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 373,col 9)-(line 378,col 9)",
        "(line 379,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 385,col 55)",
        "(line 386,col 9)-(line 388,col 9)",
        "(line 389,col 9)-(line 389,col 48)",
        "(line 390,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 38)",
        "(line 403,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 413,col 39)",
        "(line 414,col 9)-(line 417,col 9)",
        "(line 422,col 9)-(line 423,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 427,
      "end_line": 479,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 61)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 444,col 9)-(line 444,col 54)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 453,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 457,col 9)-(line 457,col 38)",
        "(line 458,col 9)-(line 466,col 9)",
        "(line 467,col 9)-(line 467,col 43)",
        "(line 468,col 9)-(line 468,col 39)",
        "(line 469,col 9)-(line 472,col 9)",
        "(line 477,col 9)-(line 478,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 482,
      "end_line": 518,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 483,col 9)-(line 488,col 9)",
        "(line 489,col 9)-(line 494,col 9)",
        "(line 495,col 9)-(line 495,col 41)",
        "(line 496,col 9)-(line 496,col 35)",
        "(line 497,col 9)-(line 497,col 27)",
        "(line 498,col 9)-(line 498,col 27)",
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 26)",
        "(line 501,col 9)-(line 511,col 9)",
        "(line 516,col 9)-(line 517,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 521,
      "end_line": 526,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 522,col 9)-(line 525,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 529,
      "end_line": 548,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 530,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 54)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 34)",
        "(line 541,col 9)-(line 541,col 44)",
        "(line 542,col 9)-(line 542,col 28)",
        "(line 547,col 9)-(line 547,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 551,
      "end_line": 579,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 552,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 564,col 25)",
        "(line 565,col 9)-(line 565,col 21)",
        "(line 566,col 9)-(line 571,col 9)",
        "(line 577,col 9)-(line 578,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 582,
      "end_line": 628,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 32)",
        "(line 584,col 9)-(line 584,col 48)",
        "(line 585,col 9)-(line 585,col 28)",
        "(line 586,col 9)-(line 587,col 65)",
        "(line 588,col 9)-(line 588,col 32)",
        "(line 589,col 9)-(line 589,col 76)",
        "(line 590,col 9)-(line 590,col 38)",
        "(line 591,col 9)-(line 591,col 56)",
        "(line 592,col 9)-(line 592,col 34)",
        "(line 593,col 9)-(line 594,col 43)",
        "(line 595,col 9)-(line 595,col 38)",
        "(line 596,col 9)-(line 597,col 61)",
        "(line 616,col 9)-(line 616,col 49)",
        "(line 617,col 9)-(line 617,col 23)",
        "(line 618,col 9)-(line 618,col 26)",
        "(line 619,col 9)-(line 619,col 50)",
        "(line 620,col 9)-(line 620,col 31)",
        "(line 621,col 9)-(line 621,col 33)",
        "(line 622,col 9)-(line 622,col 34)",
        "(line 623,col 9)-(line 623,col 20)",
        "(line 624,col 9)-(line 624,col 26)",
        "(line 625,col 9)-(line 625,col 35)",
        "(line 626,col 9)-(line 626,col 27)",
        "(line 627,col 9)-(line 627,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 631,
      "end_line": 688,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 59)",
        "(line 635,col 9)-(line 635,col 59)",
        "(line 636,col 9)-(line 636,col 81)",
        "(line 638,col 9)-(line 638,col 53)",
        "(line 639,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 39)",
        "(line 644,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 654,col 9)",
        "(line 660,col 9)-(line 661,col 69)",
        "(line 664,col 9)-(line 664,col 51)",
        "(line 665,col 9)-(line 665,col 22)",
        "(line 666,col 9)-(line 666,col 52)",
        "(line 667,col 9)-(line 667,col 43)",
        "(line 668,col 9)-(line 670,col 9)",
        "(line 673,col 9)-(line 678,col 9)",
        "(line 681,col 9)-(line 687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 690,
      "end_line": 704,
      "comment": "",
      "child_ranges": [
        "(line 692,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 67)",
        "(line 703,col 9)-(line 703,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 707,
      "end_line": 755,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 708,col 9)-(line 709,col 43)",
        "(line 710,col 9)-(line 710,col 47)",
        "(line 711,col 9)-(line 711,col 61)",
        "(line 713,col 9)-(line 716,col 9)",
        "(line 722,col 9)-(line 723,col 69)",
        "(line 726,col 9)-(line 726,col 54)",
        "(line 727,col 9)-(line 754,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 762,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 38)",
        "(line 775,col 9)-(line 775,col 18)"
      ]
    }
  ]
}
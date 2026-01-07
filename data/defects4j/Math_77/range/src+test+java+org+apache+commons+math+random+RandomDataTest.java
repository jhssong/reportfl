{
  "filepath": "/tmp/Math-77b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "RandomDataTest",
      "is_interface": false,
      "parent_types": [
        "RetryTestCase"
      ],
      "begin_line": 43,
      "end_line": 785,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.random.RandomDataTest.RandomDataTest(java.lang.String)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 20)",
        "(line 47,col 9)-(line 47,col 42)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "smallSampleSize"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "expected"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "largeSampleSize"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "hex"
      ],
      "begin_line": 53,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "randomData"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "testStatistic"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.suite()",
      "begin_line": 58,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 62)",
        "(line 60,col 9)-(line 60,col 42)",
        "(line 61,col 9)-(line 61,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 73)",
        "(line 66,col 9)-(line 66,col 73)",
        "(line 67,col 9)-(line 67,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 69)",
        "(line 72,col 9)-(line 72,col 69)",
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 77,
      "end_line": 102,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 78,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 41)",
        "(line 85,col 9)-(line 85,col 22)",
        "(line 86,col 9)-(line 90,col 9)",
        "(line 91,col 9)-(line 91,col 38)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 100,col 9)-(line 101,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 105,
      "end_line": 130,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 106,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 112,col 41)",
        "(line 113,col 9)-(line 113,col 23)",
        "(line 114,col 9)-(line 118,col 9)",
        "(line 119,col 9)-(line 119,col 38)",
        "(line 120,col 9)-(line 122,col 9)",
        "(line 128,col 9)-(line 129,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 133,
      "end_line": 158,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 134,col 9)-(line 139,col 9)",
        "(line 140,col 9)-(line 140,col 41)",
        "(line 141,col 9)-(line 141,col 23)",
        "(line 142,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 38)",
        "(line 148,col 9)-(line 150,col 9)",
        "(line 156,col 9)-(line 157,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 161,
      "end_line": 186,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 162,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 41)",
        "(line 169,col 9)-(line 169,col 22)",
        "(line 170,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 38)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 184,col 9)-(line 185,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 194,
      "end_line": 228,
      "comment": "\n     * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n     * 5) close to actual cumulative Poisson probablity and that nextPoisson\n     * fails when mean is non-positive TODO: replace with statistical test,\n     * adding test stat to TestStatistic\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 201,col 38)",
        "(line 202,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 210,col 64)",
        "(line 211,col 9)-(line 211,col 38)",
        "(line 212,col 9)-(line 213,col 56)",
        "(line 214,col 9)-(line 214,col 60)",
        "(line 215,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 226,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 230,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 236,col 53)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 242,col 9)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 256,
      "end_line": 377,
      "comment": " \n     * Verifies that nextPoisson(mean) generates an empirical distribution of values\n     * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n     * grouped frequency distribution of the observed values and comparing this distribution\n     * to the corresponding expected distribution computed using PoissonDistributionImpl.\n     * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n     * distributions are the same. If the null hypothesis can be rejected with confidence\n     * 1 - alpha, the check fails.  This check will fail randomly with probability alpha.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 30)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 260,col 34)",
        "(line 261,col 9)-(line 261,col 29)",
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 269,col 9)",
        "(line 277,col 9)-(line 277,col 84)",
        "(line 278,col 9)-(line 278,col 22)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 37)",
        "(line 283,col 9)-(line 285,col 9)",
        "(line 288,col 9)-(line 288,col 25)",
        "(line 289,col 9)-(line 289,col 40)",
        "(line 290,col 9)-(line 290,col 32)",
        "(line 291,col 9)-(line 291,col 32)",
        "(line 292,col 9)-(line 297,col 9)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 29)",
        "(line 307,col 9)-(line 307,col 37)",
        "(line 308,col 9)-(line 311,col 9)",
        "(line 312,col 9)-(line 312,col 29)",
        "(line 313,col 9)-(line 313,col 29)",
        "(line 316,col 9)-(line 316,col 50)",
        "(line 317,col 9)-(line 317,col 45)",
        "(line 318,col 9)-(line 318,col 49)",
        "(line 321,col 9)-(line 321,col 24)",
        "(line 322,col 9)-(line 324,col 9)",
        "(line 325,col 9)-(line 325,col 88)",
        "(line 328,col 9)-(line 328,col 35)",
        "(line 329,col 9)-(line 331,col 9)",
        "(line 332,col 9)-(line 332,col 105)",
        "(line 335,col 9)-(line 342,col 9)",
        "(line 345,col 9)-(line 345,col 62)",
        "(line 346,col 9)-(line 376,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 380,
      "end_line": 432,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 381,col 9)-(line 386,col 9)",
        "(line 387,col 9)-(line 392,col 9)",
        "(line 393,col 9)-(line 393,col 55)",
        "(line 394,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 410,col 38)",
        "(line 411,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 420,col 43)",
        "(line 421,col 9)-(line 421,col 39)",
        "(line 422,col 9)-(line 425,col 9)",
        "(line 430,col 9)-(line 431,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 435,
      "end_line": 487,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 436,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 61)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 452,col 54)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 461,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 465,col 9)-(line 465,col 38)",
        "(line 466,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 43)",
        "(line 476,col 9)-(line 476,col 39)",
        "(line 477,col 9)-(line 480,col 9)",
        "(line 485,col 9)-(line 486,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 490,
      "end_line": 526,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 491,col 9)-(line 496,col 9)",
        "(line 497,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 503,col 41)",
        "(line 504,col 9)-(line 504,col 35)",
        "(line 505,col 9)-(line 505,col 27)",
        "(line 506,col 9)-(line 506,col 27)",
        "(line 507,col 9)-(line 507,col 47)",
        "(line 508,col 9)-(line 508,col 26)",
        "(line 509,col 9)-(line 519,col 9)",
        "(line 524,col 9)-(line 525,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 529,
      "end_line": 534,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 530,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 537,
      "end_line": 556,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 538,col 9)-(line 543,col 9)",
        "(line 544,col 9)-(line 544,col 54)",
        "(line 545,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 34)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 550,col 28)",
        "(line 555,col 9)-(line 555,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 559,
      "end_line": 587,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 560,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 25)",
        "(line 573,col 9)-(line 573,col 21)",
        "(line 574,col 9)-(line 579,col 9)",
        "(line 585,col 9)-(line 586,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 590,
      "end_line": 636,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 32)",
        "(line 592,col 9)-(line 592,col 48)",
        "(line 593,col 9)-(line 593,col 28)",
        "(line 594,col 9)-(line 595,col 65)",
        "(line 596,col 9)-(line 596,col 32)",
        "(line 597,col 9)-(line 597,col 76)",
        "(line 598,col 9)-(line 598,col 38)",
        "(line 599,col 9)-(line 599,col 56)",
        "(line 600,col 9)-(line 600,col 34)",
        "(line 601,col 9)-(line 602,col 43)",
        "(line 603,col 9)-(line 603,col 38)",
        "(line 604,col 9)-(line 605,col 61)",
        "(line 624,col 9)-(line 624,col 49)",
        "(line 625,col 9)-(line 625,col 23)",
        "(line 626,col 9)-(line 626,col 26)",
        "(line 627,col 9)-(line 627,col 50)",
        "(line 628,col 9)-(line 628,col 31)",
        "(line 629,col 9)-(line 629,col 33)",
        "(line 630,col 9)-(line 630,col 34)",
        "(line 631,col 9)-(line 631,col 20)",
        "(line 632,col 9)-(line 632,col 26)",
        "(line 633,col 9)-(line 633,col 35)",
        "(line 634,col 9)-(line 634,col 27)",
        "(line 635,col 9)-(line 635,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 639,
      "end_line": 696,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 640,col 9)-(line 642,col 59)",
        "(line 643,col 9)-(line 643,col 59)",
        "(line 644,col 9)-(line 644,col 81)",
        "(line 646,col 9)-(line 646,col 53)",
        "(line 647,col 9)-(line 649,col 9)",
        "(line 651,col 9)-(line 651,col 39)",
        "(line 652,col 9)-(line 657,col 9)",
        "(line 659,col 9)-(line 662,col 9)",
        "(line 668,col 9)-(line 669,col 69)",
        "(line 672,col 9)-(line 672,col 51)",
        "(line 673,col 9)-(line 673,col 22)",
        "(line 674,col 9)-(line 674,col 52)",
        "(line 675,col 9)-(line 675,col 43)",
        "(line 676,col 9)-(line 678,col 9)",
        "(line 681,col 9)-(line 686,col 9)",
        "(line 689,col 9)-(line 695,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 698,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 710,col 67)",
        "(line 711,col 9)-(line 711,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 715,
      "end_line": 763,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 716,col 9)-(line 717,col 43)",
        "(line 718,col 9)-(line 718,col 47)",
        "(line 719,col 9)-(line 719,col 61)",
        "(line 721,col 9)-(line 724,col 9)",
        "(line 730,col 9)-(line 731,col 69)",
        "(line 734,col 9)-(line 734,col 54)",
        "(line 735,col 9)-(line 762,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 770,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 781,col 9)",
        "(line 782,col 9)-(line 782,col 38)",
        "(line 783,col 9)-(line 783,col 18)"
      ]
    }
  ]
}
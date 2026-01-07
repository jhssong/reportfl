{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/random/RandomDataTest.java",
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
        "(line 46,col 3)-(line 46,col 14)",
        "(line 47,col 3)-(line 47,col 36)"
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
        "(line 59,col 3)-(line 59,col 56)",
        "(line 60,col 3)-(line 60,col 36)",
        "(line 61,col 3)-(line 61,col 15)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextIntExtremeValues()",
      "begin_line": 64,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 65,col 3)-(line 65,col 67)",
        "(line 66,col 3)-(line 66,col 67)",
        "(line 67,col 3)-(line 67,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLongExtremeValues()",
      "begin_line": 70,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 71,col 3)-(line 71,col 63)",
        "(line 72,col 3)-(line 72,col 63)",
        "(line 73,col 3)-(line 73,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextInt()",
      "begin_line": 77,
      "end_line": 102,
      "comment": " test dispersion and failure modes for nextInt() ",
      "child_ranges": [
        "(line 78,col 3)-(line 83,col 3)",
        "(line 84,col 3)-(line 84,col 35)",
        "(line 85,col 3)-(line 85,col 16)",
        "(line 86,col 3)-(line 90,col 3)",
        "(line 91,col 3)-(line 91,col 32)",
        "(line 92,col 3)-(line 94,col 3)",
        "(line 100,col 3)-(line 101,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextLong()",
      "begin_line": 105,
      "end_line": 130,
      "comment": " test dispersion and failure modes for nextLong() ",
      "child_ranges": [
        "(line 106,col 3)-(line 111,col 3)",
        "(line 112,col 3)-(line 112,col 35)",
        "(line 113,col 3)-(line 113,col 17)",
        "(line 114,col 3)-(line 118,col 3)",
        "(line 119,col 3)-(line 119,col 32)",
        "(line 120,col 3)-(line 122,col 3)",
        "(line 128,col 3)-(line 129,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureLong()",
      "begin_line": 133,
      "end_line": 158,
      "comment": " test dispersion and failure modes for nextSecureLong() ",
      "child_ranges": [
        "(line 134,col 3)-(line 139,col 3)",
        "(line 140,col 3)-(line 140,col 35)",
        "(line 141,col 3)-(line 141,col 17)",
        "(line 142,col 3)-(line 146,col 3)",
        "(line 147,col 3)-(line 147,col 32)",
        "(line 148,col 3)-(line 150,col 3)",
        "(line 156,col 3)-(line 157,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureInt()",
      "begin_line": 161,
      "end_line": 186,
      "comment": " test dispersion and failure modes for nextSecureInt() ",
      "child_ranges": [
        "(line 162,col 3)-(line 167,col 3)",
        "(line 168,col 3)-(line 168,col 35)",
        "(line 169,col 3)-(line 169,col 16)",
        "(line 170,col 3)-(line 174,col 3)",
        "(line 175,col 3)-(line 175,col 32)",
        "(line 176,col 3)-(line 178,col 3)",
        "(line 184,col 3)-(line 185,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoisson()",
      "begin_line": 194,
      "end_line": 228,
      "comment": "\n\t * Make sure that empirical distribution of random Poisson(4)\u0027s has P(X \u003c\u003d\n\t * 5) close to actual cumulative Poisson probablity and that nextPoisson\n\t * fails when mean is non-positive TODO: replace with statistical test,\n\t * adding test stat to TestStatistic\n\t ",
      "child_ranges": [
        "(line 195,col 3)-(line 200,col 3)",
        "(line 201,col 3)-(line 201,col 32)",
        "(line 202,col 3)-(line 208,col 3)",
        "(line 209,col 3)-(line 210,col 52)",
        "(line 211,col 3)-(line 211,col 32)",
        "(line 212,col 3)-(line 213,col 44)",
        "(line 214,col 3)-(line 214,col 54)",
        "(line 215,col 3)-(line 220,col 3)",
        "(line 221,col 3)-(line 226,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPoissonConsistency()",
      "begin_line": 230,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 232,col 6)-(line 234,col 6)",
        "(line 236,col 6)-(line 236,col 50)",
        "(line 237,col 6)-(line 239,col 6)",
        "(line 242,col 6)-(line 244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.checkNextPoissonConsistency(double)",
      "begin_line": 256,
      "end_line": 377,
      "comment": " \n\t * Verifies that nextPoisson(mean) generates an empirical distribution of values\n\t * consistent with PoissonDistributionImpl by generating 1000 values, computing a\n\t * grouped frequency distribution of the observed values and comparing this distribution\n\t * to the corresponding expected distribution computed using PoissonDistributionImpl.\n\t * Uses ChiSquare test of goodness of fit to evaluate the null hypothesis that the\n\t * distributions are the same. If the null hypothesis can be rejected with confidence\n\t * 1 - alpha, the check fails.  This check will fail randomly with probability alpha.\n\t ",
      "child_ranges": [
        "(line 258,col 6)-(line 258,col 27)",
        "(line 259,col 6)-(line 259,col 30)",
        "(line 260,col 6)-(line 260,col 31)",
        "(line 261,col 6)-(line 261,col 26)",
        "(line 262,col 6)-(line 262,col 43)",
        "(line 263,col 6)-(line 269,col 6)",
        "(line 277,col 6)-(line 277,col 81)",
        "(line 278,col 6)-(line 278,col 19)",
        "(line 279,col 6)-(line 281,col 6)",
        "(line 282,col 6)-(line 282,col 34)",
        "(line 283,col 6)-(line 285,col 6)",
        "(line 288,col 6)-(line 288,col 22)",
        "(line 289,col 6)-(line 289,col 37)",
        "(line 290,col 6)-(line 290,col 29)",
        "(line 291,col 6)-(line 291,col 29)",
        "(line 292,col 6)-(line 297,col 6)",
        "(line 305,col 6)-(line 305,col 56)",
        "(line 306,col 6)-(line 306,col 26)",
        "(line 307,col 6)-(line 307,col 34)",
        "(line 308,col 6)-(line 311,col 6)",
        "(line 312,col 6)-(line 312,col 26)",
        "(line 313,col 6)-(line 313,col 26)",
        "(line 316,col 6)-(line 316,col 47)",
        "(line 317,col 6)-(line 317,col 42)",
        "(line 318,col 6)-(line 318,col 46)",
        "(line 321,col 6)-(line 321,col 21)",
        "(line 322,col 6)-(line 324,col 6)",
        "(line 325,col 6)-(line 325,col 85)",
        "(line 328,col 6)-(line 328,col 32)",
        "(line 329,col 6)-(line 331,col 6)",
        "(line 332,col 6)-(line 332,col 102)",
        "(line 335,col 6)-(line 342,col 6)",
        "(line 345,col 6)-(line 345,col 59)",
        "(line 346,col 6)-(line 376,col 6)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextHex()",
      "begin_line": 380,
      "end_line": 432,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 381,col 3)-(line 386,col 3)",
        "(line 387,col 3)-(line 392,col 3)",
        "(line 393,col 3)-(line 393,col 49)",
        "(line 394,col 3)-(line 396,col 3)",
        "(line 397,col 3)-(line 397,col 42)",
        "(line 398,col 3)-(line 400,col 3)",
        "(line 401,col 3)-(line 406,col 3)",
        "(line 407,col 3)-(line 409,col 3)",
        "(line 410,col 3)-(line 410,col 32)",
        "(line 411,col 3)-(line 419,col 3)",
        "(line 420,col 3)-(line 420,col 37)",
        "(line 421,col 3)-(line 421,col 33)",
        "(line 422,col 3)-(line 425,col 3)",
        "(line 430,col 3)-(line 431,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSecureHex()",
      "begin_line": 435,
      "end_line": 487,
      "comment": " test dispersion and failute modes for nextHex() ",
      "child_ranges": [
        "(line 436,col 3)-(line 441,col 3)",
        "(line 442,col 3)-(line 447,col 3)",
        "(line 448,col 3)-(line 448,col 55)",
        "(line 449,col 3)-(line 451,col 3)",
        "(line 452,col 3)-(line 452,col 48)",
        "(line 453,col 3)-(line 455,col 3)",
        "(line 456,col 3)-(line 461,col 3)",
        "(line 462,col 3)-(line 464,col 3)",
        "(line 465,col 3)-(line 465,col 32)",
        "(line 466,col 3)-(line 474,col 3)",
        "(line 475,col 3)-(line 475,col 37)",
        "(line 476,col 3)-(line 476,col 33)",
        "(line 477,col 3)-(line 480,col 3)",
        "(line 485,col 3)-(line 486,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniform()",
      "begin_line": 490,
      "end_line": 526,
      "comment": " test failure modes and dispersion of nextUniform() ",
      "child_ranges": [
        "(line 491,col 3)-(line 496,col 3)",
        "(line 497,col 3)-(line 502,col 3)",
        "(line 503,col 3)-(line 503,col 35)",
        "(line 504,col 3)-(line 504,col 29)",
        "(line 505,col 3)-(line 505,col 21)",
        "(line 506,col 3)-(line 506,col 21)",
        "(line 507,col 3)-(line 507,col 41)",
        "(line 508,col 3)-(line 508,col 20)",
        "(line 509,col 3)-(line 519,col 3)",
        "(line 524,col 3)-(line 525,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextUniformExclusiveEndpoints()",
      "begin_line": 529,
      "end_line": 534,
      "comment": " test exclusive endpoints of nextUniform *",
      "child_ranges": [
        "(line 530,col 3)-(line 533,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextGaussian()",
      "begin_line": 537,
      "end_line": 556,
      "comment": " test failure modes and distribution of nextGaussian() ",
      "child_ranges": [
        "(line 538,col 3)-(line 543,col 3)",
        "(line 544,col 3)-(line 544,col 48)",
        "(line 545,col 3)-(line 547,col 3)",
        "(line 548,col 3)-(line 548,col 28)",
        "(line 549,col 3)-(line 549,col 38)",
        "(line 550,col 3)-(line 550,col 22)",
        "(line 555,col 3)-(line 555,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextExponential()",
      "begin_line": 559,
      "end_line": 587,
      "comment": " test failure modes and distribution of nextExponential() ",
      "child_ranges": [
        "(line 560,col 3)-(line 565,col 3)",
        "(line 566,col 9)-(line 571,col 9)",
        "(line 572,col 3)-(line 572,col 19)",
        "(line 573,col 3)-(line 573,col 15)",
        "(line 574,col 3)-(line 579,col 3)",
        "(line 585,col 3)-(line 586,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testConfig()",
      "begin_line": 590,
      "end_line": 636,
      "comment": " test reseeding, algorithm/provider games ",
      "child_ranges": [
        "(line 591,col 3)-(line 591,col 26)",
        "(line 592,col 3)-(line 592,col 42)",
        "(line 593,col 3)-(line 593,col 22)",
        "(line 594,col 3)-(line 595,col 53)",
        "(line 596,col 3)-(line 596,col 26)",
        "(line 597,col 3)-(line 597,col 70)",
        "(line 598,col 3)-(line 598,col 32)",
        "(line 599,col 3)-(line 599,col 50)",
        "(line 600,col 3)-(line 600,col 28)",
        "(line 601,col 3)-(line 602,col 31)",
        "(line 603,col 3)-(line 603,col 32)",
        "(line 604,col 3)-(line 605,col 49)",
        "(line 624,col 3)-(line 624,col 43)",
        "(line 625,col 3)-(line 625,col 17)",
        "(line 626,col 3)-(line 626,col 20)",
        "(line 627,col 3)-(line 627,col 44)",
        "(line 628,col 3)-(line 628,col 25)",
        "(line 629,col 3)-(line 629,col 27)",
        "(line 630,col 3)-(line 630,col 28)",
        "(line 631,col 3)-(line 631,col 14)",
        "(line 632,col 3)-(line 632,col 20)",
        "(line 633,col 3)-(line 633,col 29)",
        "(line 634,col 3)-(line 634,col 21)",
        "(line 635,col 3)-(line 635,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextSample()",
      "begin_line": 639,
      "end_line": 696,
      "comment": " tests for nextSample() sampling from Collection ",
      "child_ranges": [
        "(line 640,col 3)-(line 642,col 47)",
        "(line 643,col 3)-(line 643,col 53)",
        "(line 644,col 3)-(line 644,col 75)",
        "(line 646,col 3)-(line 646,col 47)",
        "(line 647,col 3)-(line 649,col 3)",
        "(line 651,col 3)-(line 651,col 33)",
        "(line 652,col 3)-(line 657,col 3)",
        "(line 659,col 3)-(line 662,col 3)",
        "(line 668,col 3)-(line 669,col 57)",
        "(line 672,col 3)-(line 672,col 45)",
        "(line 673,col 3)-(line 673,col 16)",
        "(line 674,col 3)-(line 674,col 46)",
        "(line 675,col 3)-(line 675,col 37)",
        "(line 676,col 3)-(line 678,col 3)",
        "(line 681,col 3)-(line 686,col 3)",
        "(line 689,col 3)-(line 695,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findSample(java.lang.Object[], java.lang.Object[])",
      "begin_line": 698,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 700,col 3)-(line 709,col 3)",
        "(line 710,col 3)-(line 710,col 61)",
        "(line 711,col 3)-(line 711,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.testNextPermutation()",
      "begin_line": 715,
      "end_line": 763,
      "comment": " tests for nextPermutation ",
      "child_ranges": [
        "(line 716,col 3)-(line 717,col 31)",
        "(line 718,col 3)-(line 718,col 41)",
        "(line 719,col 3)-(line 719,col 55)",
        "(line 721,col 3)-(line 724,col 3)",
        "(line 730,col 3)-(line 731,col 57)",
        "(line 734,col 3)-(line 734,col 48)",
        "(line 735,col 3)-(line 762,col 3)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.random.RandomDataTest.findPerm(int[][], int[])",
      "begin_line": 770,
      "end_line": 784,
      "comment": "",
      "child_ranges": [
        "(line 771,col 3)-(line 781,col 3)",
        "(line 782,col 3)-(line 782,col 32)",
        "(line 783,col 3)-(line 783,col 12)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/util/ArithmeticUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 39,
      "end_line": 828,
      "comment": "\n * Test cases for the {@link ArithmeticUtils} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.test0Choose0()",
      "begin_line": 45,
      "end_line": 50,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 84)",
        "(line 48,col 9)-(line 48,col 81)",
        "(line 49,col 9)-(line 49,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheck()",
      "begin_line": 52,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 36)",
        "(line 55,col 9)-(line 55,col 39)",
        "(line 56,col 9)-(line 56,col 70)",
        "(line 57,col 9)-(line 61,col 9)",
        "(line 62,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheckLong()",
      "begin_line": 69,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 34)",
        "(line 72,col 9)-(line 72,col 34)",
        "(line 73,col 9)-(line 73,col 71)",
        "(line 74,col 9)-(line 74,col 71)",
        "(line 75,col 9)-(line 75,col 71)",
        "(line 76,col 9)-(line 76,col 71)",
        "(line 77,col 9)-(line 77,col 69)",
        "(line 78,col 9)-(line 78,col 69)",
        "(line 79,col 9)-(line 79,col 71)",
        "(line 80,col 9)-(line 80,col 76)",
        "(line 81,col 9)-(line 81,col 44)",
        "(line 82,col 9)-(line 82,col 45)",
        "(line 83,col 9)-(line 83,col 44)",
        "(line 84,col 9)-(line 84,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficient()",
      "begin_line": 88,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 90,col 9)-(line 96,col 16)",
        "(line 97,col 9)-(line 104,col 16)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 108,col 9)-(line 110,col 9)",
        "(line 112,col 9)-(line 118,col 9)",
        "(line 120,col 9)-(line 120,col 46)",
        "(line 121,col 9)-(line 121,col 46)",
        "(line 122,col 9)-(line 130,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 133,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 135,col 9)-(line 140,col 9)",
        "(line 142,col 9)-(line 147,col 9)",
        "(line 149,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 72)",
        "(line 188,col 9)-(line 189,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 196,
      "end_line": 251,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 69)",
        "(line 229,col 9)-(line 229,col 55)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 232,col 9)-(line 232,col 66)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 234,col 9)-(line 234,col 52)",
        "(line 237,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 22)",
        "(line 245,col 9)-(line 245,col 62)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 52)",
        "(line 248,col 9)-(line 248,col 101)",
        "(line 249,col 9)-(line 249,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testFactorial()",
      "begin_line": 253,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 259,col 9)",
        "(line 261,col 9)-(line 261,col 66)",
        "(line 262,col 9)-(line 262,col 82)",
        "(line 263,col 9)-(line 263,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testFactorialFail()",
      "begin_line": 266,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcd()",
      "begin_line": 295,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 19)",
        "(line 298,col 9)-(line 298,col 19)",
        "(line 299,col 9)-(line 299,col 19)",
        "(line 301,col 9)-(line 301,col 58)",
        "(line 303,col 9)-(line 303,col 58)",
        "(line 304,col 9)-(line 304,col 58)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 59)",
        "(line 308,col 9)-(line 308,col 59)",
        "(line 309,col 9)-(line 309,col 60)",
        "(line 310,col 9)-(line 310,col 60)",
        "(line 311,col 9)-(line 311,col 61)",
        "(line 313,col 9)-(line 313,col 58)",
        "(line 314,col 9)-(line 314,col 59)",
        "(line 315,col 9)-(line 315,col 59)",
        "(line 316,col 9)-(line 316,col 60)",
        "(line 318,col 9)-(line 318,col 88)",
        "(line 320,col 9)-(line 320,col 90)",
        "(line 321,col 9)-(line 321,col 91)",
        "(line 322,col 9)-(line 322,col 83)",
        "(line 323,col 9)-(line 329,col 9)",
        "(line 330,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 343,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdConsistency()",
      "begin_line": 346,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 71)",
        "(line 349,col 9)-(line 349,col 61)",
        "(line 350,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 57)",
        "(line 354,col 9)-(line 367,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdLong()",
      "begin_line": 370,
      "end_line": 421,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 20)",
        "(line 373,col 9)-(line 373,col 20)",
        "(line 374,col 9)-(line 374,col 20)",
        "(line 376,col 9)-(line 376,col 59)",
        "(line 378,col 9)-(line 378,col 58)",
        "(line 379,col 9)-(line 379,col 58)",
        "(line 380,col 9)-(line 380,col 59)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 383,col 9)-(line 383,col 59)",
        "(line 384,col 9)-(line 384,col 60)",
        "(line 385,col 9)-(line 385,col 60)",
        "(line 386,col 9)-(line 386,col 61)",
        "(line 388,col 9)-(line 388,col 58)",
        "(line 389,col 9)-(line 389,col 59)",
        "(line 390,col 9)-(line 390,col 59)",
        "(line 391,col 9)-(line 391,col 60)",
        "(line 393,col 9)-(line 393,col 94)",
        "(line 395,col 9)-(line 395,col 81)",
        "(line 397,col 9)-(line 397,col 85)",
        "(line 398,col 9)-(line 398,col 86)",
        "(line 399,col 9)-(line 399,col 78)",
        "(line 400,col 9)-(line 406,col 9)",
        "(line 407,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 420,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testLcm()",
      "begin_line": 424,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 19)",
        "(line 427,col 9)-(line 427,col 19)",
        "(line 428,col 9)-(line 428,col 19)",
        "(line 430,col 9)-(line 430,col 58)",
        "(line 431,col 9)-(line 431,col 58)",
        "(line 432,col 9)-(line 432,col 58)",
        "(line 433,col 9)-(line 433,col 58)",
        "(line 434,col 9)-(line 434,col 60)",
        "(line 435,col 9)-(line 435,col 61)",
        "(line 436,col 9)-(line 436,col 61)",
        "(line 437,col 9)-(line 437,col 62)",
        "(line 438,col 9)-(line 438,col 61)",
        "(line 442,col 9)-(line 442,col 83)",
        "(line 445,col 9)-(line 445,col 58)",
        "(line 447,col 9)-(line 453,col 9)",
        "(line 455,col 9)-(line 461,col 9)",
        "(line 463,col 9)-(line 468,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testLcmLong()",
      "begin_line": 471,
      "end_line": 520,
      "comment": "",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 20)",
        "(line 474,col 9)-(line 474,col 20)",
        "(line 475,col 9)-(line 475,col 20)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 58)",
        "(line 479,col 9)-(line 479,col 58)",
        "(line 480,col 9)-(line 480,col 58)",
        "(line 481,col 9)-(line 481,col 60)",
        "(line 482,col 9)-(line 482,col 61)",
        "(line 483,col 9)-(line 483,col 61)",
        "(line 484,col 9)-(line 484,col 62)",
        "(line 485,col 9)-(line 485,col 61)",
        "(line 487,col 9)-(line 487,col 91)",
        "(line 491,col 9)-(line 491,col 86)",
        "(line 494,col 9)-(line 494,col 61)",
        "(line 496,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 510,col 9)",
        "(line 512,col 9)-(line 513,col 81)",
        "(line 514,col 9)-(line 519,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheck()",
      "begin_line": 522,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 36)",
        "(line 525,col 9)-(line 525,col 39)",
        "(line 526,col 9)-(line 526,col 70)",
        "(line 527,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 536,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheckLong()",
      "begin_line": 539,
      "end_line": 559,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 34)",
        "(line 542,col 9)-(line 542,col 34)",
        "(line 543,col 9)-(line 543,col 71)",
        "(line 544,col 9)-(line 544,col 71)",
        "(line 545,col 9)-(line 545,col 70)",
        "(line 546,col 9)-(line 546,col 70)",
        "(line 547,col 9)-(line 547,col 71)",
        "(line 548,col 9)-(line 548,col 71)",
        "(line 549,col 9)-(line 549,col 70)",
        "(line 550,col 9)-(line 550,col 70)",
        "(line 551,col 9)-(line 551,col 71)",
        "(line 552,col 9)-(line 552,col 74)",
        "(line 553,col 9)-(line 553,col 44)",
        "(line 554,col 9)-(line 554,col 44)",
        "(line 555,col 9)-(line 555,col 44)",
        "(line 556,col 9)-(line 556,col 44)",
        "(line 557,col 9)-(line 557,col 45)",
        "(line 558,col 9)-(line 558,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheck()",
      "begin_line": 561,
      "end_line": 578,
      "comment": "",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 36)",
        "(line 564,col 9)-(line 564,col 39)",
        "(line 565,col 9)-(line 565,col 70)",
        "(line 566,col 9)-(line 566,col 81)",
        "(line 567,col 9)-(line 567,col 75)",
        "(line 568,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 577,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 580,
      "end_line": 589,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 36)",
        "(line 583,col 9)-(line 588,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckLong()",
      "begin_line": 591,
      "end_line": 605,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 34)",
        "(line 594,col 9)-(line 594,col 34)",
        "(line 595,col 9)-(line 595,col 70)",
        "(line 596,col 9)-(line 596,col 70)",
        "(line 597,col 9)-(line 597,col 71)",
        "(line 598,col 9)-(line 598,col 75)",
        "(line 600,col 9)-(line 600,col 77)",
        "(line 601,col 9)-(line 601,col 76)",
        "(line 602,col 9)-(line 602,col 44)",
        "(line 603,col 9)-(line 603,col 45)",
        "(line 604,col 9)-(line 604,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testPow()",
      "begin_line": 607,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 68)",
        "(line 611,col 9)-(line 611,col 59)",
        "(line 612,col 9)-(line 617,col 9)",
        "(line 619,col 9)-(line 619,col 69)",
        "(line 620,col 9)-(line 620,col 60)",
        "(line 621,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 628,col 70)",
        "(line 629,col 9)-(line 629,col 61)",
        "(line 630,col 9)-(line 635,col 9)",
        "(line 637,col 9)-(line 637,col 71)",
        "(line 638,col 9)-(line 638,col 62)",
        "(line 639,col 9)-(line 644,col 9)",
        "(line 646,col 9)-(line 646,col 55)",
        "(line 647,col 9)-(line 647,col 96)",
        "(line 648,col 9)-(line 648,col 79)",
        "(line 649,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 656,col 97)",
        "(line 657,col 9)-(line 657,col 80)",
        "(line 658,col 9)-(line 663,col 9)",
        "(line 665,col 9)-(line 665,col 117)",
        "(line 666,col 9)-(line 666,col 93)",
        "(line 667,col 9)-(line 672,col 9)",
        "(line 674,col 9)-(line 677,col 76)",
        "(line 678,col 9)-(line 678,col 73)",
        "(line 679,col 9)-(line 679,col 74)",
        "(line 680,col 9)-(line 680,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testIsPowerOfTwo()",
      "begin_line": 684,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 686,col 9)-(line 686,col 27)",
        "(line 687,col 9)-(line 687,col 50)",
        "(line 688,col 9)-(line 688,col 37)",
        "(line 689,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 695,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testStirlingS2()",
      "begin_line": 698,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 65)",
        "(line 703,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 75)",
        "(line 714,col 9)-(line 714,col 84)",
        "(line 716,col 9)-(line 716,col 70)",
        "(line 717,col 9)-(line 717,col 70)",
        "(line 718,col 9)-(line 718,col 70)",
        "(line 719,col 9)-(line 719,col 70)",
        "(line 720,col 9)-(line 720,col 70)",
        "(line 721,col 9)-(line 721,col 70)",
        "(line 722,col 9)-(line 722,col 70)",
        "(line 723,col 9)-(line 723,col 70)",
        "(line 724,col 9)-(line 724,col 70)",
        "(line 725,col 9)-(line 725,col 70)",
        "(line 726,col 9)-(line 726,col 70)",
        "(line 727,col 9)-(line 727,col 70)",
        "(line 728,col 9)-(line 728,col 70)",
        "(line 729,col 9)-(line 729,col 70)",
        "(line 730,col 9)-(line 730,col 70)",
        "(line 731,col 9)-(line 731,col 70)",
        "(line 732,col 9)-(line 732,col 70)",
        "(line 733,col 9)-(line 733,col 70)",
        "(line 734,col 9)-(line 734,col 70)",
        "(line 735,col 9)-(line 735,col 70)",
        "(line 736,col 9)-(line 736,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testStirlingS2NegativeN()",
      "begin_line": 740,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testStirlingS2LargeK()",
      "begin_line": 745,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testStirlingS2Overflow()",
      "begin_line": 750,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 758,
      "end_line": 789,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 759,col 9)-(line 764,col 9)",
        "(line 765,col 9)-(line 765,col 25)",
        "(line 766,col 9)-(line 780,col 9)",
        "(line 781,col 9)-(line 783,col 9)",
        "(line 784,col 9)-(line 786,col 9)",
        "(line 787,col 9)-(line 787,col 75)",
        "(line 788,col 9)-(line 788,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.factorial(int)",
      "begin_line": 794,
      "end_line": 800,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 795,col 9)-(line 795,col 24)",
        "(line 796,col 9)-(line 798,col 9)",
        "(line 799,col 9)-(line 799,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 802,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 808,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 811,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 820,
      "end_line": 827,
      "comment": "",
      "child_ranges": [
        "(line 821,col 9)-(line 826,col 9)"
      ]
    }
  ]
}
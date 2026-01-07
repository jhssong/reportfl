{
  "filepath": "/tmp/Math-50b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1888,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Id$\n *          2007) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 44,
      "end_line": 44,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 49,
      "end_line": 80,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 55,col 9)",
        "(line 56,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 78,col 75)",
        "(line 79,col 9)-(line 79,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 85,
      "end_line": 91,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 24)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 90,col 9)-(line 90,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 94,
      "end_line": 99,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 78)",
        "(line 97,col 9)-(line 97,col 75)",
        "(line 98,col 9)-(line 98,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 101,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 64)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 118,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 124,col 65)",
        "(line 125,col 9)-(line 125,col 65)",
        "(line 126,col 9)-(line 126,col 63)",
        "(line 127,col 9)-(line 127,col 63)",
        "(line 128,col 9)-(line 128,col 65)",
        "(line 129,col 9)-(line 129,col 70)",
        "(line 130,col 9)-(line 130,col 44)",
        "(line 131,col 9)-(line 131,col 45)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 136,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 145,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 147,col 9)-(line 153,col 16)",
        "(line 154,col 9)-(line 161,col 16)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 175,col 9)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 187,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 194,
      "end_line": 249,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 63)",
        "(line 227,col 9)-(line 227,col 55)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 52)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)",
        "(line 243,col 9)-(line 243,col 56)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 246,col 95)",
        "(line 247,col 9)-(line 247,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 251,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 265,col 9)",
        "(line 267,col 9)-(line 272,col 9)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 304,col 9)",
        "(line 305,col 9)-(line 305,col 66)",
        "(line 306,col 9)-(line 307,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToEpsilon()",
      "begin_line": 310,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 74)",
        "(line 313,col 9)-(line 313,col 74)",
        "(line 314,col 9)-(line 314,col 74)",
        "(line 315,col 9)-(line 315,col 94)",
        "(line 316,col 9)-(line 316,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToMaxUlps()",
      "begin_line": 319,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 30)",
        "(line 322,col 9)-(line 322,col 39)",
        "(line 323,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 333,col 67)",
        "(line 335,col 9)-(line 335,col 81)",
        "(line 336,col 9)-(line 336,col 81)",
        "(line 337,col 9)-(line 337,col 81)",
        "(line 338,col 9)-(line 338,col 81)",
        "(line 340,col 9)-(line 340,col 81)",
        "(line 341,col 9)-(line 341,col 81)",
        "(line 342,col 9)-(line 342,col 81)",
        "(line 343,col 9)-(line 343,col 81)",
        "(line 345,col 9)-(line 345,col 93)",
        "(line 346,col 9)-(line 346,col 93)",
        "(line 347,col 9)-(line 347,col 93)",
        "(line 349,col 9)-(line 349,col 100)",
        "(line 350,col 9)-(line 350,col 100)",
        "(line 352,col 9)-(line 352,col 102)",
        "(line 353,col 9)-(line 353,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 357,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 23)",
        "(line 360,col 9)-(line 360,col 35)",
        "(line 361,col 9)-(line 361,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 364,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 369,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 376,col 17)",
        "(line 377,col 9)-(line 387,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 390,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 72)",
        "(line 396,col 9)-(line 396,col 72)",
        "(line 397,col 9)-(line 397,col 74)",
        "(line 398,col 9)-(line 398,col 101)",
        "(line 399,col 9)-(line 399,col 101)",
        "(line 400,col 9)-(line 400,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 403,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 47)",
        "(line 406,col 9)-(line 406,col 44)",
        "(line 408,col 9)-(line 408,col 42)",
        "(line 412,col 9)-(line 412,col 62)",
        "(line 414,col 9)-(line 414,col 44)",
        "(line 415,col 9)-(line 415,col 35)",
        "(line 418,col 9)-(line 418,col 56)",
        "(line 419,col 9)-(line 419,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 422,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 83)",
        "(line 425,col 9)-(line 425,col 83)",
        "(line 426,col 9)-(line 426,col 83)",
        "(line 427,col 9)-(line 427,col 85)",
        "(line 428,col 9)-(line 428,col 113)",
        "(line 429,col 9)-(line 429,col 113)",
        "(line 430,col 9)-(line 430,col 114)",
        "(line 431,col 9)-(line 431,col 84)",
        "(line 432,col 9)-(line 432,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 436,
      "end_line": 471,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 74)",
        "(line 439,col 9)-(line 439,col 85)",
        "(line 440,col 9)-(line 440,col 30)",
        "(line 441,col 9)-(line 441,col 135)",
        "(line 442,col 9)-(line 442,col 146)",
        "(line 443,col 9)-(line 443,col 147)",
        "(line 445,col 9)-(line 445,col 63)",
        "(line 458,col 9)-(line 458,col 97)",
        "(line 459,col 9)-(line 459,col 90)",
        "(line 461,col 9)-(line 461,col 97)",
        "(line 462,col 9)-(line 462,col 90)",
        "(line 464,col 9)-(line 464,col 70)",
        "(line 465,col 9)-(line 465,col 70)",
        "(line 466,col 9)-(line 466,col 62)",
        "(line 467,col 9)-(line 467,col 84)",
        "(line 468,col 9)-(line 468,col 84)",
        "(line 470,col 9)-(line 470,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 473,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 58)",
        "(line 477,col 9)-(line 477,col 74)",
        "(line 478,col 9)-(line 478,col 79)",
        "(line 480,col 9)-(line 480,col 77)",
        "(line 481,col 9)-(line 481,col 80)",
        "(line 482,col 9)-(line 482,col 58)",
        "(line 483,col 9)-(line 483,col 60)",
        "(line 484,col 9)-(line 484,col 60)",
        "(line 486,col 9)-(line 486,col 70)",
        "(line 487,col 9)-(line 487,col 71)",
        "(line 489,col 9)-(line 489,col 61)",
        "(line 491,col 9)-(line 491,col 74)",
        "(line 492,col 9)-(line 492,col 75)",
        "(line 493,col 9)-(line 493,col 74)",
        "(line 494,col 9)-(line 494,col 73)",
        "(line 496,col 9)-(line 496,col 76)",
        "(line 497,col 9)-(line 497,col 77)",
        "(line 498,col 9)-(line 498,col 76)",
        "(line 499,col 9)-(line 499,col 77)",
        "(line 501,col 9)-(line 501,col 99)",
        "(line 502,col 9)-(line 502,col 91)",
        "(line 504,col 9)-(line 504,col 99)",
        "(line 505,col 9)-(line 505,col 92)",
        "(line 507,col 9)-(line 507,col 72)",
        "(line 508,col 9)-(line 508,col 72)",
        "(line 509,col 9)-(line 509,col 63)",
        "(line 510,col 9)-(line 510,col 86)",
        "(line 511,col 9)-(line 511,col 86)",
        "(line 513,col 9)-(line 513,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 516,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 70)",
        "(line 520,col 9)-(line 520,col 86)",
        "(line 521,col 9)-(line 521,col 91)",
        "(line 523,col 9)-(line 523,col 77)",
        "(line 524,col 9)-(line 524,col 80)",
        "(line 525,col 9)-(line 525,col 70)",
        "(line 526,col 9)-(line 526,col 72)",
        "(line 527,col 9)-(line 527,col 72)",
        "(line 529,col 9)-(line 529,col 82)",
        "(line 530,col 9)-(line 530,col 83)",
        "(line 532,col 9)-(line 532,col 73)",
        "(line 534,col 9)-(line 534,col 86)",
        "(line 535,col 9)-(line 535,col 87)",
        "(line 536,col 9)-(line 536,col 86)",
        "(line 537,col 9)-(line 537,col 85)",
        "(line 539,col 9)-(line 539,col 88)",
        "(line 540,col 9)-(line 540,col 89)",
        "(line 541,col 9)-(line 541,col 88)",
        "(line 542,col 9)-(line 542,col 89)",
        "(line 544,col 9)-(line 544,col 111)",
        "(line 545,col 9)-(line 545,col 103)",
        "(line 547,col 9)-(line 547,col 111)",
        "(line 548,col 9)-(line 548,col 104)",
        "(line 550,col 9)-(line 550,col 83)",
        "(line 552,col 9)-(line 552,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 555,
      "end_line": 577,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 72)",
        "(line 558,col 9)-(line 558,col 72)",
        "(line 559,col 9)-(line 559,col 78)",
        "(line 561,col 9)-(line 561,col 81)",
        "(line 562,col 9)-(line 562,col 86)",
        "(line 563,col 9)-(line 569,col 40)",
        "(line 570,col 9)-(line 571,col 67)",
        "(line 572,col 9)-(line 573,col 81)",
        "(line 574,col 9)-(line 575,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 579,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 84)",
        "(line 582,col 9)-(line 582,col 84)",
        "(line 583,col 9)-(line 583,col 90)",
        "(line 585,col 9)-(line 585,col 93)",
        "(line 586,col 9)-(line 586,col 98)",
        "(line 587,col 9)-(line 593,col 20)",
        "(line 594,col 9)-(line 595,col 93)",
        "(line 596,col 9)-(line 597,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 600,
      "end_line": 611,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 606,col 9)",
        "(line 608,col 9)-(line 608,col 60)",
        "(line 609,col 9)-(line 609,col 76)",
        "(line 610,col 9)-(line 610,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 613,
      "end_line": 640,
      "comment": "",
      "child_ranges": [
        "(line 615,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 626,col 9)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 638,col 9)",
        "(line 639,col 9)-(line 639,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 642,
      "end_line": 691,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 19)",
        "(line 645,col 9)-(line 645,col 19)",
        "(line 646,col 9)-(line 646,col 19)",
        "(line 648,col 9)-(line 648,col 52)",
        "(line 650,col 9)-(line 650,col 52)",
        "(line 651,col 9)-(line 651,col 52)",
        "(line 652,col 9)-(line 652,col 53)",
        "(line 653,col 9)-(line 653,col 53)",
        "(line 655,col 9)-(line 655,col 53)",
        "(line 656,col 9)-(line 656,col 54)",
        "(line 657,col 9)-(line 657,col 54)",
        "(line 658,col 9)-(line 658,col 55)",
        "(line 660,col 9)-(line 660,col 52)",
        "(line 661,col 9)-(line 661,col 53)",
        "(line 662,col 9)-(line 662,col 53)",
        "(line 663,col 9)-(line 663,col 54)",
        "(line 665,col 9)-(line 665,col 82)",
        "(line 667,col 9)-(line 667,col 84)",
        "(line 668,col 9)-(line 668,col 85)",
        "(line 669,col 9)-(line 669,col 77)",
        "(line 670,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 693,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 20)",
        "(line 696,col 9)-(line 696,col 20)",
        "(line 697,col 9)-(line 697,col 20)",
        "(line 699,col 9)-(line 699,col 53)",
        "(line 701,col 9)-(line 701,col 52)",
        "(line 702,col 9)-(line 702,col 52)",
        "(line 703,col 9)-(line 703,col 53)",
        "(line 704,col 9)-(line 704,col 53)",
        "(line 706,col 9)-(line 706,col 53)",
        "(line 707,col 9)-(line 707,col 54)",
        "(line 708,col 9)-(line 708,col 54)",
        "(line 709,col 9)-(line 709,col 55)",
        "(line 711,col 9)-(line 711,col 52)",
        "(line 712,col 9)-(line 712,col 53)",
        "(line 713,col 9)-(line 713,col 53)",
        "(line 714,col 9)-(line 714,col 54)",
        "(line 716,col 9)-(line 716,col 88)",
        "(line 718,col 9)-(line 718,col 75)",
        "(line 720,col 9)-(line 720,col 79)",
        "(line 721,col 9)-(line 721,col 80)",
        "(line 722,col 9)-(line 722,col 72)",
        "(line 723,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 743,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 746,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 71)",
        "(line 749,col 9)-(line 749,col 61)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 753,col 9)-(line 753,col 57)",
        "(line 754,col 9)-(line 767,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 770,
      "end_line": 793,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 781,col 31)",
        "(line 782,col 9)-(line 792,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 795,
      "end_line": 810,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 64)",
        "(line 798,col 9)-(line 805,col 40)",
        "(line 806,col 9)-(line 807,col 81)",
        "(line 808,col 9)-(line 809,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 815,
      "end_line": 840,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 817,col 9)-(line 817,col 43)",
        "(line 818,col 9)-(line 818,col 43)",
        "(line 819,col 9)-(line 819,col 53)",
        "(line 822,col 9)-(line 824,col 9)",
        "(line 827,col 9)-(line 827,col 34)",
        "(line 828,col 9)-(line 836,col 29)",
        "(line 839,col 9)-(line 839,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 842,
      "end_line": 847,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 67)",
        "(line 845,col 9)-(line 845,col 67)",
        "(line 846,col 9)-(line 846,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 849,
      "end_line": 856,
      "comment": "",
      "child_ranges": [
        "(line 851,col 9)-(line 851,col 27)",
        "(line 852,col 9)-(line 852,col 66)",
        "(line 853,col 9)-(line 853,col 66)",
        "(line 854,col 9)-(line 854,col 68)",
        "(line 855,col 9)-(line 855,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 858,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 860,col 9)-(line 860,col 27)",
        "(line 861,col 9)-(line 861,col 68)",
        "(line 862,col 9)-(line 862,col 68)",
        "(line 863,col 9)-(line 863,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 866,
      "end_line": 871,
      "comment": "",
      "child_ranges": [
        "(line 868,col 9)-(line 868,col 57)",
        "(line 869,col 9)-(line 869,col 57)",
        "(line 870,col 9)-(line 870,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 873,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 875,col 9)-(line 875,col 57)",
        "(line 876,col 9)-(line 876,col 57)",
        "(line 877,col 9)-(line 877,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 880,
      "end_line": 885,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 69)",
        "(line 883,col 9)-(line 883,col 69)",
        "(line 884,col 9)-(line 884,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 887,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 19)",
        "(line 890,col 9)-(line 890,col 19)",
        "(line 891,col 9)-(line 891,col 19)",
        "(line 893,col 9)-(line 893,col 52)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 52)",
        "(line 896,col 9)-(line 896,col 52)",
        "(line 897,col 9)-(line 897,col 54)",
        "(line 898,col 9)-(line 898,col 55)",
        "(line 899,col 9)-(line 899,col 55)",
        "(line 900,col 9)-(line 900,col 56)",
        "(line 901,col 9)-(line 901,col 55)",
        "(line 905,col 9)-(line 905,col 77)",
        "(line 908,col 9)-(line 908,col 52)",
        "(line 910,col 9)-(line 916,col 9)",
        "(line 918,col 9)-(line 924,col 9)",
        "(line 926,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 934,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 936,col 9)-(line 936,col 20)",
        "(line 937,col 9)-(line 937,col 20)",
        "(line 938,col 9)-(line 938,col 20)",
        "(line 940,col 9)-(line 940,col 52)",
        "(line 941,col 9)-(line 941,col 52)",
        "(line 942,col 9)-(line 942,col 52)",
        "(line 943,col 9)-(line 943,col 52)",
        "(line 944,col 9)-(line 944,col 54)",
        "(line 945,col 9)-(line 945,col 55)",
        "(line 946,col 9)-(line 946,col 55)",
        "(line 947,col 9)-(line 947,col 56)",
        "(line 948,col 9)-(line 948,col 55)",
        "(line 950,col 9)-(line 950,col 85)",
        "(line 954,col 9)-(line 954,col 80)",
        "(line 957,col 9)-(line 957,col 55)",
        "(line 959,col 9)-(line 965,col 9)",
        "(line 967,col 9)-(line 973,col 9)",
        "(line 975,col 9)-(line 976,col 75)",
        "(line 977,col 9)-(line 982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 985,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 57)",
        "(line 988,col 9)-(line 988,col 57)",
        "(line 989,col 9)-(line 989,col 62)",
        "(line 990,col 9)-(line 990,col 62)",
        "(line 991,col 9)-(line 991,col 61)",
        "(line 992,col 9)-(line 992,col 56)",
        "(line 993,col 9)-(line 993,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 996,
      "end_line": 1011,
      "comment": "",
      "child_ranges": [
        "(line 998,col 9)-(line 998,col 36)",
        "(line 999,col 9)-(line 999,col 39)",
        "(line 1000,col 9)-(line 1000,col 64)",
        "(line 1001,col 9)-(line 1005,col 9)",
        "(line 1006,col 9)-(line 1010,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 1013,
      "end_line": 1033,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 34)",
        "(line 1016,col 9)-(line 1016,col 34)",
        "(line 1017,col 9)-(line 1017,col 65)",
        "(line 1018,col 9)-(line 1018,col 65)",
        "(line 1019,col 9)-(line 1019,col 64)",
        "(line 1020,col 9)-(line 1020,col 64)",
        "(line 1021,col 9)-(line 1021,col 65)",
        "(line 1022,col 9)-(line 1022,col 65)",
        "(line 1023,col 9)-(line 1023,col 64)",
        "(line 1024,col 9)-(line 1024,col 64)",
        "(line 1025,col 9)-(line 1025,col 65)",
        "(line 1026,col 9)-(line 1026,col 68)",
        "(line 1027,col 9)-(line 1027,col 44)",
        "(line 1028,col 9)-(line 1028,col 44)",
        "(line 1029,col 9)-(line 1029,col 44)",
        "(line 1030,col 9)-(line 1030,col 44)",
        "(line 1031,col 9)-(line 1031,col 45)",
        "(line 1032,col 9)-(line 1032,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 1035,
      "end_line": 1042,
      "comment": "",
      "child_ranges": [
        "(line 1036,col 9)-(line 1041,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 1044,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduce()",
      "begin_line": 1057,
      "end_line": 1108,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 38)",
        "(line 1060,col 9)-(line 1060,col 33)",
        "(line 1062,col 9)-(line 1062,col 33)",
        "(line 1064,col 9)-(line 1064,col 58)",
        "(line 1065,col 9)-(line 1065,col 32)",
        "(line 1066,col 9)-(line 1068,col 34)",
        "(line 1069,col 9)-(line 1071,col 34)",
        "(line 1073,col 9)-(line 1073,col 51)",
        "(line 1074,col 9)-(line 1074,col 44)",
        "(line 1075,col 9)-(line 1077,col 34)",
        "(line 1078,col 9)-(line 1080,col 34)",
        "(line 1082,col 9)-(line 1082,col 51)",
        "(line 1083,col 9)-(line 1083,col 25)",
        "(line 1084,col 9)-(line 1086,col 34)",
        "(line 1087,col 9)-(line 1089,col 34)",
        "(line 1091,col 9)-(line 1091,col 84)",
        "(line 1092,col 9)-(line 1092,col 86)",
        "(line 1093,col 9)-(line 1093,col 84)",
        "(line 1094,col 9)-(line 1095,col 44)",
        "(line 1096,col 9)-(line 1097,col 34)",
        "(line 1098,col 9)-(line 1099,col 52)",
        "(line 1100,col 9)-(line 1101,col 70)",
        "(line 1102,col 9)-(line 1103,col 52)",
        "(line 1104,col 9)-(line 1105,col 52)",
        "(line 1106,col 9)-(line 1107,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduceComparedWithNormalizeAngle()",
      "begin_line": 1110,
      "end_line": 1122,
      "comment": "",
      "child_ranges": [
        "(line 1112,col 9)-(line 1112,col 40)",
        "(line 1113,col 9)-(line 1113,col 42)",
        "(line 1114,col 9)-(line 1121,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1124,
      "end_line": 1171,
      "comment": "",
      "child_ranges": [
        "(line 1126,col 9)-(line 1126,col 54)",
        "(line 1127,col 9)-(line 1130,col 34)",
        "(line 1132,col 9)-(line 1132,col 56)",
        "(line 1133,col 9)-(line 1136,col 34)",
        "(line 1139,col 9)-(line 1139,col 80)",
        "(line 1140,col 9)-(line 1143,col 34)",
        "(line 1146,col 9)-(line 1146,col 48)",
        "(line 1147,col 9)-(line 1150,col 47)",
        "(line 1153,col 9)-(line 1153,col 75)",
        "(line 1154,col 9)-(line 1157,col 52)",
        "(line 1160,col 9)-(line 1163,col 52)",
        "(line 1166,col 9)-(line 1169,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1173,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1175,col 9)-(line 1175,col 31)",
        "(line 1176,col 9)-(line 1176,col 62)",
        "(line 1177,col 9)-(line 1177,col 63)",
        "(line 1178,col 9)-(line 1178,col 64)",
        "(line 1181,col 9)-(line 1181,col 68)",
        "(line 1182,col 9)-(line 1182,col 91)",
        "(line 1183,col 9)-(line 1183,col 25)",
        "(line 1184,col 9)-(line 1184,col 31)",
        "(line 1185,col 9)-(line 1185,col 64)",
        "(line 1188,col 9)-(line 1188,col 70)",
        "(line 1189,col 9)-(line 1189,col 70)",
        "(line 1190,col 9)-(line 1190,col 70)",
        "(line 1191,col 9)-(line 1191,col 70)",
        "(line 1192,col 9)-(line 1192,col 71)",
        "(line 1193,col 9)-(line 1193,col 71)",
        "(line 1194,col 9)-(line 1194,col 71)",
        "(line 1195,col 9)-(line 1195,col 71)",
        "(line 1196,col 9)-(line 1196,col 71)",
        "(line 1198,col 9)-(line 1198,col 88)",
        "(line 1199,col 9)-(line 1199,col 89)",
        "(line 1200,col 9)-(line 1200,col 90)",
        "(line 1201,col 9)-(line 1201,col 90)",
        "(line 1202,col 9)-(line 1202,col 91)",
        "(line 1203,col 9)-(line 1203,col 92)",
        "(line 1205,col 9)-(line 1205,col 85)",
        "(line 1206,col 9)-(line 1206,col 86)",
        "(line 1207,col 9)-(line 1207,col 87)",
        "(line 1208,col 9)-(line 1208,col 87)",
        "(line 1209,col 9)-(line 1209,col 88)",
        "(line 1210,col 9)-(line 1210,col 89)",
        "(line 1212,col 9)-(line 1212,col 86)",
        "(line 1213,col 9)-(line 1213,col 87)",
        "(line 1214,col 9)-(line 1214,col 88)",
        "(line 1215,col 9)-(line 1215,col 88)",
        "(line 1216,col 9)-(line 1216,col 89)",
        "(line 1217,col 9)-(line 1217,col 90)",
        "(line 1219,col 9)-(line 1219,col 90)",
        "(line 1220,col 9)-(line 1220,col 91)",
        "(line 1221,col 9)-(line 1221,col 92)",
        "(line 1222,col 9)-(line 1222,col 92)",
        "(line 1223,col 9)-(line 1223,col 93)",
        "(line 1224,col 9)-(line 1224,col 94)",
        "(line 1225,col 9)-(line 1225,col 96)",
        "(line 1226,col 9)-(line 1226,col 98)",
        "(line 1228,col 9)-(line 1228,col 90)",
        "(line 1229,col 9)-(line 1229,col 91)",
        "(line 1230,col 9)-(line 1230,col 92)",
        "(line 1231,col 9)-(line 1231,col 92)",
        "(line 1232,col 9)-(line 1232,col 93)",
        "(line 1233,col 9)-(line 1233,col 94)",
        "(line 1234,col 9)-(line 1234,col 96)",
        "(line 1235,col 9)-(line 1235,col 98)",
        "(line 1236,col 9)-(line 1236,col 96)",
        "(line 1237,col 9)-(line 1237,col 98)",
        "(line 1239,col 9)-(line 1239,col 88)",
        "(line 1240,col 9)-(line 1240,col 89)",
        "(line 1241,col 9)-(line 1241,col 90)",
        "(line 1242,col 9)-(line 1242,col 90)",
        "(line 1243,col 9)-(line 1243,col 91)",
        "(line 1244,col 9)-(line 1244,col 92)",
        "(line 1245,col 9)-(line 1245,col 94)",
        "(line 1246,col 9)-(line 1246,col 96)",
        "(line 1248,col 9)-(line 1248,col 97)",
        "(line 1249,col 9)-(line 1249,col 95)",
        "(line 1251,col 9)-(line 1256,col 9)",
        "(line 1258,col 9)-(line 1258,col 83)",
        "(line 1259,col 9)-(line 1259,col 84)",
        "(line 1260,col 9)-(line 1260,col 85)",
        "(line 1261,col 9)-(line 1261,col 85)",
        "(line 1262,col 9)-(line 1262,col 86)",
        "(line 1263,col 9)-(line 1263,col 87)",
        "(line 1265,col 9)-(line 1270,col 9)",
        "(line 1273,col 9)-(line 1273,col 94)",
        "(line 1276,col 9)-(line 1276,col 80)",
        "(line 1277,col 9)-(line 1277,col 63)",
        "(line 1278,col 9)-(line 1278,col 105)",
        "(line 1279,col 9)-(line 1279,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1282,
      "end_line": 1377,
      "comment": "",
      "child_ranges": [
        "(line 1284,col 9)-(line 1284,col 31)",
        "(line 1285,col 9)-(line 1285,col 63)",
        "(line 1286,col 9)-(line 1286,col 64)",
        "(line 1287,col 9)-(line 1287,col 65)",
        "(line 1290,col 9)-(line 1290,col 70)",
        "(line 1291,col 9)-(line 1291,col 70)",
        "(line 1292,col 9)-(line 1292,col 71)",
        "(line 1293,col 9)-(line 1293,col 71)",
        "(line 1294,col 9)-(line 1294,col 71)",
        "(line 1295,col 9)-(line 1295,col 71)",
        "(line 1296,col 9)-(line 1296,col 71)",
        "(line 1298,col 9)-(line 1298,col 89)",
        "(line 1299,col 9)-(line 1299,col 90)",
        "(line 1300,col 9)-(line 1300,col 91)",
        "(line 1301,col 9)-(line 1301,col 91)",
        "(line 1302,col 9)-(line 1302,col 92)",
        "(line 1303,col 9)-(line 1303,col 93)",
        "(line 1305,col 9)-(line 1305,col 86)",
        "(line 1306,col 9)-(line 1306,col 87)",
        "(line 1307,col 9)-(line 1307,col 88)",
        "(line 1308,col 9)-(line 1308,col 88)",
        "(line 1309,col 9)-(line 1309,col 89)",
        "(line 1310,col 9)-(line 1310,col 90)",
        "(line 1312,col 9)-(line 1312,col 87)",
        "(line 1313,col 9)-(line 1313,col 88)",
        "(line 1314,col 9)-(line 1314,col 89)",
        "(line 1315,col 9)-(line 1315,col 89)",
        "(line 1316,col 9)-(line 1316,col 90)",
        "(line 1317,col 9)-(line 1317,col 91)",
        "(line 1319,col 9)-(line 1319,col 91)",
        "(line 1320,col 9)-(line 1320,col 92)",
        "(line 1321,col 9)-(line 1321,col 93)",
        "(line 1322,col 9)-(line 1322,col 93)",
        "(line 1323,col 9)-(line 1323,col 94)",
        "(line 1324,col 9)-(line 1324,col 95)",
        "(line 1325,col 9)-(line 1325,col 98)",
        "(line 1326,col 9)-(line 1326,col 100)",
        "(line 1328,col 9)-(line 1328,col 91)",
        "(line 1329,col 9)-(line 1329,col 92)",
        "(line 1330,col 9)-(line 1330,col 93)",
        "(line 1331,col 9)-(line 1331,col 93)",
        "(line 1332,col 9)-(line 1332,col 94)",
        "(line 1333,col 9)-(line 1333,col 95)",
        "(line 1334,col 9)-(line 1334,col 98)",
        "(line 1335,col 9)-(line 1335,col 100)",
        "(line 1336,col 9)-(line 1336,col 98)",
        "(line 1337,col 9)-(line 1337,col 100)",
        "(line 1339,col 9)-(line 1339,col 89)",
        "(line 1340,col 9)-(line 1340,col 90)",
        "(line 1341,col 9)-(line 1341,col 91)",
        "(line 1342,col 9)-(line 1342,col 91)",
        "(line 1343,col 9)-(line 1343,col 92)",
        "(line 1344,col 9)-(line 1344,col 93)",
        "(line 1345,col 9)-(line 1345,col 96)",
        "(line 1346,col 9)-(line 1346,col 98)",
        "(line 1348,col 9)-(line 1348,col 99)",
        "(line 1349,col 9)-(line 1349,col 97)",
        "(line 1351,col 9)-(line 1356,col 9)",
        "(line 1358,col 9)-(line 1358,col 84)",
        "(line 1359,col 9)-(line 1359,col 85)",
        "(line 1360,col 9)-(line 1360,col 86)",
        "(line 1361,col 9)-(line 1361,col 86)",
        "(line 1362,col 9)-(line 1362,col 87)",
        "(line 1363,col 9)-(line 1363,col 88)",
        "(line 1365,col 9)-(line 1370,col 9)",
        "(line 1373,col 9)-(line 1373,col 79)",
        "(line 1374,col 9)-(line 1374,col 66)",
        "(line 1375,col 9)-(line 1375,col 104)",
        "(line 1376,col 9)-(line 1376,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1379,
      "end_line": 1384,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 64)",
        "(line 1382,col 9)-(line 1382,col 64)",
        "(line 1383,col 9)-(line 1383,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1386,
      "end_line": 1393,
      "comment": "",
      "child_ranges": [
        "(line 1388,col 9)-(line 1388,col 27)",
        "(line 1389,col 9)-(line 1389,col 61)",
        "(line 1390,col 9)-(line 1390,col 61)",
        "(line 1391,col 9)-(line 1391,col 63)",
        "(line 1392,col 9)-(line 1392,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1395,
      "end_line": 1402,
      "comment": "",
      "child_ranges": [
        "(line 1397,col 9)-(line 1397,col 27)",
        "(line 1398,col 9)-(line 1398,col 63)",
        "(line 1399,col 9)-(line 1399,col 63)",
        "(line 1400,col 9)-(line 1400,col 65)",
        "(line 1401,col 9)-(line 1401,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1404,
      "end_line": 1409,
      "comment": "",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 50)",
        "(line 1407,col 9)-(line 1407,col 50)",
        "(line 1408,col 9)-(line 1408,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1411,
      "end_line": 1416,
      "comment": "",
      "child_ranges": [
        "(line 1413,col 9)-(line 1413,col 52)",
        "(line 1414,col 9)-(line 1414,col 52)",
        "(line 1415,col 9)-(line 1415,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1418,
      "end_line": 1423,
      "comment": "",
      "child_ranges": [
        "(line 1420,col 9)-(line 1420,col 66)",
        "(line 1421,col 9)-(line 1421,col 66)",
        "(line 1422,col 9)-(line 1422,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1425,
      "end_line": 1430,
      "comment": "",
      "child_ranges": [
        "(line 1427,col 9)-(line 1427,col 23)",
        "(line 1428,col 9)-(line 1428,col 35)",
        "(line 1429,col 9)-(line 1429,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1432,
      "end_line": 1435,
      "comment": "",
      "child_ranges": [
        "(line 1434,col 9)-(line 1434,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1437,
      "end_line": 1454,
      "comment": "",
      "child_ranges": [
        "(line 1439,col 9)-(line 1439,col 36)",
        "(line 1440,col 9)-(line 1440,col 39)",
        "(line 1441,col 9)-(line 1441,col 64)",
        "(line 1442,col 9)-(line 1442,col 75)",
        "(line 1443,col 9)-(line 1443,col 69)",
        "(line 1444,col 9)-(line 1448,col 9)",
        "(line 1449,col 9)-(line 1453,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1456,
      "end_line": 1465,
      "comment": "",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 36)",
        "(line 1459,col 9)-(line 1464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1467,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1469,col 9)-(line 1469,col 34)",
        "(line 1470,col 9)-(line 1470,col 34)",
        "(line 1471,col 9)-(line 1471,col 64)",
        "(line 1472,col 9)-(line 1472,col 64)",
        "(line 1473,col 9)-(line 1473,col 65)",
        "(line 1474,col 9)-(line 1474,col 69)",
        "(line 1476,col 9)-(line 1476,col 71)",
        "(line 1477,col 9)-(line 1477,col 70)",
        "(line 1478,col 9)-(line 1478,col 44)",
        "(line 1479,col 9)-(line 1479,col 45)",
        "(line 1480,col 9)-(line 1480,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1483,
      "end_line": 1491,
      "comment": "",
      "child_ranges": [
        "(line 1484,col 9)-(line 1489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1493,
      "end_line": 1568,
      "comment": "",
      "child_ranges": [
        "(line 1496,col 9)-(line 1496,col 62)",
        "(line 1497,col 9)-(line 1497,col 53)",
        "(line 1498,col 9)-(line 1503,col 9)",
        "(line 1505,col 9)-(line 1505,col 63)",
        "(line 1506,col 9)-(line 1506,col 54)",
        "(line 1507,col 9)-(line 1512,col 9)",
        "(line 1514,col 9)-(line 1514,col 64)",
        "(line 1515,col 9)-(line 1515,col 55)",
        "(line 1516,col 9)-(line 1521,col 9)",
        "(line 1523,col 9)-(line 1523,col 65)",
        "(line 1524,col 9)-(line 1524,col 56)",
        "(line 1525,col 9)-(line 1530,col 9)",
        "(line 1532,col 9)-(line 1532,col 55)",
        "(line 1533,col 9)-(line 1533,col 90)",
        "(line 1534,col 9)-(line 1534,col 73)",
        "(line 1535,col 9)-(line 1540,col 9)",
        "(line 1542,col 9)-(line 1542,col 91)",
        "(line 1543,col 9)-(line 1543,col 74)",
        "(line 1544,col 9)-(line 1549,col 9)",
        "(line 1551,col 9)-(line 1551,col 111)",
        "(line 1552,col 9)-(line 1552,col 87)",
        "(line 1553,col 9)-(line 1558,col 9)",
        "(line 1560,col 9)-(line 1563,col 76)",
        "(line 1564,col 9)-(line 1564,col 67)",
        "(line 1565,col 9)-(line 1565,col 68)",
        "(line 1566,col 9)-(line 1566,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1570,
      "end_line": 1575,
      "comment": "",
      "child_ranges": [
        "(line 1572,col 9)-(line 1572,col 36)",
        "(line 1573,col 9)-(line 1573,col 36)",
        "(line 1574,col 9)-(line 1574,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1577,
      "end_line": 1582,
      "comment": "",
      "child_ranges": [
        "(line 1579,col 9)-(line 1579,col 28)",
        "(line 1580,col 9)-(line 1580,col 28)",
        "(line 1581,col 9)-(line 1581,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1584,
      "end_line": 1589,
      "comment": "",
      "child_ranges": [
        "(line 1586,col 9)-(line 1586,col 36)",
        "(line 1587,col 9)-(line 1587,col 36)",
        "(line 1588,col 9)-(line 1588,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1591,
      "end_line": 1596,
      "comment": "",
      "child_ranges": [
        "(line 1593,col 9)-(line 1593,col 28)",
        "(line 1594,col 9)-(line 1594,col 28)",
        "(line 1595,col 9)-(line 1595,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1598,
      "end_line": 1603,
      "comment": "",
      "child_ranges": [
        "(line 1600,col 9)-(line 1600,col 36)",
        "(line 1601,col 9)-(line 1601,col 36)",
        "(line 1602,col 9)-(line 1602,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1605,
      "end_line": 1610,
      "comment": "",
      "child_ranges": [
        "(line 1607,col 9)-(line 1607,col 28)",
        "(line 1608,col 9)-(line 1608,col 28)",
        "(line 1609,col 9)-(line 1609,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1612,
      "end_line": 1651,
      "comment": "",
      "child_ranges": [
        "(line 1614,col 9)-(line 1615,col 72)",
        "(line 1616,col 9)-(line 1617,col 73)",
        "(line 1618,col 9)-(line 1619,col 72)",
        "(line 1620,col 9)-(line 1621,col 73)",
        "(line 1623,col 9)-(line 1629,col 9)",
        "(line 1630,col 9)-(line 1636,col 9)",
        "(line 1637,col 9)-(line 1643,col 9)",
        "(line 1644,col 9)-(line 1650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1653,
      "end_line": 1692,
      "comment": "",
      "child_ranges": [
        "(line 1655,col 9)-(line 1660,col 9)",
        "(line 1661,col 9)-(line 1666,col 9)",
        "(line 1667,col 9)-(line 1672,col 9)",
        "(line 1674,col 9)-(line 1679,col 9)",
        "(line 1680,col 9)-(line 1685,col 9)",
        "(line 1686,col 9)-(line 1691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1694,
      "end_line": 1721,
      "comment": "",
      "child_ranges": [
        "(line 1696,col 9)-(line 1696,col 49)",
        "(line 1697,col 9)-(line 1697,col 49)",
        "(line 1698,col 9)-(line 1698,col 49)",
        "(line 1700,col 9)-(line 1700,col 42)",
        "(line 1702,col 9)-(line 1702,col 54)",
        "(line 1703,col 9)-(line 1703,col 54)",
        "(line 1704,col 9)-(line 1704,col 54)",
        "(line 1706,col 9)-(line 1706,col 52)",
        "(line 1707,col 9)-(line 1707,col 52)",
        "(line 1708,col 9)-(line 1708,col 52)",
        "(line 1710,col 9)-(line 1710,col 52)",
        "(line 1711,col 9)-(line 1711,col 52)",
        "(line 1712,col 9)-(line 1712,col 52)",
        "(line 1714,col 9)-(line 1714,col 53)",
        "(line 1715,col 9)-(line 1715,col 53)",
        "(line 1716,col 9)-(line 1716,col 53)",
        "(line 1718,col 9)-(line 1718,col 54)",
        "(line 1719,col 9)-(line 1719,col 54)",
        "(line 1720,col 9)-(line 1720,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt()",
      "begin_line": 1723,
      "end_line": 1734,
      "comment": "",
      "child_ranges": [
        "(line 1725,col 9)-(line 1727,col 51)",
        "(line 1728,col 9)-(line 1728,col 52)",
        "(line 1730,col 9)-(line 1730,col 56)",
        "(line 1731,col 9)-(line 1733,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt2()",
      "begin_line": 1736,
      "end_line": 1748,
      "comment": "",
      "child_ranges": [
        "(line 1738,col 9)-(line 1740,col 51)",
        "(line 1741,col 9)-(line 1741,col 29)",
        "(line 1742,col 9)-(line 1742,col 76)",
        "(line 1744,col 9)-(line 1744,col 65)",
        "(line 1745,col 9)-(line 1747,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt3()",
      "begin_line": 1750,
      "end_line": 1765,
      "comment": "",
      "child_ranges": [
        "(line 1752,col 9)-(line 1754,col 51)",
        "(line 1755,col 9)-(line 1755,col 29)",
        "(line 1756,col 9)-(line 1756,col 76)",
        "(line 1758,col 9)-(line 1758,col 65)",
        "(line 1759,col 9)-(line 1761,col 9)",
        "(line 1762,col 9)-(line 1764,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble()",
      "begin_line": 1767,
      "end_line": 1783,
      "comment": "",
      "child_ranges": [
        "(line 1769,col 9)-(line 1776,col 61)",
        "(line 1777,col 9)-(line 1777,col 55)",
        "(line 1779,col 9)-(line 1779,col 56)",
        "(line 1780,col 9)-(line 1782,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble2()",
      "begin_line": 1785,
      "end_line": 1802,
      "comment": "",
      "child_ranges": [
        "(line 1787,col 9)-(line 1794,col 61)",
        "(line 1795,col 9)-(line 1795,col 29)",
        "(line 1796,col 9)-(line 1796,col 79)",
        "(line 1798,col 9)-(line 1798,col 65)",
        "(line 1799,col 9)-(line 1801,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble3()",
      "begin_line": 1804,
      "end_line": 1824,
      "comment": "",
      "child_ranges": [
        "(line 1806,col 9)-(line 1813,col 61)",
        "(line 1814,col 9)-(line 1814,col 29)",
        "(line 1815,col 9)-(line 1815,col 79)",
        "(line 1817,col 9)-(line 1817,col 65)",
        "(line 1818,col 9)-(line 1820,col 9)",
        "(line 1821,col 9)-(line 1823,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull1()",
      "begin_line": 1826,
      "end_line": 1834,
      "comment": "",
      "child_ranges": [
        "(line 1828,col 9)-(line 1833,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull2()",
      "begin_line": 1836,
      "end_line": 1844,
      "comment": "",
      "child_ranges": [
        "(line 1838,col 9)-(line 1843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLinearCombination1()",
      "begin_line": 1846,
      "end_line": 1865,
      "comment": "",
      "child_ranges": [
        "(line 1848,col 9)-(line 1852,col 10)",
        "(line 1853,col 9)-(line 1857,col 10)",
        "(line 1859,col 9)-(line 1861,col 75)",
        "(line 1862,col 9)-(line 1862,col 68)",
        "(line 1864,col 9)-(line 1864,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLinearCombination2()",
      "begin_line": 1867,
      "end_line": 1887,
      "comment": "",
      "child_ranges": [
        "(line 1871,col 9)-(line 1871,col 62)",
        "(line 1873,col 9)-(line 1886,col 9)"
      ]
    }
  ]
}
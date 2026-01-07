{
  "filepath": "/tmp/Math-91b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1080,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.suite()",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 61)",
        "(line 42,col 9)-(line 42,col 41)",
        "(line 43,col 9)-(line 43,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 52,
      "end_line": 84,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 67)",
        "(line 83,col 9)-(line 83,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 89,
      "end_line": 95,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 24)",
        "(line 91,col 9)-(line 93,col 9)",
        "(line 94,col 9)-(line 94,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 98,
      "end_line": 102,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 71)",
        "(line 100,col 9)-(line 100,col 68)",
        "(line 101,col 9)-(line 101,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 104,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 57)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 120,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 58)",
        "(line 130,col 9)-(line 130,col 63)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 45)",
        "(line 133,col 9)-(line 133,col 44)",
        "(line 134,col 9)-(line 134,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 137,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 143,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 146,
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
      "end_line": 248,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 63)",
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 227,col 45)",
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 45)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 22)",
        "(line 242,col 9)-(line 242,col 56)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 45)",
        "(line 245,col 9)-(line 245,col 88)",
        "(line 246,col 9)-(line 246,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 250,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 291,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 66)",
        "(line 304,col 9)-(line 305,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 7)-(line 309,col 65)",
        "(line 310,col 7)-(line 310,col 65)",
        "(line 311,col 7)-(line 311,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 314,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 23)",
        "(line 316,col 9)-(line 316,col 35)",
        "(line 317,col 9)-(line 317,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 320,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 324,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 330,col 17)",
        "(line 331,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 344,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 64)",
        "(line 346,col 9)-(line 346,col 64)",
        "(line 347,col 9)-(line 347,col 64)",
        "(line 348,col 9)-(line 348,col 66)",
        "(line 349,col 9)-(line 349,col 94)",
        "(line 350,col 9)-(line 350,col 94)",
        "(line 351,col 9)-(line 351,col 95)",
        "(line 352,col 9)-(line 352,col 65)",
        "(line 353,col 9)-(line 353,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 356,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 65)",
        "(line 358,col 9)-(line 358,col 65)",
        "(line 359,col 9)-(line 359,col 71)",
        "(line 361,col 9)-(line 361,col 74)",
        "(line 362,col 9)-(line 362,col 79)",
        "(line 363,col 9)-(line 369,col 40)",
        "(line 370,col 9)-(line 371,col 81)",
        "(line 372,col 9)-(line 373,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 377,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 53)",
        "(line 385,col 9)-(line 385,col 69)",
        "(line 386,col 9)-(line 386,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 389,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 395,col 9)",
        "(line 396,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 407,col 9)",
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 414,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 417,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 19)",
        "(line 419,col 9)-(line 419,col 19)",
        "(line 420,col 9)-(line 420,col 19)",
        "(line 422,col 9)-(line 422,col 45)",
        "(line 424,col 9)-(line 424,col 45)",
        "(line 425,col 9)-(line 425,col 45)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 46)",
        "(line 429,col 9)-(line 429,col 46)",
        "(line 430,col 9)-(line 430,col 47)",
        "(line 431,col 9)-(line 431,col 47)",
        "(line 432,col 9)-(line 432,col 48)",
        "(line 434,col 9)-(line 434,col 45)",
        "(line 435,col 9)-(line 435,col 46)",
        "(line 436,col 9)-(line 436,col 46)",
        "(line 437,col 9)-(line 437,col 47)",
        "(line 439,col 9)-(line 439,col 75)",
        "(line 441,col 9)-(line 441,col 77)",
        "(line 442,col 9)-(line 442,col 78)",
        "(line 443,col 9)-(line 443,col 70)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 451,col 9)-(line 457,col 9)",
        "(line 458,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 467,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 477,col 31)",
        "(line 478,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 491,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 57)",
        "(line 493,col 9)-(line 500,col 40)",
        "(line 501,col 9)-(line 502,col 82)",
        "(line 503,col 9)-(line 504,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 510,
      "end_line": 534,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 43)",
        "(line 512,col 9)-(line 512,col 43)",
        "(line 513,col 9)-(line 513,col 53)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 521,col 9)-(line 521,col 34)",
        "(line 522,col 9)-(line 530,col 29)",
        "(line 533,col 9)-(line 533,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 536,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 60)",
        "(line 538,col 9)-(line 538,col 60)",
        "(line 539,col 9)-(line 539,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 542,
      "end_line": 548,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 27)",
        "(line 544,col 9)-(line 544,col 59)",
        "(line 545,col 9)-(line 545,col 59)",
        "(line 546,col 9)-(line 546,col 61)",
        "(line 547,col 9)-(line 547,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 550,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 27)",
        "(line 552,col 9)-(line 552,col 61)",
        "(line 553,col 9)-(line 553,col 61)",
        "(line 554,col 9)-(line 554,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 557,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 60)",
        "(line 559,col 9)-(line 559,col 60)",
        "(line 560,col 9)-(line 560,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 563,
      "end_line": 567,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 50)",
        "(line 565,col 9)-(line 565,col 50)",
        "(line 566,col 9)-(line 566,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 569,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 62)",
        "(line 571,col 9)-(line 571,col 62)",
        "(line 572,col 9)-(line 572,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 575,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 19)",
        "(line 577,col 9)-(line 577,col 19)",
        "(line 578,col 9)-(line 578,col 19)",
        "(line 580,col 9)-(line 580,col 45)",
        "(line 581,col 9)-(line 581,col 45)",
        "(line 582,col 9)-(line 582,col 45)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 47)",
        "(line 585,col 9)-(line 585,col 48)",
        "(line 586,col 9)-(line 586,col 48)",
        "(line 587,col 9)-(line 587,col 49)",
        "(line 588,col 9)-(line 588,col 48)",
        "(line 592,col 9)-(line 592,col 70)",
        "(line 595,col 9)-(line 595,col 45)",
        "(line 597,col 9)-(line 603,col 9)",
        "(line 605,col 9)-(line 611,col 9)",
        "(line 613,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 621,
      "end_line": 629,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 50)",
        "(line 623,col 9)-(line 623,col 50)",
        "(line 624,col 9)-(line 624,col 55)",
        "(line 625,col 9)-(line 625,col 55)",
        "(line 626,col 9)-(line 626,col 54)",
        "(line 627,col 9)-(line 627,col 49)",
        "(line 628,col 9)-(line 628,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 631,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 36)",
        "(line 633,col 9)-(line 633,col 39)",
        "(line 634,col 9)-(line 634,col 57)",
        "(line 635,col 9)-(line 639,col 9)",
        "(line 640,col 9)-(line 644,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 647,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 34)",
        "(line 649,col 9)-(line 649,col 34)",
        "(line 650,col 9)-(line 650,col 58)",
        "(line 651,col 9)-(line 651,col 58)",
        "(line 652,col 9)-(line 652,col 57)",
        "(line 653,col 9)-(line 653,col 57)",
        "(line 654,col 9)-(line 654,col 58)",
        "(line 655,col 9)-(line 655,col 58)",
        "(line 656,col 9)-(line 656,col 57)",
        "(line 657,col 9)-(line 657,col 57)",
        "(line 658,col 9)-(line 658,col 58)",
        "(line 659,col 9)-(line 659,col 61)",
        "(line 660,col 9)-(line 660,col 44)",
        "(line 661,col 9)-(line 661,col 44)",
        "(line 662,col 9)-(line 662,col 44)",
        "(line 663,col 9)-(line 663,col 44)",
        "(line 664,col 9)-(line 664,col 45)",
        "(line 665,col 9)-(line 665,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 668,
      "end_line": 675,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 674,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 677,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 92)",
        "(line 682,col 9)-(line 682,col 108)",
        "(line 685,col 9)-(line 685,col 106)",
        "(line 688,col 9)-(line 688,col 108)",
        "(line 691,col 9)-(line 691,col 90)",
        "(line 694,col 9)-(line 694,col 92)",
        "(line 697,col 9)-(line 697,col 90)",
        "(line 700,col 9)-(line 700,col 92)",
        "(line 703,col 9)-(line 703,col 114)",
        "(line 706,col 9)-(line 706,col 115)",
        "(line 709,col 9)-(line 709,col 116)",
        "(line 712,col 9)-(line 712,col 116)",
        "(line 715,col 9)-(line 715,col 117)",
        "(line 718,col 9)-(line 718,col 117)",
        "(line 721,col 9)-(line 721,col 117)",
        "(line 724,col 9)-(line 724,col 118)",
        "(line 727,col 9)-(line 727,col 118)",
        "(line 730,col 9)-(line 730,col 117)",
        "(line 733,col 9)-(line 733,col 118)",
        "(line 736,col 9)-(line 736,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 740,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 88)",
        "(line 742,col 9)-(line 742,col 88)",
        "(line 743,col 9)-(line 743,col 69)",
        "(line 744,col 9)-(line 744,col 103)",
        "(line 745,col 9)-(line 745,col 104)",
        "(line 746,col 9)-(line 746,col 69)",
        "(line 747,col 9)-(line 747,col 71)",
        "(line 748,col 9)-(line 748,col 70)",
        "(line 749,col 9)-(line 749,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 752,
      "end_line": 760,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 61)",
        "(line 754,col 9)-(line 754,col 61)",
        "(line 755,col 9)-(line 755,col 69)",
        "(line 756,col 9)-(line 756,col 68)",
        "(line 757,col 9)-(line 757,col 84)",
        "(line 758,col 9)-(line 758,col 84)",
        "(line 759,col 9)-(line 759,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 762,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 763,col 9)-(line 771,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 774,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 31)",
        "(line 776,col 9)-(line 776,col 55)",
        "(line 777,col 9)-(line 777,col 56)",
        "(line 778,col 9)-(line 778,col 57)",
        "(line 781,col 9)-(line 781,col 61)",
        "(line 782,col 9)-(line 782,col 84)",
        "(line 783,col 9)-(line 783,col 25)",
        "(line 784,col 9)-(line 784,col 31)",
        "(line 785,col 9)-(line 785,col 57)",
        "(line 788,col 9)-(line 788,col 63)",
        "(line 789,col 9)-(line 789,col 63)",
        "(line 790,col 9)-(line 790,col 63)",
        "(line 791,col 9)-(line 791,col 63)",
        "(line 792,col 9)-(line 792,col 64)",
        "(line 793,col 9)-(line 793,col 64)",
        "(line 794,col 9)-(line 794,col 64)",
        "(line 795,col 9)-(line 795,col 64)",
        "(line 796,col 9)-(line 796,col 64)",
        "(line 798,col 9)-(line 798,col 81)",
        "(line 799,col 9)-(line 799,col 82)",
        "(line 800,col 9)-(line 800,col 83)",
        "(line 801,col 9)-(line 801,col 83)",
        "(line 802,col 9)-(line 802,col 84)",
        "(line 803,col 9)-(line 803,col 85)",
        "(line 805,col 9)-(line 805,col 78)",
        "(line 806,col 9)-(line 806,col 79)",
        "(line 807,col 9)-(line 807,col 80)",
        "(line 808,col 9)-(line 808,col 80)",
        "(line 809,col 9)-(line 809,col 81)",
        "(line 810,col 9)-(line 810,col 82)",
        "(line 812,col 9)-(line 812,col 79)",
        "(line 813,col 9)-(line 813,col 80)",
        "(line 814,col 9)-(line 814,col 81)",
        "(line 815,col 9)-(line 815,col 81)",
        "(line 816,col 9)-(line 816,col 82)",
        "(line 817,col 9)-(line 817,col 83)",
        "(line 819,col 9)-(line 819,col 83)",
        "(line 820,col 9)-(line 820,col 84)",
        "(line 821,col 9)-(line 821,col 85)",
        "(line 822,col 9)-(line 822,col 85)",
        "(line 823,col 9)-(line 823,col 86)",
        "(line 824,col 9)-(line 824,col 87)",
        "(line 825,col 9)-(line 825,col 89)",
        "(line 826,col 9)-(line 826,col 91)",
        "(line 828,col 9)-(line 828,col 83)",
        "(line 829,col 9)-(line 829,col 84)",
        "(line 830,col 9)-(line 830,col 85)",
        "(line 831,col 9)-(line 831,col 85)",
        "(line 832,col 9)-(line 832,col 86)",
        "(line 833,col 9)-(line 833,col 87)",
        "(line 834,col 9)-(line 834,col 89)",
        "(line 835,col 9)-(line 835,col 91)",
        "(line 836,col 9)-(line 836,col 89)",
        "(line 837,col 9)-(line 837,col 91)",
        "(line 839,col 9)-(line 839,col 81)",
        "(line 840,col 9)-(line 840,col 82)",
        "(line 841,col 9)-(line 841,col 83)",
        "(line 842,col 9)-(line 842,col 83)",
        "(line 843,col 9)-(line 843,col 84)",
        "(line 844,col 9)-(line 844,col 85)",
        "(line 845,col 9)-(line 845,col 87)",
        "(line 846,col 9)-(line 846,col 89)",
        "(line 848,col 9)-(line 848,col 90)",
        "(line 849,col 9)-(line 849,col 88)",
        "(line 851,col 9)-(line 856,col 9)",
        "(line 858,col 9)-(line 858,col 76)",
        "(line 859,col 9)-(line 859,col 77)",
        "(line 860,col 9)-(line 860,col 78)",
        "(line 861,col 9)-(line 861,col 78)",
        "(line 862,col 9)-(line 862,col 79)",
        "(line 863,col 9)-(line 863,col 80)",
        "(line 865,col 9)-(line 870,col 9)",
        "(line 873,col 9)-(line 873,col 87)",
        "(line 876,col 9)-(line 876,col 80)",
        "(line 877,col 9)-(line 877,col 56)",
        "(line 878,col 9)-(line 878,col 98)",
        "(line 879,col 9)-(line 879,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 882,
      "end_line": 976,
      "comment": "",
      "child_ranges": [
        "(line 883,col 9)-(line 883,col 31)",
        "(line 884,col 9)-(line 884,col 56)",
        "(line 885,col 9)-(line 885,col 57)",
        "(line 886,col 9)-(line 886,col 58)",
        "(line 889,col 9)-(line 889,col 63)",
        "(line 890,col 9)-(line 890,col 63)",
        "(line 891,col 9)-(line 891,col 64)",
        "(line 892,col 9)-(line 892,col 64)",
        "(line 893,col 9)-(line 893,col 64)",
        "(line 894,col 9)-(line 894,col 64)",
        "(line 895,col 9)-(line 895,col 64)",
        "(line 897,col 9)-(line 897,col 82)",
        "(line 898,col 9)-(line 898,col 83)",
        "(line 899,col 9)-(line 899,col 84)",
        "(line 900,col 9)-(line 900,col 84)",
        "(line 901,col 9)-(line 901,col 85)",
        "(line 902,col 9)-(line 902,col 86)",
        "(line 904,col 9)-(line 904,col 79)",
        "(line 905,col 9)-(line 905,col 80)",
        "(line 906,col 9)-(line 906,col 81)",
        "(line 907,col 9)-(line 907,col 81)",
        "(line 908,col 9)-(line 908,col 82)",
        "(line 909,col 9)-(line 909,col 83)",
        "(line 911,col 9)-(line 911,col 80)",
        "(line 912,col 9)-(line 912,col 81)",
        "(line 913,col 9)-(line 913,col 82)",
        "(line 914,col 9)-(line 914,col 82)",
        "(line 915,col 9)-(line 915,col 83)",
        "(line 916,col 9)-(line 916,col 84)",
        "(line 918,col 9)-(line 918,col 84)",
        "(line 919,col 9)-(line 919,col 85)",
        "(line 920,col 9)-(line 920,col 86)",
        "(line 921,col 9)-(line 921,col 86)",
        "(line 922,col 9)-(line 922,col 87)",
        "(line 923,col 9)-(line 923,col 88)",
        "(line 924,col 9)-(line 924,col 91)",
        "(line 925,col 9)-(line 925,col 93)",
        "(line 927,col 9)-(line 927,col 84)",
        "(line 928,col 9)-(line 928,col 85)",
        "(line 929,col 9)-(line 929,col 86)",
        "(line 930,col 9)-(line 930,col 86)",
        "(line 931,col 9)-(line 931,col 87)",
        "(line 932,col 9)-(line 932,col 88)",
        "(line 933,col 9)-(line 933,col 91)",
        "(line 934,col 9)-(line 934,col 93)",
        "(line 935,col 9)-(line 935,col 91)",
        "(line 936,col 9)-(line 936,col 93)",
        "(line 938,col 9)-(line 938,col 82)",
        "(line 939,col 9)-(line 939,col 83)",
        "(line 940,col 9)-(line 940,col 84)",
        "(line 941,col 9)-(line 941,col 84)",
        "(line 942,col 9)-(line 942,col 85)",
        "(line 943,col 9)-(line 943,col 86)",
        "(line 944,col 9)-(line 944,col 89)",
        "(line 945,col 9)-(line 945,col 91)",
        "(line 947,col 9)-(line 947,col 92)",
        "(line 948,col 9)-(line 948,col 90)",
        "(line 950,col 9)-(line 955,col 9)",
        "(line 957,col 9)-(line 957,col 77)",
        "(line 958,col 9)-(line 958,col 78)",
        "(line 959,col 9)-(line 959,col 79)",
        "(line 960,col 9)-(line 960,col 79)",
        "(line 961,col 9)-(line 961,col 80)",
        "(line 962,col 9)-(line 962,col 81)",
        "(line 964,col 9)-(line 969,col 9)",
        "(line 972,col 9)-(line 972,col 79)",
        "(line 973,col 9)-(line 973,col 59)",
        "(line 974,col 9)-(line 974,col 97)",
        "(line 975,col 9)-(line 975,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 978,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 979,col 9)-(line 979,col 57)",
        "(line 980,col 9)-(line 980,col 57)",
        "(line 981,col 9)-(line 981,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 984,
      "end_line": 990,
      "comment": "",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 27)",
        "(line 986,col 9)-(line 986,col 54)",
        "(line 987,col 9)-(line 987,col 54)",
        "(line 988,col 9)-(line 988,col 56)",
        "(line 989,col 9)-(line 989,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 992,
      "end_line": 998,
      "comment": "",
      "child_ranges": [
        "(line 993,col 9)-(line 993,col 27)",
        "(line 994,col 9)-(line 994,col 56)",
        "(line 995,col 9)-(line 995,col 56)",
        "(line 996,col 9)-(line 996,col 58)",
        "(line 997,col 9)-(line 997,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1000,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 1001,col 9)-(line 1001,col 55)",
        "(line 1002,col 9)-(line 1002,col 55)",
        "(line 1003,col 9)-(line 1003,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1006,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 1007,col 9)-(line 1007,col 45)",
        "(line 1008,col 9)-(line 1008,col 45)",
        "(line 1009,col 9)-(line 1009,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1012,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1013,col 9)-(line 1013,col 59)",
        "(line 1014,col 9)-(line 1014,col 59)",
        "(line 1015,col 9)-(line 1015,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1018,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 23)",
        "(line 1020,col 9)-(line 1020,col 35)",
        "(line 1021,col 9)-(line 1021,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1024,
      "end_line": 1026,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1028,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1029,col 9)-(line 1029,col 36)",
        "(line 1030,col 9)-(line 1030,col 39)",
        "(line 1031,col 9)-(line 1031,col 57)",
        "(line 1032,col 9)-(line 1032,col 68)",
        "(line 1033,col 9)-(line 1033,col 62)",
        "(line 1034,col 9)-(line 1038,col 9)",
        "(line 1039,col 9)-(line 1043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1046,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 36)",
        "(line 1048,col 9)-(line 1053,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1056,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 34)",
        "(line 1058,col 9)-(line 1058,col 34)",
        "(line 1059,col 9)-(line 1059,col 57)",
        "(line 1060,col 9)-(line 1060,col 57)",
        "(line 1061,col 9)-(line 1061,col 58)",
        "(line 1062,col 9)-(line 1062,col 62)",
        "(line 1064,col 9)-(line 1064,col 64)",
        "(line 1065,col 9)-(line 1065,col 63)",
        "(line 1066,col 9)-(line 1066,col 44)",
        "(line 1067,col 9)-(line 1067,col 45)",
        "(line 1068,col 9)-(line 1068,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1071,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 1072,col 9)-(line 1077,col 9)"
      ]
    }
  ]
}
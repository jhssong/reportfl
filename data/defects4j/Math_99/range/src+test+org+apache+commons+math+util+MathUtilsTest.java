{
  "filepath": "/tmp/Math-99b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1070,
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 23)",
        "(line 310,col 9)-(line 310,col 35)",
        "(line 311,col 9)-(line 311,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 318,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 324,col 17)",
        "(line 325,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 338,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 64)",
        "(line 341,col 9)-(line 341,col 64)",
        "(line 342,col 9)-(line 342,col 66)",
        "(line 343,col 9)-(line 343,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 346,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 65)",
        "(line 349,col 9)-(line 349,col 71)",
        "(line 351,col 9)-(line 351,col 74)",
        "(line 352,col 9)-(line 352,col 79)",
        "(line 353,col 9)-(line 359,col 40)",
        "(line 360,col 9)-(line 361,col 81)",
        "(line 362,col 9)-(line 363,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 367,
      "end_line": 377,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 53)",
        "(line 375,col 9)-(line 375,col 69)",
        "(line 376,col 9)-(line 376,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 379,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 385,col 9)",
        "(line 386,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 397,col 9)",
        "(line 398,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 404,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 407,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 19)",
        "(line 409,col 9)-(line 409,col 19)",
        "(line 410,col 9)-(line 410,col 19)",
        "(line 412,col 9)-(line 412,col 45)",
        "(line 414,col 9)-(line 414,col 45)",
        "(line 415,col 9)-(line 415,col 45)",
        "(line 416,col 9)-(line 416,col 46)",
        "(line 417,col 9)-(line 417,col 46)",
        "(line 419,col 9)-(line 419,col 46)",
        "(line 420,col 9)-(line 420,col 47)",
        "(line 421,col 9)-(line 421,col 47)",
        "(line 422,col 9)-(line 422,col 48)",
        "(line 424,col 9)-(line 424,col 45)",
        "(line 425,col 9)-(line 425,col 46)",
        "(line 426,col 9)-(line 426,col 46)",
        "(line 427,col 9)-(line 427,col 47)",
        "(line 429,col 9)-(line 429,col 75)",
        "(line 431,col 9)-(line 431,col 77)",
        "(line 432,col 9)-(line 432,col 78)",
        "(line 433,col 9)-(line 433,col 70)",
        "(line 434,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 454,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 457,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 467,col 31)",
        "(line 468,col 9)-(line 478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 481,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 57)",
        "(line 483,col 9)-(line 490,col 40)",
        "(line 491,col 9)-(line 492,col 82)",
        "(line 493,col 9)-(line 494,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 500,
      "end_line": 524,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 43)",
        "(line 502,col 9)-(line 502,col 43)",
        "(line 503,col 9)-(line 503,col 53)",
        "(line 506,col 9)-(line 508,col 9)",
        "(line 511,col 9)-(line 511,col 34)",
        "(line 512,col 9)-(line 520,col 29)",
        "(line 523,col 9)-(line 523,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 526,
      "end_line": 530,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 60)",
        "(line 528,col 9)-(line 528,col 60)",
        "(line 529,col 9)-(line 529,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 532,
      "end_line": 538,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 27)",
        "(line 534,col 9)-(line 534,col 59)",
        "(line 535,col 9)-(line 535,col 59)",
        "(line 536,col 9)-(line 536,col 61)",
        "(line 537,col 9)-(line 537,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 540,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 27)",
        "(line 542,col 9)-(line 542,col 61)",
        "(line 543,col 9)-(line 543,col 61)",
        "(line 544,col 9)-(line 544,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 547,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 60)",
        "(line 549,col 9)-(line 549,col 60)",
        "(line 550,col 9)-(line 550,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 553,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 50)",
        "(line 555,col 9)-(line 555,col 50)",
        "(line 556,col 9)-(line 556,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 559,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 62)",
        "(line 561,col 9)-(line 561,col 62)",
        "(line 562,col 9)-(line 562,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 565,
      "end_line": 609,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 19)",
        "(line 567,col 9)-(line 567,col 19)",
        "(line 568,col 9)-(line 568,col 19)",
        "(line 570,col 9)-(line 570,col 45)",
        "(line 571,col 9)-(line 571,col 45)",
        "(line 572,col 9)-(line 572,col 45)",
        "(line 573,col 9)-(line 573,col 45)",
        "(line 574,col 9)-(line 574,col 47)",
        "(line 575,col 9)-(line 575,col 48)",
        "(line 576,col 9)-(line 576,col 48)",
        "(line 577,col 9)-(line 577,col 49)",
        "(line 578,col 9)-(line 578,col 48)",
        "(line 582,col 9)-(line 582,col 70)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 587,col 9)-(line 593,col 9)",
        "(line 595,col 9)-(line 601,col 9)",
        "(line 603,col 9)-(line 608,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 611,
      "end_line": 619,
      "comment": "",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 50)",
        "(line 613,col 9)-(line 613,col 50)",
        "(line 614,col 9)-(line 614,col 55)",
        "(line 615,col 9)-(line 615,col 55)",
        "(line 616,col 9)-(line 616,col 54)",
        "(line 617,col 9)-(line 617,col 49)",
        "(line 618,col 9)-(line 618,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 621,
      "end_line": 635,
      "comment": "",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 36)",
        "(line 623,col 9)-(line 623,col 39)",
        "(line 624,col 9)-(line 624,col 57)",
        "(line 625,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 637,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 34)",
        "(line 639,col 9)-(line 639,col 34)",
        "(line 640,col 9)-(line 640,col 58)",
        "(line 641,col 9)-(line 641,col 58)",
        "(line 642,col 9)-(line 642,col 57)",
        "(line 643,col 9)-(line 643,col 57)",
        "(line 644,col 9)-(line 644,col 58)",
        "(line 645,col 9)-(line 645,col 58)",
        "(line 646,col 9)-(line 646,col 57)",
        "(line 647,col 9)-(line 647,col 57)",
        "(line 648,col 9)-(line 648,col 58)",
        "(line 649,col 9)-(line 649,col 61)",
        "(line 650,col 9)-(line 650,col 44)",
        "(line 651,col 9)-(line 651,col 44)",
        "(line 652,col 9)-(line 652,col 44)",
        "(line 653,col 9)-(line 653,col 44)",
        "(line 654,col 9)-(line 654,col 45)",
        "(line 655,col 9)-(line 655,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 658,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 664,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 667,
      "end_line": 728,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 92)",
        "(line 672,col 9)-(line 672,col 108)",
        "(line 675,col 9)-(line 675,col 106)",
        "(line 678,col 9)-(line 678,col 108)",
        "(line 681,col 9)-(line 681,col 90)",
        "(line 684,col 9)-(line 684,col 92)",
        "(line 687,col 9)-(line 687,col 90)",
        "(line 690,col 9)-(line 690,col 92)",
        "(line 693,col 9)-(line 693,col 114)",
        "(line 696,col 9)-(line 696,col 115)",
        "(line 699,col 9)-(line 699,col 116)",
        "(line 702,col 9)-(line 702,col 116)",
        "(line 705,col 9)-(line 705,col 117)",
        "(line 708,col 9)-(line 708,col 117)",
        "(line 711,col 9)-(line 711,col 117)",
        "(line 714,col 9)-(line 714,col 118)",
        "(line 717,col 9)-(line 717,col 118)",
        "(line 720,col 9)-(line 720,col 117)",
        "(line 723,col 9)-(line 723,col 118)",
        "(line 726,col 9)-(line 726,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 730,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 88)",
        "(line 732,col 9)-(line 732,col 88)",
        "(line 733,col 9)-(line 733,col 69)",
        "(line 734,col 9)-(line 734,col 103)",
        "(line 735,col 9)-(line 735,col 104)",
        "(line 736,col 9)-(line 736,col 69)",
        "(line 737,col 9)-(line 737,col 71)",
        "(line 738,col 9)-(line 738,col 70)",
        "(line 739,col 9)-(line 739,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 742,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 743,col 61)",
        "(line 744,col 9)-(line 744,col 61)",
        "(line 745,col 9)-(line 745,col 69)",
        "(line 746,col 9)-(line 746,col 68)",
        "(line 747,col 9)-(line 747,col 84)",
        "(line 748,col 9)-(line 748,col 84)",
        "(line 749,col 9)-(line 749,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 752,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 764,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 31)",
        "(line 766,col 9)-(line 766,col 55)",
        "(line 767,col 9)-(line 767,col 56)",
        "(line 768,col 9)-(line 768,col 57)",
        "(line 771,col 9)-(line 771,col 61)",
        "(line 772,col 9)-(line 772,col 84)",
        "(line 773,col 9)-(line 773,col 25)",
        "(line 774,col 9)-(line 774,col 31)",
        "(line 775,col 9)-(line 775,col 57)",
        "(line 778,col 9)-(line 778,col 63)",
        "(line 779,col 9)-(line 779,col 63)",
        "(line 780,col 9)-(line 780,col 63)",
        "(line 781,col 9)-(line 781,col 63)",
        "(line 782,col 9)-(line 782,col 64)",
        "(line 783,col 9)-(line 783,col 64)",
        "(line 784,col 9)-(line 784,col 64)",
        "(line 785,col 9)-(line 785,col 64)",
        "(line 786,col 9)-(line 786,col 64)",
        "(line 788,col 9)-(line 788,col 81)",
        "(line 789,col 9)-(line 789,col 82)",
        "(line 790,col 9)-(line 790,col 83)",
        "(line 791,col 9)-(line 791,col 83)",
        "(line 792,col 9)-(line 792,col 84)",
        "(line 793,col 9)-(line 793,col 85)",
        "(line 795,col 9)-(line 795,col 78)",
        "(line 796,col 9)-(line 796,col 79)",
        "(line 797,col 9)-(line 797,col 80)",
        "(line 798,col 9)-(line 798,col 80)",
        "(line 799,col 9)-(line 799,col 81)",
        "(line 800,col 9)-(line 800,col 82)",
        "(line 802,col 9)-(line 802,col 79)",
        "(line 803,col 9)-(line 803,col 80)",
        "(line 804,col 9)-(line 804,col 81)",
        "(line 805,col 9)-(line 805,col 81)",
        "(line 806,col 9)-(line 806,col 82)",
        "(line 807,col 9)-(line 807,col 83)",
        "(line 809,col 9)-(line 809,col 83)",
        "(line 810,col 9)-(line 810,col 84)",
        "(line 811,col 9)-(line 811,col 85)",
        "(line 812,col 9)-(line 812,col 85)",
        "(line 813,col 9)-(line 813,col 86)",
        "(line 814,col 9)-(line 814,col 87)",
        "(line 815,col 9)-(line 815,col 89)",
        "(line 816,col 9)-(line 816,col 91)",
        "(line 818,col 9)-(line 818,col 83)",
        "(line 819,col 9)-(line 819,col 84)",
        "(line 820,col 9)-(line 820,col 85)",
        "(line 821,col 9)-(line 821,col 85)",
        "(line 822,col 9)-(line 822,col 86)",
        "(line 823,col 9)-(line 823,col 87)",
        "(line 824,col 9)-(line 824,col 89)",
        "(line 825,col 9)-(line 825,col 91)",
        "(line 826,col 9)-(line 826,col 89)",
        "(line 827,col 9)-(line 827,col 91)",
        "(line 829,col 9)-(line 829,col 81)",
        "(line 830,col 9)-(line 830,col 82)",
        "(line 831,col 9)-(line 831,col 83)",
        "(line 832,col 9)-(line 832,col 83)",
        "(line 833,col 9)-(line 833,col 84)",
        "(line 834,col 9)-(line 834,col 85)",
        "(line 835,col 9)-(line 835,col 87)",
        "(line 836,col 9)-(line 836,col 89)",
        "(line 838,col 9)-(line 838,col 90)",
        "(line 839,col 9)-(line 839,col 88)",
        "(line 841,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 848,col 76)",
        "(line 849,col 9)-(line 849,col 77)",
        "(line 850,col 9)-(line 850,col 78)",
        "(line 851,col 9)-(line 851,col 78)",
        "(line 852,col 9)-(line 852,col 79)",
        "(line 853,col 9)-(line 853,col 80)",
        "(line 855,col 9)-(line 860,col 9)",
        "(line 863,col 9)-(line 863,col 87)",
        "(line 866,col 9)-(line 866,col 80)",
        "(line 867,col 9)-(line 867,col 56)",
        "(line 868,col 9)-(line 868,col 98)",
        "(line 869,col 9)-(line 869,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 872,
      "end_line": 966,
      "comment": "",
      "child_ranges": [
        "(line 873,col 9)-(line 873,col 31)",
        "(line 874,col 9)-(line 874,col 56)",
        "(line 875,col 9)-(line 875,col 57)",
        "(line 876,col 9)-(line 876,col 58)",
        "(line 879,col 9)-(line 879,col 63)",
        "(line 880,col 9)-(line 880,col 63)",
        "(line 881,col 9)-(line 881,col 64)",
        "(line 882,col 9)-(line 882,col 64)",
        "(line 883,col 9)-(line 883,col 64)",
        "(line 884,col 9)-(line 884,col 64)",
        "(line 885,col 9)-(line 885,col 64)",
        "(line 887,col 9)-(line 887,col 82)",
        "(line 888,col 9)-(line 888,col 83)",
        "(line 889,col 9)-(line 889,col 84)",
        "(line 890,col 9)-(line 890,col 84)",
        "(line 891,col 9)-(line 891,col 85)",
        "(line 892,col 9)-(line 892,col 86)",
        "(line 894,col 9)-(line 894,col 79)",
        "(line 895,col 9)-(line 895,col 80)",
        "(line 896,col 9)-(line 896,col 81)",
        "(line 897,col 9)-(line 897,col 81)",
        "(line 898,col 9)-(line 898,col 82)",
        "(line 899,col 9)-(line 899,col 83)",
        "(line 901,col 9)-(line 901,col 80)",
        "(line 902,col 9)-(line 902,col 81)",
        "(line 903,col 9)-(line 903,col 82)",
        "(line 904,col 9)-(line 904,col 82)",
        "(line 905,col 9)-(line 905,col 83)",
        "(line 906,col 9)-(line 906,col 84)",
        "(line 908,col 9)-(line 908,col 84)",
        "(line 909,col 9)-(line 909,col 85)",
        "(line 910,col 9)-(line 910,col 86)",
        "(line 911,col 9)-(line 911,col 86)",
        "(line 912,col 9)-(line 912,col 87)",
        "(line 913,col 9)-(line 913,col 88)",
        "(line 914,col 9)-(line 914,col 91)",
        "(line 915,col 9)-(line 915,col 93)",
        "(line 917,col 9)-(line 917,col 84)",
        "(line 918,col 9)-(line 918,col 85)",
        "(line 919,col 9)-(line 919,col 86)",
        "(line 920,col 9)-(line 920,col 86)",
        "(line 921,col 9)-(line 921,col 87)",
        "(line 922,col 9)-(line 922,col 88)",
        "(line 923,col 9)-(line 923,col 91)",
        "(line 924,col 9)-(line 924,col 93)",
        "(line 925,col 9)-(line 925,col 91)",
        "(line 926,col 9)-(line 926,col 93)",
        "(line 928,col 9)-(line 928,col 82)",
        "(line 929,col 9)-(line 929,col 83)",
        "(line 930,col 9)-(line 930,col 84)",
        "(line 931,col 9)-(line 931,col 84)",
        "(line 932,col 9)-(line 932,col 85)",
        "(line 933,col 9)-(line 933,col 86)",
        "(line 934,col 9)-(line 934,col 89)",
        "(line 935,col 9)-(line 935,col 91)",
        "(line 937,col 9)-(line 937,col 92)",
        "(line 938,col 9)-(line 938,col 90)",
        "(line 940,col 9)-(line 945,col 9)",
        "(line 947,col 9)-(line 947,col 77)",
        "(line 948,col 9)-(line 948,col 78)",
        "(line 949,col 9)-(line 949,col 79)",
        "(line 950,col 9)-(line 950,col 79)",
        "(line 951,col 9)-(line 951,col 80)",
        "(line 952,col 9)-(line 952,col 81)",
        "(line 954,col 9)-(line 959,col 9)",
        "(line 962,col 9)-(line 962,col 79)",
        "(line 963,col 9)-(line 963,col 59)",
        "(line 964,col 9)-(line 964,col 97)",
        "(line 965,col 9)-(line 965,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 968,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 969,col 9)-(line 969,col 57)",
        "(line 970,col 9)-(line 970,col 57)",
        "(line 971,col 9)-(line 971,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 974,
      "end_line": 980,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 27)",
        "(line 976,col 9)-(line 976,col 54)",
        "(line 977,col 9)-(line 977,col 54)",
        "(line 978,col 9)-(line 978,col 56)",
        "(line 979,col 9)-(line 979,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 982,
      "end_line": 988,
      "comment": "",
      "child_ranges": [
        "(line 983,col 9)-(line 983,col 27)",
        "(line 984,col 9)-(line 984,col 56)",
        "(line 985,col 9)-(line 985,col 56)",
        "(line 986,col 9)-(line 986,col 58)",
        "(line 987,col 9)-(line 987,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 990,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 991,col 9)-(line 991,col 55)",
        "(line 992,col 9)-(line 992,col 55)",
        "(line 993,col 9)-(line 993,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 996,
      "end_line": 1000,
      "comment": "",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 45)",
        "(line 998,col 9)-(line 998,col 45)",
        "(line 999,col 9)-(line 999,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1002,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 1003,col 9)-(line 1003,col 59)",
        "(line 1004,col 9)-(line 1004,col 59)",
        "(line 1005,col 9)-(line 1005,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1008,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 23)",
        "(line 1010,col 9)-(line 1010,col 35)",
        "(line 1011,col 9)-(line 1011,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1014,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1015,col 9)-(line 1015,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1018,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 36)",
        "(line 1020,col 9)-(line 1020,col 39)",
        "(line 1021,col 9)-(line 1021,col 57)",
        "(line 1022,col 9)-(line 1022,col 68)",
        "(line 1023,col 9)-(line 1023,col 62)",
        "(line 1024,col 9)-(line 1028,col 9)",
        "(line 1029,col 9)-(line 1033,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1036,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 36)",
        "(line 1038,col 9)-(line 1043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1046,
      "end_line": 1059,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1047,col 34)",
        "(line 1048,col 9)-(line 1048,col 34)",
        "(line 1049,col 9)-(line 1049,col 57)",
        "(line 1050,col 9)-(line 1050,col 57)",
        "(line 1051,col 9)-(line 1051,col 58)",
        "(line 1052,col 9)-(line 1052,col 62)",
        "(line 1054,col 9)-(line 1054,col 64)",
        "(line 1055,col 9)-(line 1055,col 63)",
        "(line 1056,col 9)-(line 1056,col 44)",
        "(line 1057,col 9)-(line 1057,col 45)",
        "(line 1058,col 9)-(line 1058,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1061,
      "end_line": 1069,
      "comment": "",
      "child_ranges": [
        "(line 1062,col 9)-(line 1067,col 9)"
      ]
    }
  ]
}
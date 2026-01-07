{
  "filepath": "/tmp/Math-63b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1513,
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
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 46,
      "end_line": 78,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 75)",
        "(line 77,col 9)-(line 77,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 24)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 92,
      "end_line": 96,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 94,col 68)",
        "(line 95,col 9)-(line 95,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 114,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 58)",
        "(line 121,col 9)-(line 121,col 56)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 63)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 45)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 140,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 147,col 16)",
        "(line 148,col 9)-(line 155,col 16)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 188,
      "end_line": 242,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 221,col 45)",
        "(line 223,col 9)-(line 223,col 60)",
        "(line 224,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 225,col 45)",
        "(line 228,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 22)",
        "(line 236,col 9)-(line 236,col 56)",
        "(line 237,col 9)-(line 237,col 48)",
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 88)",
        "(line 240,col 9)-(line 240,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 244,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 66)",
        "(line 298,col 9)-(line 299,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 302,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 65)",
        "(line 304,col 7)-(line 304,col 65)",
        "(line 305,col 7)-(line 305,col 65)"
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
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
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 64)",
        "(line 341,col 9)-(line 341,col 64)",
        "(line 342,col 9)-(line 342,col 67)",
        "(line 343,col 9)-(line 343,col 94)",
        "(line 344,col 9)-(line 344,col 94)",
        "(line 345,col 9)-(line 345,col 95)",
        "(line 346,col 9)-(line 346,col 65)",
        "(line 347,col 9)-(line 347,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 350,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 76)",
        "(line 352,col 9)-(line 352,col 76)",
        "(line 353,col 9)-(line 353,col 76)",
        "(line 354,col 9)-(line 354,col 78)",
        "(line 355,col 9)-(line 355,col 106)",
        "(line 356,col 9)-(line 356,col 106)",
        "(line 357,col 9)-(line 357,col 107)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 362,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 51)",
        "(line 365,col 9)-(line 365,col 67)",
        "(line 366,col 9)-(line 366,col 72)",
        "(line 368,col 9)-(line 368,col 77)",
        "(line 369,col 9)-(line 369,col 80)",
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 371,col 53)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 374,col 9)-(line 374,col 63)",
        "(line 375,col 9)-(line 375,col 64)",
        "(line 377,col 9)-(line 377,col 54)",
        "(line 379,col 9)-(line 379,col 67)",
        "(line 380,col 9)-(line 380,col 68)",
        "(line 381,col 9)-(line 381,col 67)",
        "(line 382,col 9)-(line 382,col 66)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 385,col 70)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 70)",
        "(line 389,col 9)-(line 389,col 92)",
        "(line 390,col 9)-(line 390,col 84)",
        "(line 392,col 9)-(line 392,col 92)",
        "(line 393,col 9)-(line 393,col 85)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 397,col 9)-(line 397,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 400,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 63)",
        "(line 403,col 9)-(line 403,col 79)",
        "(line 404,col 9)-(line 404,col 84)",
        "(line 406,col 9)-(line 406,col 77)",
        "(line 407,col 9)-(line 407,col 80)",
        "(line 408,col 9)-(line 408,col 63)",
        "(line 409,col 9)-(line 409,col 65)",
        "(line 410,col 9)-(line 410,col 65)",
        "(line 412,col 9)-(line 412,col 75)",
        "(line 413,col 9)-(line 413,col 76)",
        "(line 415,col 9)-(line 415,col 66)",
        "(line 417,col 9)-(line 417,col 79)",
        "(line 418,col 9)-(line 418,col 80)",
        "(line 419,col 9)-(line 419,col 79)",
        "(line 420,col 9)-(line 420,col 78)",
        "(line 422,col 9)-(line 422,col 81)",
        "(line 423,col 9)-(line 423,col 82)",
        "(line 424,col 9)-(line 424,col 81)",
        "(line 425,col 9)-(line 425,col 82)",
        "(line 427,col 9)-(line 427,col 104)",
        "(line 428,col 9)-(line 428,col 96)",
        "(line 430,col 9)-(line 430,col 104)",
        "(line 431,col 9)-(line 431,col 97)",
        "(line 433,col 9)-(line 433,col 76)",
        "(line 435,col 9)-(line 435,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 442,
      "end_line": 463,
      "comment": "\n     * @deprecated To be removed in release 3.0 (replaced by {@link\n     * #testArrayEqualsIncludingNaN()}.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 65)",
        "(line 444,col 9)-(line 444,col 65)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 447,col 9)-(line 447,col 74)",
        "(line 448,col 9)-(line 448,col 79)",
        "(line 449,col 9)-(line 455,col 40)",
        "(line 456,col 9)-(line 457,col 67)",
        "(line 458,col 9)-(line 459,col 81)",
        "(line 460,col 9)-(line 461,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 465,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 77)",
        "(line 467,col 9)-(line 467,col 77)",
        "(line 468,col 9)-(line 468,col 83)",
        "(line 470,col 9)-(line 470,col 86)",
        "(line 471,col 9)-(line 471,col 91)",
        "(line 472,col 9)-(line 478,col 20)",
        "(line 479,col 9)-(line 480,col 93)",
        "(line 481,col 9)-(line 482,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 485,
      "end_line": 495,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 53)",
        "(line 493,col 9)-(line 493,col 69)",
        "(line 494,col 9)-(line 494,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 497,
      "end_line": 523,
      "comment": "",
      "child_ranges": [
        "(line 498,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 509,col 9)",
        "(line 510,col 9)-(line 515,col 9)",
        "(line 516,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 525,
      "end_line": 573,
      "comment": "",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 19)",
        "(line 527,col 9)-(line 527,col 19)",
        "(line 528,col 9)-(line 528,col 19)",
        "(line 530,col 9)-(line 530,col 45)",
        "(line 532,col 9)-(line 532,col 45)",
        "(line 533,col 9)-(line 533,col 45)",
        "(line 534,col 9)-(line 534,col 46)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 537,col 9)-(line 537,col 46)",
        "(line 538,col 9)-(line 538,col 47)",
        "(line 539,col 9)-(line 539,col 47)",
        "(line 540,col 9)-(line 540,col 48)",
        "(line 542,col 9)-(line 542,col 45)",
        "(line 543,col 9)-(line 543,col 46)",
        "(line 544,col 9)-(line 544,col 46)",
        "(line 545,col 9)-(line 545,col 47)",
        "(line 547,col 9)-(line 547,col 75)",
        "(line 549,col 9)-(line 549,col 77)",
        "(line 550,col 9)-(line 550,col 78)",
        "(line 551,col 9)-(line 551,col 70)",
        "(line 552,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 565,col 9)",
        "(line 566,col 9)-(line 572,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 575,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 20)",
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 20)",
        "(line 580,col 9)-(line 580,col 46)",
        "(line 582,col 9)-(line 582,col 45)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 46)",
        "(line 585,col 9)-(line 585,col 46)",
        "(line 587,col 9)-(line 587,col 46)",
        "(line 588,col 9)-(line 588,col 47)",
        "(line 589,col 9)-(line 589,col 47)",
        "(line 590,col 9)-(line 590,col 48)",
        "(line 592,col 9)-(line 592,col 45)",
        "(line 593,col 9)-(line 593,col 46)",
        "(line 594,col 9)-(line 594,col 46)",
        "(line 595,col 9)-(line 595,col 47)",
        "(line 597,col 9)-(line 597,col 81)",
        "(line 599,col 9)-(line 599,col 68)",
        "(line 601,col 9)-(line 601,col 72)",
        "(line 602,col 9)-(line 602,col 73)",
        "(line 603,col 9)-(line 603,col 65)",
        "(line 604,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 627,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 71)",
        "(line 629,col 9)-(line 629,col 61)",
        "(line 630,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 57)",
        "(line 634,col 9)-(line 647,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 650,
      "end_line": 672,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 660,col 31)",
        "(line 661,col 9)-(line 671,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 674,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 675,col 9)-(line 675,col 57)",
        "(line 676,col 9)-(line 683,col 40)",
        "(line 684,col 9)-(line 685,col 81)",
        "(line 686,col 9)-(line 687,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 693,
      "end_line": 717,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 43)",
        "(line 695,col 9)-(line 695,col 43)",
        "(line 696,col 9)-(line 696,col 53)",
        "(line 699,col 9)-(line 701,col 9)",
        "(line 704,col 9)-(line 704,col 34)",
        "(line 705,col 9)-(line 713,col 29)",
        "(line 716,col 9)-(line 716,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 719,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 720,col 9)-(line 720,col 60)",
        "(line 721,col 9)-(line 721,col 60)",
        "(line 722,col 9)-(line 722,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 725,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 27)",
        "(line 727,col 9)-(line 727,col 59)",
        "(line 728,col 9)-(line 728,col 59)",
        "(line 729,col 9)-(line 729,col 61)",
        "(line 730,col 9)-(line 730,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 733,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 734,col 9)-(line 734,col 27)",
        "(line 735,col 9)-(line 735,col 61)",
        "(line 736,col 9)-(line 736,col 61)",
        "(line 737,col 9)-(line 737,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 740,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 741,col 9)-(line 741,col 50)",
        "(line 742,col 9)-(line 742,col 50)",
        "(line 743,col 9)-(line 743,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 746,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 50)",
        "(line 748,col 9)-(line 748,col 50)",
        "(line 749,col 9)-(line 749,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 752,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 753,col 62)",
        "(line 754,col 9)-(line 754,col 62)",
        "(line 755,col 9)-(line 755,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 758,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 759,col 9)-(line 759,col 19)",
        "(line 760,col 9)-(line 760,col 19)",
        "(line 761,col 9)-(line 761,col 19)",
        "(line 763,col 9)-(line 763,col 45)",
        "(line 764,col 9)-(line 764,col 45)",
        "(line 765,col 9)-(line 765,col 45)",
        "(line 766,col 9)-(line 766,col 45)",
        "(line 767,col 9)-(line 767,col 47)",
        "(line 768,col 9)-(line 768,col 48)",
        "(line 769,col 9)-(line 769,col 48)",
        "(line 770,col 9)-(line 770,col 49)",
        "(line 771,col 9)-(line 771,col 48)",
        "(line 775,col 9)-(line 775,col 70)",
        "(line 778,col 9)-(line 778,col 45)",
        "(line 780,col 9)-(line 786,col 9)",
        "(line 788,col 9)-(line 794,col 9)",
        "(line 796,col 9)-(line 801,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 804,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 20)",
        "(line 806,col 9)-(line 806,col 20)",
        "(line 807,col 9)-(line 807,col 20)",
        "(line 809,col 9)-(line 809,col 45)",
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 45)",
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 813,col 47)",
        "(line 814,col 9)-(line 814,col 48)",
        "(line 815,col 9)-(line 815,col 48)",
        "(line 816,col 9)-(line 816,col 49)",
        "(line 817,col 9)-(line 817,col 48)",
        "(line 819,col 9)-(line 819,col 78)",
        "(line 823,col 9)-(line 823,col 73)",
        "(line 826,col 9)-(line 826,col 48)",
        "(line 828,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 842,col 9)",
        "(line 844,col 9)-(line 845,col 75)",
        "(line 846,col 9)-(line 851,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 854,
      "end_line": 862,
      "comment": "",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 50)",
        "(line 856,col 9)-(line 856,col 50)",
        "(line 857,col 9)-(line 857,col 55)",
        "(line 858,col 9)-(line 858,col 55)",
        "(line 859,col 9)-(line 859,col 54)",
        "(line 860,col 9)-(line 860,col 49)",
        "(line 861,col 9)-(line 861,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 864,
      "end_line": 878,
      "comment": "",
      "child_ranges": [
        "(line 865,col 9)-(line 865,col 36)",
        "(line 866,col 9)-(line 866,col 39)",
        "(line 867,col 9)-(line 867,col 57)",
        "(line 868,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 877,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 880,
      "end_line": 899,
      "comment": "",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 34)",
        "(line 882,col 9)-(line 882,col 34)",
        "(line 883,col 9)-(line 883,col 58)",
        "(line 884,col 9)-(line 884,col 58)",
        "(line 885,col 9)-(line 885,col 57)",
        "(line 886,col 9)-(line 886,col 57)",
        "(line 887,col 9)-(line 887,col 58)",
        "(line 888,col 9)-(line 888,col 58)",
        "(line 889,col 9)-(line 889,col 57)",
        "(line 890,col 9)-(line 890,col 57)",
        "(line 891,col 9)-(line 891,col 58)",
        "(line 892,col 9)-(line 892,col 61)",
        "(line 893,col 9)-(line 893,col 44)",
        "(line 894,col 9)-(line 894,col 44)",
        "(line 895,col 9)-(line 895,col 44)",
        "(line 896,col 9)-(line 896,col 44)",
        "(line 897,col 9)-(line 897,col 45)",
        "(line 898,col 9)-(line 898,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 901,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 902,col 9)-(line 907,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 910,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 912,col 9)-(line 912,col 91)",
        "(line 915,col 9)-(line 915,col 107)",
        "(line 918,col 9)-(line 918,col 105)",
        "(line 921,col 9)-(line 921,col 107)",
        "(line 924,col 9)-(line 924,col 89)",
        "(line 927,col 9)-(line 927,col 91)",
        "(line 930,col 9)-(line 930,col 89)",
        "(line 933,col 9)-(line 933,col 91)",
        "(line 936,col 9)-(line 936,col 113)",
        "(line 939,col 9)-(line 939,col 114)",
        "(line 942,col 9)-(line 942,col 115)",
        "(line 945,col 9)-(line 945,col 115)",
        "(line 948,col 9)-(line 948,col 116)",
        "(line 951,col 9)-(line 951,col 116)",
        "(line 954,col 9)-(line 954,col 116)",
        "(line 957,col 9)-(line 957,col 117)",
        "(line 960,col 9)-(line 960,col 117)",
        "(line 963,col 9)-(line 963,col 116)",
        "(line 966,col 9)-(line 966,col 117)",
        "(line 969,col 9)-(line 969,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 973,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 87)",
        "(line 975,col 9)-(line 975,col 87)",
        "(line 976,col 9)-(line 976,col 68)",
        "(line 977,col 9)-(line 977,col 102)",
        "(line 978,col 9)-(line 978,col 103)",
        "(line 979,col 9)-(line 979,col 68)",
        "(line 980,col 9)-(line 980,col 70)",
        "(line 981,col 9)-(line 981,col 69)",
        "(line 982,col 9)-(line 982,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 985,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 61)",
        "(line 987,col 9)-(line 987,col 61)",
        "(line 988,col 9)-(line 988,col 69)",
        "(line 989,col 9)-(line 989,col 76)",
        "(line 990,col 9)-(line 990,col 84)",
        "(line 991,col 9)-(line 991,col 84)",
        "(line 992,col 9)-(line 992,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 995,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 996,col 9)-(line 1004,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1007,
      "end_line": 1053,
      "comment": "",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 54)",
        "(line 1009,col 9)-(line 1012,col 34)",
        "(line 1014,col 9)-(line 1014,col 56)",
        "(line 1015,col 9)-(line 1018,col 34)",
        "(line 1021,col 9)-(line 1021,col 80)",
        "(line 1022,col 9)-(line 1025,col 34)",
        "(line 1028,col 9)-(line 1028,col 48)",
        "(line 1029,col 9)-(line 1032,col 43)",
        "(line 1035,col 9)-(line 1035,col 75)",
        "(line 1036,col 9)-(line 1039,col 43)",
        "(line 1042,col 9)-(line 1045,col 48)",
        "(line 1048,col 9)-(line 1051,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1055,
      "end_line": 1161,
      "comment": "",
      "child_ranges": [
        "(line 1056,col 9)-(line 1056,col 31)",
        "(line 1057,col 9)-(line 1057,col 55)",
        "(line 1058,col 9)-(line 1058,col 56)",
        "(line 1059,col 9)-(line 1059,col 57)",
        "(line 1062,col 9)-(line 1062,col 61)",
        "(line 1063,col 9)-(line 1063,col 84)",
        "(line 1064,col 9)-(line 1064,col 25)",
        "(line 1065,col 9)-(line 1065,col 31)",
        "(line 1066,col 9)-(line 1066,col 57)",
        "(line 1069,col 9)-(line 1069,col 63)",
        "(line 1070,col 9)-(line 1070,col 63)",
        "(line 1071,col 9)-(line 1071,col 63)",
        "(line 1072,col 9)-(line 1072,col 63)",
        "(line 1073,col 9)-(line 1073,col 64)",
        "(line 1074,col 9)-(line 1074,col 64)",
        "(line 1075,col 9)-(line 1075,col 64)",
        "(line 1076,col 9)-(line 1076,col 64)",
        "(line 1077,col 9)-(line 1077,col 64)",
        "(line 1079,col 9)-(line 1079,col 81)",
        "(line 1080,col 9)-(line 1080,col 82)",
        "(line 1081,col 9)-(line 1081,col 83)",
        "(line 1082,col 9)-(line 1082,col 83)",
        "(line 1083,col 9)-(line 1083,col 84)",
        "(line 1084,col 9)-(line 1084,col 85)",
        "(line 1086,col 9)-(line 1086,col 78)",
        "(line 1087,col 9)-(line 1087,col 79)",
        "(line 1088,col 9)-(line 1088,col 80)",
        "(line 1089,col 9)-(line 1089,col 80)",
        "(line 1090,col 9)-(line 1090,col 81)",
        "(line 1091,col 9)-(line 1091,col 82)",
        "(line 1093,col 9)-(line 1093,col 79)",
        "(line 1094,col 9)-(line 1094,col 80)",
        "(line 1095,col 9)-(line 1095,col 81)",
        "(line 1096,col 9)-(line 1096,col 81)",
        "(line 1097,col 9)-(line 1097,col 82)",
        "(line 1098,col 9)-(line 1098,col 83)",
        "(line 1100,col 9)-(line 1100,col 83)",
        "(line 1101,col 9)-(line 1101,col 84)",
        "(line 1102,col 9)-(line 1102,col 85)",
        "(line 1103,col 9)-(line 1103,col 85)",
        "(line 1104,col 9)-(line 1104,col 86)",
        "(line 1105,col 9)-(line 1105,col 87)",
        "(line 1106,col 9)-(line 1106,col 89)",
        "(line 1107,col 9)-(line 1107,col 91)",
        "(line 1109,col 9)-(line 1109,col 83)",
        "(line 1110,col 9)-(line 1110,col 84)",
        "(line 1111,col 9)-(line 1111,col 85)",
        "(line 1112,col 9)-(line 1112,col 85)",
        "(line 1113,col 9)-(line 1113,col 86)",
        "(line 1114,col 9)-(line 1114,col 87)",
        "(line 1115,col 9)-(line 1115,col 89)",
        "(line 1116,col 9)-(line 1116,col 91)",
        "(line 1117,col 9)-(line 1117,col 89)",
        "(line 1118,col 9)-(line 1118,col 91)",
        "(line 1120,col 9)-(line 1120,col 81)",
        "(line 1121,col 9)-(line 1121,col 82)",
        "(line 1122,col 9)-(line 1122,col 83)",
        "(line 1123,col 9)-(line 1123,col 83)",
        "(line 1124,col 9)-(line 1124,col 84)",
        "(line 1125,col 9)-(line 1125,col 85)",
        "(line 1126,col 9)-(line 1126,col 87)",
        "(line 1127,col 9)-(line 1127,col 89)",
        "(line 1129,col 9)-(line 1129,col 90)",
        "(line 1130,col 9)-(line 1130,col 88)",
        "(line 1132,col 9)-(line 1137,col 9)",
        "(line 1139,col 9)-(line 1139,col 76)",
        "(line 1140,col 9)-(line 1140,col 77)",
        "(line 1141,col 9)-(line 1141,col 78)",
        "(line 1142,col 9)-(line 1142,col 78)",
        "(line 1143,col 9)-(line 1143,col 79)",
        "(line 1144,col 9)-(line 1144,col 80)",
        "(line 1146,col 9)-(line 1151,col 9)",
        "(line 1154,col 9)-(line 1154,col 87)",
        "(line 1157,col 9)-(line 1157,col 80)",
        "(line 1158,col 9)-(line 1158,col 56)",
        "(line 1159,col 9)-(line 1159,col 98)",
        "(line 1160,col 9)-(line 1160,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1163,
      "end_line": 1257,
      "comment": "",
      "child_ranges": [
        "(line 1164,col 9)-(line 1164,col 31)",
        "(line 1165,col 9)-(line 1165,col 56)",
        "(line 1166,col 9)-(line 1166,col 57)",
        "(line 1167,col 9)-(line 1167,col 58)",
        "(line 1170,col 9)-(line 1170,col 63)",
        "(line 1171,col 9)-(line 1171,col 63)",
        "(line 1172,col 9)-(line 1172,col 64)",
        "(line 1173,col 9)-(line 1173,col 64)",
        "(line 1174,col 9)-(line 1174,col 64)",
        "(line 1175,col 9)-(line 1175,col 64)",
        "(line 1176,col 9)-(line 1176,col 64)",
        "(line 1178,col 9)-(line 1178,col 82)",
        "(line 1179,col 9)-(line 1179,col 83)",
        "(line 1180,col 9)-(line 1180,col 84)",
        "(line 1181,col 9)-(line 1181,col 84)",
        "(line 1182,col 9)-(line 1182,col 85)",
        "(line 1183,col 9)-(line 1183,col 86)",
        "(line 1185,col 9)-(line 1185,col 79)",
        "(line 1186,col 9)-(line 1186,col 80)",
        "(line 1187,col 9)-(line 1187,col 81)",
        "(line 1188,col 9)-(line 1188,col 81)",
        "(line 1189,col 9)-(line 1189,col 82)",
        "(line 1190,col 9)-(line 1190,col 83)",
        "(line 1192,col 9)-(line 1192,col 80)",
        "(line 1193,col 9)-(line 1193,col 81)",
        "(line 1194,col 9)-(line 1194,col 82)",
        "(line 1195,col 9)-(line 1195,col 82)",
        "(line 1196,col 9)-(line 1196,col 83)",
        "(line 1197,col 9)-(line 1197,col 84)",
        "(line 1199,col 9)-(line 1199,col 84)",
        "(line 1200,col 9)-(line 1200,col 85)",
        "(line 1201,col 9)-(line 1201,col 86)",
        "(line 1202,col 9)-(line 1202,col 86)",
        "(line 1203,col 9)-(line 1203,col 87)",
        "(line 1204,col 9)-(line 1204,col 88)",
        "(line 1205,col 9)-(line 1205,col 91)",
        "(line 1206,col 9)-(line 1206,col 93)",
        "(line 1208,col 9)-(line 1208,col 84)",
        "(line 1209,col 9)-(line 1209,col 85)",
        "(line 1210,col 9)-(line 1210,col 86)",
        "(line 1211,col 9)-(line 1211,col 86)",
        "(line 1212,col 9)-(line 1212,col 87)",
        "(line 1213,col 9)-(line 1213,col 88)",
        "(line 1214,col 9)-(line 1214,col 91)",
        "(line 1215,col 9)-(line 1215,col 93)",
        "(line 1216,col 9)-(line 1216,col 91)",
        "(line 1217,col 9)-(line 1217,col 93)",
        "(line 1219,col 9)-(line 1219,col 82)",
        "(line 1220,col 9)-(line 1220,col 83)",
        "(line 1221,col 9)-(line 1221,col 84)",
        "(line 1222,col 9)-(line 1222,col 84)",
        "(line 1223,col 9)-(line 1223,col 85)",
        "(line 1224,col 9)-(line 1224,col 86)",
        "(line 1225,col 9)-(line 1225,col 89)",
        "(line 1226,col 9)-(line 1226,col 91)",
        "(line 1228,col 9)-(line 1228,col 92)",
        "(line 1229,col 9)-(line 1229,col 90)",
        "(line 1231,col 9)-(line 1236,col 9)",
        "(line 1238,col 9)-(line 1238,col 77)",
        "(line 1239,col 9)-(line 1239,col 78)",
        "(line 1240,col 9)-(line 1240,col 79)",
        "(line 1241,col 9)-(line 1241,col 79)",
        "(line 1242,col 9)-(line 1242,col 80)",
        "(line 1243,col 9)-(line 1243,col 81)",
        "(line 1245,col 9)-(line 1250,col 9)",
        "(line 1253,col 9)-(line 1253,col 79)",
        "(line 1254,col 9)-(line 1254,col 59)",
        "(line 1255,col 9)-(line 1255,col 97)",
        "(line 1256,col 9)-(line 1256,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1259,
      "end_line": 1263,
      "comment": "",
      "child_ranges": [
        "(line 1260,col 9)-(line 1260,col 57)",
        "(line 1261,col 9)-(line 1261,col 57)",
        "(line 1262,col 9)-(line 1262,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1265,
      "end_line": 1271,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 27)",
        "(line 1267,col 9)-(line 1267,col 54)",
        "(line 1268,col 9)-(line 1268,col 54)",
        "(line 1269,col 9)-(line 1269,col 56)",
        "(line 1270,col 9)-(line 1270,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1273,
      "end_line": 1279,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 27)",
        "(line 1275,col 9)-(line 1275,col 56)",
        "(line 1276,col 9)-(line 1276,col 56)",
        "(line 1277,col 9)-(line 1277,col 58)",
        "(line 1278,col 9)-(line 1278,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1281,
      "end_line": 1285,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 43)",
        "(line 1283,col 9)-(line 1283,col 43)",
        "(line 1284,col 9)-(line 1284,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1287,
      "end_line": 1291,
      "comment": "",
      "child_ranges": [
        "(line 1288,col 9)-(line 1288,col 45)",
        "(line 1289,col 9)-(line 1289,col 45)",
        "(line 1290,col 9)-(line 1290,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1293,
      "end_line": 1297,
      "comment": "",
      "child_ranges": [
        "(line 1294,col 9)-(line 1294,col 59)",
        "(line 1295,col 9)-(line 1295,col 59)",
        "(line 1296,col 9)-(line 1296,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1299,
      "end_line": 1303,
      "comment": "",
      "child_ranges": [
        "(line 1300,col 9)-(line 1300,col 23)",
        "(line 1301,col 9)-(line 1301,col 35)",
        "(line 1302,col 9)-(line 1302,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1305,
      "end_line": 1307,
      "comment": "",
      "child_ranges": [
        "(line 1306,col 9)-(line 1306,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1309,
      "end_line": 1325,
      "comment": "",
      "child_ranges": [
        "(line 1310,col 9)-(line 1310,col 36)",
        "(line 1311,col 9)-(line 1311,col 39)",
        "(line 1312,col 9)-(line 1312,col 57)",
        "(line 1313,col 9)-(line 1313,col 68)",
        "(line 1314,col 9)-(line 1314,col 62)",
        "(line 1315,col 9)-(line 1319,col 9)",
        "(line 1320,col 9)-(line 1324,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1327,
      "end_line": 1335,
      "comment": "",
      "child_ranges": [
        "(line 1328,col 9)-(line 1328,col 36)",
        "(line 1329,col 9)-(line 1334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1337,
      "end_line": 1350,
      "comment": "",
      "child_ranges": [
        "(line 1338,col 9)-(line 1338,col 34)",
        "(line 1339,col 9)-(line 1339,col 34)",
        "(line 1340,col 9)-(line 1340,col 57)",
        "(line 1341,col 9)-(line 1341,col 57)",
        "(line 1342,col 9)-(line 1342,col 58)",
        "(line 1343,col 9)-(line 1343,col 62)",
        "(line 1345,col 9)-(line 1345,col 64)",
        "(line 1346,col 9)-(line 1346,col 63)",
        "(line 1347,col 9)-(line 1347,col 44)",
        "(line 1348,col 9)-(line 1348,col 45)",
        "(line 1349,col 9)-(line 1349,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1352,
      "end_line": 1360,
      "comment": "",
      "child_ranges": [
        "(line 1353,col 9)-(line 1358,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1362,
      "end_line": 1436,
      "comment": "",
      "child_ranges": [
        "(line 1364,col 9)-(line 1364,col 55)",
        "(line 1365,col 9)-(line 1365,col 46)",
        "(line 1366,col 9)-(line 1371,col 9)",
        "(line 1373,col 9)-(line 1373,col 56)",
        "(line 1374,col 9)-(line 1374,col 47)",
        "(line 1375,col 9)-(line 1380,col 9)",
        "(line 1382,col 9)-(line 1382,col 57)",
        "(line 1383,col 9)-(line 1383,col 48)",
        "(line 1384,col 9)-(line 1389,col 9)",
        "(line 1391,col 9)-(line 1391,col 58)",
        "(line 1392,col 9)-(line 1392,col 49)",
        "(line 1393,col 9)-(line 1398,col 9)",
        "(line 1400,col 9)-(line 1400,col 55)",
        "(line 1401,col 9)-(line 1401,col 83)",
        "(line 1402,col 9)-(line 1402,col 66)",
        "(line 1403,col 9)-(line 1408,col 9)",
        "(line 1410,col 9)-(line 1410,col 84)",
        "(line 1411,col 9)-(line 1411,col 67)",
        "(line 1412,col 9)-(line 1417,col 9)",
        "(line 1419,col 9)-(line 1419,col 104)",
        "(line 1420,col 9)-(line 1420,col 80)",
        "(line 1421,col 9)-(line 1426,col 9)",
        "(line 1428,col 9)-(line 1431,col 76)",
        "(line 1432,col 9)-(line 1432,col 60)",
        "(line 1433,col 9)-(line 1433,col 61)",
        "(line 1434,col 9)-(line 1434,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1438,
      "end_line": 1442,
      "comment": "",
      "child_ranges": [
        "(line 1439,col 9)-(line 1439,col 36)",
        "(line 1440,col 9)-(line 1440,col 36)",
        "(line 1441,col 9)-(line 1441,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1444,
      "end_line": 1448,
      "comment": "",
      "child_ranges": [
        "(line 1445,col 9)-(line 1445,col 28)",
        "(line 1446,col 9)-(line 1446,col 28)",
        "(line 1447,col 9)-(line 1447,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1450,
      "end_line": 1454,
      "comment": "",
      "child_ranges": [
        "(line 1451,col 9)-(line 1451,col 36)",
        "(line 1452,col 9)-(line 1452,col 36)",
        "(line 1453,col 9)-(line 1453,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1456,
      "end_line": 1460,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 9)-(line 1457,col 28)",
        "(line 1458,col 9)-(line 1458,col 28)",
        "(line 1459,col 9)-(line 1459,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1462,
      "end_line": 1466,
      "comment": "",
      "child_ranges": [
        "(line 1463,col 9)-(line 1463,col 36)",
        "(line 1464,col 9)-(line 1464,col 36)",
        "(line 1465,col 9)-(line 1465,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1468,
      "end_line": 1472,
      "comment": "",
      "child_ranges": [
        "(line 1469,col 9)-(line 1469,col 28)",
        "(line 1470,col 9)-(line 1470,col 28)",
        "(line 1471,col 9)-(line 1471,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1474,
      "end_line": 1512,
      "comment": "",
      "child_ranges": [
        "(line 1475,col 9)-(line 1476,col 72)",
        "(line 1477,col 9)-(line 1478,col 73)",
        "(line 1479,col 9)-(line 1480,col 72)",
        "(line 1481,col 9)-(line 1482,col 73)",
        "(line 1484,col 9)-(line 1490,col 9)",
        "(line 1491,col 9)-(line 1497,col 9)",
        "(line 1498,col 9)-(line 1504,col 9)",
        "(line 1505,col 9)-(line 1511,col 9)"
      ]
    }
  ]
}
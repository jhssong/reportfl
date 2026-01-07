{
  "filepath": "/tmp/Math-60b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1542,
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
      "end_line": 464,
      "comment": "\n     * @deprecated To be removed in release 3.0 (replaced by {@link\n     * #testArrayEqualsIncludingNaN()}.\n     ",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 65)",
        "(line 445,col 9)-(line 445,col 65)",
        "(line 446,col 9)-(line 446,col 71)",
        "(line 448,col 9)-(line 448,col 74)",
        "(line 449,col 9)-(line 449,col 79)",
        "(line 450,col 9)-(line 456,col 40)",
        "(line 457,col 9)-(line 458,col 67)",
        "(line 459,col 9)-(line 460,col 81)",
        "(line 461,col 9)-(line 462,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 466,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 77)",
        "(line 468,col 9)-(line 468,col 77)",
        "(line 469,col 9)-(line 469,col 83)",
        "(line 471,col 9)-(line 471,col 86)",
        "(line 472,col 9)-(line 472,col 91)",
        "(line 473,col 9)-(line 479,col 20)",
        "(line 480,col 9)-(line 481,col 93)",
        "(line 482,col 9)-(line 483,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 486,
      "end_line": 496,
      "comment": "",
      "child_ranges": [
        "(line 487,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 493,col 53)",
        "(line 494,col 9)-(line 494,col 69)",
        "(line 495,col 9)-(line 495,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 498,
      "end_line": 524,
      "comment": "",
      "child_ranges": [
        "(line 499,col 9)-(line 504,col 9)",
        "(line 505,col 9)-(line 510,col 9)",
        "(line 511,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 526,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 19)",
        "(line 528,col 9)-(line 528,col 19)",
        "(line 529,col 9)-(line 529,col 19)",
        "(line 531,col 9)-(line 531,col 45)",
        "(line 533,col 9)-(line 533,col 45)",
        "(line 534,col 9)-(line 534,col 45)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 538,col 9)-(line 538,col 46)",
        "(line 539,col 9)-(line 539,col 47)",
        "(line 540,col 9)-(line 540,col 47)",
        "(line 541,col 9)-(line 541,col 48)",
        "(line 543,col 9)-(line 543,col 45)",
        "(line 544,col 9)-(line 544,col 46)",
        "(line 545,col 9)-(line 545,col 46)",
        "(line 546,col 9)-(line 546,col 47)",
        "(line 548,col 9)-(line 548,col 75)",
        "(line 550,col 9)-(line 550,col 77)",
        "(line 551,col 9)-(line 551,col 78)",
        "(line 552,col 9)-(line 552,col 70)",
        "(line 553,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 576,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 20)",
        "(line 578,col 9)-(line 578,col 20)",
        "(line 579,col 9)-(line 579,col 20)",
        "(line 581,col 9)-(line 581,col 46)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 45)",
        "(line 585,col 9)-(line 585,col 46)",
        "(line 586,col 9)-(line 586,col 46)",
        "(line 588,col 9)-(line 588,col 46)",
        "(line 589,col 9)-(line 589,col 47)",
        "(line 590,col 9)-(line 590,col 47)",
        "(line 591,col 9)-(line 591,col 48)",
        "(line 593,col 9)-(line 593,col 45)",
        "(line 594,col 9)-(line 594,col 46)",
        "(line 595,col 9)-(line 595,col 46)",
        "(line 596,col 9)-(line 596,col 47)",
        "(line 598,col 9)-(line 598,col 81)",
        "(line 600,col 9)-(line 600,col 68)",
        "(line 602,col 9)-(line 602,col 72)",
        "(line 603,col 9)-(line 603,col 73)",
        "(line 604,col 9)-(line 604,col 65)",
        "(line 605,col 9)-(line 611,col 9)",
        "(line 612,col 9)-(line 618,col 9)",
        "(line 619,col 9)-(line 625,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 628,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 71)",
        "(line 630,col 9)-(line 630,col 61)",
        "(line 631,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 57)",
        "(line 635,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 651,
      "end_line": 673,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 661,col 31)",
        "(line 662,col 9)-(line 672,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 675,
      "end_line": 689,
      "comment": "",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 57)",
        "(line 677,col 9)-(line 684,col 40)",
        "(line 685,col 9)-(line 686,col 81)",
        "(line 687,col 9)-(line 688,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 694,
      "end_line": 718,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 43)",
        "(line 696,col 9)-(line 696,col 43)",
        "(line 697,col 9)-(line 697,col 53)",
        "(line 700,col 9)-(line 702,col 9)",
        "(line 705,col 9)-(line 705,col 34)",
        "(line 706,col 9)-(line 714,col 29)",
        "(line 717,col 9)-(line 717,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 720,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 60)",
        "(line 722,col 9)-(line 722,col 60)",
        "(line 723,col 9)-(line 723,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 726,
      "end_line": 732,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 27)",
        "(line 728,col 9)-(line 728,col 59)",
        "(line 729,col 9)-(line 729,col 59)",
        "(line 730,col 9)-(line 730,col 61)",
        "(line 731,col 9)-(line 731,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 734,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 735,col 27)",
        "(line 736,col 9)-(line 736,col 61)",
        "(line 737,col 9)-(line 737,col 61)",
        "(line 738,col 9)-(line 738,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 741,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 50)",
        "(line 743,col 9)-(line 743,col 50)",
        "(line 744,col 9)-(line 744,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 747,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 748,col 9)-(line 748,col 50)",
        "(line 749,col 9)-(line 749,col 50)",
        "(line 750,col 9)-(line 750,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 753,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 62)",
        "(line 755,col 9)-(line 755,col 62)",
        "(line 756,col 9)-(line 756,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 759,
      "end_line": 803,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 19)",
        "(line 761,col 9)-(line 761,col 19)",
        "(line 762,col 9)-(line 762,col 19)",
        "(line 764,col 9)-(line 764,col 45)",
        "(line 765,col 9)-(line 765,col 45)",
        "(line 766,col 9)-(line 766,col 45)",
        "(line 767,col 9)-(line 767,col 45)",
        "(line 768,col 9)-(line 768,col 47)",
        "(line 769,col 9)-(line 769,col 48)",
        "(line 770,col 9)-(line 770,col 48)",
        "(line 771,col 9)-(line 771,col 49)",
        "(line 772,col 9)-(line 772,col 48)",
        "(line 776,col 9)-(line 776,col 70)",
        "(line 779,col 9)-(line 779,col 45)",
        "(line 781,col 9)-(line 787,col 9)",
        "(line 789,col 9)-(line 795,col 9)",
        "(line 797,col 9)-(line 802,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 805,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 806,col 9)-(line 806,col 20)",
        "(line 807,col 9)-(line 807,col 20)",
        "(line 808,col 9)-(line 808,col 20)",
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 45)",
        "(line 812,col 9)-(line 812,col 45)",
        "(line 813,col 9)-(line 813,col 45)",
        "(line 814,col 9)-(line 814,col 47)",
        "(line 815,col 9)-(line 815,col 48)",
        "(line 816,col 9)-(line 816,col 48)",
        "(line 817,col 9)-(line 817,col 49)",
        "(line 818,col 9)-(line 818,col 48)",
        "(line 820,col 9)-(line 820,col 78)",
        "(line 824,col 9)-(line 824,col 73)",
        "(line 827,col 9)-(line 827,col 48)",
        "(line 829,col 9)-(line 835,col 9)",
        "(line 837,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 846,col 75)",
        "(line 847,col 9)-(line 852,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 855,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 50)",
        "(line 857,col 9)-(line 857,col 50)",
        "(line 858,col 9)-(line 858,col 55)",
        "(line 859,col 9)-(line 859,col 55)",
        "(line 860,col 9)-(line 860,col 54)",
        "(line 861,col 9)-(line 861,col 49)",
        "(line 862,col 9)-(line 862,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 865,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 866,col 9)-(line 866,col 36)",
        "(line 867,col 9)-(line 867,col 39)",
        "(line 868,col 9)-(line 868,col 57)",
        "(line 869,col 9)-(line 873,col 9)",
        "(line 874,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 881,
      "end_line": 900,
      "comment": "",
      "child_ranges": [
        "(line 882,col 9)-(line 882,col 34)",
        "(line 883,col 9)-(line 883,col 34)",
        "(line 884,col 9)-(line 884,col 58)",
        "(line 885,col 9)-(line 885,col 58)",
        "(line 886,col 9)-(line 886,col 57)",
        "(line 887,col 9)-(line 887,col 57)",
        "(line 888,col 9)-(line 888,col 58)",
        "(line 889,col 9)-(line 889,col 58)",
        "(line 890,col 9)-(line 890,col 57)",
        "(line 891,col 9)-(line 891,col 57)",
        "(line 892,col 9)-(line 892,col 58)",
        "(line 893,col 9)-(line 893,col 61)",
        "(line 894,col 9)-(line 894,col 44)",
        "(line 895,col 9)-(line 895,col 44)",
        "(line 896,col 9)-(line 896,col 44)",
        "(line 897,col 9)-(line 897,col 44)",
        "(line 898,col 9)-(line 898,col 45)",
        "(line 899,col 9)-(line 899,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 902,
      "end_line": 909,
      "comment": "",
      "child_ranges": [
        "(line 903,col 9)-(line 908,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 911,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 913,col 9)-(line 913,col 91)",
        "(line 916,col 9)-(line 916,col 107)",
        "(line 919,col 9)-(line 919,col 105)",
        "(line 922,col 9)-(line 922,col 107)",
        "(line 925,col 9)-(line 925,col 89)",
        "(line 928,col 9)-(line 928,col 91)",
        "(line 931,col 9)-(line 931,col 89)",
        "(line 934,col 9)-(line 934,col 91)",
        "(line 937,col 9)-(line 937,col 113)",
        "(line 940,col 9)-(line 940,col 114)",
        "(line 943,col 9)-(line 943,col 115)",
        "(line 946,col 9)-(line 946,col 115)",
        "(line 949,col 9)-(line 949,col 116)",
        "(line 952,col 9)-(line 952,col 116)",
        "(line 955,col 9)-(line 955,col 116)",
        "(line 958,col 9)-(line 958,col 117)",
        "(line 961,col 9)-(line 961,col 117)",
        "(line 964,col 9)-(line 964,col 116)",
        "(line 967,col 9)-(line 967,col 117)",
        "(line 970,col 9)-(line 970,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 974,
      "end_line": 984,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 87)",
        "(line 976,col 9)-(line 976,col 87)",
        "(line 977,col 9)-(line 977,col 68)",
        "(line 978,col 9)-(line 978,col 102)",
        "(line 979,col 9)-(line 979,col 103)",
        "(line 980,col 9)-(line 980,col 68)",
        "(line 981,col 9)-(line 981,col 70)",
        "(line 982,col 9)-(line 982,col 69)",
        "(line 983,col 9)-(line 983,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 986,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 987,col 9)-(line 987,col 61)",
        "(line 988,col 9)-(line 988,col 61)",
        "(line 989,col 9)-(line 989,col 69)",
        "(line 990,col 9)-(line 990,col 76)",
        "(line 991,col 9)-(line 991,col 84)",
        "(line 992,col 9)-(line 992,col 84)",
        "(line 993,col 9)-(line 993,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 996,
      "end_line": 1006,
      "comment": "",
      "child_ranges": [
        "(line 997,col 9)-(line 1005,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1008,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 54)",
        "(line 1010,col 9)-(line 1013,col 34)",
        "(line 1015,col 9)-(line 1015,col 56)",
        "(line 1016,col 9)-(line 1019,col 34)",
        "(line 1022,col 9)-(line 1022,col 80)",
        "(line 1023,col 9)-(line 1026,col 34)",
        "(line 1029,col 9)-(line 1029,col 48)",
        "(line 1030,col 9)-(line 1033,col 43)",
        "(line 1036,col 9)-(line 1036,col 75)",
        "(line 1037,col 9)-(line 1040,col 43)",
        "(line 1043,col 9)-(line 1046,col 48)",
        "(line 1049,col 9)-(line 1052,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1056,
      "end_line": 1162,
      "comment": "",
      "child_ranges": [
        "(line 1057,col 9)-(line 1057,col 31)",
        "(line 1058,col 9)-(line 1058,col 55)",
        "(line 1059,col 9)-(line 1059,col 56)",
        "(line 1060,col 9)-(line 1060,col 57)",
        "(line 1063,col 9)-(line 1063,col 61)",
        "(line 1064,col 9)-(line 1064,col 84)",
        "(line 1065,col 9)-(line 1065,col 25)",
        "(line 1066,col 9)-(line 1066,col 31)",
        "(line 1067,col 9)-(line 1067,col 57)",
        "(line 1070,col 9)-(line 1070,col 63)",
        "(line 1071,col 9)-(line 1071,col 63)",
        "(line 1072,col 9)-(line 1072,col 63)",
        "(line 1073,col 9)-(line 1073,col 63)",
        "(line 1074,col 9)-(line 1074,col 64)",
        "(line 1075,col 9)-(line 1075,col 64)",
        "(line 1076,col 9)-(line 1076,col 64)",
        "(line 1077,col 9)-(line 1077,col 64)",
        "(line 1078,col 9)-(line 1078,col 64)",
        "(line 1080,col 9)-(line 1080,col 81)",
        "(line 1081,col 9)-(line 1081,col 82)",
        "(line 1082,col 9)-(line 1082,col 83)",
        "(line 1083,col 9)-(line 1083,col 83)",
        "(line 1084,col 9)-(line 1084,col 84)",
        "(line 1085,col 9)-(line 1085,col 85)",
        "(line 1087,col 9)-(line 1087,col 78)",
        "(line 1088,col 9)-(line 1088,col 79)",
        "(line 1089,col 9)-(line 1089,col 80)",
        "(line 1090,col 9)-(line 1090,col 80)",
        "(line 1091,col 9)-(line 1091,col 81)",
        "(line 1092,col 9)-(line 1092,col 82)",
        "(line 1094,col 9)-(line 1094,col 79)",
        "(line 1095,col 9)-(line 1095,col 80)",
        "(line 1096,col 9)-(line 1096,col 81)",
        "(line 1097,col 9)-(line 1097,col 81)",
        "(line 1098,col 9)-(line 1098,col 82)",
        "(line 1099,col 9)-(line 1099,col 83)",
        "(line 1101,col 9)-(line 1101,col 83)",
        "(line 1102,col 9)-(line 1102,col 84)",
        "(line 1103,col 9)-(line 1103,col 85)",
        "(line 1104,col 9)-(line 1104,col 85)",
        "(line 1105,col 9)-(line 1105,col 86)",
        "(line 1106,col 9)-(line 1106,col 87)",
        "(line 1107,col 9)-(line 1107,col 89)",
        "(line 1108,col 9)-(line 1108,col 91)",
        "(line 1110,col 9)-(line 1110,col 83)",
        "(line 1111,col 9)-(line 1111,col 84)",
        "(line 1112,col 9)-(line 1112,col 85)",
        "(line 1113,col 9)-(line 1113,col 85)",
        "(line 1114,col 9)-(line 1114,col 86)",
        "(line 1115,col 9)-(line 1115,col 87)",
        "(line 1116,col 9)-(line 1116,col 89)",
        "(line 1117,col 9)-(line 1117,col 91)",
        "(line 1118,col 9)-(line 1118,col 89)",
        "(line 1119,col 9)-(line 1119,col 91)",
        "(line 1121,col 9)-(line 1121,col 81)",
        "(line 1122,col 9)-(line 1122,col 82)",
        "(line 1123,col 9)-(line 1123,col 83)",
        "(line 1124,col 9)-(line 1124,col 83)",
        "(line 1125,col 9)-(line 1125,col 84)",
        "(line 1126,col 9)-(line 1126,col 85)",
        "(line 1127,col 9)-(line 1127,col 87)",
        "(line 1128,col 9)-(line 1128,col 89)",
        "(line 1130,col 9)-(line 1130,col 90)",
        "(line 1131,col 9)-(line 1131,col 88)",
        "(line 1133,col 9)-(line 1138,col 9)",
        "(line 1140,col 9)-(line 1140,col 76)",
        "(line 1141,col 9)-(line 1141,col 77)",
        "(line 1142,col 9)-(line 1142,col 78)",
        "(line 1143,col 9)-(line 1143,col 78)",
        "(line 1144,col 9)-(line 1144,col 79)",
        "(line 1145,col 9)-(line 1145,col 80)",
        "(line 1147,col 9)-(line 1152,col 9)",
        "(line 1155,col 9)-(line 1155,col 87)",
        "(line 1158,col 9)-(line 1158,col 80)",
        "(line 1159,col 9)-(line 1159,col 56)",
        "(line 1160,col 9)-(line 1160,col 98)",
        "(line 1161,col 9)-(line 1161,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1164,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1165,col 9)-(line 1165,col 31)",
        "(line 1166,col 9)-(line 1166,col 56)",
        "(line 1167,col 9)-(line 1167,col 57)",
        "(line 1168,col 9)-(line 1168,col 58)",
        "(line 1171,col 9)-(line 1171,col 63)",
        "(line 1172,col 9)-(line 1172,col 63)",
        "(line 1173,col 9)-(line 1173,col 64)",
        "(line 1174,col 9)-(line 1174,col 64)",
        "(line 1175,col 9)-(line 1175,col 64)",
        "(line 1176,col 9)-(line 1176,col 64)",
        "(line 1177,col 9)-(line 1177,col 64)",
        "(line 1179,col 9)-(line 1179,col 82)",
        "(line 1180,col 9)-(line 1180,col 83)",
        "(line 1181,col 9)-(line 1181,col 84)",
        "(line 1182,col 9)-(line 1182,col 84)",
        "(line 1183,col 9)-(line 1183,col 85)",
        "(line 1184,col 9)-(line 1184,col 86)",
        "(line 1186,col 9)-(line 1186,col 79)",
        "(line 1187,col 9)-(line 1187,col 80)",
        "(line 1188,col 9)-(line 1188,col 81)",
        "(line 1189,col 9)-(line 1189,col 81)",
        "(line 1190,col 9)-(line 1190,col 82)",
        "(line 1191,col 9)-(line 1191,col 83)",
        "(line 1193,col 9)-(line 1193,col 80)",
        "(line 1194,col 9)-(line 1194,col 81)",
        "(line 1195,col 9)-(line 1195,col 82)",
        "(line 1196,col 9)-(line 1196,col 82)",
        "(line 1197,col 9)-(line 1197,col 83)",
        "(line 1198,col 9)-(line 1198,col 84)",
        "(line 1200,col 9)-(line 1200,col 84)",
        "(line 1201,col 9)-(line 1201,col 85)",
        "(line 1202,col 9)-(line 1202,col 86)",
        "(line 1203,col 9)-(line 1203,col 86)",
        "(line 1204,col 9)-(line 1204,col 87)",
        "(line 1205,col 9)-(line 1205,col 88)",
        "(line 1206,col 9)-(line 1206,col 91)",
        "(line 1207,col 9)-(line 1207,col 93)",
        "(line 1209,col 9)-(line 1209,col 84)",
        "(line 1210,col 9)-(line 1210,col 85)",
        "(line 1211,col 9)-(line 1211,col 86)",
        "(line 1212,col 9)-(line 1212,col 86)",
        "(line 1213,col 9)-(line 1213,col 87)",
        "(line 1214,col 9)-(line 1214,col 88)",
        "(line 1215,col 9)-(line 1215,col 91)",
        "(line 1216,col 9)-(line 1216,col 93)",
        "(line 1217,col 9)-(line 1217,col 91)",
        "(line 1218,col 9)-(line 1218,col 93)",
        "(line 1220,col 9)-(line 1220,col 82)",
        "(line 1221,col 9)-(line 1221,col 83)",
        "(line 1222,col 9)-(line 1222,col 84)",
        "(line 1223,col 9)-(line 1223,col 84)",
        "(line 1224,col 9)-(line 1224,col 85)",
        "(line 1225,col 9)-(line 1225,col 86)",
        "(line 1226,col 9)-(line 1226,col 89)",
        "(line 1227,col 9)-(line 1227,col 91)",
        "(line 1229,col 9)-(line 1229,col 92)",
        "(line 1230,col 9)-(line 1230,col 90)",
        "(line 1232,col 9)-(line 1237,col 9)",
        "(line 1239,col 9)-(line 1239,col 77)",
        "(line 1240,col 9)-(line 1240,col 78)",
        "(line 1241,col 9)-(line 1241,col 79)",
        "(line 1242,col 9)-(line 1242,col 79)",
        "(line 1243,col 9)-(line 1243,col 80)",
        "(line 1244,col 9)-(line 1244,col 81)",
        "(line 1246,col 9)-(line 1251,col 9)",
        "(line 1254,col 9)-(line 1254,col 79)",
        "(line 1255,col 9)-(line 1255,col 59)",
        "(line 1256,col 9)-(line 1256,col 97)",
        "(line 1257,col 9)-(line 1257,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1260,
      "end_line": 1264,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 57)",
        "(line 1262,col 9)-(line 1262,col 57)",
        "(line 1263,col 9)-(line 1263,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1266,
      "end_line": 1272,
      "comment": "",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 27)",
        "(line 1268,col 9)-(line 1268,col 54)",
        "(line 1269,col 9)-(line 1269,col 54)",
        "(line 1270,col 9)-(line 1270,col 56)",
        "(line 1271,col 9)-(line 1271,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1274,
      "end_line": 1280,
      "comment": "",
      "child_ranges": [
        "(line 1275,col 9)-(line 1275,col 27)",
        "(line 1276,col 9)-(line 1276,col 56)",
        "(line 1277,col 9)-(line 1277,col 56)",
        "(line 1278,col 9)-(line 1278,col 58)",
        "(line 1279,col 9)-(line 1279,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1282,
      "end_line": 1286,
      "comment": "",
      "child_ranges": [
        "(line 1283,col 9)-(line 1283,col 43)",
        "(line 1284,col 9)-(line 1284,col 43)",
        "(line 1285,col 9)-(line 1285,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1288,
      "end_line": 1292,
      "comment": "",
      "child_ranges": [
        "(line 1289,col 9)-(line 1289,col 45)",
        "(line 1290,col 9)-(line 1290,col 45)",
        "(line 1291,col 9)-(line 1291,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1294,
      "end_line": 1298,
      "comment": "",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 59)",
        "(line 1296,col 9)-(line 1296,col 59)",
        "(line 1297,col 9)-(line 1297,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1300,
      "end_line": 1304,
      "comment": "",
      "child_ranges": [
        "(line 1301,col 9)-(line 1301,col 23)",
        "(line 1302,col 9)-(line 1302,col 35)",
        "(line 1303,col 9)-(line 1303,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1306,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1307,col 9)-(line 1307,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1310,
      "end_line": 1326,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 36)",
        "(line 1312,col 9)-(line 1312,col 39)",
        "(line 1313,col 9)-(line 1313,col 57)",
        "(line 1314,col 9)-(line 1314,col 68)",
        "(line 1315,col 9)-(line 1315,col 62)",
        "(line 1316,col 9)-(line 1320,col 9)",
        "(line 1321,col 9)-(line 1325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1328,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1329,col 9)-(line 1329,col 36)",
        "(line 1330,col 9)-(line 1335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1338,
      "end_line": 1351,
      "comment": "",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 34)",
        "(line 1340,col 9)-(line 1340,col 34)",
        "(line 1341,col 9)-(line 1341,col 57)",
        "(line 1342,col 9)-(line 1342,col 57)",
        "(line 1343,col 9)-(line 1343,col 58)",
        "(line 1344,col 9)-(line 1344,col 62)",
        "(line 1346,col 9)-(line 1346,col 64)",
        "(line 1347,col 9)-(line 1347,col 63)",
        "(line 1348,col 9)-(line 1348,col 44)",
        "(line 1349,col 9)-(line 1349,col 45)",
        "(line 1350,col 9)-(line 1350,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1353,
      "end_line": 1361,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 9)-(line 1359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1363,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1365,col 9)-(line 1365,col 55)",
        "(line 1366,col 9)-(line 1366,col 46)",
        "(line 1367,col 9)-(line 1372,col 9)",
        "(line 1374,col 9)-(line 1374,col 56)",
        "(line 1375,col 9)-(line 1375,col 47)",
        "(line 1376,col 9)-(line 1381,col 9)",
        "(line 1383,col 9)-(line 1383,col 57)",
        "(line 1384,col 9)-(line 1384,col 48)",
        "(line 1385,col 9)-(line 1390,col 9)",
        "(line 1392,col 9)-(line 1392,col 58)",
        "(line 1393,col 9)-(line 1393,col 49)",
        "(line 1394,col 9)-(line 1399,col 9)",
        "(line 1401,col 9)-(line 1401,col 55)",
        "(line 1402,col 9)-(line 1402,col 83)",
        "(line 1403,col 9)-(line 1403,col 66)",
        "(line 1404,col 9)-(line 1409,col 9)",
        "(line 1411,col 9)-(line 1411,col 84)",
        "(line 1412,col 9)-(line 1412,col 67)",
        "(line 1413,col 9)-(line 1418,col 9)",
        "(line 1420,col 9)-(line 1420,col 104)",
        "(line 1421,col 9)-(line 1421,col 80)",
        "(line 1422,col 9)-(line 1427,col 9)",
        "(line 1429,col 9)-(line 1432,col 76)",
        "(line 1433,col 9)-(line 1433,col 60)",
        "(line 1434,col 9)-(line 1434,col 61)",
        "(line 1435,col 9)-(line 1435,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1439,
      "end_line": 1443,
      "comment": "",
      "child_ranges": [
        "(line 1440,col 9)-(line 1440,col 36)",
        "(line 1441,col 9)-(line 1441,col 36)",
        "(line 1442,col 9)-(line 1442,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1445,
      "end_line": 1449,
      "comment": "",
      "child_ranges": [
        "(line 1446,col 9)-(line 1446,col 28)",
        "(line 1447,col 9)-(line 1447,col 28)",
        "(line 1448,col 9)-(line 1448,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1451,
      "end_line": 1455,
      "comment": "",
      "child_ranges": [
        "(line 1452,col 9)-(line 1452,col 36)",
        "(line 1453,col 9)-(line 1453,col 36)",
        "(line 1454,col 9)-(line 1454,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1457,
      "end_line": 1461,
      "comment": "",
      "child_ranges": [
        "(line 1458,col 9)-(line 1458,col 28)",
        "(line 1459,col 9)-(line 1459,col 28)",
        "(line 1460,col 9)-(line 1460,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1463,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1464,col 9)-(line 1464,col 36)",
        "(line 1465,col 9)-(line 1465,col 36)",
        "(line 1466,col 9)-(line 1466,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1469,
      "end_line": 1473,
      "comment": "",
      "child_ranges": [
        "(line 1470,col 9)-(line 1470,col 28)",
        "(line 1471,col 9)-(line 1471,col 28)",
        "(line 1472,col 9)-(line 1472,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1475,
      "end_line": 1513,
      "comment": "",
      "child_ranges": [
        "(line 1476,col 9)-(line 1477,col 72)",
        "(line 1478,col 9)-(line 1479,col 73)",
        "(line 1480,col 9)-(line 1481,col 72)",
        "(line 1482,col 9)-(line 1483,col 73)",
        "(line 1485,col 9)-(line 1491,col 9)",
        "(line 1492,col 9)-(line 1498,col 9)",
        "(line 1499,col 9)-(line 1505,col 9)",
        "(line 1506,col 9)-(line 1512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1515,
      "end_line": 1541,
      "comment": "",
      "child_ranges": [
        "(line 1516,col 9)-(line 1516,col 49)",
        "(line 1517,col 9)-(line 1517,col 49)",
        "(line 1518,col 9)-(line 1518,col 49)",
        "(line 1520,col 9)-(line 1520,col 42)",
        "(line 1522,col 9)-(line 1522,col 47)",
        "(line 1523,col 9)-(line 1523,col 47)",
        "(line 1524,col 9)-(line 1524,col 47)",
        "(line 1526,col 9)-(line 1526,col 45)",
        "(line 1527,col 9)-(line 1527,col 45)",
        "(line 1528,col 9)-(line 1528,col 45)",
        "(line 1530,col 9)-(line 1530,col 45)",
        "(line 1531,col 9)-(line 1531,col 45)",
        "(line 1532,col 9)-(line 1532,col 45)",
        "(line 1534,col 9)-(line 1534,col 46)",
        "(line 1535,col 9)-(line 1535,col 46)",
        "(line 1536,col 9)-(line 1536,col 46)",
        "(line 1538,col 9)-(line 1538,col 47)",
        "(line 1539,col 9)-(line 1539,col 47)",
        "(line 1540,col 9)-(line 1540,col 47)"
      ]
    }
  ]
}
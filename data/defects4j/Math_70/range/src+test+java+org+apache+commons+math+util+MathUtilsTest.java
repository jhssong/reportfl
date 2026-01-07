{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 33,
      "end_line": 1415,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 45,
      "end_line": 77,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 51,col 9)",
        "(line 52,col 9)-(line 52,col 25)",
        "(line 53,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 75)",
        "(line 76,col 9)-(line 76,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 82,
      "end_line": 88,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 24)",
        "(line 84,col 9)-(line 86,col 9)",
        "(line 87,col 9)-(line 87,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 91,
      "end_line": 95,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 71)",
        "(line 93,col 9)-(line 93,col 68)",
        "(line 94,col 9)-(line 94,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 97,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 36)",
        "(line 99,col 9)-(line 99,col 39)",
        "(line 100,col 9)-(line 100,col 57)",
        "(line 101,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 113,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 34)",
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 56)",
        "(line 121,col 9)-(line 121,col 56)",
        "(line 122,col 9)-(line 122,col 58)",
        "(line 123,col 9)-(line 123,col 63)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 45)",
        "(line 126,col 9)-(line 126,col 44)",
        "(line 127,col 9)-(line 127,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 130,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 136,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 139,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 140,col 9)-(line 146,col 16)",
        "(line 147,col 9)-(line 154,col 16)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 170,col 46)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 187,
      "end_line": 241,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 216,col 9)",
        "(line 218,col 9)-(line 218,col 63)",
        "(line 219,col 9)-(line 219,col 55)",
        "(line 220,col 9)-(line 220,col 45)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 223,col 52)",
        "(line 224,col 9)-(line 224,col 45)",
        "(line 227,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 234,col 22)",
        "(line 235,col 9)-(line 235,col 56)",
        "(line 236,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 237,col 45)",
        "(line 238,col 9)-(line 238,col 88)",
        "(line 239,col 9)-(line 239,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 243,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 263,col 9)",
        "(line 265,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 66)",
        "(line 297,col 9)-(line 298,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 301,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 302,col 7)-(line 302,col 65)",
        "(line 303,col 7)-(line 303,col 65)",
        "(line 304,col 7)-(line 304,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 307,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 23)",
        "(line 309,col 9)-(line 309,col 35)",
        "(line 310,col 9)-(line 310,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 317,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 323,col 17)",
        "(line 324,col 9)-(line 334,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 337,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 64)",
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 64)",
        "(line 341,col 9)-(line 341,col 66)",
        "(line 342,col 9)-(line 342,col 94)",
        "(line 343,col 9)-(line 343,col 94)",
        "(line 344,col 9)-(line 344,col 95)",
        "(line 345,col 9)-(line 345,col 65)",
        "(line 346,col 9)-(line 346,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 349,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 50)",
        "(line 352,col 9)-(line 352,col 65)",
        "(line 353,col 9)-(line 353,col 66)",
        "(line 354,col 9)-(line 354,col 65)",
        "(line 355,col 9)-(line 355,col 66)",
        "(line 357,col 9)-(line 357,col 67)",
        "(line 358,col 9)-(line 358,col 68)",
        "(line 359,col 9)-(line 359,col 67)",
        "(line 360,col 9)-(line 360,col 68)",
        "(line 362,col 9)-(line 362,col 92)",
        "(line 363,col 9)-(line 363,col 84)",
        "(line 365,col 9)-(line 365,col 92)",
        "(line 366,col 9)-(line 366,col 85)",
        "(line 369,col 9)-(line 369,col 64)",
        "(line 371,col 9)-(line 371,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 374,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 65)",
        "(line 376,col 9)-(line 376,col 65)",
        "(line 377,col 9)-(line 377,col 71)",
        "(line 379,col 9)-(line 379,col 74)",
        "(line 380,col 9)-(line 380,col 79)",
        "(line 381,col 9)-(line 387,col 40)",
        "(line 388,col 9)-(line 389,col 81)",
        "(line 390,col 9)-(line 391,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 395,
      "end_line": 405,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 400,col 9)",
        "(line 402,col 9)-(line 402,col 53)",
        "(line 403,col 9)-(line 403,col 69)",
        "(line 404,col 9)-(line 404,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 407,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 408,col 9)-(line 413,col 9)",
        "(line 414,col 9)-(line 419,col 9)",
        "(line 420,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 431,col 9)",
        "(line 432,col 9)-(line 432,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 435,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 19)",
        "(line 437,col 9)-(line 437,col 19)",
        "(line 438,col 9)-(line 438,col 19)",
        "(line 440,col 9)-(line 440,col 45)",
        "(line 442,col 9)-(line 442,col 45)",
        "(line 443,col 9)-(line 443,col 45)",
        "(line 444,col 9)-(line 444,col 46)",
        "(line 445,col 9)-(line 445,col 46)",
        "(line 447,col 9)-(line 447,col 46)",
        "(line 448,col 9)-(line 448,col 47)",
        "(line 449,col 9)-(line 449,col 47)",
        "(line 450,col 9)-(line 450,col 48)",
        "(line 452,col 9)-(line 452,col 45)",
        "(line 453,col 9)-(line 453,col 46)",
        "(line 454,col 9)-(line 454,col 46)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 457,col 9)-(line 457,col 75)",
        "(line 459,col 9)-(line 459,col 77)",
        "(line 460,col 9)-(line 460,col 78)",
        "(line 461,col 9)-(line 461,col 70)",
        "(line 462,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 485,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 20)",
        "(line 487,col 9)-(line 487,col 20)",
        "(line 488,col 9)-(line 488,col 20)",
        "(line 490,col 9)-(line 490,col 46)",
        "(line 492,col 9)-(line 492,col 45)",
        "(line 493,col 9)-(line 493,col 45)",
        "(line 494,col 9)-(line 494,col 46)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 497,col 9)-(line 497,col 46)",
        "(line 498,col 9)-(line 498,col 47)",
        "(line 499,col 9)-(line 499,col 47)",
        "(line 500,col 9)-(line 500,col 48)",
        "(line 502,col 9)-(line 502,col 45)",
        "(line 503,col 9)-(line 503,col 46)",
        "(line 504,col 9)-(line 504,col 46)",
        "(line 505,col 9)-(line 505,col 47)",
        "(line 507,col 9)-(line 507,col 81)",
        "(line 509,col 9)-(line 509,col 68)",
        "(line 511,col 9)-(line 511,col 72)",
        "(line 512,col 9)-(line 512,col 73)",
        "(line 513,col 9)-(line 513,col 65)",
        "(line 514,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 537,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 71)",
        "(line 539,col 9)-(line 539,col 61)",
        "(line 540,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 543,col 57)",
        "(line 544,col 9)-(line 557,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 560,
      "end_line": 582,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 570,col 31)",
        "(line 571,col 9)-(line 581,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 584,
      "end_line": 598,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 57)",
        "(line 586,col 9)-(line 593,col 40)",
        "(line 594,col 9)-(line 595,col 82)",
        "(line 596,col 9)-(line 597,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 603,
      "end_line": 627,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 43)",
        "(line 605,col 9)-(line 605,col 43)",
        "(line 606,col 9)-(line 606,col 53)",
        "(line 609,col 9)-(line 611,col 9)",
        "(line 614,col 9)-(line 614,col 34)",
        "(line 615,col 9)-(line 623,col 29)",
        "(line 626,col 9)-(line 626,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 629,
      "end_line": 633,
      "comment": "",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 60)",
        "(line 631,col 9)-(line 631,col 60)",
        "(line 632,col 9)-(line 632,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 635,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 27)",
        "(line 637,col 9)-(line 637,col 59)",
        "(line 638,col 9)-(line 638,col 59)",
        "(line 639,col 9)-(line 639,col 61)",
        "(line 640,col 9)-(line 640,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 643,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 27)",
        "(line 645,col 9)-(line 645,col 61)",
        "(line 646,col 9)-(line 646,col 61)",
        "(line 647,col 9)-(line 647,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 650,
      "end_line": 654,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 651,col 50)",
        "(line 652,col 9)-(line 652,col 50)",
        "(line 653,col 9)-(line 653,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 656,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 50)",
        "(line 658,col 9)-(line 658,col 50)",
        "(line 659,col 9)-(line 659,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 662,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 62)",
        "(line 664,col 9)-(line 664,col 62)",
        "(line 665,col 9)-(line 665,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 668,
      "end_line": 712,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 19)",
        "(line 670,col 9)-(line 670,col 19)",
        "(line 671,col 9)-(line 671,col 19)",
        "(line 673,col 9)-(line 673,col 45)",
        "(line 674,col 9)-(line 674,col 45)",
        "(line 675,col 9)-(line 675,col 45)",
        "(line 676,col 9)-(line 676,col 45)",
        "(line 677,col 9)-(line 677,col 47)",
        "(line 678,col 9)-(line 678,col 48)",
        "(line 679,col 9)-(line 679,col 48)",
        "(line 680,col 9)-(line 680,col 49)",
        "(line 681,col 9)-(line 681,col 48)",
        "(line 685,col 9)-(line 685,col 70)",
        "(line 688,col 9)-(line 688,col 45)",
        "(line 690,col 9)-(line 696,col 9)",
        "(line 698,col 9)-(line 704,col 9)",
        "(line 706,col 9)-(line 711,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 714,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 715,col 9)-(line 715,col 20)",
        "(line 716,col 9)-(line 716,col 20)",
        "(line 717,col 9)-(line 717,col 20)",
        "(line 719,col 9)-(line 719,col 45)",
        "(line 720,col 9)-(line 720,col 45)",
        "(line 721,col 9)-(line 721,col 45)",
        "(line 722,col 9)-(line 722,col 45)",
        "(line 723,col 9)-(line 723,col 47)",
        "(line 724,col 9)-(line 724,col 48)",
        "(line 725,col 9)-(line 725,col 48)",
        "(line 726,col 9)-(line 726,col 49)",
        "(line 727,col 9)-(line 727,col 48)",
        "(line 729,col 9)-(line 729,col 78)",
        "(line 733,col 9)-(line 733,col 73)",
        "(line 736,col 9)-(line 736,col 48)",
        "(line 738,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 755,col 75)",
        "(line 756,col 9)-(line 761,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 764,
      "end_line": 772,
      "comment": "",
      "child_ranges": [
        "(line 765,col 9)-(line 765,col 50)",
        "(line 766,col 9)-(line 766,col 50)",
        "(line 767,col 9)-(line 767,col 55)",
        "(line 768,col 9)-(line 768,col 55)",
        "(line 769,col 9)-(line 769,col 54)",
        "(line 770,col 9)-(line 770,col 49)",
        "(line 771,col 9)-(line 771,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 774,
      "end_line": 788,
      "comment": "",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 36)",
        "(line 776,col 9)-(line 776,col 39)",
        "(line 777,col 9)-(line 777,col 57)",
        "(line 778,col 9)-(line 782,col 9)",
        "(line 783,col 9)-(line 787,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 790,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 791,col 9)-(line 791,col 34)",
        "(line 792,col 9)-(line 792,col 34)",
        "(line 793,col 9)-(line 793,col 58)",
        "(line 794,col 9)-(line 794,col 58)",
        "(line 795,col 9)-(line 795,col 57)",
        "(line 796,col 9)-(line 796,col 57)",
        "(line 797,col 9)-(line 797,col 58)",
        "(line 798,col 9)-(line 798,col 58)",
        "(line 799,col 9)-(line 799,col 57)",
        "(line 800,col 9)-(line 800,col 57)",
        "(line 801,col 9)-(line 801,col 58)",
        "(line 802,col 9)-(line 802,col 61)",
        "(line 803,col 9)-(line 803,col 44)",
        "(line 804,col 9)-(line 804,col 44)",
        "(line 805,col 9)-(line 805,col 44)",
        "(line 806,col 9)-(line 806,col 44)",
        "(line 807,col 9)-(line 807,col 45)",
        "(line 808,col 9)-(line 808,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 811,
      "end_line": 818,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 817,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 820,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 822,col 9)-(line 822,col 92)",
        "(line 825,col 9)-(line 825,col 108)",
        "(line 828,col 9)-(line 828,col 106)",
        "(line 831,col 9)-(line 831,col 108)",
        "(line 834,col 9)-(line 834,col 90)",
        "(line 837,col 9)-(line 837,col 92)",
        "(line 840,col 9)-(line 840,col 90)",
        "(line 843,col 9)-(line 843,col 92)",
        "(line 846,col 9)-(line 846,col 114)",
        "(line 849,col 9)-(line 849,col 115)",
        "(line 852,col 9)-(line 852,col 116)",
        "(line 855,col 9)-(line 855,col 116)",
        "(line 858,col 9)-(line 858,col 117)",
        "(line 861,col 9)-(line 861,col 117)",
        "(line 864,col 9)-(line 864,col 117)",
        "(line 867,col 9)-(line 867,col 118)",
        "(line 870,col 9)-(line 870,col 118)",
        "(line 873,col 9)-(line 873,col 117)",
        "(line 876,col 9)-(line 876,col 118)",
        "(line 879,col 9)-(line 879,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 883,
      "end_line": 893,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 88)",
        "(line 885,col 9)-(line 885,col 88)",
        "(line 886,col 9)-(line 886,col 69)",
        "(line 887,col 9)-(line 887,col 103)",
        "(line 888,col 9)-(line 888,col 104)",
        "(line 889,col 9)-(line 889,col 69)",
        "(line 890,col 9)-(line 890,col 71)",
        "(line 891,col 9)-(line 891,col 70)",
        "(line 892,col 9)-(line 892,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 895,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 896,col 9)-(line 896,col 61)",
        "(line 897,col 9)-(line 897,col 61)",
        "(line 898,col 9)-(line 898,col 69)",
        "(line 899,col 9)-(line 899,col 68)",
        "(line 900,col 9)-(line 900,col 84)",
        "(line 901,col 9)-(line 901,col 84)",
        "(line 902,col 9)-(line 902,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 905,
      "end_line": 915,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 914,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 917,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 54)",
        "(line 919,col 9)-(line 922,col 34)",
        "(line 924,col 9)-(line 924,col 56)",
        "(line 925,col 9)-(line 928,col 34)",
        "(line 931,col 9)-(line 931,col 80)",
        "(line 932,col 9)-(line 935,col 34)",
        "(line 938,col 9)-(line 938,col 48)",
        "(line 939,col 9)-(line 942,col 43)",
        "(line 945,col 9)-(line 945,col 75)",
        "(line 946,col 9)-(line 949,col 43)",
        "(line 952,col 9)-(line 955,col 48)",
        "(line 958,col 9)-(line 961,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 965,
      "end_line": 1071,
      "comment": "",
      "child_ranges": [
        "(line 966,col 9)-(line 966,col 31)",
        "(line 967,col 9)-(line 967,col 55)",
        "(line 968,col 9)-(line 968,col 56)",
        "(line 969,col 9)-(line 969,col 57)",
        "(line 972,col 9)-(line 972,col 61)",
        "(line 973,col 9)-(line 973,col 84)",
        "(line 974,col 9)-(line 974,col 25)",
        "(line 975,col 9)-(line 975,col 31)",
        "(line 976,col 9)-(line 976,col 57)",
        "(line 979,col 9)-(line 979,col 63)",
        "(line 980,col 9)-(line 980,col 63)",
        "(line 981,col 9)-(line 981,col 63)",
        "(line 982,col 9)-(line 982,col 63)",
        "(line 983,col 9)-(line 983,col 64)",
        "(line 984,col 9)-(line 984,col 64)",
        "(line 985,col 9)-(line 985,col 64)",
        "(line 986,col 9)-(line 986,col 64)",
        "(line 987,col 9)-(line 987,col 64)",
        "(line 989,col 9)-(line 989,col 81)",
        "(line 990,col 9)-(line 990,col 82)",
        "(line 991,col 9)-(line 991,col 83)",
        "(line 992,col 9)-(line 992,col 83)",
        "(line 993,col 9)-(line 993,col 84)",
        "(line 994,col 9)-(line 994,col 85)",
        "(line 996,col 9)-(line 996,col 78)",
        "(line 997,col 9)-(line 997,col 79)",
        "(line 998,col 9)-(line 998,col 80)",
        "(line 999,col 9)-(line 999,col 80)",
        "(line 1000,col 9)-(line 1000,col 81)",
        "(line 1001,col 9)-(line 1001,col 82)",
        "(line 1003,col 9)-(line 1003,col 79)",
        "(line 1004,col 9)-(line 1004,col 80)",
        "(line 1005,col 9)-(line 1005,col 81)",
        "(line 1006,col 9)-(line 1006,col 81)",
        "(line 1007,col 9)-(line 1007,col 82)",
        "(line 1008,col 9)-(line 1008,col 83)",
        "(line 1010,col 9)-(line 1010,col 83)",
        "(line 1011,col 9)-(line 1011,col 84)",
        "(line 1012,col 9)-(line 1012,col 85)",
        "(line 1013,col 9)-(line 1013,col 85)",
        "(line 1014,col 9)-(line 1014,col 86)",
        "(line 1015,col 9)-(line 1015,col 87)",
        "(line 1016,col 9)-(line 1016,col 89)",
        "(line 1017,col 9)-(line 1017,col 91)",
        "(line 1019,col 9)-(line 1019,col 83)",
        "(line 1020,col 9)-(line 1020,col 84)",
        "(line 1021,col 9)-(line 1021,col 85)",
        "(line 1022,col 9)-(line 1022,col 85)",
        "(line 1023,col 9)-(line 1023,col 86)",
        "(line 1024,col 9)-(line 1024,col 87)",
        "(line 1025,col 9)-(line 1025,col 89)",
        "(line 1026,col 9)-(line 1026,col 91)",
        "(line 1027,col 9)-(line 1027,col 89)",
        "(line 1028,col 9)-(line 1028,col 91)",
        "(line 1030,col 9)-(line 1030,col 81)",
        "(line 1031,col 9)-(line 1031,col 82)",
        "(line 1032,col 9)-(line 1032,col 83)",
        "(line 1033,col 9)-(line 1033,col 83)",
        "(line 1034,col 9)-(line 1034,col 84)",
        "(line 1035,col 9)-(line 1035,col 85)",
        "(line 1036,col 9)-(line 1036,col 87)",
        "(line 1037,col 9)-(line 1037,col 89)",
        "(line 1039,col 9)-(line 1039,col 90)",
        "(line 1040,col 9)-(line 1040,col 88)",
        "(line 1042,col 9)-(line 1047,col 9)",
        "(line 1049,col 9)-(line 1049,col 76)",
        "(line 1050,col 9)-(line 1050,col 77)",
        "(line 1051,col 9)-(line 1051,col 78)",
        "(line 1052,col 9)-(line 1052,col 78)",
        "(line 1053,col 9)-(line 1053,col 79)",
        "(line 1054,col 9)-(line 1054,col 80)",
        "(line 1056,col 9)-(line 1061,col 9)",
        "(line 1064,col 9)-(line 1064,col 87)",
        "(line 1067,col 9)-(line 1067,col 80)",
        "(line 1068,col 9)-(line 1068,col 56)",
        "(line 1069,col 9)-(line 1069,col 98)",
        "(line 1070,col 9)-(line 1070,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1073,
      "end_line": 1167,
      "comment": "",
      "child_ranges": [
        "(line 1074,col 9)-(line 1074,col 31)",
        "(line 1075,col 9)-(line 1075,col 56)",
        "(line 1076,col 9)-(line 1076,col 57)",
        "(line 1077,col 9)-(line 1077,col 58)",
        "(line 1080,col 9)-(line 1080,col 63)",
        "(line 1081,col 9)-(line 1081,col 63)",
        "(line 1082,col 9)-(line 1082,col 64)",
        "(line 1083,col 9)-(line 1083,col 64)",
        "(line 1084,col 9)-(line 1084,col 64)",
        "(line 1085,col 9)-(line 1085,col 64)",
        "(line 1086,col 9)-(line 1086,col 64)",
        "(line 1088,col 9)-(line 1088,col 82)",
        "(line 1089,col 9)-(line 1089,col 83)",
        "(line 1090,col 9)-(line 1090,col 84)",
        "(line 1091,col 9)-(line 1091,col 84)",
        "(line 1092,col 9)-(line 1092,col 85)",
        "(line 1093,col 9)-(line 1093,col 86)",
        "(line 1095,col 9)-(line 1095,col 79)",
        "(line 1096,col 9)-(line 1096,col 80)",
        "(line 1097,col 9)-(line 1097,col 81)",
        "(line 1098,col 9)-(line 1098,col 81)",
        "(line 1099,col 9)-(line 1099,col 82)",
        "(line 1100,col 9)-(line 1100,col 83)",
        "(line 1102,col 9)-(line 1102,col 80)",
        "(line 1103,col 9)-(line 1103,col 81)",
        "(line 1104,col 9)-(line 1104,col 82)",
        "(line 1105,col 9)-(line 1105,col 82)",
        "(line 1106,col 9)-(line 1106,col 83)",
        "(line 1107,col 9)-(line 1107,col 84)",
        "(line 1109,col 9)-(line 1109,col 84)",
        "(line 1110,col 9)-(line 1110,col 85)",
        "(line 1111,col 9)-(line 1111,col 86)",
        "(line 1112,col 9)-(line 1112,col 86)",
        "(line 1113,col 9)-(line 1113,col 87)",
        "(line 1114,col 9)-(line 1114,col 88)",
        "(line 1115,col 9)-(line 1115,col 91)",
        "(line 1116,col 9)-(line 1116,col 93)",
        "(line 1118,col 9)-(line 1118,col 84)",
        "(line 1119,col 9)-(line 1119,col 85)",
        "(line 1120,col 9)-(line 1120,col 86)",
        "(line 1121,col 9)-(line 1121,col 86)",
        "(line 1122,col 9)-(line 1122,col 87)",
        "(line 1123,col 9)-(line 1123,col 88)",
        "(line 1124,col 9)-(line 1124,col 91)",
        "(line 1125,col 9)-(line 1125,col 93)",
        "(line 1126,col 9)-(line 1126,col 91)",
        "(line 1127,col 9)-(line 1127,col 93)",
        "(line 1129,col 9)-(line 1129,col 82)",
        "(line 1130,col 9)-(line 1130,col 83)",
        "(line 1131,col 9)-(line 1131,col 84)",
        "(line 1132,col 9)-(line 1132,col 84)",
        "(line 1133,col 9)-(line 1133,col 85)",
        "(line 1134,col 9)-(line 1134,col 86)",
        "(line 1135,col 9)-(line 1135,col 89)",
        "(line 1136,col 9)-(line 1136,col 91)",
        "(line 1138,col 9)-(line 1138,col 92)",
        "(line 1139,col 9)-(line 1139,col 90)",
        "(line 1141,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1148,col 77)",
        "(line 1149,col 9)-(line 1149,col 78)",
        "(line 1150,col 9)-(line 1150,col 79)",
        "(line 1151,col 9)-(line 1151,col 79)",
        "(line 1152,col 9)-(line 1152,col 80)",
        "(line 1153,col 9)-(line 1153,col 81)",
        "(line 1155,col 9)-(line 1160,col 9)",
        "(line 1163,col 9)-(line 1163,col 79)",
        "(line 1164,col 9)-(line 1164,col 59)",
        "(line 1165,col 9)-(line 1165,col 97)",
        "(line 1166,col 9)-(line 1166,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1169,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1170,col 9)-(line 1170,col 57)",
        "(line 1171,col 9)-(line 1171,col 57)",
        "(line 1172,col 9)-(line 1172,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1175,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1176,col 9)-(line 1176,col 27)",
        "(line 1177,col 9)-(line 1177,col 54)",
        "(line 1178,col 9)-(line 1178,col 54)",
        "(line 1179,col 9)-(line 1179,col 56)",
        "(line 1180,col 9)-(line 1180,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1183,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 27)",
        "(line 1185,col 9)-(line 1185,col 56)",
        "(line 1186,col 9)-(line 1186,col 56)",
        "(line 1187,col 9)-(line 1187,col 58)",
        "(line 1188,col 9)-(line 1188,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1191,
      "end_line": 1195,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 43)",
        "(line 1193,col 9)-(line 1193,col 43)",
        "(line 1194,col 9)-(line 1194,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1197,
      "end_line": 1201,
      "comment": "",
      "child_ranges": [
        "(line 1198,col 9)-(line 1198,col 45)",
        "(line 1199,col 9)-(line 1199,col 45)",
        "(line 1200,col 9)-(line 1200,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1203,
      "end_line": 1207,
      "comment": "",
      "child_ranges": [
        "(line 1204,col 9)-(line 1204,col 59)",
        "(line 1205,col 9)-(line 1205,col 59)",
        "(line 1206,col 9)-(line 1206,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1209,
      "end_line": 1213,
      "comment": "",
      "child_ranges": [
        "(line 1210,col 9)-(line 1210,col 23)",
        "(line 1211,col 9)-(line 1211,col 35)",
        "(line 1212,col 9)-(line 1212,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1215,
      "end_line": 1217,
      "comment": "",
      "child_ranges": [
        "(line 1216,col 9)-(line 1216,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1219,
      "end_line": 1235,
      "comment": "",
      "child_ranges": [
        "(line 1220,col 9)-(line 1220,col 36)",
        "(line 1221,col 9)-(line 1221,col 39)",
        "(line 1222,col 9)-(line 1222,col 57)",
        "(line 1223,col 9)-(line 1223,col 68)",
        "(line 1224,col 9)-(line 1224,col 62)",
        "(line 1225,col 9)-(line 1229,col 9)",
        "(line 1230,col 9)-(line 1234,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1237,
      "end_line": 1245,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 36)",
        "(line 1239,col 9)-(line 1244,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1247,
      "end_line": 1260,
      "comment": "",
      "child_ranges": [
        "(line 1248,col 9)-(line 1248,col 34)",
        "(line 1249,col 9)-(line 1249,col 34)",
        "(line 1250,col 9)-(line 1250,col 57)",
        "(line 1251,col 9)-(line 1251,col 57)",
        "(line 1252,col 9)-(line 1252,col 58)",
        "(line 1253,col 9)-(line 1253,col 62)",
        "(line 1255,col 9)-(line 1255,col 64)",
        "(line 1256,col 9)-(line 1256,col 63)",
        "(line 1257,col 9)-(line 1257,col 44)",
        "(line 1258,col 9)-(line 1258,col 45)",
        "(line 1259,col 9)-(line 1259,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1262,
      "end_line": 1270,
      "comment": "",
      "child_ranges": [
        "(line 1263,col 9)-(line 1268,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1272,
      "end_line": 1346,
      "comment": "",
      "child_ranges": [
        "(line 1274,col 9)-(line 1274,col 55)",
        "(line 1275,col 9)-(line 1275,col 46)",
        "(line 1276,col 9)-(line 1281,col 9)",
        "(line 1283,col 9)-(line 1283,col 56)",
        "(line 1284,col 9)-(line 1284,col 47)",
        "(line 1285,col 9)-(line 1290,col 9)",
        "(line 1292,col 9)-(line 1292,col 57)",
        "(line 1293,col 9)-(line 1293,col 48)",
        "(line 1294,col 9)-(line 1299,col 9)",
        "(line 1301,col 9)-(line 1301,col 58)",
        "(line 1302,col 9)-(line 1302,col 49)",
        "(line 1303,col 9)-(line 1308,col 9)",
        "(line 1310,col 9)-(line 1310,col 55)",
        "(line 1311,col 9)-(line 1311,col 83)",
        "(line 1312,col 9)-(line 1312,col 66)",
        "(line 1313,col 9)-(line 1318,col 9)",
        "(line 1320,col 9)-(line 1320,col 84)",
        "(line 1321,col 9)-(line 1321,col 67)",
        "(line 1322,col 9)-(line 1327,col 9)",
        "(line 1329,col 9)-(line 1329,col 104)",
        "(line 1330,col 9)-(line 1330,col 80)",
        "(line 1331,col 9)-(line 1336,col 9)",
        "(line 1338,col 9)-(line 1341,col 76)",
        "(line 1342,col 9)-(line 1342,col 60)",
        "(line 1343,col 9)-(line 1343,col 61)",
        "(line 1344,col 9)-(line 1344,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1348,
      "end_line": 1352,
      "comment": "",
      "child_ranges": [
        "(line 1349,col 9)-(line 1349,col 36)",
        "(line 1350,col 9)-(line 1350,col 36)",
        "(line 1351,col 9)-(line 1351,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1354,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1355,col 9)-(line 1355,col 28)",
        "(line 1356,col 9)-(line 1356,col 28)",
        "(line 1357,col 9)-(line 1357,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1360,
      "end_line": 1364,
      "comment": "",
      "child_ranges": [
        "(line 1361,col 9)-(line 1361,col 36)",
        "(line 1362,col 9)-(line 1362,col 36)",
        "(line 1363,col 9)-(line 1363,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1366,
      "end_line": 1370,
      "comment": "",
      "child_ranges": [
        "(line 1367,col 9)-(line 1367,col 28)",
        "(line 1368,col 9)-(line 1368,col 28)",
        "(line 1369,col 9)-(line 1369,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1372,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1373,col 9)-(line 1373,col 36)",
        "(line 1374,col 9)-(line 1374,col 36)",
        "(line 1375,col 9)-(line 1375,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1378,
      "end_line": 1382,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 28)",
        "(line 1380,col 9)-(line 1380,col 28)",
        "(line 1381,col 9)-(line 1381,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1384,
      "end_line": 1414,
      "comment": "",
      "child_ranges": [
        "(line 1385,col 9)-(line 1385,col 75)",
        "(line 1386,col 9)-(line 1386,col 75)",
        "(line 1387,col 9)-(line 1387,col 75)",
        "(line 1388,col 9)-(line 1388,col 82)",
        "(line 1390,col 9)-(line 1395,col 9)",
        "(line 1396,col 9)-(line 1401,col 9)",
        "(line 1402,col 9)-(line 1407,col 9)",
        "(line 1408,col 9)-(line 1413,col 9)"
      ]
    }
  ]
}
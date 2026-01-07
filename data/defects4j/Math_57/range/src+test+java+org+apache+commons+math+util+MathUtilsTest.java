{
  "filepath": "/tmp/Math-57b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 40,
      "end_line": 1663,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 20)"
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
      "end_line": 83,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 77,col 9)",
        "(line 78,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 75)",
        "(line 82,col 9)-(line 82,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 88,
      "end_line": 94,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 24)",
        "(line 90,col 9)-(line 92,col 9)",
        "(line 93,col 9)-(line 93,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 97,
      "end_line": 101,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 71)",
        "(line 99,col 9)-(line 99,col 68)",
        "(line 100,col 9)-(line 100,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 103,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 36)",
        "(line 105,col 9)-(line 105,col 39)",
        "(line 106,col 9)-(line 106,col 57)",
        "(line 107,col 9)-(line 111,col 9)",
        "(line 112,col 9)-(line 116,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 119,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 34)",
        "(line 122,col 9)-(line 122,col 58)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 127,col 56)",
        "(line 128,col 9)-(line 128,col 58)",
        "(line 129,col 9)-(line 129,col 63)",
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
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 146,col 9)-(line 152,col 16)",
        "(line 153,col 9)-(line 160,col 16)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 174,col 9)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 46)",
        "(line 178,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 193,
      "end_line": 247,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 63)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 45)",
        "(line 228,col 9)-(line 228,col 60)",
        "(line 229,col 9)-(line 229,col 52)",
        "(line 230,col 9)-(line 230,col 45)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 22)",
        "(line 241,col 9)-(line 241,col 56)",
        "(line 242,col 9)-(line 242,col 48)",
        "(line 243,col 9)-(line 243,col 45)",
        "(line 244,col 9)-(line 244,col 88)",
        "(line 245,col 9)-(line 245,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 249,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 288,col 9)",
        "(line 290,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 301,col 9)",
        "(line 302,col 9)-(line 302,col 66)",
        "(line 303,col 9)-(line 304,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 307,
      "end_line": 311,
      "comment": "",
      "child_ranges": [
        "(line 308,col 7)-(line 308,col 65)",
        "(line 309,col 7)-(line 309,col 65)",
        "(line 310,col 7)-(line 310,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 313,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 23)",
        "(line 315,col 9)-(line 315,col 35)",
        "(line 316,col 9)-(line 316,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 323,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 329,col 17)",
        "(line 330,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 343,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 64)",
        "(line 345,col 9)-(line 345,col 64)",
        "(line 346,col 9)-(line 346,col 64)",
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 65)",
        "(line 349,col 9)-(line 349,col 67)",
        "(line 350,col 9)-(line 350,col 94)",
        "(line 351,col 9)-(line 351,col 94)",
        "(line 352,col 9)-(line 352,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 355,
      "end_line": 371,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 47)",
        "(line 357,col 9)-(line 357,col 44)",
        "(line 359,col 9)-(line 359,col 42)",
        "(line 363,col 9)-(line 363,col 55)",
        "(line 365,col 9)-(line 365,col 44)",
        "(line 366,col 9)-(line 366,col 35)",
        "(line 369,col 9)-(line 369,col 49)",
        "(line 370,col 9)-(line 370,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 373,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 76)",
        "(line 375,col 9)-(line 375,col 76)",
        "(line 376,col 9)-(line 376,col 76)",
        "(line 377,col 9)-(line 377,col 78)",
        "(line 378,col 9)-(line 378,col 106)",
        "(line 379,col 9)-(line 379,col 106)",
        "(line 380,col 9)-(line 380,col 107)",
        "(line 381,col 9)-(line 381,col 77)",
        "(line 382,col 9)-(line 382,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 386,
      "end_line": 416,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 67)",
        "(line 388,col 9)-(line 388,col 78)",
        "(line 389,col 9)-(line 389,col 30)",
        "(line 390,col 9)-(line 390,col 128)",
        "(line 391,col 9)-(line 391,col 139)",
        "(line 392,col 9)-(line 392,col 140)",
        "(line 394,col 9)-(line 394,col 56)",
        "(line 407,col 9)-(line 407,col 90)",
        "(line 408,col 9)-(line 408,col 83)",
        "(line 410,col 9)-(line 410,col 90)",
        "(line 411,col 9)-(line 411,col 83)",
        "(line 413,col 9)-(line 413,col 63)",
        "(line 415,col 9)-(line 415,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 418,
      "end_line": 454,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 51)",
        "(line 421,col 9)-(line 421,col 67)",
        "(line 422,col 9)-(line 422,col 72)",
        "(line 424,col 9)-(line 424,col 77)",
        "(line 425,col 9)-(line 425,col 80)",
        "(line 426,col 9)-(line 426,col 51)",
        "(line 427,col 9)-(line 427,col 53)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 430,col 9)-(line 430,col 63)",
        "(line 431,col 9)-(line 431,col 64)",
        "(line 433,col 9)-(line 433,col 54)",
        "(line 435,col 9)-(line 435,col 67)",
        "(line 436,col 9)-(line 436,col 68)",
        "(line 437,col 9)-(line 437,col 67)",
        "(line 438,col 9)-(line 438,col 66)",
        "(line 440,col 9)-(line 440,col 69)",
        "(line 441,col 9)-(line 441,col 70)",
        "(line 442,col 9)-(line 442,col 69)",
        "(line 443,col 9)-(line 443,col 70)",
        "(line 445,col 9)-(line 445,col 92)",
        "(line 446,col 9)-(line 446,col 84)",
        "(line 448,col 9)-(line 448,col 92)",
        "(line 449,col 9)-(line 449,col 85)",
        "(line 451,col 9)-(line 451,col 65)",
        "(line 453,col 9)-(line 453,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 456,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 63)",
        "(line 459,col 9)-(line 459,col 79)",
        "(line 460,col 9)-(line 460,col 84)",
        "(line 462,col 9)-(line 462,col 77)",
        "(line 463,col 9)-(line 463,col 80)",
        "(line 464,col 9)-(line 464,col 63)",
        "(line 465,col 9)-(line 465,col 65)",
        "(line 466,col 9)-(line 466,col 65)",
        "(line 468,col 9)-(line 468,col 75)",
        "(line 469,col 9)-(line 469,col 76)",
        "(line 471,col 9)-(line 471,col 66)",
        "(line 473,col 9)-(line 473,col 79)",
        "(line 474,col 9)-(line 474,col 80)",
        "(line 475,col 9)-(line 475,col 79)",
        "(line 476,col 9)-(line 476,col 78)",
        "(line 478,col 9)-(line 478,col 81)",
        "(line 479,col 9)-(line 479,col 82)",
        "(line 480,col 9)-(line 480,col 81)",
        "(line 481,col 9)-(line 481,col 82)",
        "(line 483,col 9)-(line 483,col 104)",
        "(line 484,col 9)-(line 484,col 96)",
        "(line 486,col 9)-(line 486,col 104)",
        "(line 487,col 9)-(line 487,col 97)",
        "(line 489,col 9)-(line 489,col 76)",
        "(line 491,col 9)-(line 491,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 494,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 65)",
        "(line 496,col 9)-(line 496,col 65)",
        "(line 497,col 9)-(line 497,col 71)",
        "(line 499,col 9)-(line 499,col 74)",
        "(line 500,col 9)-(line 500,col 79)",
        "(line 501,col 9)-(line 507,col 40)",
        "(line 508,col 9)-(line 509,col 67)",
        "(line 510,col 9)-(line 511,col 81)",
        "(line 512,col 9)-(line 513,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 517,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 77)",
        "(line 519,col 9)-(line 519,col 77)",
        "(line 520,col 9)-(line 520,col 83)",
        "(line 522,col 9)-(line 522,col 86)",
        "(line 523,col 9)-(line 523,col 91)",
        "(line 524,col 9)-(line 530,col 20)",
        "(line 531,col 9)-(line 532,col 93)",
        "(line 533,col 9)-(line 534,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 537,
      "end_line": 547,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 542,col 9)",
        "(line 544,col 9)-(line 544,col 53)",
        "(line 545,col 9)-(line 545,col 69)",
        "(line 546,col 9)-(line 546,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 549,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 550,col 9)-(line 555,col 9)",
        "(line 556,col 9)-(line 561,col 9)",
        "(line 562,col 9)-(line 567,col 9)",
        "(line 568,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 577,
      "end_line": 625,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 19)",
        "(line 579,col 9)-(line 579,col 19)",
        "(line 580,col 9)-(line 580,col 19)",
        "(line 582,col 9)-(line 582,col 45)",
        "(line 584,col 9)-(line 584,col 45)",
        "(line 585,col 9)-(line 585,col 45)",
        "(line 586,col 9)-(line 586,col 46)",
        "(line 587,col 9)-(line 587,col 46)",
        "(line 589,col 9)-(line 589,col 46)",
        "(line 590,col 9)-(line 590,col 47)",
        "(line 591,col 9)-(line 591,col 47)",
        "(line 592,col 9)-(line 592,col 48)",
        "(line 594,col 9)-(line 594,col 45)",
        "(line 595,col 9)-(line 595,col 46)",
        "(line 596,col 9)-(line 596,col 46)",
        "(line 597,col 9)-(line 597,col 47)",
        "(line 599,col 9)-(line 599,col 75)",
        "(line 601,col 9)-(line 601,col 77)",
        "(line 602,col 9)-(line 602,col 78)",
        "(line 603,col 9)-(line 603,col 70)",
        "(line 604,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 617,col 9)",
        "(line 618,col 9)-(line 624,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 627,
      "end_line": 677,
      "comment": "",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 20)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 630,col 9)-(line 630,col 20)",
        "(line 632,col 9)-(line 632,col 46)",
        "(line 634,col 9)-(line 634,col 45)",
        "(line 635,col 9)-(line 635,col 45)",
        "(line 636,col 9)-(line 636,col 46)",
        "(line 637,col 9)-(line 637,col 46)",
        "(line 639,col 9)-(line 639,col 46)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 47)",
        "(line 642,col 9)-(line 642,col 48)",
        "(line 644,col 9)-(line 644,col 45)",
        "(line 645,col 9)-(line 645,col 46)",
        "(line 646,col 9)-(line 646,col 46)",
        "(line 647,col 9)-(line 647,col 47)",
        "(line 649,col 9)-(line 649,col 81)",
        "(line 651,col 9)-(line 651,col 68)",
        "(line 653,col 9)-(line 653,col 72)",
        "(line 654,col 9)-(line 654,col 73)",
        "(line 655,col 9)-(line 655,col 65)",
        "(line 656,col 9)-(line 662,col 9)",
        "(line 663,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 676,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 679,
      "end_line": 700,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 71)",
        "(line 681,col 9)-(line 681,col 61)",
        "(line 682,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 685,col 57)",
        "(line 686,col 9)-(line 699,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 702,
      "end_line": 724,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 712,col 31)",
        "(line 713,col 9)-(line 723,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 726,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 727,col 9)-(line 727,col 57)",
        "(line 728,col 9)-(line 735,col 40)",
        "(line 736,col 9)-(line 737,col 81)",
        "(line 738,col 9)-(line 739,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 745,
      "end_line": 769,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 746,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 747,col 43)",
        "(line 748,col 9)-(line 748,col 53)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 756,col 9)-(line 756,col 34)",
        "(line 757,col 9)-(line 765,col 29)",
        "(line 768,col 9)-(line 768,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 771,
      "end_line": 775,
      "comment": "",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 60)",
        "(line 773,col 9)-(line 773,col 60)",
        "(line 774,col 9)-(line 774,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 777,
      "end_line": 783,
      "comment": "",
      "child_ranges": [
        "(line 778,col 9)-(line 778,col 27)",
        "(line 779,col 9)-(line 779,col 59)",
        "(line 780,col 9)-(line 780,col 59)",
        "(line 781,col 9)-(line 781,col 61)",
        "(line 782,col 9)-(line 782,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 785,
      "end_line": 790,
      "comment": "",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 27)",
        "(line 787,col 9)-(line 787,col 61)",
        "(line 788,col 9)-(line 788,col 61)",
        "(line 789,col 9)-(line 789,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 792,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 793,col 9)-(line 793,col 50)",
        "(line 794,col 9)-(line 794,col 50)",
        "(line 795,col 9)-(line 795,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 798,
      "end_line": 802,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 800,col 50)",
        "(line 801,col 9)-(line 801,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 804,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 805,col 9)-(line 805,col 62)",
        "(line 806,col 9)-(line 806,col 62)",
        "(line 807,col 9)-(line 807,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 810,
      "end_line": 854,
      "comment": "",
      "child_ranges": [
        "(line 811,col 9)-(line 811,col 19)",
        "(line 812,col 9)-(line 812,col 19)",
        "(line 813,col 9)-(line 813,col 19)",
        "(line 815,col 9)-(line 815,col 45)",
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 45)",
        "(line 819,col 9)-(line 819,col 47)",
        "(line 820,col 9)-(line 820,col 48)",
        "(line 821,col 9)-(line 821,col 48)",
        "(line 822,col 9)-(line 822,col 49)",
        "(line 823,col 9)-(line 823,col 48)",
        "(line 827,col 9)-(line 827,col 70)",
        "(line 830,col 9)-(line 830,col 45)",
        "(line 832,col 9)-(line 838,col 9)",
        "(line 840,col 9)-(line 846,col 9)",
        "(line 848,col 9)-(line 853,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 856,
      "end_line": 904,
      "comment": "",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 20)",
        "(line 858,col 9)-(line 858,col 20)",
        "(line 859,col 9)-(line 859,col 20)",
        "(line 861,col 9)-(line 861,col 45)",
        "(line 862,col 9)-(line 862,col 45)",
        "(line 863,col 9)-(line 863,col 45)",
        "(line 864,col 9)-(line 864,col 45)",
        "(line 865,col 9)-(line 865,col 47)",
        "(line 866,col 9)-(line 866,col 48)",
        "(line 867,col 9)-(line 867,col 48)",
        "(line 868,col 9)-(line 868,col 49)",
        "(line 869,col 9)-(line 869,col 48)",
        "(line 871,col 9)-(line 871,col 78)",
        "(line 875,col 9)-(line 875,col 73)",
        "(line 878,col 9)-(line 878,col 48)",
        "(line 880,col 9)-(line 886,col 9)",
        "(line 888,col 9)-(line 894,col 9)",
        "(line 896,col 9)-(line 897,col 75)",
        "(line 898,col 9)-(line 903,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 906,
      "end_line": 914,
      "comment": "",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 50)",
        "(line 908,col 9)-(line 908,col 50)",
        "(line 909,col 9)-(line 909,col 55)",
        "(line 910,col 9)-(line 910,col 55)",
        "(line 911,col 9)-(line 911,col 54)",
        "(line 912,col 9)-(line 912,col 49)",
        "(line 913,col 9)-(line 913,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 916,
      "end_line": 930,
      "comment": "",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 36)",
        "(line 918,col 9)-(line 918,col 39)",
        "(line 919,col 9)-(line 919,col 57)",
        "(line 920,col 9)-(line 924,col 9)",
        "(line 925,col 9)-(line 929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 932,
      "end_line": 951,
      "comment": "",
      "child_ranges": [
        "(line 933,col 9)-(line 933,col 34)",
        "(line 934,col 9)-(line 934,col 34)",
        "(line 935,col 9)-(line 935,col 58)",
        "(line 936,col 9)-(line 936,col 58)",
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 57)",
        "(line 939,col 9)-(line 939,col 58)",
        "(line 940,col 9)-(line 940,col 58)",
        "(line 941,col 9)-(line 941,col 57)",
        "(line 942,col 9)-(line 942,col 57)",
        "(line 943,col 9)-(line 943,col 58)",
        "(line 944,col 9)-(line 944,col 61)",
        "(line 945,col 9)-(line 945,col 44)",
        "(line 946,col 9)-(line 946,col 44)",
        "(line 947,col 9)-(line 947,col 44)",
        "(line 948,col 9)-(line 948,col 44)",
        "(line 949,col 9)-(line 949,col 45)",
        "(line 950,col 9)-(line 950,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 953,
      "end_line": 960,
      "comment": "",
      "child_ranges": [
        "(line 954,col 9)-(line 959,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 962,
      "end_line": 972,
      "comment": "",
      "child_ranges": [
        "(line 963,col 9)-(line 971,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 974,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 975,col 9)-(line 975,col 54)",
        "(line 976,col 9)-(line 979,col 34)",
        "(line 981,col 9)-(line 981,col 56)",
        "(line 982,col 9)-(line 985,col 34)",
        "(line 988,col 9)-(line 988,col 80)",
        "(line 989,col 9)-(line 992,col 34)",
        "(line 995,col 9)-(line 995,col 48)",
        "(line 996,col 9)-(line 999,col 47)",
        "(line 1002,col 9)-(line 1002,col 75)",
        "(line 1003,col 9)-(line 1006,col 52)",
        "(line 1009,col 9)-(line 1012,col 52)",
        "(line 1015,col 9)-(line 1018,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1022,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1023,col 9)-(line 1023,col 31)",
        "(line 1024,col 9)-(line 1024,col 55)",
        "(line 1025,col 9)-(line 1025,col 56)",
        "(line 1026,col 9)-(line 1026,col 57)",
        "(line 1029,col 9)-(line 1029,col 61)",
        "(line 1030,col 9)-(line 1030,col 84)",
        "(line 1031,col 9)-(line 1031,col 25)",
        "(line 1032,col 9)-(line 1032,col 31)",
        "(line 1033,col 9)-(line 1033,col 57)",
        "(line 1036,col 9)-(line 1036,col 63)",
        "(line 1037,col 9)-(line 1037,col 63)",
        "(line 1038,col 9)-(line 1038,col 63)",
        "(line 1039,col 9)-(line 1039,col 63)",
        "(line 1040,col 9)-(line 1040,col 64)",
        "(line 1041,col 9)-(line 1041,col 64)",
        "(line 1042,col 9)-(line 1042,col 64)",
        "(line 1043,col 9)-(line 1043,col 64)",
        "(line 1044,col 9)-(line 1044,col 64)",
        "(line 1046,col 9)-(line 1046,col 81)",
        "(line 1047,col 9)-(line 1047,col 82)",
        "(line 1048,col 9)-(line 1048,col 83)",
        "(line 1049,col 9)-(line 1049,col 83)",
        "(line 1050,col 9)-(line 1050,col 84)",
        "(line 1051,col 9)-(line 1051,col 85)",
        "(line 1053,col 9)-(line 1053,col 78)",
        "(line 1054,col 9)-(line 1054,col 79)",
        "(line 1055,col 9)-(line 1055,col 80)",
        "(line 1056,col 9)-(line 1056,col 80)",
        "(line 1057,col 9)-(line 1057,col 81)",
        "(line 1058,col 9)-(line 1058,col 82)",
        "(line 1060,col 9)-(line 1060,col 79)",
        "(line 1061,col 9)-(line 1061,col 80)",
        "(line 1062,col 9)-(line 1062,col 81)",
        "(line 1063,col 9)-(line 1063,col 81)",
        "(line 1064,col 9)-(line 1064,col 82)",
        "(line 1065,col 9)-(line 1065,col 83)",
        "(line 1067,col 9)-(line 1067,col 83)",
        "(line 1068,col 9)-(line 1068,col 84)",
        "(line 1069,col 9)-(line 1069,col 85)",
        "(line 1070,col 9)-(line 1070,col 85)",
        "(line 1071,col 9)-(line 1071,col 86)",
        "(line 1072,col 9)-(line 1072,col 87)",
        "(line 1073,col 9)-(line 1073,col 89)",
        "(line 1074,col 9)-(line 1074,col 91)",
        "(line 1076,col 9)-(line 1076,col 83)",
        "(line 1077,col 9)-(line 1077,col 84)",
        "(line 1078,col 9)-(line 1078,col 85)",
        "(line 1079,col 9)-(line 1079,col 85)",
        "(line 1080,col 9)-(line 1080,col 86)",
        "(line 1081,col 9)-(line 1081,col 87)",
        "(line 1082,col 9)-(line 1082,col 89)",
        "(line 1083,col 9)-(line 1083,col 91)",
        "(line 1084,col 9)-(line 1084,col 89)",
        "(line 1085,col 9)-(line 1085,col 91)",
        "(line 1087,col 9)-(line 1087,col 81)",
        "(line 1088,col 9)-(line 1088,col 82)",
        "(line 1089,col 9)-(line 1089,col 83)",
        "(line 1090,col 9)-(line 1090,col 83)",
        "(line 1091,col 9)-(line 1091,col 84)",
        "(line 1092,col 9)-(line 1092,col 85)",
        "(line 1093,col 9)-(line 1093,col 87)",
        "(line 1094,col 9)-(line 1094,col 89)",
        "(line 1096,col 9)-(line 1096,col 90)",
        "(line 1097,col 9)-(line 1097,col 88)",
        "(line 1099,col 9)-(line 1104,col 9)",
        "(line 1106,col 9)-(line 1106,col 76)",
        "(line 1107,col 9)-(line 1107,col 77)",
        "(line 1108,col 9)-(line 1108,col 78)",
        "(line 1109,col 9)-(line 1109,col 78)",
        "(line 1110,col 9)-(line 1110,col 79)",
        "(line 1111,col 9)-(line 1111,col 80)",
        "(line 1113,col 9)-(line 1118,col 9)",
        "(line 1121,col 9)-(line 1121,col 87)",
        "(line 1124,col 9)-(line 1124,col 80)",
        "(line 1125,col 9)-(line 1125,col 56)",
        "(line 1126,col 9)-(line 1126,col 98)",
        "(line 1127,col 9)-(line 1127,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1130,
      "end_line": 1224,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 9)-(line 1131,col 31)",
        "(line 1132,col 9)-(line 1132,col 56)",
        "(line 1133,col 9)-(line 1133,col 57)",
        "(line 1134,col 9)-(line 1134,col 58)",
        "(line 1137,col 9)-(line 1137,col 63)",
        "(line 1138,col 9)-(line 1138,col 63)",
        "(line 1139,col 9)-(line 1139,col 64)",
        "(line 1140,col 9)-(line 1140,col 64)",
        "(line 1141,col 9)-(line 1141,col 64)",
        "(line 1142,col 9)-(line 1142,col 64)",
        "(line 1143,col 9)-(line 1143,col 64)",
        "(line 1145,col 9)-(line 1145,col 82)",
        "(line 1146,col 9)-(line 1146,col 83)",
        "(line 1147,col 9)-(line 1147,col 84)",
        "(line 1148,col 9)-(line 1148,col 84)",
        "(line 1149,col 9)-(line 1149,col 85)",
        "(line 1150,col 9)-(line 1150,col 86)",
        "(line 1152,col 9)-(line 1152,col 79)",
        "(line 1153,col 9)-(line 1153,col 80)",
        "(line 1154,col 9)-(line 1154,col 81)",
        "(line 1155,col 9)-(line 1155,col 81)",
        "(line 1156,col 9)-(line 1156,col 82)",
        "(line 1157,col 9)-(line 1157,col 83)",
        "(line 1159,col 9)-(line 1159,col 80)",
        "(line 1160,col 9)-(line 1160,col 81)",
        "(line 1161,col 9)-(line 1161,col 82)",
        "(line 1162,col 9)-(line 1162,col 82)",
        "(line 1163,col 9)-(line 1163,col 83)",
        "(line 1164,col 9)-(line 1164,col 84)",
        "(line 1166,col 9)-(line 1166,col 84)",
        "(line 1167,col 9)-(line 1167,col 85)",
        "(line 1168,col 9)-(line 1168,col 86)",
        "(line 1169,col 9)-(line 1169,col 86)",
        "(line 1170,col 9)-(line 1170,col 87)",
        "(line 1171,col 9)-(line 1171,col 88)",
        "(line 1172,col 9)-(line 1172,col 91)",
        "(line 1173,col 9)-(line 1173,col 93)",
        "(line 1175,col 9)-(line 1175,col 84)",
        "(line 1176,col 9)-(line 1176,col 85)",
        "(line 1177,col 9)-(line 1177,col 86)",
        "(line 1178,col 9)-(line 1178,col 86)",
        "(line 1179,col 9)-(line 1179,col 87)",
        "(line 1180,col 9)-(line 1180,col 88)",
        "(line 1181,col 9)-(line 1181,col 91)",
        "(line 1182,col 9)-(line 1182,col 93)",
        "(line 1183,col 9)-(line 1183,col 91)",
        "(line 1184,col 9)-(line 1184,col 93)",
        "(line 1186,col 9)-(line 1186,col 82)",
        "(line 1187,col 9)-(line 1187,col 83)",
        "(line 1188,col 9)-(line 1188,col 84)",
        "(line 1189,col 9)-(line 1189,col 84)",
        "(line 1190,col 9)-(line 1190,col 85)",
        "(line 1191,col 9)-(line 1191,col 86)",
        "(line 1192,col 9)-(line 1192,col 89)",
        "(line 1193,col 9)-(line 1193,col 91)",
        "(line 1195,col 9)-(line 1195,col 92)",
        "(line 1196,col 9)-(line 1196,col 90)",
        "(line 1198,col 9)-(line 1203,col 9)",
        "(line 1205,col 9)-(line 1205,col 77)",
        "(line 1206,col 9)-(line 1206,col 78)",
        "(line 1207,col 9)-(line 1207,col 79)",
        "(line 1208,col 9)-(line 1208,col 79)",
        "(line 1209,col 9)-(line 1209,col 80)",
        "(line 1210,col 9)-(line 1210,col 81)",
        "(line 1212,col 9)-(line 1217,col 9)",
        "(line 1220,col 9)-(line 1220,col 79)",
        "(line 1221,col 9)-(line 1221,col 59)",
        "(line 1222,col 9)-(line 1222,col 97)",
        "(line 1223,col 9)-(line 1223,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1226,
      "end_line": 1230,
      "comment": "",
      "child_ranges": [
        "(line 1227,col 9)-(line 1227,col 57)",
        "(line 1228,col 9)-(line 1228,col 57)",
        "(line 1229,col 9)-(line 1229,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1232,
      "end_line": 1238,
      "comment": "",
      "child_ranges": [
        "(line 1233,col 9)-(line 1233,col 27)",
        "(line 1234,col 9)-(line 1234,col 54)",
        "(line 1235,col 9)-(line 1235,col 54)",
        "(line 1236,col 9)-(line 1236,col 56)",
        "(line 1237,col 9)-(line 1237,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1240,
      "end_line": 1246,
      "comment": "",
      "child_ranges": [
        "(line 1241,col 9)-(line 1241,col 27)",
        "(line 1242,col 9)-(line 1242,col 56)",
        "(line 1243,col 9)-(line 1243,col 56)",
        "(line 1244,col 9)-(line 1244,col 58)",
        "(line 1245,col 9)-(line 1245,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1248,
      "end_line": 1252,
      "comment": "",
      "child_ranges": [
        "(line 1249,col 9)-(line 1249,col 43)",
        "(line 1250,col 9)-(line 1250,col 43)",
        "(line 1251,col 9)-(line 1251,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1254,
      "end_line": 1258,
      "comment": "",
      "child_ranges": [
        "(line 1255,col 9)-(line 1255,col 45)",
        "(line 1256,col 9)-(line 1256,col 45)",
        "(line 1257,col 9)-(line 1257,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1260,
      "end_line": 1264,
      "comment": "",
      "child_ranges": [
        "(line 1261,col 9)-(line 1261,col 59)",
        "(line 1262,col 9)-(line 1262,col 59)",
        "(line 1263,col 9)-(line 1263,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1266,
      "end_line": 1270,
      "comment": "",
      "child_ranges": [
        "(line 1267,col 9)-(line 1267,col 23)",
        "(line 1268,col 9)-(line 1268,col 35)",
        "(line 1269,col 9)-(line 1269,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1272,
      "end_line": 1274,
      "comment": "",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1276,
      "end_line": 1292,
      "comment": "",
      "child_ranges": [
        "(line 1277,col 9)-(line 1277,col 36)",
        "(line 1278,col 9)-(line 1278,col 39)",
        "(line 1279,col 9)-(line 1279,col 57)",
        "(line 1280,col 9)-(line 1280,col 68)",
        "(line 1281,col 9)-(line 1281,col 62)",
        "(line 1282,col 9)-(line 1286,col 9)",
        "(line 1287,col 9)-(line 1291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1294,
      "end_line": 1302,
      "comment": "",
      "child_ranges": [
        "(line 1295,col 9)-(line 1295,col 36)",
        "(line 1296,col 9)-(line 1301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1304,
      "end_line": 1317,
      "comment": "",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 34)",
        "(line 1306,col 9)-(line 1306,col 34)",
        "(line 1307,col 9)-(line 1307,col 57)",
        "(line 1308,col 9)-(line 1308,col 57)",
        "(line 1309,col 9)-(line 1309,col 58)",
        "(line 1310,col 9)-(line 1310,col 62)",
        "(line 1312,col 9)-(line 1312,col 64)",
        "(line 1313,col 9)-(line 1313,col 63)",
        "(line 1314,col 9)-(line 1314,col 44)",
        "(line 1315,col 9)-(line 1315,col 45)",
        "(line 1316,col 9)-(line 1316,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1319,
      "end_line": 1327,
      "comment": "",
      "child_ranges": [
        "(line 1320,col 9)-(line 1325,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1329,
      "end_line": 1403,
      "comment": "",
      "child_ranges": [
        "(line 1331,col 9)-(line 1331,col 55)",
        "(line 1332,col 9)-(line 1332,col 46)",
        "(line 1333,col 9)-(line 1338,col 9)",
        "(line 1340,col 9)-(line 1340,col 56)",
        "(line 1341,col 9)-(line 1341,col 47)",
        "(line 1342,col 9)-(line 1347,col 9)",
        "(line 1349,col 9)-(line 1349,col 57)",
        "(line 1350,col 9)-(line 1350,col 48)",
        "(line 1351,col 9)-(line 1356,col 9)",
        "(line 1358,col 9)-(line 1358,col 58)",
        "(line 1359,col 9)-(line 1359,col 49)",
        "(line 1360,col 9)-(line 1365,col 9)",
        "(line 1367,col 9)-(line 1367,col 55)",
        "(line 1368,col 9)-(line 1368,col 83)",
        "(line 1369,col 9)-(line 1369,col 66)",
        "(line 1370,col 9)-(line 1375,col 9)",
        "(line 1377,col 9)-(line 1377,col 84)",
        "(line 1378,col 9)-(line 1378,col 67)",
        "(line 1379,col 9)-(line 1384,col 9)",
        "(line 1386,col 9)-(line 1386,col 104)",
        "(line 1387,col 9)-(line 1387,col 80)",
        "(line 1388,col 9)-(line 1393,col 9)",
        "(line 1395,col 9)-(line 1398,col 76)",
        "(line 1399,col 9)-(line 1399,col 60)",
        "(line 1400,col 9)-(line 1400,col 61)",
        "(line 1401,col 9)-(line 1401,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1405,
      "end_line": 1409,
      "comment": "",
      "child_ranges": [
        "(line 1406,col 9)-(line 1406,col 36)",
        "(line 1407,col 9)-(line 1407,col 36)",
        "(line 1408,col 9)-(line 1408,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1411,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 28)",
        "(line 1413,col 9)-(line 1413,col 28)",
        "(line 1414,col 9)-(line 1414,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1417,
      "end_line": 1421,
      "comment": "",
      "child_ranges": [
        "(line 1418,col 9)-(line 1418,col 36)",
        "(line 1419,col 9)-(line 1419,col 36)",
        "(line 1420,col 9)-(line 1420,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1423,
      "end_line": 1427,
      "comment": "",
      "child_ranges": [
        "(line 1424,col 9)-(line 1424,col 28)",
        "(line 1425,col 9)-(line 1425,col 28)",
        "(line 1426,col 9)-(line 1426,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1429,
      "end_line": 1433,
      "comment": "",
      "child_ranges": [
        "(line 1430,col 9)-(line 1430,col 36)",
        "(line 1431,col 9)-(line 1431,col 36)",
        "(line 1432,col 9)-(line 1432,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1435,
      "end_line": 1439,
      "comment": "",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 28)",
        "(line 1437,col 9)-(line 1437,col 28)",
        "(line 1438,col 9)-(line 1438,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1441,
      "end_line": 1479,
      "comment": "",
      "child_ranges": [
        "(line 1442,col 9)-(line 1443,col 72)",
        "(line 1444,col 9)-(line 1445,col 73)",
        "(line 1446,col 9)-(line 1447,col 72)",
        "(line 1448,col 9)-(line 1449,col 73)",
        "(line 1451,col 9)-(line 1457,col 9)",
        "(line 1458,col 9)-(line 1464,col 9)",
        "(line 1465,col 9)-(line 1471,col 9)",
        "(line 1472,col 9)-(line 1478,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1481,
      "end_line": 1519,
      "comment": "",
      "child_ranges": [
        "(line 1482,col 9)-(line 1487,col 9)",
        "(line 1488,col 9)-(line 1493,col 9)",
        "(line 1494,col 9)-(line 1499,col 9)",
        "(line 1501,col 9)-(line 1506,col 9)",
        "(line 1507,col 9)-(line 1512,col 9)",
        "(line 1513,col 9)-(line 1518,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1521,
      "end_line": 1547,
      "comment": "",
      "child_ranges": [
        "(line 1522,col 9)-(line 1522,col 49)",
        "(line 1523,col 9)-(line 1523,col 49)",
        "(line 1524,col 9)-(line 1524,col 49)",
        "(line 1526,col 9)-(line 1526,col 42)",
        "(line 1528,col 9)-(line 1528,col 47)",
        "(line 1529,col 9)-(line 1529,col 47)",
        "(line 1530,col 9)-(line 1530,col 47)",
        "(line 1532,col 9)-(line 1532,col 45)",
        "(line 1533,col 9)-(line 1533,col 45)",
        "(line 1534,col 9)-(line 1534,col 45)",
        "(line 1536,col 9)-(line 1536,col 45)",
        "(line 1537,col 9)-(line 1537,col 45)",
        "(line 1538,col 9)-(line 1538,col 45)",
        "(line 1540,col 9)-(line 1540,col 46)",
        "(line 1541,col 9)-(line 1541,col 46)",
        "(line 1542,col 9)-(line 1542,col 46)",
        "(line 1544,col 9)-(line 1544,col 47)",
        "(line 1545,col 9)-(line 1545,col 47)",
        "(line 1546,col 9)-(line 1546,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt()",
      "begin_line": 1549,
      "end_line": 1559,
      "comment": "",
      "child_ranges": [
        "(line 1550,col 9)-(line 1552,col 51)",
        "(line 1553,col 9)-(line 1553,col 52)",
        "(line 1555,col 9)-(line 1555,col 49)",
        "(line 1556,col 9)-(line 1558,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt2()",
      "begin_line": 1561,
      "end_line": 1572,
      "comment": "",
      "child_ranges": [
        "(line 1562,col 9)-(line 1564,col 51)",
        "(line 1565,col 9)-(line 1565,col 29)",
        "(line 1566,col 9)-(line 1566,col 76)",
        "(line 1568,col 9)-(line 1568,col 58)",
        "(line 1569,col 9)-(line 1571,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt3()",
      "begin_line": 1574,
      "end_line": 1588,
      "comment": "",
      "child_ranges": [
        "(line 1575,col 9)-(line 1577,col 51)",
        "(line 1578,col 9)-(line 1578,col 29)",
        "(line 1579,col 9)-(line 1579,col 76)",
        "(line 1581,col 9)-(line 1581,col 58)",
        "(line 1582,col 9)-(line 1584,col 9)",
        "(line 1585,col 9)-(line 1587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble()",
      "begin_line": 1590,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1591,col 9)-(line 1598,col 61)",
        "(line 1599,col 9)-(line 1599,col 55)",
        "(line 1601,col 9)-(line 1601,col 49)",
        "(line 1602,col 9)-(line 1604,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble2()",
      "begin_line": 1607,
      "end_line": 1623,
      "comment": "",
      "child_ranges": [
        "(line 1608,col 9)-(line 1615,col 61)",
        "(line 1616,col 9)-(line 1616,col 29)",
        "(line 1617,col 9)-(line 1617,col 79)",
        "(line 1619,col 9)-(line 1619,col 58)",
        "(line 1620,col 9)-(line 1622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble3()",
      "begin_line": 1625,
      "end_line": 1644,
      "comment": "",
      "child_ranges": [
        "(line 1626,col 9)-(line 1633,col 61)",
        "(line 1634,col 9)-(line 1634,col 29)",
        "(line 1635,col 9)-(line 1635,col 79)",
        "(line 1637,col 9)-(line 1637,col 58)",
        "(line 1638,col 9)-(line 1640,col 9)",
        "(line 1641,col 9)-(line 1643,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull1()",
      "begin_line": 1646,
      "end_line": 1653,
      "comment": "",
      "child_ranges": [
        "(line 1647,col 9)-(line 1652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull2()",
      "begin_line": 1655,
      "end_line": 1662,
      "comment": "",
      "child_ranges": [
        "(line 1656,col 9)-(line 1661,col 9)"
      ]
    }
  ]
}
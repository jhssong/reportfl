{
  "filepath": "/tmp/Math-59b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 38,
      "end_line": 1632,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 20)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 50,
      "end_line": 82,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 25)",
        "(line 58,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 80,col 75)",
        "(line 81,col 9)-(line 81,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 87,
      "end_line": 93,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 24)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 92,col 9)-(line 92,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 96,
      "end_line": 100,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 71)",
        "(line 98,col 9)-(line 98,col 68)",
        "(line 99,col 9)-(line 99,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 102,
      "end_line": 116,
      "comment": "",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 36)",
        "(line 104,col 9)-(line 104,col 39)",
        "(line 105,col 9)-(line 105,col 57)",
        "(line 106,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 115,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 118,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 58)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 56)",
        "(line 126,col 9)-(line 126,col 56)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 63)",
        "(line 129,col 9)-(line 129,col 44)",
        "(line 130,col 9)-(line 130,col 45)",
        "(line 131,col 9)-(line 131,col 44)",
        "(line 132,col 9)-(line 132,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 135,
      "end_line": 142,
      "comment": "",
      "child_ranges": [
        "(line 136,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 144,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 145,col 9)-(line 151,col 16)",
        "(line 152,col 9)-(line 159,col 16)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 167,col 9)-(line 173,col 9)",
        "(line 175,col 9)-(line 175,col 46)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 185,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 192,
      "end_line": 246,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 63)",
        "(line 224,col 9)-(line 224,col 55)",
        "(line 225,col 9)-(line 225,col 45)",
        "(line 227,col 9)-(line 227,col 60)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 229,col 9)-(line 229,col 45)",
        "(line 232,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 239,col 22)",
        "(line 240,col 9)-(line 240,col 56)",
        "(line 241,col 9)-(line 241,col 48)",
        "(line 242,col 9)-(line 242,col 45)",
        "(line 243,col 9)-(line 243,col 88)",
        "(line 244,col 9)-(line 244,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 248,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 268,col 9)",
        "(line 270,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 66)",
        "(line 302,col 9)-(line 303,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 306,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 307,col 7)-(line 307,col 65)",
        "(line 308,col 7)-(line 308,col 65)",
        "(line 309,col 7)-(line 309,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 312,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 23)",
        "(line 314,col 9)-(line 314,col 35)",
        "(line 315,col 9)-(line 315,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 318,
      "end_line": 320,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 322,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 328,col 17)",
        "(line 329,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 342,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 64)",
        "(line 344,col 9)-(line 344,col 64)",
        "(line 345,col 9)-(line 345,col 64)",
        "(line 346,col 9)-(line 346,col 65)",
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 67)",
        "(line 349,col 9)-(line 349,col 94)",
        "(line 350,col 9)-(line 350,col 94)",
        "(line 351,col 9)-(line 351,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 354,
      "end_line": 370,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 47)",
        "(line 356,col 9)-(line 356,col 44)",
        "(line 358,col 9)-(line 358,col 42)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 364,col 9)-(line 364,col 44)",
        "(line 365,col 9)-(line 365,col 35)",
        "(line 368,col 9)-(line 368,col 49)",
        "(line 369,col 9)-(line 369,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 372,
      "end_line": 382,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 76)",
        "(line 374,col 9)-(line 374,col 76)",
        "(line 375,col 9)-(line 375,col 76)",
        "(line 376,col 9)-(line 376,col 78)",
        "(line 377,col 9)-(line 377,col 106)",
        "(line 378,col 9)-(line 378,col 106)",
        "(line 379,col 9)-(line 379,col 107)",
        "(line 380,col 9)-(line 380,col 77)",
        "(line 381,col 9)-(line 381,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 385,
      "end_line": 415,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 67)",
        "(line 387,col 9)-(line 387,col 78)",
        "(line 388,col 9)-(line 388,col 30)",
        "(line 389,col 9)-(line 389,col 128)",
        "(line 390,col 9)-(line 390,col 139)",
        "(line 391,col 9)-(line 391,col 140)",
        "(line 393,col 9)-(line 393,col 56)",
        "(line 406,col 9)-(line 406,col 90)",
        "(line 407,col 9)-(line 407,col 83)",
        "(line 409,col 9)-(line 409,col 90)",
        "(line 410,col 9)-(line 410,col 83)",
        "(line 412,col 9)-(line 412,col 63)",
        "(line 414,col 9)-(line 414,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 417,
      "end_line": 453,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 51)",
        "(line 420,col 9)-(line 420,col 67)",
        "(line 421,col 9)-(line 421,col 72)",
        "(line 423,col 9)-(line 423,col 77)",
        "(line 424,col 9)-(line 424,col 80)",
        "(line 425,col 9)-(line 425,col 51)",
        "(line 426,col 9)-(line 426,col 53)",
        "(line 427,col 9)-(line 427,col 53)",
        "(line 429,col 9)-(line 429,col 63)",
        "(line 430,col 9)-(line 430,col 64)",
        "(line 432,col 9)-(line 432,col 54)",
        "(line 434,col 9)-(line 434,col 67)",
        "(line 435,col 9)-(line 435,col 68)",
        "(line 436,col 9)-(line 436,col 67)",
        "(line 437,col 9)-(line 437,col 66)",
        "(line 439,col 9)-(line 439,col 69)",
        "(line 440,col 9)-(line 440,col 70)",
        "(line 441,col 9)-(line 441,col 69)",
        "(line 442,col 9)-(line 442,col 70)",
        "(line 444,col 9)-(line 444,col 92)",
        "(line 445,col 9)-(line 445,col 84)",
        "(line 447,col 9)-(line 447,col 92)",
        "(line 448,col 9)-(line 448,col 85)",
        "(line 450,col 9)-(line 450,col 65)",
        "(line 452,col 9)-(line 452,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 455,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 63)",
        "(line 458,col 9)-(line 458,col 79)",
        "(line 459,col 9)-(line 459,col 84)",
        "(line 461,col 9)-(line 461,col 77)",
        "(line 462,col 9)-(line 462,col 80)",
        "(line 463,col 9)-(line 463,col 63)",
        "(line 464,col 9)-(line 464,col 65)",
        "(line 465,col 9)-(line 465,col 65)",
        "(line 467,col 9)-(line 467,col 75)",
        "(line 468,col 9)-(line 468,col 76)",
        "(line 470,col 9)-(line 470,col 66)",
        "(line 472,col 9)-(line 472,col 79)",
        "(line 473,col 9)-(line 473,col 80)",
        "(line 474,col 9)-(line 474,col 79)",
        "(line 475,col 9)-(line 475,col 78)",
        "(line 477,col 9)-(line 477,col 81)",
        "(line 478,col 9)-(line 478,col 82)",
        "(line 479,col 9)-(line 479,col 81)",
        "(line 480,col 9)-(line 480,col 82)",
        "(line 482,col 9)-(line 482,col 104)",
        "(line 483,col 9)-(line 483,col 96)",
        "(line 485,col 9)-(line 485,col 104)",
        "(line 486,col 9)-(line 486,col 97)",
        "(line 488,col 9)-(line 488,col 76)",
        "(line 490,col 9)-(line 490,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 493,
      "end_line": 514,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 65)",
        "(line 495,col 9)-(line 495,col 65)",
        "(line 496,col 9)-(line 496,col 71)",
        "(line 498,col 9)-(line 498,col 74)",
        "(line 499,col 9)-(line 499,col 79)",
        "(line 500,col 9)-(line 506,col 40)",
        "(line 507,col 9)-(line 508,col 67)",
        "(line 509,col 9)-(line 510,col 81)",
        "(line 511,col 9)-(line 512,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 516,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 77)",
        "(line 518,col 9)-(line 518,col 77)",
        "(line 519,col 9)-(line 519,col 83)",
        "(line 521,col 9)-(line 521,col 86)",
        "(line 522,col 9)-(line 522,col 91)",
        "(line 523,col 9)-(line 529,col 20)",
        "(line 530,col 9)-(line 531,col 93)",
        "(line 532,col 9)-(line 533,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 536,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 541,col 9)",
        "(line 543,col 9)-(line 543,col 53)",
        "(line 544,col 9)-(line 544,col 69)",
        "(line 545,col 9)-(line 545,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 548,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 549,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 566,col 9)",
        "(line 567,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 573,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 576,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 19)",
        "(line 578,col 9)-(line 578,col 19)",
        "(line 579,col 9)-(line 579,col 19)",
        "(line 581,col 9)-(line 581,col 45)",
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
        "(line 598,col 9)-(line 598,col 75)",
        "(line 600,col 9)-(line 600,col 77)",
        "(line 601,col 9)-(line 601,col 78)",
        "(line 602,col 9)-(line 602,col 70)",
        "(line 603,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 626,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 20)",
        "(line 628,col 9)-(line 628,col 20)",
        "(line 629,col 9)-(line 629,col 20)",
        "(line 631,col 9)-(line 631,col 46)",
        "(line 633,col 9)-(line 633,col 45)",
        "(line 634,col 9)-(line 634,col 45)",
        "(line 635,col 9)-(line 635,col 46)",
        "(line 636,col 9)-(line 636,col 46)",
        "(line 638,col 9)-(line 638,col 46)",
        "(line 639,col 9)-(line 639,col 47)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 48)",
        "(line 643,col 9)-(line 643,col 45)",
        "(line 644,col 9)-(line 644,col 46)",
        "(line 645,col 9)-(line 645,col 46)",
        "(line 646,col 9)-(line 646,col 47)",
        "(line 648,col 9)-(line 648,col 81)",
        "(line 650,col 9)-(line 650,col 68)",
        "(line 652,col 9)-(line 652,col 72)",
        "(line 653,col 9)-(line 653,col 73)",
        "(line 654,col 9)-(line 654,col 65)",
        "(line 655,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 678,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 679,col 9)-(line 679,col 71)",
        "(line 680,col 9)-(line 680,col 61)",
        "(line 681,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 684,col 57)",
        "(line 685,col 9)-(line 698,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 701,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 702,col 9)-(line 711,col 31)",
        "(line 712,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 725,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 57)",
        "(line 727,col 9)-(line 734,col 40)",
        "(line 735,col 9)-(line 736,col 81)",
        "(line 737,col 9)-(line 738,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 744,
      "end_line": 768,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 43)",
        "(line 746,col 9)-(line 746,col 43)",
        "(line 747,col 9)-(line 747,col 53)",
        "(line 750,col 9)-(line 752,col 9)",
        "(line 755,col 9)-(line 755,col 34)",
        "(line 756,col 9)-(line 764,col 29)",
        "(line 767,col 9)-(line 767,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 770,
      "end_line": 774,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 60)",
        "(line 772,col 9)-(line 772,col 60)",
        "(line 773,col 9)-(line 773,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 776,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 777,col 9)-(line 777,col 27)",
        "(line 778,col 9)-(line 778,col 59)",
        "(line 779,col 9)-(line 779,col 59)",
        "(line 780,col 9)-(line 780,col 61)",
        "(line 781,col 9)-(line 781,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 784,
      "end_line": 789,
      "comment": "",
      "child_ranges": [
        "(line 785,col 9)-(line 785,col 27)",
        "(line 786,col 9)-(line 786,col 61)",
        "(line 787,col 9)-(line 787,col 61)",
        "(line 788,col 9)-(line 788,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 791,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 792,col 9)-(line 792,col 50)",
        "(line 793,col 9)-(line 793,col 50)",
        "(line 794,col 9)-(line 794,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 797,
      "end_line": 801,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 50)",
        "(line 799,col 9)-(line 799,col 50)",
        "(line 800,col 9)-(line 800,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 803,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 804,col 9)-(line 804,col 62)",
        "(line 805,col 9)-(line 805,col 62)",
        "(line 806,col 9)-(line 806,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 809,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 19)",
        "(line 811,col 9)-(line 811,col 19)",
        "(line 812,col 9)-(line 812,col 19)",
        "(line 814,col 9)-(line 814,col 45)",
        "(line 815,col 9)-(line 815,col 45)",
        "(line 816,col 9)-(line 816,col 45)",
        "(line 817,col 9)-(line 817,col 45)",
        "(line 818,col 9)-(line 818,col 47)",
        "(line 819,col 9)-(line 819,col 48)",
        "(line 820,col 9)-(line 820,col 48)",
        "(line 821,col 9)-(line 821,col 49)",
        "(line 822,col 9)-(line 822,col 48)",
        "(line 826,col 9)-(line 826,col 70)",
        "(line 829,col 9)-(line 829,col 45)",
        "(line 831,col 9)-(line 837,col 9)",
        "(line 839,col 9)-(line 845,col 9)",
        "(line 847,col 9)-(line 852,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 855,
      "end_line": 903,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 20)",
        "(line 857,col 9)-(line 857,col 20)",
        "(line 858,col 9)-(line 858,col 20)",
        "(line 860,col 9)-(line 860,col 45)",
        "(line 861,col 9)-(line 861,col 45)",
        "(line 862,col 9)-(line 862,col 45)",
        "(line 863,col 9)-(line 863,col 45)",
        "(line 864,col 9)-(line 864,col 47)",
        "(line 865,col 9)-(line 865,col 48)",
        "(line 866,col 9)-(line 866,col 48)",
        "(line 867,col 9)-(line 867,col 49)",
        "(line 868,col 9)-(line 868,col 48)",
        "(line 870,col 9)-(line 870,col 78)",
        "(line 874,col 9)-(line 874,col 73)",
        "(line 877,col 9)-(line 877,col 48)",
        "(line 879,col 9)-(line 885,col 9)",
        "(line 887,col 9)-(line 893,col 9)",
        "(line 895,col 9)-(line 896,col 75)",
        "(line 897,col 9)-(line 902,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 905,
      "end_line": 913,
      "comment": "",
      "child_ranges": [
        "(line 906,col 9)-(line 906,col 50)",
        "(line 907,col 9)-(line 907,col 50)",
        "(line 908,col 9)-(line 908,col 55)",
        "(line 909,col 9)-(line 909,col 55)",
        "(line 910,col 9)-(line 910,col 54)",
        "(line 911,col 9)-(line 911,col 49)",
        "(line 912,col 9)-(line 912,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 915,
      "end_line": 929,
      "comment": "",
      "child_ranges": [
        "(line 916,col 9)-(line 916,col 36)",
        "(line 917,col 9)-(line 917,col 39)",
        "(line 918,col 9)-(line 918,col 57)",
        "(line 919,col 9)-(line 923,col 9)",
        "(line 924,col 9)-(line 928,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 931,
      "end_line": 950,
      "comment": "",
      "child_ranges": [
        "(line 932,col 9)-(line 932,col 34)",
        "(line 933,col 9)-(line 933,col 34)",
        "(line 934,col 9)-(line 934,col 58)",
        "(line 935,col 9)-(line 935,col 58)",
        "(line 936,col 9)-(line 936,col 57)",
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 58)",
        "(line 939,col 9)-(line 939,col 58)",
        "(line 940,col 9)-(line 940,col 57)",
        "(line 941,col 9)-(line 941,col 57)",
        "(line 942,col 9)-(line 942,col 58)",
        "(line 943,col 9)-(line 943,col 61)",
        "(line 944,col 9)-(line 944,col 44)",
        "(line 945,col 9)-(line 945,col 44)",
        "(line 946,col 9)-(line 946,col 44)",
        "(line 947,col 9)-(line 947,col 44)",
        "(line 948,col 9)-(line 948,col 45)",
        "(line 949,col 9)-(line 949,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 952,
      "end_line": 959,
      "comment": "",
      "child_ranges": [
        "(line 953,col 9)-(line 958,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 961,
      "end_line": 1022,
      "comment": "",
      "child_ranges": [
        "(line 963,col 9)-(line 963,col 91)",
        "(line 966,col 9)-(line 966,col 107)",
        "(line 969,col 9)-(line 969,col 105)",
        "(line 972,col 9)-(line 972,col 107)",
        "(line 975,col 9)-(line 975,col 89)",
        "(line 978,col 9)-(line 978,col 91)",
        "(line 981,col 9)-(line 981,col 89)",
        "(line 984,col 9)-(line 984,col 91)",
        "(line 987,col 9)-(line 987,col 113)",
        "(line 990,col 9)-(line 990,col 114)",
        "(line 993,col 9)-(line 993,col 115)",
        "(line 996,col 9)-(line 996,col 115)",
        "(line 999,col 9)-(line 999,col 116)",
        "(line 1002,col 9)-(line 1002,col 116)",
        "(line 1005,col 9)-(line 1005,col 116)",
        "(line 1008,col 9)-(line 1008,col 117)",
        "(line 1011,col 9)-(line 1011,col 117)",
        "(line 1014,col 9)-(line 1014,col 116)",
        "(line 1017,col 9)-(line 1017,col 117)",
        "(line 1020,col 9)-(line 1020,col 118)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 1024,
      "end_line": 1034,
      "comment": "",
      "child_ranges": [
        "(line 1025,col 9)-(line 1025,col 87)",
        "(line 1026,col 9)-(line 1026,col 87)",
        "(line 1027,col 9)-(line 1027,col 68)",
        "(line 1028,col 9)-(line 1028,col 102)",
        "(line 1029,col 9)-(line 1029,col 103)",
        "(line 1030,col 9)-(line 1030,col 68)",
        "(line 1031,col 9)-(line 1031,col 70)",
        "(line 1032,col 9)-(line 1032,col 69)",
        "(line 1033,col 9)-(line 1033,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 1036,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1037,col 9)-(line 1037,col 61)",
        "(line 1038,col 9)-(line 1038,col 61)",
        "(line 1039,col 9)-(line 1039,col 69)",
        "(line 1040,col 9)-(line 1040,col 76)",
        "(line 1041,col 9)-(line 1041,col 84)",
        "(line 1042,col 9)-(line 1042,col 84)",
        "(line 1043,col 9)-(line 1043,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 1046,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1055,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1058,
      "end_line": 1104,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 54)",
        "(line 1060,col 9)-(line 1063,col 34)",
        "(line 1065,col 9)-(line 1065,col 56)",
        "(line 1066,col 9)-(line 1069,col 34)",
        "(line 1072,col 9)-(line 1072,col 80)",
        "(line 1073,col 9)-(line 1076,col 34)",
        "(line 1079,col 9)-(line 1079,col 48)",
        "(line 1080,col 9)-(line 1083,col 47)",
        "(line 1086,col 9)-(line 1086,col 75)",
        "(line 1087,col 9)-(line 1090,col 52)",
        "(line 1093,col 9)-(line 1096,col 52)",
        "(line 1099,col 9)-(line 1102,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1106,
      "end_line": 1212,
      "comment": "",
      "child_ranges": [
        "(line 1107,col 9)-(line 1107,col 31)",
        "(line 1108,col 9)-(line 1108,col 55)",
        "(line 1109,col 9)-(line 1109,col 56)",
        "(line 1110,col 9)-(line 1110,col 57)",
        "(line 1113,col 9)-(line 1113,col 61)",
        "(line 1114,col 9)-(line 1114,col 84)",
        "(line 1115,col 9)-(line 1115,col 25)",
        "(line 1116,col 9)-(line 1116,col 31)",
        "(line 1117,col 9)-(line 1117,col 57)",
        "(line 1120,col 9)-(line 1120,col 63)",
        "(line 1121,col 9)-(line 1121,col 63)",
        "(line 1122,col 9)-(line 1122,col 63)",
        "(line 1123,col 9)-(line 1123,col 63)",
        "(line 1124,col 9)-(line 1124,col 64)",
        "(line 1125,col 9)-(line 1125,col 64)",
        "(line 1126,col 9)-(line 1126,col 64)",
        "(line 1127,col 9)-(line 1127,col 64)",
        "(line 1128,col 9)-(line 1128,col 64)",
        "(line 1130,col 9)-(line 1130,col 81)",
        "(line 1131,col 9)-(line 1131,col 82)",
        "(line 1132,col 9)-(line 1132,col 83)",
        "(line 1133,col 9)-(line 1133,col 83)",
        "(line 1134,col 9)-(line 1134,col 84)",
        "(line 1135,col 9)-(line 1135,col 85)",
        "(line 1137,col 9)-(line 1137,col 78)",
        "(line 1138,col 9)-(line 1138,col 79)",
        "(line 1139,col 9)-(line 1139,col 80)",
        "(line 1140,col 9)-(line 1140,col 80)",
        "(line 1141,col 9)-(line 1141,col 81)",
        "(line 1142,col 9)-(line 1142,col 82)",
        "(line 1144,col 9)-(line 1144,col 79)",
        "(line 1145,col 9)-(line 1145,col 80)",
        "(line 1146,col 9)-(line 1146,col 81)",
        "(line 1147,col 9)-(line 1147,col 81)",
        "(line 1148,col 9)-(line 1148,col 82)",
        "(line 1149,col 9)-(line 1149,col 83)",
        "(line 1151,col 9)-(line 1151,col 83)",
        "(line 1152,col 9)-(line 1152,col 84)",
        "(line 1153,col 9)-(line 1153,col 85)",
        "(line 1154,col 9)-(line 1154,col 85)",
        "(line 1155,col 9)-(line 1155,col 86)",
        "(line 1156,col 9)-(line 1156,col 87)",
        "(line 1157,col 9)-(line 1157,col 89)",
        "(line 1158,col 9)-(line 1158,col 91)",
        "(line 1160,col 9)-(line 1160,col 83)",
        "(line 1161,col 9)-(line 1161,col 84)",
        "(line 1162,col 9)-(line 1162,col 85)",
        "(line 1163,col 9)-(line 1163,col 85)",
        "(line 1164,col 9)-(line 1164,col 86)",
        "(line 1165,col 9)-(line 1165,col 87)",
        "(line 1166,col 9)-(line 1166,col 89)",
        "(line 1167,col 9)-(line 1167,col 91)",
        "(line 1168,col 9)-(line 1168,col 89)",
        "(line 1169,col 9)-(line 1169,col 91)",
        "(line 1171,col 9)-(line 1171,col 81)",
        "(line 1172,col 9)-(line 1172,col 82)",
        "(line 1173,col 9)-(line 1173,col 83)",
        "(line 1174,col 9)-(line 1174,col 83)",
        "(line 1175,col 9)-(line 1175,col 84)",
        "(line 1176,col 9)-(line 1176,col 85)",
        "(line 1177,col 9)-(line 1177,col 87)",
        "(line 1178,col 9)-(line 1178,col 89)",
        "(line 1180,col 9)-(line 1180,col 90)",
        "(line 1181,col 9)-(line 1181,col 88)",
        "(line 1183,col 9)-(line 1188,col 9)",
        "(line 1190,col 9)-(line 1190,col 76)",
        "(line 1191,col 9)-(line 1191,col 77)",
        "(line 1192,col 9)-(line 1192,col 78)",
        "(line 1193,col 9)-(line 1193,col 78)",
        "(line 1194,col 9)-(line 1194,col 79)",
        "(line 1195,col 9)-(line 1195,col 80)",
        "(line 1197,col 9)-(line 1202,col 9)",
        "(line 1205,col 9)-(line 1205,col 87)",
        "(line 1208,col 9)-(line 1208,col 80)",
        "(line 1209,col 9)-(line 1209,col 56)",
        "(line 1210,col 9)-(line 1210,col 98)",
        "(line 1211,col 9)-(line 1211,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1214,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1215,col 9)-(line 1215,col 31)",
        "(line 1216,col 9)-(line 1216,col 56)",
        "(line 1217,col 9)-(line 1217,col 57)",
        "(line 1218,col 9)-(line 1218,col 58)",
        "(line 1221,col 9)-(line 1221,col 63)",
        "(line 1222,col 9)-(line 1222,col 63)",
        "(line 1223,col 9)-(line 1223,col 64)",
        "(line 1224,col 9)-(line 1224,col 64)",
        "(line 1225,col 9)-(line 1225,col 64)",
        "(line 1226,col 9)-(line 1226,col 64)",
        "(line 1227,col 9)-(line 1227,col 64)",
        "(line 1229,col 9)-(line 1229,col 82)",
        "(line 1230,col 9)-(line 1230,col 83)",
        "(line 1231,col 9)-(line 1231,col 84)",
        "(line 1232,col 9)-(line 1232,col 84)",
        "(line 1233,col 9)-(line 1233,col 85)",
        "(line 1234,col 9)-(line 1234,col 86)",
        "(line 1236,col 9)-(line 1236,col 79)",
        "(line 1237,col 9)-(line 1237,col 80)",
        "(line 1238,col 9)-(line 1238,col 81)",
        "(line 1239,col 9)-(line 1239,col 81)",
        "(line 1240,col 9)-(line 1240,col 82)",
        "(line 1241,col 9)-(line 1241,col 83)",
        "(line 1243,col 9)-(line 1243,col 80)",
        "(line 1244,col 9)-(line 1244,col 81)",
        "(line 1245,col 9)-(line 1245,col 82)",
        "(line 1246,col 9)-(line 1246,col 82)",
        "(line 1247,col 9)-(line 1247,col 83)",
        "(line 1248,col 9)-(line 1248,col 84)",
        "(line 1250,col 9)-(line 1250,col 84)",
        "(line 1251,col 9)-(line 1251,col 85)",
        "(line 1252,col 9)-(line 1252,col 86)",
        "(line 1253,col 9)-(line 1253,col 86)",
        "(line 1254,col 9)-(line 1254,col 87)",
        "(line 1255,col 9)-(line 1255,col 88)",
        "(line 1256,col 9)-(line 1256,col 91)",
        "(line 1257,col 9)-(line 1257,col 93)",
        "(line 1259,col 9)-(line 1259,col 84)",
        "(line 1260,col 9)-(line 1260,col 85)",
        "(line 1261,col 9)-(line 1261,col 86)",
        "(line 1262,col 9)-(line 1262,col 86)",
        "(line 1263,col 9)-(line 1263,col 87)",
        "(line 1264,col 9)-(line 1264,col 88)",
        "(line 1265,col 9)-(line 1265,col 91)",
        "(line 1266,col 9)-(line 1266,col 93)",
        "(line 1267,col 9)-(line 1267,col 91)",
        "(line 1268,col 9)-(line 1268,col 93)",
        "(line 1270,col 9)-(line 1270,col 82)",
        "(line 1271,col 9)-(line 1271,col 83)",
        "(line 1272,col 9)-(line 1272,col 84)",
        "(line 1273,col 9)-(line 1273,col 84)",
        "(line 1274,col 9)-(line 1274,col 85)",
        "(line 1275,col 9)-(line 1275,col 86)",
        "(line 1276,col 9)-(line 1276,col 89)",
        "(line 1277,col 9)-(line 1277,col 91)",
        "(line 1279,col 9)-(line 1279,col 92)",
        "(line 1280,col 9)-(line 1280,col 90)",
        "(line 1282,col 9)-(line 1287,col 9)",
        "(line 1289,col 9)-(line 1289,col 77)",
        "(line 1290,col 9)-(line 1290,col 78)",
        "(line 1291,col 9)-(line 1291,col 79)",
        "(line 1292,col 9)-(line 1292,col 79)",
        "(line 1293,col 9)-(line 1293,col 80)",
        "(line 1294,col 9)-(line 1294,col 81)",
        "(line 1296,col 9)-(line 1301,col 9)",
        "(line 1304,col 9)-(line 1304,col 79)",
        "(line 1305,col 9)-(line 1305,col 59)",
        "(line 1306,col 9)-(line 1306,col 97)",
        "(line 1307,col 9)-(line 1307,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1310,
      "end_line": 1314,
      "comment": "",
      "child_ranges": [
        "(line 1311,col 9)-(line 1311,col 57)",
        "(line 1312,col 9)-(line 1312,col 57)",
        "(line 1313,col 9)-(line 1313,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1316,
      "end_line": 1322,
      "comment": "",
      "child_ranges": [
        "(line 1317,col 9)-(line 1317,col 27)",
        "(line 1318,col 9)-(line 1318,col 54)",
        "(line 1319,col 9)-(line 1319,col 54)",
        "(line 1320,col 9)-(line 1320,col 56)",
        "(line 1321,col 9)-(line 1321,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1324,
      "end_line": 1330,
      "comment": "",
      "child_ranges": [
        "(line 1325,col 9)-(line 1325,col 27)",
        "(line 1326,col 9)-(line 1326,col 56)",
        "(line 1327,col 9)-(line 1327,col 56)",
        "(line 1328,col 9)-(line 1328,col 58)",
        "(line 1329,col 9)-(line 1329,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1332,
      "end_line": 1336,
      "comment": "",
      "child_ranges": [
        "(line 1333,col 9)-(line 1333,col 43)",
        "(line 1334,col 9)-(line 1334,col 43)",
        "(line 1335,col 9)-(line 1335,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1338,
      "end_line": 1342,
      "comment": "",
      "child_ranges": [
        "(line 1339,col 9)-(line 1339,col 45)",
        "(line 1340,col 9)-(line 1340,col 45)",
        "(line 1341,col 9)-(line 1341,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1344,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1345,col 9)-(line 1345,col 59)",
        "(line 1346,col 9)-(line 1346,col 59)",
        "(line 1347,col 9)-(line 1347,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1350,
      "end_line": 1354,
      "comment": "",
      "child_ranges": [
        "(line 1351,col 9)-(line 1351,col 23)",
        "(line 1352,col 9)-(line 1352,col 35)",
        "(line 1353,col 9)-(line 1353,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1356,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1360,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1361,col 9)-(line 1361,col 36)",
        "(line 1362,col 9)-(line 1362,col 39)",
        "(line 1363,col 9)-(line 1363,col 57)",
        "(line 1364,col 9)-(line 1364,col 68)",
        "(line 1365,col 9)-(line 1365,col 62)",
        "(line 1366,col 9)-(line 1370,col 9)",
        "(line 1371,col 9)-(line 1375,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1378,
      "end_line": 1386,
      "comment": "",
      "child_ranges": [
        "(line 1379,col 9)-(line 1379,col 36)",
        "(line 1380,col 9)-(line 1385,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1388,
      "end_line": 1401,
      "comment": "",
      "child_ranges": [
        "(line 1389,col 9)-(line 1389,col 34)",
        "(line 1390,col 9)-(line 1390,col 34)",
        "(line 1391,col 9)-(line 1391,col 57)",
        "(line 1392,col 9)-(line 1392,col 57)",
        "(line 1393,col 9)-(line 1393,col 58)",
        "(line 1394,col 9)-(line 1394,col 62)",
        "(line 1396,col 9)-(line 1396,col 64)",
        "(line 1397,col 9)-(line 1397,col 63)",
        "(line 1398,col 9)-(line 1398,col 44)",
        "(line 1399,col 9)-(line 1399,col 45)",
        "(line 1400,col 9)-(line 1400,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1403,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1404,col 9)-(line 1409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1413,
      "end_line": 1487,
      "comment": "",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 55)",
        "(line 1416,col 9)-(line 1416,col 46)",
        "(line 1417,col 9)-(line 1422,col 9)",
        "(line 1424,col 9)-(line 1424,col 56)",
        "(line 1425,col 9)-(line 1425,col 47)",
        "(line 1426,col 9)-(line 1431,col 9)",
        "(line 1433,col 9)-(line 1433,col 57)",
        "(line 1434,col 9)-(line 1434,col 48)",
        "(line 1435,col 9)-(line 1440,col 9)",
        "(line 1442,col 9)-(line 1442,col 58)",
        "(line 1443,col 9)-(line 1443,col 49)",
        "(line 1444,col 9)-(line 1449,col 9)",
        "(line 1451,col 9)-(line 1451,col 55)",
        "(line 1452,col 9)-(line 1452,col 83)",
        "(line 1453,col 9)-(line 1453,col 66)",
        "(line 1454,col 9)-(line 1459,col 9)",
        "(line 1461,col 9)-(line 1461,col 84)",
        "(line 1462,col 9)-(line 1462,col 67)",
        "(line 1463,col 9)-(line 1468,col 9)",
        "(line 1470,col 9)-(line 1470,col 104)",
        "(line 1471,col 9)-(line 1471,col 80)",
        "(line 1472,col 9)-(line 1477,col 9)",
        "(line 1479,col 9)-(line 1482,col 76)",
        "(line 1483,col 9)-(line 1483,col 60)",
        "(line 1484,col 9)-(line 1484,col 61)",
        "(line 1485,col 9)-(line 1485,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1489,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1490,col 9)-(line 1490,col 36)",
        "(line 1491,col 9)-(line 1491,col 36)",
        "(line 1492,col 9)-(line 1492,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1495,
      "end_line": 1499,
      "comment": "",
      "child_ranges": [
        "(line 1496,col 9)-(line 1496,col 28)",
        "(line 1497,col 9)-(line 1497,col 28)",
        "(line 1498,col 9)-(line 1498,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1501,
      "end_line": 1505,
      "comment": "",
      "child_ranges": [
        "(line 1502,col 9)-(line 1502,col 36)",
        "(line 1503,col 9)-(line 1503,col 36)",
        "(line 1504,col 9)-(line 1504,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1507,
      "end_line": 1511,
      "comment": "",
      "child_ranges": [
        "(line 1508,col 9)-(line 1508,col 28)",
        "(line 1509,col 9)-(line 1509,col 28)",
        "(line 1510,col 9)-(line 1510,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1513,
      "end_line": 1517,
      "comment": "",
      "child_ranges": [
        "(line 1514,col 9)-(line 1514,col 36)",
        "(line 1515,col 9)-(line 1515,col 36)",
        "(line 1516,col 9)-(line 1516,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1519,
      "end_line": 1523,
      "comment": "",
      "child_ranges": [
        "(line 1520,col 9)-(line 1520,col 28)",
        "(line 1521,col 9)-(line 1521,col 28)",
        "(line 1522,col 9)-(line 1522,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1525,
      "end_line": 1563,
      "comment": "",
      "child_ranges": [
        "(line 1526,col 9)-(line 1527,col 72)",
        "(line 1528,col 9)-(line 1529,col 73)",
        "(line 1530,col 9)-(line 1531,col 72)",
        "(line 1532,col 9)-(line 1533,col 73)",
        "(line 1535,col 9)-(line 1541,col 9)",
        "(line 1542,col 9)-(line 1548,col 9)",
        "(line 1549,col 9)-(line 1555,col 9)",
        "(line 1556,col 9)-(line 1562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1565,
      "end_line": 1603,
      "comment": "",
      "child_ranges": [
        "(line 1566,col 9)-(line 1571,col 9)",
        "(line 1572,col 9)-(line 1577,col 9)",
        "(line 1578,col 9)-(line 1583,col 9)",
        "(line 1585,col 9)-(line 1590,col 9)",
        "(line 1591,col 9)-(line 1596,col 9)",
        "(line 1597,col 9)-(line 1602,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1605,
      "end_line": 1631,
      "comment": "",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 49)",
        "(line 1607,col 9)-(line 1607,col 49)",
        "(line 1608,col 9)-(line 1608,col 49)",
        "(line 1610,col 9)-(line 1610,col 42)",
        "(line 1612,col 9)-(line 1612,col 47)",
        "(line 1613,col 9)-(line 1613,col 47)",
        "(line 1614,col 9)-(line 1614,col 47)",
        "(line 1616,col 9)-(line 1616,col 45)",
        "(line 1617,col 9)-(line 1617,col 45)",
        "(line 1618,col 9)-(line 1618,col 45)",
        "(line 1620,col 9)-(line 1620,col 45)",
        "(line 1621,col 9)-(line 1621,col 45)",
        "(line 1622,col 9)-(line 1622,col 45)",
        "(line 1624,col 9)-(line 1624,col 46)",
        "(line 1625,col 9)-(line 1625,col 46)",
        "(line 1626,col 9)-(line 1626,col 46)",
        "(line 1628,col 9)-(line 1628,col 47)",
        "(line 1629,col 9)-(line 1629,col 47)",
        "(line 1630,col 9)-(line 1630,col 47)"
      ]
    }
  ]
}
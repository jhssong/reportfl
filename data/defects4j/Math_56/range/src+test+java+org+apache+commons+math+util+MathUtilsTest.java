{
  "filepath": "/tmp/Math-56b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 41,
      "end_line": 1730,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 310,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 312,col 7)-(line 312,col 72)",
        "(line 313,col 7)-(line 313,col 72)",
        "(line 314,col 7)-(line 314,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 317,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 23)",
        "(line 320,col 9)-(line 320,col 35)",
        "(line 321,col 9)-(line 321,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 324,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 329,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 336,col 17)",
        "(line 337,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 350,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 71)",
        "(line 353,col 9)-(line 353,col 71)",
        "(line 354,col 9)-(line 354,col 71)",
        "(line 355,col 9)-(line 355,col 72)",
        "(line 356,col 9)-(line 356,col 72)",
        "(line 357,col 9)-(line 357,col 74)",
        "(line 358,col 9)-(line 358,col 101)",
        "(line 359,col 9)-(line 359,col 101)",
        "(line 360,col 9)-(line 360,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 363,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 47)",
        "(line 366,col 9)-(line 366,col 44)",
        "(line 368,col 9)-(line 368,col 42)",
        "(line 372,col 9)-(line 372,col 62)",
        "(line 374,col 9)-(line 374,col 44)",
        "(line 375,col 9)-(line 375,col 35)",
        "(line 378,col 9)-(line 378,col 56)",
        "(line 379,col 9)-(line 379,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 382,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 83)",
        "(line 385,col 9)-(line 385,col 83)",
        "(line 386,col 9)-(line 386,col 83)",
        "(line 387,col 9)-(line 387,col 85)",
        "(line 388,col 9)-(line 388,col 113)",
        "(line 389,col 9)-(line 389,col 113)",
        "(line 390,col 9)-(line 390,col 114)",
        "(line 391,col 9)-(line 391,col 84)",
        "(line 392,col 9)-(line 392,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 396,
      "end_line": 427,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 74)",
        "(line 399,col 9)-(line 399,col 85)",
        "(line 400,col 9)-(line 400,col 30)",
        "(line 401,col 9)-(line 401,col 135)",
        "(line 402,col 9)-(line 402,col 146)",
        "(line 403,col 9)-(line 403,col 147)",
        "(line 405,col 9)-(line 405,col 63)",
        "(line 418,col 9)-(line 418,col 97)",
        "(line 419,col 9)-(line 419,col 90)",
        "(line 421,col 9)-(line 421,col 97)",
        "(line 422,col 9)-(line 422,col 90)",
        "(line 424,col 9)-(line 424,col 70)",
        "(line 426,col 9)-(line 426,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 429,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 58)",
        "(line 433,col 9)-(line 433,col 74)",
        "(line 434,col 9)-(line 434,col 79)",
        "(line 436,col 9)-(line 436,col 77)",
        "(line 437,col 9)-(line 437,col 80)",
        "(line 438,col 9)-(line 438,col 58)",
        "(line 439,col 9)-(line 439,col 60)",
        "(line 440,col 9)-(line 440,col 60)",
        "(line 442,col 9)-(line 442,col 70)",
        "(line 443,col 9)-(line 443,col 71)",
        "(line 445,col 9)-(line 445,col 61)",
        "(line 447,col 9)-(line 447,col 74)",
        "(line 448,col 9)-(line 448,col 75)",
        "(line 449,col 9)-(line 449,col 74)",
        "(line 450,col 9)-(line 450,col 73)",
        "(line 452,col 9)-(line 452,col 76)",
        "(line 453,col 9)-(line 453,col 77)",
        "(line 454,col 9)-(line 454,col 76)",
        "(line 455,col 9)-(line 455,col 77)",
        "(line 457,col 9)-(line 457,col 99)",
        "(line 458,col 9)-(line 458,col 91)",
        "(line 460,col 9)-(line 460,col 99)",
        "(line 461,col 9)-(line 461,col 92)",
        "(line 463,col 9)-(line 463,col 72)",
        "(line 465,col 9)-(line 465,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 468,
      "end_line": 505,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 70)",
        "(line 472,col 9)-(line 472,col 86)",
        "(line 473,col 9)-(line 473,col 91)",
        "(line 475,col 9)-(line 475,col 77)",
        "(line 476,col 9)-(line 476,col 80)",
        "(line 477,col 9)-(line 477,col 70)",
        "(line 478,col 9)-(line 478,col 72)",
        "(line 479,col 9)-(line 479,col 72)",
        "(line 481,col 9)-(line 481,col 82)",
        "(line 482,col 9)-(line 482,col 83)",
        "(line 484,col 9)-(line 484,col 73)",
        "(line 486,col 9)-(line 486,col 86)",
        "(line 487,col 9)-(line 487,col 87)",
        "(line 488,col 9)-(line 488,col 86)",
        "(line 489,col 9)-(line 489,col 85)",
        "(line 491,col 9)-(line 491,col 88)",
        "(line 492,col 9)-(line 492,col 89)",
        "(line 493,col 9)-(line 493,col 88)",
        "(line 494,col 9)-(line 494,col 89)",
        "(line 496,col 9)-(line 496,col 111)",
        "(line 497,col 9)-(line 497,col 103)",
        "(line 499,col 9)-(line 499,col 111)",
        "(line 500,col 9)-(line 500,col 104)",
        "(line 502,col 9)-(line 502,col 83)",
        "(line 504,col 9)-(line 504,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 507,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 72)",
        "(line 510,col 9)-(line 510,col 72)",
        "(line 511,col 9)-(line 511,col 78)",
        "(line 513,col 9)-(line 513,col 81)",
        "(line 514,col 9)-(line 514,col 86)",
        "(line 515,col 9)-(line 521,col 40)",
        "(line 522,col 9)-(line 523,col 67)",
        "(line 524,col 9)-(line 525,col 81)",
        "(line 526,col 9)-(line 527,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 531,
      "end_line": 550,
      "comment": "",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 84)",
        "(line 534,col 9)-(line 534,col 84)",
        "(line 535,col 9)-(line 535,col 90)",
        "(line 537,col 9)-(line 537,col 93)",
        "(line 538,col 9)-(line 538,col 98)",
        "(line 539,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 547,col 93)",
        "(line 548,col 9)-(line 549,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 552,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 558,col 9)",
        "(line 560,col 9)-(line 560,col 60)",
        "(line 561,col 9)-(line 561,col 76)",
        "(line 562,col 9)-(line 562,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 565,
      "end_line": 592,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 572,col 9)",
        "(line 573,col 9)-(line 578,col 9)",
        "(line 579,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 590,col 9)",
        "(line 591,col 9)-(line 591,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 594,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 19)",
        "(line 597,col 9)-(line 597,col 19)",
        "(line 598,col 9)-(line 598,col 19)",
        "(line 600,col 9)-(line 600,col 52)",
        "(line 602,col 9)-(line 602,col 52)",
        "(line 603,col 9)-(line 603,col 52)",
        "(line 604,col 9)-(line 604,col 53)",
        "(line 605,col 9)-(line 605,col 53)",
        "(line 607,col 9)-(line 607,col 53)",
        "(line 608,col 9)-(line 608,col 54)",
        "(line 609,col 9)-(line 609,col 54)",
        "(line 610,col 9)-(line 610,col 55)",
        "(line 612,col 9)-(line 612,col 52)",
        "(line 613,col 9)-(line 613,col 53)",
        "(line 614,col 9)-(line 614,col 53)",
        "(line 615,col 9)-(line 615,col 54)",
        "(line 617,col 9)-(line 617,col 82)",
        "(line 619,col 9)-(line 619,col 84)",
        "(line 620,col 9)-(line 620,col 85)",
        "(line 621,col 9)-(line 621,col 77)",
        "(line 622,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 642,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 645,
      "end_line": 696,
      "comment": "",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 20)",
        "(line 648,col 9)-(line 648,col 20)",
        "(line 649,col 9)-(line 649,col 20)",
        "(line 651,col 9)-(line 651,col 53)",
        "(line 653,col 9)-(line 653,col 52)",
        "(line 654,col 9)-(line 654,col 52)",
        "(line 655,col 9)-(line 655,col 53)",
        "(line 656,col 9)-(line 656,col 53)",
        "(line 658,col 9)-(line 658,col 53)",
        "(line 659,col 9)-(line 659,col 54)",
        "(line 660,col 9)-(line 660,col 54)",
        "(line 661,col 9)-(line 661,col 55)",
        "(line 663,col 9)-(line 663,col 52)",
        "(line 664,col 9)-(line 664,col 53)",
        "(line 665,col 9)-(line 665,col 53)",
        "(line 666,col 9)-(line 666,col 54)",
        "(line 668,col 9)-(line 668,col 88)",
        "(line 670,col 9)-(line 670,col 75)",
        "(line 672,col 9)-(line 672,col 79)",
        "(line 673,col 9)-(line 673,col 80)",
        "(line 674,col 9)-(line 674,col 72)",
        "(line 675,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 695,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 698,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 71)",
        "(line 701,col 9)-(line 701,col 61)",
        "(line 702,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 705,col 57)",
        "(line 706,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 722,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 733,col 31)",
        "(line 734,col 9)-(line 744,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 747,
      "end_line": 762,
      "comment": "",
      "child_ranges": [
        "(line 749,col 9)-(line 749,col 64)",
        "(line 750,col 9)-(line 757,col 40)",
        "(line 758,col 9)-(line 759,col 81)",
        "(line 760,col 9)-(line 761,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 767,
      "end_line": 792,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 769,col 9)-(line 769,col 43)",
        "(line 770,col 9)-(line 770,col 43)",
        "(line 771,col 9)-(line 771,col 53)",
        "(line 774,col 9)-(line 776,col 9)",
        "(line 779,col 9)-(line 779,col 34)",
        "(line 780,col 9)-(line 788,col 29)",
        "(line 791,col 9)-(line 791,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 794,
      "end_line": 799,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 67)",
        "(line 797,col 9)-(line 797,col 67)",
        "(line 798,col 9)-(line 798,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 801,
      "end_line": 808,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 27)",
        "(line 804,col 9)-(line 804,col 66)",
        "(line 805,col 9)-(line 805,col 66)",
        "(line 806,col 9)-(line 806,col 68)",
        "(line 807,col 9)-(line 807,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 810,
      "end_line": 816,
      "comment": "",
      "child_ranges": [
        "(line 812,col 9)-(line 812,col 27)",
        "(line 813,col 9)-(line 813,col 68)",
        "(line 814,col 9)-(line 814,col 68)",
        "(line 815,col 9)-(line 815,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 818,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 820,col 57)",
        "(line 821,col 9)-(line 821,col 57)",
        "(line 822,col 9)-(line 822,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 825,
      "end_line": 830,
      "comment": "",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 57)",
        "(line 828,col 9)-(line 828,col 57)",
        "(line 829,col 9)-(line 829,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 832,
      "end_line": 837,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 834,col 69)",
        "(line 835,col 9)-(line 835,col 69)",
        "(line 836,col 9)-(line 836,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 839,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 841,col 9)-(line 841,col 19)",
        "(line 842,col 9)-(line 842,col 19)",
        "(line 843,col 9)-(line 843,col 19)",
        "(line 845,col 9)-(line 845,col 52)",
        "(line 846,col 9)-(line 846,col 52)",
        "(line 847,col 9)-(line 847,col 52)",
        "(line 848,col 9)-(line 848,col 52)",
        "(line 849,col 9)-(line 849,col 54)",
        "(line 850,col 9)-(line 850,col 55)",
        "(line 851,col 9)-(line 851,col 55)",
        "(line 852,col 9)-(line 852,col 56)",
        "(line 853,col 9)-(line 853,col 55)",
        "(line 857,col 9)-(line 857,col 77)",
        "(line 860,col 9)-(line 860,col 52)",
        "(line 862,col 9)-(line 868,col 9)",
        "(line 870,col 9)-(line 876,col 9)",
        "(line 878,col 9)-(line 883,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 886,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 20)",
        "(line 889,col 9)-(line 889,col 20)",
        "(line 890,col 9)-(line 890,col 20)",
        "(line 892,col 9)-(line 892,col 52)",
        "(line 893,col 9)-(line 893,col 52)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 52)",
        "(line 896,col 9)-(line 896,col 54)",
        "(line 897,col 9)-(line 897,col 55)",
        "(line 898,col 9)-(line 898,col 55)",
        "(line 899,col 9)-(line 899,col 56)",
        "(line 900,col 9)-(line 900,col 55)",
        "(line 902,col 9)-(line 902,col 85)",
        "(line 906,col 9)-(line 906,col 80)",
        "(line 909,col 9)-(line 909,col 55)",
        "(line 911,col 9)-(line 917,col 9)",
        "(line 919,col 9)-(line 925,col 9)",
        "(line 927,col 9)-(line 928,col 75)",
        "(line 929,col 9)-(line 934,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 937,
      "end_line": 946,
      "comment": "",
      "child_ranges": [
        "(line 939,col 9)-(line 939,col 57)",
        "(line 940,col 9)-(line 940,col 57)",
        "(line 941,col 9)-(line 941,col 62)",
        "(line 942,col 9)-(line 942,col 62)",
        "(line 943,col 9)-(line 943,col 61)",
        "(line 944,col 9)-(line 944,col 56)",
        "(line 945,col 9)-(line 945,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 948,
      "end_line": 963,
      "comment": "",
      "child_ranges": [
        "(line 950,col 9)-(line 950,col 36)",
        "(line 951,col 9)-(line 951,col 39)",
        "(line 952,col 9)-(line 952,col 64)",
        "(line 953,col 9)-(line 957,col 9)",
        "(line 958,col 9)-(line 962,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 965,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 967,col 9)-(line 967,col 34)",
        "(line 968,col 9)-(line 968,col 34)",
        "(line 969,col 9)-(line 969,col 65)",
        "(line 970,col 9)-(line 970,col 65)",
        "(line 971,col 9)-(line 971,col 64)",
        "(line 972,col 9)-(line 972,col 64)",
        "(line 973,col 9)-(line 973,col 65)",
        "(line 974,col 9)-(line 974,col 65)",
        "(line 975,col 9)-(line 975,col 64)",
        "(line 976,col 9)-(line 976,col 64)",
        "(line 977,col 9)-(line 977,col 65)",
        "(line 978,col 9)-(line 978,col 68)",
        "(line 979,col 9)-(line 979,col 44)",
        "(line 980,col 9)-(line 980,col 44)",
        "(line 981,col 9)-(line 981,col 44)",
        "(line 982,col 9)-(line 982,col 44)",
        "(line 983,col 9)-(line 983,col 45)",
        "(line 984,col 9)-(line 984,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 987,
      "end_line": 994,
      "comment": "",
      "child_ranges": [
        "(line 988,col 9)-(line 993,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 996,
      "end_line": 1007,
      "comment": "",
      "child_ranges": [
        "(line 998,col 9)-(line 1006,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1009,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1011,col 9)-(line 1011,col 54)",
        "(line 1012,col 9)-(line 1015,col 34)",
        "(line 1017,col 9)-(line 1017,col 56)",
        "(line 1018,col 9)-(line 1021,col 34)",
        "(line 1024,col 9)-(line 1024,col 80)",
        "(line 1025,col 9)-(line 1028,col 34)",
        "(line 1031,col 9)-(line 1031,col 48)",
        "(line 1032,col 9)-(line 1035,col 47)",
        "(line 1038,col 9)-(line 1038,col 75)",
        "(line 1039,col 9)-(line 1042,col 52)",
        "(line 1045,col 9)-(line 1048,col 52)",
        "(line 1051,col 9)-(line 1054,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1058,
      "end_line": 1165,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 31)",
        "(line 1061,col 9)-(line 1061,col 62)",
        "(line 1062,col 9)-(line 1062,col 63)",
        "(line 1063,col 9)-(line 1063,col 64)",
        "(line 1066,col 9)-(line 1066,col 68)",
        "(line 1067,col 9)-(line 1067,col 91)",
        "(line 1068,col 9)-(line 1068,col 25)",
        "(line 1069,col 9)-(line 1069,col 31)",
        "(line 1070,col 9)-(line 1070,col 64)",
        "(line 1073,col 9)-(line 1073,col 70)",
        "(line 1074,col 9)-(line 1074,col 70)",
        "(line 1075,col 9)-(line 1075,col 70)",
        "(line 1076,col 9)-(line 1076,col 70)",
        "(line 1077,col 9)-(line 1077,col 71)",
        "(line 1078,col 9)-(line 1078,col 71)",
        "(line 1079,col 9)-(line 1079,col 71)",
        "(line 1080,col 9)-(line 1080,col 71)",
        "(line 1081,col 9)-(line 1081,col 71)",
        "(line 1083,col 9)-(line 1083,col 88)",
        "(line 1084,col 9)-(line 1084,col 89)",
        "(line 1085,col 9)-(line 1085,col 90)",
        "(line 1086,col 9)-(line 1086,col 90)",
        "(line 1087,col 9)-(line 1087,col 91)",
        "(line 1088,col 9)-(line 1088,col 92)",
        "(line 1090,col 9)-(line 1090,col 85)",
        "(line 1091,col 9)-(line 1091,col 86)",
        "(line 1092,col 9)-(line 1092,col 87)",
        "(line 1093,col 9)-(line 1093,col 87)",
        "(line 1094,col 9)-(line 1094,col 88)",
        "(line 1095,col 9)-(line 1095,col 89)",
        "(line 1097,col 9)-(line 1097,col 86)",
        "(line 1098,col 9)-(line 1098,col 87)",
        "(line 1099,col 9)-(line 1099,col 88)",
        "(line 1100,col 9)-(line 1100,col 88)",
        "(line 1101,col 9)-(line 1101,col 89)",
        "(line 1102,col 9)-(line 1102,col 90)",
        "(line 1104,col 9)-(line 1104,col 90)",
        "(line 1105,col 9)-(line 1105,col 91)",
        "(line 1106,col 9)-(line 1106,col 92)",
        "(line 1107,col 9)-(line 1107,col 92)",
        "(line 1108,col 9)-(line 1108,col 93)",
        "(line 1109,col 9)-(line 1109,col 94)",
        "(line 1110,col 9)-(line 1110,col 96)",
        "(line 1111,col 9)-(line 1111,col 98)",
        "(line 1113,col 9)-(line 1113,col 90)",
        "(line 1114,col 9)-(line 1114,col 91)",
        "(line 1115,col 9)-(line 1115,col 92)",
        "(line 1116,col 9)-(line 1116,col 92)",
        "(line 1117,col 9)-(line 1117,col 93)",
        "(line 1118,col 9)-(line 1118,col 94)",
        "(line 1119,col 9)-(line 1119,col 96)",
        "(line 1120,col 9)-(line 1120,col 98)",
        "(line 1121,col 9)-(line 1121,col 96)",
        "(line 1122,col 9)-(line 1122,col 98)",
        "(line 1124,col 9)-(line 1124,col 88)",
        "(line 1125,col 9)-(line 1125,col 89)",
        "(line 1126,col 9)-(line 1126,col 90)",
        "(line 1127,col 9)-(line 1127,col 90)",
        "(line 1128,col 9)-(line 1128,col 91)",
        "(line 1129,col 9)-(line 1129,col 92)",
        "(line 1130,col 9)-(line 1130,col 94)",
        "(line 1131,col 9)-(line 1131,col 96)",
        "(line 1133,col 9)-(line 1133,col 97)",
        "(line 1134,col 9)-(line 1134,col 95)",
        "(line 1136,col 9)-(line 1141,col 9)",
        "(line 1143,col 9)-(line 1143,col 83)",
        "(line 1144,col 9)-(line 1144,col 84)",
        "(line 1145,col 9)-(line 1145,col 85)",
        "(line 1146,col 9)-(line 1146,col 85)",
        "(line 1147,col 9)-(line 1147,col 86)",
        "(line 1148,col 9)-(line 1148,col 87)",
        "(line 1150,col 9)-(line 1155,col 9)",
        "(line 1158,col 9)-(line 1158,col 94)",
        "(line 1161,col 9)-(line 1161,col 80)",
        "(line 1162,col 9)-(line 1162,col 63)",
        "(line 1163,col 9)-(line 1163,col 105)",
        "(line 1164,col 9)-(line 1164,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1167,
      "end_line": 1262,
      "comment": "",
      "child_ranges": [
        "(line 1169,col 9)-(line 1169,col 31)",
        "(line 1170,col 9)-(line 1170,col 63)",
        "(line 1171,col 9)-(line 1171,col 64)",
        "(line 1172,col 9)-(line 1172,col 65)",
        "(line 1175,col 9)-(line 1175,col 70)",
        "(line 1176,col 9)-(line 1176,col 70)",
        "(line 1177,col 9)-(line 1177,col 71)",
        "(line 1178,col 9)-(line 1178,col 71)",
        "(line 1179,col 9)-(line 1179,col 71)",
        "(line 1180,col 9)-(line 1180,col 71)",
        "(line 1181,col 9)-(line 1181,col 71)",
        "(line 1183,col 9)-(line 1183,col 89)",
        "(line 1184,col 9)-(line 1184,col 90)",
        "(line 1185,col 9)-(line 1185,col 91)",
        "(line 1186,col 9)-(line 1186,col 91)",
        "(line 1187,col 9)-(line 1187,col 92)",
        "(line 1188,col 9)-(line 1188,col 93)",
        "(line 1190,col 9)-(line 1190,col 86)",
        "(line 1191,col 9)-(line 1191,col 87)",
        "(line 1192,col 9)-(line 1192,col 88)",
        "(line 1193,col 9)-(line 1193,col 88)",
        "(line 1194,col 9)-(line 1194,col 89)",
        "(line 1195,col 9)-(line 1195,col 90)",
        "(line 1197,col 9)-(line 1197,col 87)",
        "(line 1198,col 9)-(line 1198,col 88)",
        "(line 1199,col 9)-(line 1199,col 89)",
        "(line 1200,col 9)-(line 1200,col 89)",
        "(line 1201,col 9)-(line 1201,col 90)",
        "(line 1202,col 9)-(line 1202,col 91)",
        "(line 1204,col 9)-(line 1204,col 91)",
        "(line 1205,col 9)-(line 1205,col 92)",
        "(line 1206,col 9)-(line 1206,col 93)",
        "(line 1207,col 9)-(line 1207,col 93)",
        "(line 1208,col 9)-(line 1208,col 94)",
        "(line 1209,col 9)-(line 1209,col 95)",
        "(line 1210,col 9)-(line 1210,col 98)",
        "(line 1211,col 9)-(line 1211,col 100)",
        "(line 1213,col 9)-(line 1213,col 91)",
        "(line 1214,col 9)-(line 1214,col 92)",
        "(line 1215,col 9)-(line 1215,col 93)",
        "(line 1216,col 9)-(line 1216,col 93)",
        "(line 1217,col 9)-(line 1217,col 94)",
        "(line 1218,col 9)-(line 1218,col 95)",
        "(line 1219,col 9)-(line 1219,col 98)",
        "(line 1220,col 9)-(line 1220,col 100)",
        "(line 1221,col 9)-(line 1221,col 98)",
        "(line 1222,col 9)-(line 1222,col 100)",
        "(line 1224,col 9)-(line 1224,col 89)",
        "(line 1225,col 9)-(line 1225,col 90)",
        "(line 1226,col 9)-(line 1226,col 91)",
        "(line 1227,col 9)-(line 1227,col 91)",
        "(line 1228,col 9)-(line 1228,col 92)",
        "(line 1229,col 9)-(line 1229,col 93)",
        "(line 1230,col 9)-(line 1230,col 96)",
        "(line 1231,col 9)-(line 1231,col 98)",
        "(line 1233,col 9)-(line 1233,col 99)",
        "(line 1234,col 9)-(line 1234,col 97)",
        "(line 1236,col 9)-(line 1241,col 9)",
        "(line 1243,col 9)-(line 1243,col 84)",
        "(line 1244,col 9)-(line 1244,col 85)",
        "(line 1245,col 9)-(line 1245,col 86)",
        "(line 1246,col 9)-(line 1246,col 86)",
        "(line 1247,col 9)-(line 1247,col 87)",
        "(line 1248,col 9)-(line 1248,col 88)",
        "(line 1250,col 9)-(line 1255,col 9)",
        "(line 1258,col 9)-(line 1258,col 79)",
        "(line 1259,col 9)-(line 1259,col 66)",
        "(line 1260,col 9)-(line 1260,col 104)",
        "(line 1261,col 9)-(line 1261,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1264,
      "end_line": 1269,
      "comment": "",
      "child_ranges": [
        "(line 1266,col 9)-(line 1266,col 64)",
        "(line 1267,col 9)-(line 1267,col 64)",
        "(line 1268,col 9)-(line 1268,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1271,
      "end_line": 1278,
      "comment": "",
      "child_ranges": [
        "(line 1273,col 9)-(line 1273,col 27)",
        "(line 1274,col 9)-(line 1274,col 61)",
        "(line 1275,col 9)-(line 1275,col 61)",
        "(line 1276,col 9)-(line 1276,col 63)",
        "(line 1277,col 9)-(line 1277,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1280,
      "end_line": 1287,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 27)",
        "(line 1283,col 9)-(line 1283,col 63)",
        "(line 1284,col 9)-(line 1284,col 63)",
        "(line 1285,col 9)-(line 1285,col 65)",
        "(line 1286,col 9)-(line 1286,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1289,
      "end_line": 1294,
      "comment": "",
      "child_ranges": [
        "(line 1291,col 9)-(line 1291,col 50)",
        "(line 1292,col 9)-(line 1292,col 50)",
        "(line 1293,col 9)-(line 1293,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1296,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 52)",
        "(line 1299,col 9)-(line 1299,col 52)",
        "(line 1300,col 9)-(line 1300,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1303,
      "end_line": 1308,
      "comment": "",
      "child_ranges": [
        "(line 1305,col 9)-(line 1305,col 66)",
        "(line 1306,col 9)-(line 1306,col 66)",
        "(line 1307,col 9)-(line 1307,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1310,
      "end_line": 1315,
      "comment": "",
      "child_ranges": [
        "(line 1312,col 9)-(line 1312,col 23)",
        "(line 1313,col 9)-(line 1313,col 35)",
        "(line 1314,col 9)-(line 1314,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1317,
      "end_line": 1320,
      "comment": "",
      "child_ranges": [
        "(line 1319,col 9)-(line 1319,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1322,
      "end_line": 1339,
      "comment": "",
      "child_ranges": [
        "(line 1324,col 9)-(line 1324,col 36)",
        "(line 1325,col 9)-(line 1325,col 39)",
        "(line 1326,col 9)-(line 1326,col 64)",
        "(line 1327,col 9)-(line 1327,col 75)",
        "(line 1328,col 9)-(line 1328,col 69)",
        "(line 1329,col 9)-(line 1333,col 9)",
        "(line 1334,col 9)-(line 1338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1341,
      "end_line": 1350,
      "comment": "",
      "child_ranges": [
        "(line 1343,col 9)-(line 1343,col 36)",
        "(line 1344,col 9)-(line 1349,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1352,
      "end_line": 1366,
      "comment": "",
      "child_ranges": [
        "(line 1354,col 9)-(line 1354,col 34)",
        "(line 1355,col 9)-(line 1355,col 34)",
        "(line 1356,col 9)-(line 1356,col 64)",
        "(line 1357,col 9)-(line 1357,col 64)",
        "(line 1358,col 9)-(line 1358,col 65)",
        "(line 1359,col 9)-(line 1359,col 69)",
        "(line 1361,col 9)-(line 1361,col 71)",
        "(line 1362,col 9)-(line 1362,col 70)",
        "(line 1363,col 9)-(line 1363,col 44)",
        "(line 1364,col 9)-(line 1364,col 45)",
        "(line 1365,col 9)-(line 1365,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1368,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 9)-(line 1374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1378,
      "end_line": 1453,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 62)",
        "(line 1382,col 9)-(line 1382,col 53)",
        "(line 1383,col 9)-(line 1388,col 9)",
        "(line 1390,col 9)-(line 1390,col 63)",
        "(line 1391,col 9)-(line 1391,col 54)",
        "(line 1392,col 9)-(line 1397,col 9)",
        "(line 1399,col 9)-(line 1399,col 64)",
        "(line 1400,col 9)-(line 1400,col 55)",
        "(line 1401,col 9)-(line 1406,col 9)",
        "(line 1408,col 9)-(line 1408,col 65)",
        "(line 1409,col 9)-(line 1409,col 56)",
        "(line 1410,col 9)-(line 1415,col 9)",
        "(line 1417,col 9)-(line 1417,col 55)",
        "(line 1418,col 9)-(line 1418,col 90)",
        "(line 1419,col 9)-(line 1419,col 73)",
        "(line 1420,col 9)-(line 1425,col 9)",
        "(line 1427,col 9)-(line 1427,col 91)",
        "(line 1428,col 9)-(line 1428,col 74)",
        "(line 1429,col 9)-(line 1434,col 9)",
        "(line 1436,col 9)-(line 1436,col 111)",
        "(line 1437,col 9)-(line 1437,col 87)",
        "(line 1438,col 9)-(line 1443,col 9)",
        "(line 1445,col 9)-(line 1448,col 76)",
        "(line 1449,col 9)-(line 1449,col 67)",
        "(line 1450,col 9)-(line 1450,col 68)",
        "(line 1451,col 9)-(line 1451,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1455,
      "end_line": 1460,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 9)-(line 1457,col 36)",
        "(line 1458,col 9)-(line 1458,col 36)",
        "(line 1459,col 9)-(line 1459,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1462,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1464,col 9)-(line 1464,col 28)",
        "(line 1465,col 9)-(line 1465,col 28)",
        "(line 1466,col 9)-(line 1466,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1469,
      "end_line": 1474,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 36)",
        "(line 1472,col 9)-(line 1472,col 36)",
        "(line 1473,col 9)-(line 1473,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1476,
      "end_line": 1481,
      "comment": "",
      "child_ranges": [
        "(line 1478,col 9)-(line 1478,col 28)",
        "(line 1479,col 9)-(line 1479,col 28)",
        "(line 1480,col 9)-(line 1480,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1483,
      "end_line": 1488,
      "comment": "",
      "child_ranges": [
        "(line 1485,col 9)-(line 1485,col 36)",
        "(line 1486,col 9)-(line 1486,col 36)",
        "(line 1487,col 9)-(line 1487,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1490,
      "end_line": 1495,
      "comment": "",
      "child_ranges": [
        "(line 1492,col 9)-(line 1492,col 28)",
        "(line 1493,col 9)-(line 1493,col 28)",
        "(line 1494,col 9)-(line 1494,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1497,
      "end_line": 1536,
      "comment": "",
      "child_ranges": [
        "(line 1499,col 9)-(line 1500,col 72)",
        "(line 1501,col 9)-(line 1502,col 73)",
        "(line 1503,col 9)-(line 1504,col 72)",
        "(line 1505,col 9)-(line 1506,col 73)",
        "(line 1508,col 9)-(line 1514,col 9)",
        "(line 1515,col 9)-(line 1521,col 9)",
        "(line 1522,col 9)-(line 1528,col 9)",
        "(line 1529,col 9)-(line 1535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1538,
      "end_line": 1577,
      "comment": "",
      "child_ranges": [
        "(line 1540,col 9)-(line 1545,col 9)",
        "(line 1546,col 9)-(line 1551,col 9)",
        "(line 1552,col 9)-(line 1557,col 9)",
        "(line 1559,col 9)-(line 1564,col 9)",
        "(line 1565,col 9)-(line 1570,col 9)",
        "(line 1571,col 9)-(line 1576,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1579,
      "end_line": 1606,
      "comment": "",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 49)",
        "(line 1582,col 9)-(line 1582,col 49)",
        "(line 1583,col 9)-(line 1583,col 49)",
        "(line 1585,col 9)-(line 1585,col 42)",
        "(line 1587,col 9)-(line 1587,col 54)",
        "(line 1588,col 9)-(line 1588,col 54)",
        "(line 1589,col 9)-(line 1589,col 54)",
        "(line 1591,col 9)-(line 1591,col 52)",
        "(line 1592,col 9)-(line 1592,col 52)",
        "(line 1593,col 9)-(line 1593,col 52)",
        "(line 1595,col 9)-(line 1595,col 52)",
        "(line 1596,col 9)-(line 1596,col 52)",
        "(line 1597,col 9)-(line 1597,col 52)",
        "(line 1599,col 9)-(line 1599,col 53)",
        "(line 1600,col 9)-(line 1600,col 53)",
        "(line 1601,col 9)-(line 1601,col 53)",
        "(line 1603,col 9)-(line 1603,col 54)",
        "(line 1604,col 9)-(line 1604,col 54)",
        "(line 1605,col 9)-(line 1605,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt()",
      "begin_line": 1608,
      "end_line": 1619,
      "comment": "",
      "child_ranges": [
        "(line 1610,col 9)-(line 1612,col 51)",
        "(line 1613,col 9)-(line 1613,col 52)",
        "(line 1615,col 9)-(line 1615,col 56)",
        "(line 1616,col 9)-(line 1618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt2()",
      "begin_line": 1621,
      "end_line": 1633,
      "comment": "",
      "child_ranges": [
        "(line 1623,col 9)-(line 1625,col 51)",
        "(line 1626,col 9)-(line 1626,col 29)",
        "(line 1627,col 9)-(line 1627,col 76)",
        "(line 1629,col 9)-(line 1629,col 65)",
        "(line 1630,col 9)-(line 1632,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt3()",
      "begin_line": 1635,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1637,col 9)-(line 1639,col 51)",
        "(line 1640,col 9)-(line 1640,col 29)",
        "(line 1641,col 9)-(line 1641,col 76)",
        "(line 1643,col 9)-(line 1643,col 65)",
        "(line 1644,col 9)-(line 1646,col 9)",
        "(line 1647,col 9)-(line 1649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble()",
      "begin_line": 1652,
      "end_line": 1668,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 9)-(line 1661,col 61)",
        "(line 1662,col 9)-(line 1662,col 55)",
        "(line 1664,col 9)-(line 1664,col 56)",
        "(line 1665,col 9)-(line 1667,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble2()",
      "begin_line": 1670,
      "end_line": 1687,
      "comment": "",
      "child_ranges": [
        "(line 1672,col 9)-(line 1679,col 61)",
        "(line 1680,col 9)-(line 1680,col 29)",
        "(line 1681,col 9)-(line 1681,col 79)",
        "(line 1683,col 9)-(line 1683,col 65)",
        "(line 1684,col 9)-(line 1686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble3()",
      "begin_line": 1689,
      "end_line": 1709,
      "comment": "",
      "child_ranges": [
        "(line 1691,col 9)-(line 1698,col 61)",
        "(line 1699,col 9)-(line 1699,col 29)",
        "(line 1700,col 9)-(line 1700,col 79)",
        "(line 1702,col 9)-(line 1702,col 65)",
        "(line 1703,col 9)-(line 1705,col 9)",
        "(line 1706,col 9)-(line 1708,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull1()",
      "begin_line": 1711,
      "end_line": 1719,
      "comment": "",
      "child_ranges": [
        "(line 1713,col 9)-(line 1718,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull2()",
      "begin_line": 1721,
      "end_line": 1729,
      "comment": "",
      "child_ranges": [
        "(line 1723,col 9)-(line 1728,col 9)"
      ]
    }
  ]
}
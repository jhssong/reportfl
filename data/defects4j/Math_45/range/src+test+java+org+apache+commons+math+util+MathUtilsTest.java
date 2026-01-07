{
  "filepath": "/tmp/Math-45b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 43,
      "end_line": 2138,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Id$\n *          2007) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 51,
      "end_line": 82,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 58,col 25)",
        "(line 59,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
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
      "end_line": 101,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 78)",
        "(line 99,col 9)-(line 99,col 75)",
        "(line 100,col 9)-(line 100,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 103,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 36)",
        "(line 106,col 9)-(line 106,col 39)",
        "(line 107,col 9)-(line 107,col 64)",
        "(line 108,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 120,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 65)",
        "(line 125,col 9)-(line 125,col 65)",
        "(line 126,col 9)-(line 126,col 65)",
        "(line 127,col 9)-(line 127,col 65)",
        "(line 128,col 9)-(line 128,col 63)",
        "(line 129,col 9)-(line 129,col 63)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 70)",
        "(line 132,col 9)-(line 132,col 44)",
        "(line 133,col 9)-(line 133,col 45)",
        "(line 134,col 9)-(line 134,col 44)",
        "(line 135,col 9)-(line 135,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 138,
      "end_line": 145,
      "comment": "",
      "child_ranges": [
        "(line 139,col 9)-(line 144,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 147,
      "end_line": 190,
      "comment": "",
      "child_ranges": [
        "(line 149,col 9)-(line 155,col 16)",
        "(line 156,col 9)-(line 163,col 16)",
        "(line 164,col 9)-(line 166,col 9)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 177,col 9)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 180,col 46)",
        "(line 181,col 9)-(line 189,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 196,
      "end_line": 251,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 226,col 9)",
        "(line 228,col 9)-(line 228,col 63)",
        "(line 229,col 9)-(line 229,col 55)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 232,col 9)-(line 232,col 60)",
        "(line 233,col 9)-(line 233,col 52)",
        "(line 234,col 9)-(line 234,col 52)",
        "(line 237,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 244,col 22)",
        "(line 245,col 9)-(line 245,col 56)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 52)",
        "(line 248,col 9)-(line 248,col 95)",
        "(line 249,col 9)-(line 249,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 253,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 66)",
        "(line 308,col 9)-(line 309,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToEpsilon()",
      "begin_line": 312,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 74)",
        "(line 315,col 9)-(line 315,col 74)",
        "(line 316,col 9)-(line 316,col 74)",
        "(line 317,col 9)-(line 317,col 94)",
        "(line 318,col 9)-(line 318,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToMaxUlps()",
      "begin_line": 321,
      "end_line": 357,
      "comment": "",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 30)",
        "(line 324,col 9)-(line 324,col 39)",
        "(line 325,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 335,col 67)",
        "(line 337,col 9)-(line 337,col 81)",
        "(line 338,col 9)-(line 338,col 81)",
        "(line 339,col 9)-(line 339,col 81)",
        "(line 340,col 9)-(line 340,col 81)",
        "(line 342,col 9)-(line 342,col 81)",
        "(line 343,col 9)-(line 343,col 81)",
        "(line 344,col 9)-(line 344,col 81)",
        "(line 345,col 9)-(line 345,col 81)",
        "(line 347,col 9)-(line 347,col 93)",
        "(line 348,col 9)-(line 348,col 93)",
        "(line 349,col 9)-(line 349,col 93)",
        "(line 351,col 9)-(line 351,col 100)",
        "(line 352,col 9)-(line 352,col 100)",
        "(line 354,col 9)-(line 354,col 102)",
        "(line 355,col 9)-(line 355,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 359,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 361,col 23)",
        "(line 362,col 9)-(line 362,col 35)",
        "(line 363,col 9)-(line 363,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 366,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 371,
      "end_line": 390,
      "comment": "",
      "child_ranges": [
        "(line 373,col 9)-(line 378,col 17)",
        "(line 379,col 9)-(line 389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 392,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 71)",
        "(line 395,col 9)-(line 395,col 71)",
        "(line 396,col 9)-(line 396,col 71)",
        "(line 397,col 9)-(line 397,col 72)",
        "(line 398,col 9)-(line 398,col 72)",
        "(line 399,col 9)-(line 399,col 74)",
        "(line 400,col 9)-(line 400,col 101)",
        "(line 401,col 9)-(line 401,col 101)",
        "(line 402,col 9)-(line 402,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 405,
      "end_line": 422,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 47)",
        "(line 408,col 9)-(line 408,col 44)",
        "(line 410,col 9)-(line 410,col 42)",
        "(line 414,col 9)-(line 414,col 62)",
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 417,col 35)",
        "(line 420,col 9)-(line 420,col 56)",
        "(line 421,col 9)-(line 421,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 424,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 83)",
        "(line 427,col 9)-(line 427,col 83)",
        "(line 428,col 9)-(line 428,col 83)",
        "(line 429,col 9)-(line 429,col 85)",
        "(line 430,col 9)-(line 430,col 113)",
        "(line 431,col 9)-(line 431,col 113)",
        "(line 432,col 9)-(line 432,col 114)",
        "(line 433,col 9)-(line 433,col 84)",
        "(line 434,col 9)-(line 434,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 438,
      "end_line": 473,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 74)",
        "(line 441,col 9)-(line 441,col 85)",
        "(line 442,col 9)-(line 442,col 30)",
        "(line 443,col 9)-(line 443,col 135)",
        "(line 444,col 9)-(line 444,col 146)",
        "(line 445,col 9)-(line 445,col 147)",
        "(line 447,col 9)-(line 447,col 63)",
        "(line 460,col 9)-(line 460,col 97)",
        "(line 461,col 9)-(line 461,col 90)",
        "(line 463,col 9)-(line 463,col 97)",
        "(line 464,col 9)-(line 464,col 90)",
        "(line 466,col 9)-(line 466,col 70)",
        "(line 467,col 9)-(line 467,col 70)",
        "(line 468,col 9)-(line 468,col 62)",
        "(line 469,col 9)-(line 469,col 84)",
        "(line 470,col 9)-(line 470,col 84)",
        "(line 472,col 9)-(line 472,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 475,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 58)",
        "(line 479,col 9)-(line 479,col 74)",
        "(line 480,col 9)-(line 480,col 79)",
        "(line 482,col 9)-(line 482,col 77)",
        "(line 483,col 9)-(line 483,col 80)",
        "(line 484,col 9)-(line 484,col 58)",
        "(line 485,col 9)-(line 485,col 60)",
        "(line 486,col 9)-(line 486,col 60)",
        "(line 488,col 9)-(line 488,col 70)",
        "(line 489,col 9)-(line 489,col 71)",
        "(line 491,col 9)-(line 491,col 61)",
        "(line 493,col 9)-(line 493,col 74)",
        "(line 494,col 9)-(line 494,col 75)",
        "(line 495,col 9)-(line 495,col 74)",
        "(line 496,col 9)-(line 496,col 73)",
        "(line 498,col 9)-(line 498,col 76)",
        "(line 499,col 9)-(line 499,col 77)",
        "(line 500,col 9)-(line 500,col 76)",
        "(line 501,col 9)-(line 501,col 77)",
        "(line 503,col 9)-(line 503,col 99)",
        "(line 504,col 9)-(line 504,col 91)",
        "(line 506,col 9)-(line 506,col 99)",
        "(line 507,col 9)-(line 507,col 92)",
        "(line 509,col 9)-(line 509,col 72)",
        "(line 510,col 9)-(line 510,col 72)",
        "(line 511,col 9)-(line 511,col 63)",
        "(line 512,col 9)-(line 512,col 86)",
        "(line 513,col 9)-(line 513,col 86)",
        "(line 515,col 9)-(line 515,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 518,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 70)",
        "(line 522,col 9)-(line 522,col 86)",
        "(line 523,col 9)-(line 523,col 91)",
        "(line 525,col 9)-(line 525,col 77)",
        "(line 526,col 9)-(line 526,col 80)",
        "(line 527,col 9)-(line 527,col 70)",
        "(line 528,col 9)-(line 528,col 72)",
        "(line 529,col 9)-(line 529,col 72)",
        "(line 531,col 9)-(line 531,col 82)",
        "(line 532,col 9)-(line 532,col 83)",
        "(line 534,col 9)-(line 534,col 73)",
        "(line 536,col 9)-(line 536,col 86)",
        "(line 537,col 9)-(line 537,col 87)",
        "(line 538,col 9)-(line 538,col 86)",
        "(line 539,col 9)-(line 539,col 85)",
        "(line 541,col 9)-(line 541,col 88)",
        "(line 542,col 9)-(line 542,col 89)",
        "(line 543,col 9)-(line 543,col 88)",
        "(line 544,col 9)-(line 544,col 89)",
        "(line 546,col 9)-(line 546,col 111)",
        "(line 547,col 9)-(line 547,col 103)",
        "(line 549,col 9)-(line 549,col 111)",
        "(line 550,col 9)-(line 550,col 104)",
        "(line 552,col 9)-(line 552,col 83)",
        "(line 554,col 9)-(line 554,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 557,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 72)",
        "(line 560,col 9)-(line 560,col 72)",
        "(line 561,col 9)-(line 561,col 78)",
        "(line 563,col 9)-(line 563,col 81)",
        "(line 564,col 9)-(line 564,col 86)",
        "(line 565,col 9)-(line 571,col 40)",
        "(line 572,col 9)-(line 573,col 67)",
        "(line 574,col 9)-(line 575,col 81)",
        "(line 576,col 9)-(line 577,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 581,
      "end_line": 600,
      "comment": "",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 84)",
        "(line 584,col 9)-(line 584,col 84)",
        "(line 585,col 9)-(line 585,col 90)",
        "(line 587,col 9)-(line 587,col 93)",
        "(line 588,col 9)-(line 588,col 98)",
        "(line 589,col 9)-(line 595,col 20)",
        "(line 596,col 9)-(line 597,col 93)",
        "(line 598,col 9)-(line 599,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 602,
      "end_line": 613,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 608,col 9)",
        "(line 610,col 9)-(line 610,col 60)",
        "(line 611,col 9)-(line 611,col 76)",
        "(line 612,col 9)-(line 612,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 615,
      "end_line": 642,
      "comment": "",
      "child_ranges": [
        "(line 617,col 9)-(line 622,col 9)",
        "(line 623,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 641,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 644,
      "end_line": 693,
      "comment": "",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 19)",
        "(line 647,col 9)-(line 647,col 19)",
        "(line 648,col 9)-(line 648,col 19)",
        "(line 650,col 9)-(line 650,col 52)",
        "(line 652,col 9)-(line 652,col 52)",
        "(line 653,col 9)-(line 653,col 52)",
        "(line 654,col 9)-(line 654,col 53)",
        "(line 655,col 9)-(line 655,col 53)",
        "(line 657,col 9)-(line 657,col 53)",
        "(line 658,col 9)-(line 658,col 54)",
        "(line 659,col 9)-(line 659,col 54)",
        "(line 660,col 9)-(line 660,col 55)",
        "(line 662,col 9)-(line 662,col 52)",
        "(line 663,col 9)-(line 663,col 53)",
        "(line 664,col 9)-(line 664,col 53)",
        "(line 665,col 9)-(line 665,col 54)",
        "(line 667,col 9)-(line 667,col 82)",
        "(line 669,col 9)-(line 669,col 84)",
        "(line 670,col 9)-(line 670,col 85)",
        "(line 671,col 9)-(line 671,col 77)",
        "(line 672,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 692,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 695,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 20)",
        "(line 698,col 9)-(line 698,col 20)",
        "(line 699,col 9)-(line 699,col 20)",
        "(line 701,col 9)-(line 701,col 53)",
        "(line 703,col 9)-(line 703,col 52)",
        "(line 704,col 9)-(line 704,col 52)",
        "(line 705,col 9)-(line 705,col 53)",
        "(line 706,col 9)-(line 706,col 53)",
        "(line 708,col 9)-(line 708,col 53)",
        "(line 709,col 9)-(line 709,col 54)",
        "(line 710,col 9)-(line 710,col 54)",
        "(line 711,col 9)-(line 711,col 55)",
        "(line 713,col 9)-(line 713,col 52)",
        "(line 714,col 9)-(line 714,col 53)",
        "(line 715,col 9)-(line 715,col 53)",
        "(line 716,col 9)-(line 716,col 54)",
        "(line 718,col 9)-(line 718,col 88)",
        "(line 720,col 9)-(line 720,col 75)",
        "(line 722,col 9)-(line 722,col 79)",
        "(line 723,col 9)-(line 723,col 80)",
        "(line 724,col 9)-(line 724,col 72)",
        "(line 725,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 745,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 748,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 71)",
        "(line 751,col 9)-(line 751,col 61)",
        "(line 752,col 9)-(line 754,col 9)",
        "(line 755,col 9)-(line 755,col 57)",
        "(line 756,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 772,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 774,col 9)-(line 783,col 31)",
        "(line 784,col 9)-(line 794,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 797,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 64)",
        "(line 800,col 9)-(line 807,col 40)",
        "(line 808,col 9)-(line 809,col 81)",
        "(line 810,col 9)-(line 811,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 817,
      "end_line": 842,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 819,col 9)-(line 819,col 43)",
        "(line 820,col 9)-(line 820,col 43)",
        "(line 821,col 9)-(line 821,col 53)",
        "(line 824,col 9)-(line 826,col 9)",
        "(line 829,col 9)-(line 829,col 34)",
        "(line 830,col 9)-(line 838,col 29)",
        "(line 841,col 9)-(line 841,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 844,
      "end_line": 849,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 846,col 67)",
        "(line 847,col 9)-(line 847,col 67)",
        "(line 848,col 9)-(line 848,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 851,
      "end_line": 858,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 27)",
        "(line 854,col 9)-(line 854,col 66)",
        "(line 855,col 9)-(line 855,col 66)",
        "(line 856,col 9)-(line 856,col 68)",
        "(line 857,col 9)-(line 857,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 860,
      "end_line": 866,
      "comment": "",
      "child_ranges": [
        "(line 862,col 9)-(line 862,col 27)",
        "(line 863,col 9)-(line 863,col 68)",
        "(line 864,col 9)-(line 864,col 68)",
        "(line 865,col 9)-(line 865,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 868,
      "end_line": 873,
      "comment": "",
      "child_ranges": [
        "(line 870,col 9)-(line 870,col 57)",
        "(line 871,col 9)-(line 871,col 57)",
        "(line 872,col 9)-(line 872,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 875,
      "end_line": 880,
      "comment": "",
      "child_ranges": [
        "(line 877,col 9)-(line 877,col 57)",
        "(line 878,col 9)-(line 878,col 57)",
        "(line 879,col 9)-(line 879,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 882,
      "end_line": 887,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 69)",
        "(line 885,col 9)-(line 885,col 69)",
        "(line 886,col 9)-(line 886,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 889,
      "end_line": 934,
      "comment": "",
      "child_ranges": [
        "(line 891,col 9)-(line 891,col 19)",
        "(line 892,col 9)-(line 892,col 19)",
        "(line 893,col 9)-(line 893,col 19)",
        "(line 895,col 9)-(line 895,col 52)",
        "(line 896,col 9)-(line 896,col 52)",
        "(line 897,col 9)-(line 897,col 52)",
        "(line 898,col 9)-(line 898,col 52)",
        "(line 899,col 9)-(line 899,col 54)",
        "(line 900,col 9)-(line 900,col 55)",
        "(line 901,col 9)-(line 901,col 55)",
        "(line 902,col 9)-(line 902,col 56)",
        "(line 903,col 9)-(line 903,col 55)",
        "(line 907,col 9)-(line 907,col 77)",
        "(line 910,col 9)-(line 910,col 52)",
        "(line 912,col 9)-(line 918,col 9)",
        "(line 920,col 9)-(line 926,col 9)",
        "(line 928,col 9)-(line 933,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 936,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 938,col 9)-(line 938,col 20)",
        "(line 939,col 9)-(line 939,col 20)",
        "(line 940,col 9)-(line 940,col 20)",
        "(line 942,col 9)-(line 942,col 52)",
        "(line 943,col 9)-(line 943,col 52)",
        "(line 944,col 9)-(line 944,col 52)",
        "(line 945,col 9)-(line 945,col 52)",
        "(line 946,col 9)-(line 946,col 54)",
        "(line 947,col 9)-(line 947,col 55)",
        "(line 948,col 9)-(line 948,col 55)",
        "(line 949,col 9)-(line 949,col 56)",
        "(line 950,col 9)-(line 950,col 55)",
        "(line 952,col 9)-(line 952,col 85)",
        "(line 956,col 9)-(line 956,col 80)",
        "(line 959,col 9)-(line 959,col 55)",
        "(line 961,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 975,col 9)",
        "(line 977,col 9)-(line 978,col 75)",
        "(line 979,col 9)-(line 984,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 987,
      "end_line": 996,
      "comment": "",
      "child_ranges": [
        "(line 989,col 9)-(line 989,col 57)",
        "(line 990,col 9)-(line 990,col 57)",
        "(line 991,col 9)-(line 991,col 62)",
        "(line 992,col 9)-(line 992,col 62)",
        "(line 993,col 9)-(line 993,col 61)",
        "(line 994,col 9)-(line 994,col 56)",
        "(line 995,col 9)-(line 995,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 998,
      "end_line": 1013,
      "comment": "",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 36)",
        "(line 1001,col 9)-(line 1001,col 39)",
        "(line 1002,col 9)-(line 1002,col 64)",
        "(line 1003,col 9)-(line 1007,col 9)",
        "(line 1008,col 9)-(line 1012,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 1015,
      "end_line": 1035,
      "comment": "",
      "child_ranges": [
        "(line 1017,col 9)-(line 1017,col 34)",
        "(line 1018,col 9)-(line 1018,col 34)",
        "(line 1019,col 9)-(line 1019,col 65)",
        "(line 1020,col 9)-(line 1020,col 65)",
        "(line 1021,col 9)-(line 1021,col 64)",
        "(line 1022,col 9)-(line 1022,col 64)",
        "(line 1023,col 9)-(line 1023,col 65)",
        "(line 1024,col 9)-(line 1024,col 65)",
        "(line 1025,col 9)-(line 1025,col 64)",
        "(line 1026,col 9)-(line 1026,col 64)",
        "(line 1027,col 9)-(line 1027,col 65)",
        "(line 1028,col 9)-(line 1028,col 68)",
        "(line 1029,col 9)-(line 1029,col 44)",
        "(line 1030,col 9)-(line 1030,col 44)",
        "(line 1031,col 9)-(line 1031,col 44)",
        "(line 1032,col 9)-(line 1032,col 44)",
        "(line 1033,col 9)-(line 1033,col 45)",
        "(line 1034,col 9)-(line 1034,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 1037,
      "end_line": 1044,
      "comment": "",
      "child_ranges": [
        "(line 1038,col 9)-(line 1043,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 1046,
      "end_line": 1057,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 9)-(line 1056,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduce()",
      "begin_line": 1059,
      "end_line": 1110,
      "comment": "",
      "child_ranges": [
        "(line 1061,col 9)-(line 1061,col 38)",
        "(line 1062,col 9)-(line 1062,col 33)",
        "(line 1064,col 9)-(line 1064,col 33)",
        "(line 1066,col 9)-(line 1066,col 58)",
        "(line 1067,col 9)-(line 1067,col 32)",
        "(line 1068,col 9)-(line 1070,col 34)",
        "(line 1071,col 9)-(line 1073,col 34)",
        "(line 1075,col 9)-(line 1075,col 51)",
        "(line 1076,col 9)-(line 1076,col 44)",
        "(line 1077,col 9)-(line 1079,col 34)",
        "(line 1080,col 9)-(line 1082,col 34)",
        "(line 1084,col 9)-(line 1084,col 51)",
        "(line 1085,col 9)-(line 1085,col 25)",
        "(line 1086,col 9)-(line 1088,col 34)",
        "(line 1089,col 9)-(line 1091,col 34)",
        "(line 1093,col 9)-(line 1093,col 84)",
        "(line 1094,col 9)-(line 1094,col 86)",
        "(line 1095,col 9)-(line 1095,col 84)",
        "(line 1096,col 9)-(line 1097,col 44)",
        "(line 1098,col 9)-(line 1099,col 34)",
        "(line 1100,col 9)-(line 1101,col 52)",
        "(line 1102,col 9)-(line 1103,col 70)",
        "(line 1104,col 9)-(line 1105,col 52)",
        "(line 1106,col 9)-(line 1107,col 52)",
        "(line 1108,col 9)-(line 1109,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduceComparedWithNormalizeAngle()",
      "begin_line": 1112,
      "end_line": 1124,
      "comment": "",
      "child_ranges": [
        "(line 1114,col 9)-(line 1114,col 40)",
        "(line 1115,col 9)-(line 1115,col 42)",
        "(line 1116,col 9)-(line 1123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1126,
      "end_line": 1173,
      "comment": "",
      "child_ranges": [
        "(line 1128,col 9)-(line 1128,col 54)",
        "(line 1129,col 9)-(line 1132,col 34)",
        "(line 1134,col 9)-(line 1134,col 56)",
        "(line 1135,col 9)-(line 1138,col 34)",
        "(line 1141,col 9)-(line 1141,col 80)",
        "(line 1142,col 9)-(line 1145,col 34)",
        "(line 1148,col 9)-(line 1148,col 48)",
        "(line 1149,col 9)-(line 1152,col 47)",
        "(line 1155,col 9)-(line 1155,col 75)",
        "(line 1156,col 9)-(line 1159,col 52)",
        "(line 1162,col 9)-(line 1165,col 52)",
        "(line 1168,col 9)-(line 1171,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1175,
      "end_line": 1282,
      "comment": "",
      "child_ranges": [
        "(line 1177,col 9)-(line 1177,col 31)",
        "(line 1178,col 9)-(line 1178,col 62)",
        "(line 1179,col 9)-(line 1179,col 63)",
        "(line 1180,col 9)-(line 1180,col 64)",
        "(line 1183,col 9)-(line 1183,col 68)",
        "(line 1184,col 9)-(line 1184,col 91)",
        "(line 1185,col 9)-(line 1185,col 25)",
        "(line 1186,col 9)-(line 1186,col 31)",
        "(line 1187,col 9)-(line 1187,col 64)",
        "(line 1190,col 9)-(line 1190,col 70)",
        "(line 1191,col 9)-(line 1191,col 70)",
        "(line 1192,col 9)-(line 1192,col 70)",
        "(line 1193,col 9)-(line 1193,col 70)",
        "(line 1194,col 9)-(line 1194,col 71)",
        "(line 1195,col 9)-(line 1195,col 71)",
        "(line 1196,col 9)-(line 1196,col 71)",
        "(line 1197,col 9)-(line 1197,col 71)",
        "(line 1198,col 9)-(line 1198,col 71)",
        "(line 1200,col 9)-(line 1200,col 88)",
        "(line 1201,col 9)-(line 1201,col 89)",
        "(line 1202,col 9)-(line 1202,col 90)",
        "(line 1203,col 9)-(line 1203,col 90)",
        "(line 1204,col 9)-(line 1204,col 91)",
        "(line 1205,col 9)-(line 1205,col 92)",
        "(line 1207,col 9)-(line 1207,col 85)",
        "(line 1208,col 9)-(line 1208,col 86)",
        "(line 1209,col 9)-(line 1209,col 87)",
        "(line 1210,col 9)-(line 1210,col 87)",
        "(line 1211,col 9)-(line 1211,col 88)",
        "(line 1212,col 9)-(line 1212,col 89)",
        "(line 1214,col 9)-(line 1214,col 86)",
        "(line 1215,col 9)-(line 1215,col 87)",
        "(line 1216,col 9)-(line 1216,col 88)",
        "(line 1217,col 9)-(line 1217,col 88)",
        "(line 1218,col 9)-(line 1218,col 89)",
        "(line 1219,col 9)-(line 1219,col 90)",
        "(line 1221,col 9)-(line 1221,col 90)",
        "(line 1222,col 9)-(line 1222,col 91)",
        "(line 1223,col 9)-(line 1223,col 92)",
        "(line 1224,col 9)-(line 1224,col 92)",
        "(line 1225,col 9)-(line 1225,col 93)",
        "(line 1226,col 9)-(line 1226,col 94)",
        "(line 1227,col 9)-(line 1227,col 96)",
        "(line 1228,col 9)-(line 1228,col 98)",
        "(line 1230,col 9)-(line 1230,col 90)",
        "(line 1231,col 9)-(line 1231,col 91)",
        "(line 1232,col 9)-(line 1232,col 92)",
        "(line 1233,col 9)-(line 1233,col 92)",
        "(line 1234,col 9)-(line 1234,col 93)",
        "(line 1235,col 9)-(line 1235,col 94)",
        "(line 1236,col 9)-(line 1236,col 96)",
        "(line 1237,col 9)-(line 1237,col 98)",
        "(line 1238,col 9)-(line 1238,col 96)",
        "(line 1239,col 9)-(line 1239,col 98)",
        "(line 1241,col 9)-(line 1241,col 88)",
        "(line 1242,col 9)-(line 1242,col 89)",
        "(line 1243,col 9)-(line 1243,col 90)",
        "(line 1244,col 9)-(line 1244,col 90)",
        "(line 1245,col 9)-(line 1245,col 91)",
        "(line 1246,col 9)-(line 1246,col 92)",
        "(line 1247,col 9)-(line 1247,col 94)",
        "(line 1248,col 9)-(line 1248,col 96)",
        "(line 1250,col 9)-(line 1250,col 97)",
        "(line 1251,col 9)-(line 1251,col 95)",
        "(line 1253,col 9)-(line 1258,col 9)",
        "(line 1260,col 9)-(line 1260,col 83)",
        "(line 1261,col 9)-(line 1261,col 84)",
        "(line 1262,col 9)-(line 1262,col 85)",
        "(line 1263,col 9)-(line 1263,col 85)",
        "(line 1264,col 9)-(line 1264,col 86)",
        "(line 1265,col 9)-(line 1265,col 87)",
        "(line 1267,col 9)-(line 1272,col 9)",
        "(line 1275,col 9)-(line 1275,col 94)",
        "(line 1278,col 9)-(line 1278,col 80)",
        "(line 1279,col 9)-(line 1279,col 63)",
        "(line 1280,col 9)-(line 1280,col 105)",
        "(line 1281,col 9)-(line 1281,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1284,
      "end_line": 1379,
      "comment": "",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 31)",
        "(line 1287,col 9)-(line 1287,col 63)",
        "(line 1288,col 9)-(line 1288,col 64)",
        "(line 1289,col 9)-(line 1289,col 65)",
        "(line 1292,col 9)-(line 1292,col 70)",
        "(line 1293,col 9)-(line 1293,col 70)",
        "(line 1294,col 9)-(line 1294,col 71)",
        "(line 1295,col 9)-(line 1295,col 71)",
        "(line 1296,col 9)-(line 1296,col 71)",
        "(line 1297,col 9)-(line 1297,col 71)",
        "(line 1298,col 9)-(line 1298,col 71)",
        "(line 1300,col 9)-(line 1300,col 89)",
        "(line 1301,col 9)-(line 1301,col 90)",
        "(line 1302,col 9)-(line 1302,col 91)",
        "(line 1303,col 9)-(line 1303,col 91)",
        "(line 1304,col 9)-(line 1304,col 92)",
        "(line 1305,col 9)-(line 1305,col 93)",
        "(line 1307,col 9)-(line 1307,col 86)",
        "(line 1308,col 9)-(line 1308,col 87)",
        "(line 1309,col 9)-(line 1309,col 88)",
        "(line 1310,col 9)-(line 1310,col 88)",
        "(line 1311,col 9)-(line 1311,col 89)",
        "(line 1312,col 9)-(line 1312,col 90)",
        "(line 1314,col 9)-(line 1314,col 87)",
        "(line 1315,col 9)-(line 1315,col 88)",
        "(line 1316,col 9)-(line 1316,col 89)",
        "(line 1317,col 9)-(line 1317,col 89)",
        "(line 1318,col 9)-(line 1318,col 90)",
        "(line 1319,col 9)-(line 1319,col 91)",
        "(line 1321,col 9)-(line 1321,col 91)",
        "(line 1322,col 9)-(line 1322,col 92)",
        "(line 1323,col 9)-(line 1323,col 93)",
        "(line 1324,col 9)-(line 1324,col 93)",
        "(line 1325,col 9)-(line 1325,col 94)",
        "(line 1326,col 9)-(line 1326,col 95)",
        "(line 1327,col 9)-(line 1327,col 98)",
        "(line 1328,col 9)-(line 1328,col 100)",
        "(line 1330,col 9)-(line 1330,col 91)",
        "(line 1331,col 9)-(line 1331,col 92)",
        "(line 1332,col 9)-(line 1332,col 93)",
        "(line 1333,col 9)-(line 1333,col 93)",
        "(line 1334,col 9)-(line 1334,col 94)",
        "(line 1335,col 9)-(line 1335,col 95)",
        "(line 1336,col 9)-(line 1336,col 98)",
        "(line 1337,col 9)-(line 1337,col 100)",
        "(line 1338,col 9)-(line 1338,col 98)",
        "(line 1339,col 9)-(line 1339,col 100)",
        "(line 1341,col 9)-(line 1341,col 89)",
        "(line 1342,col 9)-(line 1342,col 90)",
        "(line 1343,col 9)-(line 1343,col 91)",
        "(line 1344,col 9)-(line 1344,col 91)",
        "(line 1345,col 9)-(line 1345,col 92)",
        "(line 1346,col 9)-(line 1346,col 93)",
        "(line 1347,col 9)-(line 1347,col 96)",
        "(line 1348,col 9)-(line 1348,col 98)",
        "(line 1350,col 9)-(line 1350,col 99)",
        "(line 1351,col 9)-(line 1351,col 97)",
        "(line 1353,col 9)-(line 1358,col 9)",
        "(line 1360,col 9)-(line 1360,col 84)",
        "(line 1361,col 9)-(line 1361,col 85)",
        "(line 1362,col 9)-(line 1362,col 86)",
        "(line 1363,col 9)-(line 1363,col 86)",
        "(line 1364,col 9)-(line 1364,col 87)",
        "(line 1365,col 9)-(line 1365,col 88)",
        "(line 1367,col 9)-(line 1372,col 9)",
        "(line 1375,col 9)-(line 1375,col 79)",
        "(line 1376,col 9)-(line 1376,col 66)",
        "(line 1377,col 9)-(line 1377,col 104)",
        "(line 1378,col 9)-(line 1378,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1381,
      "end_line": 1386,
      "comment": "",
      "child_ranges": [
        "(line 1383,col 9)-(line 1383,col 64)",
        "(line 1384,col 9)-(line 1384,col 64)",
        "(line 1385,col 9)-(line 1385,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1388,
      "end_line": 1395,
      "comment": "",
      "child_ranges": [
        "(line 1390,col 9)-(line 1390,col 27)",
        "(line 1391,col 9)-(line 1391,col 61)",
        "(line 1392,col 9)-(line 1392,col 61)",
        "(line 1393,col 9)-(line 1393,col 63)",
        "(line 1394,col 9)-(line 1394,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1397,
      "end_line": 1404,
      "comment": "",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 27)",
        "(line 1400,col 9)-(line 1400,col 63)",
        "(line 1401,col 9)-(line 1401,col 63)",
        "(line 1402,col 9)-(line 1402,col 65)",
        "(line 1403,col 9)-(line 1403,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1406,
      "end_line": 1411,
      "comment": "",
      "child_ranges": [
        "(line 1408,col 9)-(line 1408,col 50)",
        "(line 1409,col 9)-(line 1409,col 50)",
        "(line 1410,col 9)-(line 1410,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1413,
      "end_line": 1418,
      "comment": "",
      "child_ranges": [
        "(line 1415,col 9)-(line 1415,col 52)",
        "(line 1416,col 9)-(line 1416,col 52)",
        "(line 1417,col 9)-(line 1417,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1420,
      "end_line": 1425,
      "comment": "",
      "child_ranges": [
        "(line 1422,col 9)-(line 1422,col 66)",
        "(line 1423,col 9)-(line 1423,col 66)",
        "(line 1424,col 9)-(line 1424,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1427,
      "end_line": 1432,
      "comment": "",
      "child_ranges": [
        "(line 1429,col 9)-(line 1429,col 23)",
        "(line 1430,col 9)-(line 1430,col 35)",
        "(line 1431,col 9)-(line 1431,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1434,
      "end_line": 1437,
      "comment": "",
      "child_ranges": [
        "(line 1436,col 9)-(line 1436,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1439,
      "end_line": 1456,
      "comment": "",
      "child_ranges": [
        "(line 1441,col 9)-(line 1441,col 36)",
        "(line 1442,col 9)-(line 1442,col 39)",
        "(line 1443,col 9)-(line 1443,col 64)",
        "(line 1444,col 9)-(line 1444,col 75)",
        "(line 1445,col 9)-(line 1445,col 69)",
        "(line 1446,col 9)-(line 1450,col 9)",
        "(line 1451,col 9)-(line 1455,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1458,
      "end_line": 1467,
      "comment": "",
      "child_ranges": [
        "(line 1460,col 9)-(line 1460,col 36)",
        "(line 1461,col 9)-(line 1466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1469,
      "end_line": 1483,
      "comment": "",
      "child_ranges": [
        "(line 1471,col 9)-(line 1471,col 34)",
        "(line 1472,col 9)-(line 1472,col 34)",
        "(line 1473,col 9)-(line 1473,col 64)",
        "(line 1474,col 9)-(line 1474,col 64)",
        "(line 1475,col 9)-(line 1475,col 65)",
        "(line 1476,col 9)-(line 1476,col 69)",
        "(line 1478,col 9)-(line 1478,col 71)",
        "(line 1479,col 9)-(line 1479,col 70)",
        "(line 1480,col 9)-(line 1480,col 44)",
        "(line 1481,col 9)-(line 1481,col 45)",
        "(line 1482,col 9)-(line 1482,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1485,
      "end_line": 1493,
      "comment": "",
      "child_ranges": [
        "(line 1486,col 9)-(line 1491,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1495,
      "end_line": 1570,
      "comment": "",
      "child_ranges": [
        "(line 1498,col 9)-(line 1498,col 62)",
        "(line 1499,col 9)-(line 1499,col 53)",
        "(line 1500,col 9)-(line 1505,col 9)",
        "(line 1507,col 9)-(line 1507,col 63)",
        "(line 1508,col 9)-(line 1508,col 54)",
        "(line 1509,col 9)-(line 1514,col 9)",
        "(line 1516,col 9)-(line 1516,col 64)",
        "(line 1517,col 9)-(line 1517,col 55)",
        "(line 1518,col 9)-(line 1523,col 9)",
        "(line 1525,col 9)-(line 1525,col 65)",
        "(line 1526,col 9)-(line 1526,col 56)",
        "(line 1527,col 9)-(line 1532,col 9)",
        "(line 1534,col 9)-(line 1534,col 55)",
        "(line 1535,col 9)-(line 1535,col 90)",
        "(line 1536,col 9)-(line 1536,col 73)",
        "(line 1537,col 9)-(line 1542,col 9)",
        "(line 1544,col 9)-(line 1544,col 91)",
        "(line 1545,col 9)-(line 1545,col 74)",
        "(line 1546,col 9)-(line 1551,col 9)",
        "(line 1553,col 9)-(line 1553,col 111)",
        "(line 1554,col 9)-(line 1554,col 87)",
        "(line 1555,col 9)-(line 1560,col 9)",
        "(line 1562,col 9)-(line 1565,col 76)",
        "(line 1566,col 9)-(line 1566,col 67)",
        "(line 1567,col 9)-(line 1567,col 68)",
        "(line 1568,col 9)-(line 1568,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1572,
      "end_line": 1577,
      "comment": "",
      "child_ranges": [
        "(line 1574,col 9)-(line 1574,col 36)",
        "(line 1575,col 9)-(line 1575,col 36)",
        "(line 1576,col 9)-(line 1576,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1579,
      "end_line": 1584,
      "comment": "",
      "child_ranges": [
        "(line 1581,col 9)-(line 1581,col 28)",
        "(line 1582,col 9)-(line 1582,col 28)",
        "(line 1583,col 9)-(line 1583,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1586,
      "end_line": 1591,
      "comment": "",
      "child_ranges": [
        "(line 1588,col 9)-(line 1588,col 36)",
        "(line 1589,col 9)-(line 1589,col 36)",
        "(line 1590,col 9)-(line 1590,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1593,
      "end_line": 1598,
      "comment": "",
      "child_ranges": [
        "(line 1595,col 9)-(line 1595,col 28)",
        "(line 1596,col 9)-(line 1596,col 28)",
        "(line 1597,col 9)-(line 1597,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1600,
      "end_line": 1605,
      "comment": "",
      "child_ranges": [
        "(line 1602,col 9)-(line 1602,col 36)",
        "(line 1603,col 9)-(line 1603,col 36)",
        "(line 1604,col 9)-(line 1604,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1607,
      "end_line": 1612,
      "comment": "",
      "child_ranges": [
        "(line 1609,col 9)-(line 1609,col 28)",
        "(line 1610,col 9)-(line 1610,col 28)",
        "(line 1611,col 9)-(line 1611,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1614,
      "end_line": 1660,
      "comment": "",
      "child_ranges": [
        "(line 1616,col 9)-(line 1617,col 72)",
        "(line 1618,col 9)-(line 1619,col 73)",
        "(line 1620,col 9)-(line 1621,col 72)",
        "(line 1622,col 9)-(line 1623,col 73)",
        "(line 1625,col 9)-(line 1631,col 9)",
        "(line 1632,col 9)-(line 1638,col 9)",
        "(line 1639,col 9)-(line 1645,col 9)",
        "(line 1646,col 9)-(line 1652,col 9)",
        "(line 1653,col 9)-(line 1659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIsMonotone()",
      "begin_line": 1662,
      "end_line": 1683,
      "comment": "",
      "child_ranges": [
        "(line 1664,col 9)-(line 1667,col 9)",
        "(line 1669,col 9)-(line 1672,col 9)",
        "(line 1674,col 9)-(line 1677,col 9)",
        "(line 1678,col 9)-(line 1681,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIsMonotoneComparable()",
      "begin_line": 1685,
      "end_line": 1706,
      "comment": "",
      "child_ranges": [
        "(line 1687,col 9)-(line 1690,col 9)",
        "(line 1692,col 9)-(line 1695,col 9)",
        "(line 1697,col 9)-(line 1700,col 9)",
        "(line 1701,col 9)-(line 1704,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1708,
      "end_line": 1747,
      "comment": "",
      "child_ranges": [
        "(line 1710,col 9)-(line 1715,col 9)",
        "(line 1716,col 9)-(line 1721,col 9)",
        "(line 1722,col 9)-(line 1727,col 9)",
        "(line 1729,col 9)-(line 1734,col 9)",
        "(line 1735,col 9)-(line 1740,col 9)",
        "(line 1741,col 9)-(line 1746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1749,
      "end_line": 1776,
      "comment": "",
      "child_ranges": [
        "(line 1751,col 9)-(line 1751,col 49)",
        "(line 1752,col 9)-(line 1752,col 49)",
        "(line 1753,col 9)-(line 1753,col 49)",
        "(line 1755,col 9)-(line 1755,col 42)",
        "(line 1757,col 9)-(line 1757,col 54)",
        "(line 1758,col 9)-(line 1758,col 54)",
        "(line 1759,col 9)-(line 1759,col 54)",
        "(line 1761,col 9)-(line 1761,col 52)",
        "(line 1762,col 9)-(line 1762,col 52)",
        "(line 1763,col 9)-(line 1763,col 52)",
        "(line 1765,col 9)-(line 1765,col 52)",
        "(line 1766,col 9)-(line 1766,col 52)",
        "(line 1767,col 9)-(line 1767,col 52)",
        "(line 1769,col 9)-(line 1769,col 53)",
        "(line 1770,col 9)-(line 1770,col 53)",
        "(line 1771,col 9)-(line 1771,col 53)",
        "(line 1773,col 9)-(line 1773,col 54)",
        "(line 1774,col 9)-(line 1774,col 54)",
        "(line 1775,col 9)-(line 1775,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlaceExample()",
      "begin_line": 1778,
      "end_line": 1791,
      "comment": "",
      "child_ranges": [
        "(line 1781,col 9)-(line 1781,col 37)",
        "(line 1782,col 9)-(line 1782,col 37)",
        "(line 1783,col 9)-(line 1783,col 37)",
        "(line 1784,col 9)-(line 1784,col 39)",
        "(line 1785,col 9)-(line 1785,col 38)",
        "(line 1786,col 9)-(line 1786,col 38)",
        "(line 1787,col 9)-(line 1787,col 38)",
        "(line 1788,col 9)-(line 1788,col 48)",
        "(line 1789,col 9)-(line 1789,col 48)",
        "(line 1790,col 9)-(line 1790,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlaceFaliures()",
      "begin_line": 1793,
      "end_line": 1817,
      "comment": "",
      "child_ranges": [
        "(line 1795,col 9)-(line 1795,col 40)",
        "(line 1796,col 9)-(line 1796,col 33)",
        "(line 1797,col 9)-(line 1797,col 36)",
        "(line 1798,col 9)-(line 1798,col 34)",
        "(line 1799,col 9)-(line 1804,col 9)",
        "(line 1805,col 9)-(line 1810,col 9)",
        "(line 1811,col 9)-(line 1816,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt()",
      "begin_line": 1819,
      "end_line": 1830,
      "comment": "",
      "child_ranges": [
        "(line 1821,col 9)-(line 1823,col 51)",
        "(line 1824,col 9)-(line 1824,col 52)",
        "(line 1826,col 9)-(line 1826,col 56)",
        "(line 1827,col 9)-(line 1829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt2()",
      "begin_line": 1832,
      "end_line": 1844,
      "comment": "",
      "child_ranges": [
        "(line 1834,col 9)-(line 1836,col 51)",
        "(line 1837,col 9)-(line 1837,col 29)",
        "(line 1838,col 9)-(line 1838,col 76)",
        "(line 1840,col 9)-(line 1840,col 65)",
        "(line 1841,col 9)-(line 1843,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt3()",
      "begin_line": 1846,
      "end_line": 1861,
      "comment": "",
      "child_ranges": [
        "(line 1848,col 9)-(line 1850,col 51)",
        "(line 1851,col 9)-(line 1851,col 29)",
        "(line 1852,col 9)-(line 1852,col 76)",
        "(line 1854,col 9)-(line 1854,col 65)",
        "(line 1855,col 9)-(line 1857,col 9)",
        "(line 1858,col 9)-(line 1860,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble()",
      "begin_line": 1863,
      "end_line": 1879,
      "comment": "",
      "child_ranges": [
        "(line 1865,col 9)-(line 1872,col 61)",
        "(line 1873,col 9)-(line 1873,col 55)",
        "(line 1875,col 9)-(line 1875,col 56)",
        "(line 1876,col 9)-(line 1878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble2()",
      "begin_line": 1881,
      "end_line": 1898,
      "comment": "",
      "child_ranges": [
        "(line 1883,col 9)-(line 1890,col 61)",
        "(line 1891,col 9)-(line 1891,col 29)",
        "(line 1892,col 9)-(line 1892,col 79)",
        "(line 1894,col 9)-(line 1894,col 65)",
        "(line 1895,col 9)-(line 1897,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble3()",
      "begin_line": 1900,
      "end_line": 1920,
      "comment": "",
      "child_ranges": [
        "(line 1902,col 9)-(line 1909,col 61)",
        "(line 1910,col 9)-(line 1910,col 29)",
        "(line 1911,col 9)-(line 1911,col 79)",
        "(line 1913,col 9)-(line 1913,col 65)",
        "(line 1914,col 9)-(line 1916,col 9)",
        "(line 1917,col 9)-(line 1919,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull1()",
      "begin_line": 1922,
      "end_line": 1930,
      "comment": "",
      "child_ranges": [
        "(line 1924,col 9)-(line 1929,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull2()",
      "begin_line": 1932,
      "end_line": 1940,
      "comment": "",
      "child_ranges": [
        "(line 1934,col 9)-(line 1939,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLinearCombination1()",
      "begin_line": 1942,
      "end_line": 1961,
      "comment": "",
      "child_ranges": [
        "(line 1944,col 9)-(line 1948,col 10)",
        "(line 1949,col 9)-(line 1953,col 10)",
        "(line 1955,col 9)-(line 1957,col 75)",
        "(line 1958,col 9)-(line 1958,col 68)",
        "(line 1960,col 9)-(line 1960,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLinearCombination2()",
      "begin_line": 1963,
      "end_line": 1983,
      "comment": "",
      "child_ranges": [
        "(line 1967,col 9)-(line 1967,col 62)",
        "(line 1969,col 9)-(line 1982,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLinearCombinationInfinite()",
      "begin_line": 1985,
      "end_line": 2136,
      "comment": "",
      "child_ranges": [
        "(line 1987,col 9)-(line 1996,col 10)",
        "(line 1997,col 9)-(line 2006,col 10)",
        "(line 2008,col 9)-(line 2011,col 37)",
        "(line 2012,col 9)-(line 2016,col 37)",
        "(line 2017,col 9)-(line 2022,col 37)",
        "(line 2023,col 9)-(line 2023,col 82)",
        "(line 2025,col 9)-(line 2028,col 37)",
        "(line 2029,col 9)-(line 2033,col 37)",
        "(line 2034,col 9)-(line 2039,col 37)",
        "(line 2040,col 9)-(line 2040,col 104)",
        "(line 2042,col 9)-(line 2045,col 37)",
        "(line 2046,col 9)-(line 2050,col 37)",
        "(line 2051,col 9)-(line 2056,col 37)",
        "(line 2057,col 9)-(line 2057,col 104)",
        "(line 2059,col 9)-(line 2062,col 37)",
        "(line 2063,col 9)-(line 2067,col 37)",
        "(line 2068,col 9)-(line 2073,col 37)",
        "(line 2074,col 9)-(line 2074,col 104)",
        "(line 2076,col 9)-(line 2079,col 37)",
        "(line 2080,col 9)-(line 2084,col 37)",
        "(line 2085,col 9)-(line 2090,col 37)",
        "(line 2091,col 9)-(line 2091,col 104)",
        "(line 2093,col 9)-(line 2096,col 37)",
        "(line 2097,col 9)-(line 2101,col 37)",
        "(line 2102,col 9)-(line 2107,col 37)",
        "(line 2108,col 9)-(line 2108,col 104)",
        "(line 2110,col 9)-(line 2113,col 37)",
        "(line 2114,col 9)-(line 2118,col 37)",
        "(line 2119,col 9)-(line 2122,col 87)",
        "(line 2123,col 9)-(line 2123,col 81)",
        "(line 2125,col 9)-(line 2126,col 76)",
        "(line 2127,col 9)-(line 2129,col 76)",
        "(line 2130,col 9)-(line 2133,col 87)",
        "(line 2134,col 9)-(line 2134,col 81)"
      ]
    }
  ]
}
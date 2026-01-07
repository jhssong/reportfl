{
  "filepath": "/tmp/Math-52b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 40,
      "end_line": 1844,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Id$\n *          2007) $\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 48,
      "end_line": 79,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 54,col 9)",
        "(line 55,col 9)-(line 55,col 25)",
        "(line 56,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 75)",
        "(line 78,col 9)-(line 78,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 84,
      "end_line": 90,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 24)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 89,col 9)-(line 89,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 93,
      "end_line": 98,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 78)",
        "(line 96,col 9)-(line 96,col 75)",
        "(line 97,col 9)-(line 97,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 100,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 36)",
        "(line 103,col 9)-(line 103,col 39)",
        "(line 104,col 9)-(line 104,col 64)",
        "(line 105,col 9)-(line 109,col 9)",
        "(line 110,col 9)-(line 114,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 117,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 34)",
        "(line 120,col 9)-(line 120,col 34)",
        "(line 121,col 9)-(line 121,col 65)",
        "(line 122,col 9)-(line 122,col 65)",
        "(line 123,col 9)-(line 123,col 65)",
        "(line 124,col 9)-(line 124,col 65)",
        "(line 125,col 9)-(line 125,col 63)",
        "(line 126,col 9)-(line 126,col 63)",
        "(line 127,col 9)-(line 127,col 65)",
        "(line 128,col 9)-(line 128,col 70)",
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
      "end_line": 248,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 63)",
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 227,col 52)",
        "(line 229,col 9)-(line 229,col 60)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 22)",
        "(line 242,col 9)-(line 242,col 56)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 245,col 95)",
        "(line 246,col 9)-(line 246,col 106)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 250,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 273,col 9)-(line 278,col 9)",
        "(line 279,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 292,col 9)-(line 297,col 9)",
        "(line 298,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 304,col 66)",
        "(line 305,col 9)-(line 306,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToEpsilon()",
      "begin_line": 309,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 74)",
        "(line 312,col 9)-(line 312,col 74)",
        "(line 313,col 9)-(line 313,col 74)",
        "(line 314,col 9)-(line 314,col 94)",
        "(line 315,col 9)-(line 315,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareToMaxUlps()",
      "begin_line": 318,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 30)",
        "(line 321,col 9)-(line 321,col 39)",
        "(line 322,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 67)",
        "(line 334,col 9)-(line 334,col 81)",
        "(line 335,col 9)-(line 335,col 81)",
        "(line 336,col 9)-(line 336,col 81)",
        "(line 337,col 9)-(line 337,col 81)",
        "(line 339,col 9)-(line 339,col 81)",
        "(line 340,col 9)-(line 340,col 81)",
        "(line 341,col 9)-(line 341,col 81)",
        "(line 342,col 9)-(line 342,col 81)",
        "(line 344,col 9)-(line 344,col 93)",
        "(line 345,col 9)-(line 345,col 93)",
        "(line 346,col 9)-(line 346,col 93)",
        "(line 348,col 9)-(line 348,col 100)",
        "(line 349,col 9)-(line 349,col 100)",
        "(line 351,col 9)-(line 351,col 102)",
        "(line 352,col 9)-(line 352,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 356,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 23)",
        "(line 359,col 9)-(line 359,col 35)",
        "(line 360,col 9)-(line 360,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 363,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 368,
      "end_line": 387,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 375,col 17)",
        "(line 376,col 9)-(line 386,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 389,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 391,col 71)",
        "(line 392,col 9)-(line 392,col 71)",
        "(line 393,col 9)-(line 393,col 71)",
        "(line 394,col 9)-(line 394,col 72)",
        "(line 395,col 9)-(line 395,col 72)",
        "(line 396,col 9)-(line 396,col 74)",
        "(line 397,col 9)-(line 397,col 101)",
        "(line 398,col 9)-(line 398,col 101)",
        "(line 399,col 9)-(line 399,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMath475()",
      "begin_line": 402,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 47)",
        "(line 405,col 9)-(line 405,col 44)",
        "(line 407,col 9)-(line 407,col 42)",
        "(line 411,col 9)-(line 411,col 62)",
        "(line 413,col 9)-(line 413,col 44)",
        "(line 414,col 9)-(line 414,col 35)",
        "(line 417,col 9)-(line 417,col 56)",
        "(line 418,col 9)-(line 418,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 421,
      "end_line": 432,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 83)",
        "(line 424,col 9)-(line 424,col 83)",
        "(line 425,col 9)-(line 425,col 83)",
        "(line 426,col 9)-(line 426,col 85)",
        "(line 427,col 9)-(line 427,col 113)",
        "(line 428,col 9)-(line 428,col 113)",
        "(line 429,col 9)-(line 429,col 114)",
        "(line 430,col 9)-(line 430,col 84)",
        "(line 431,col 9)-(line 431,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFloatEqualsWithAllowedUlps()",
      "begin_line": 435,
      "end_line": 470,
      "comment": " Tests for floating point equality",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 74)",
        "(line 438,col 9)-(line 438,col 85)",
        "(line 439,col 9)-(line 439,col 30)",
        "(line 440,col 9)-(line 440,col 135)",
        "(line 441,col 9)-(line 441,col 146)",
        "(line 442,col 9)-(line 442,col 147)",
        "(line 444,col 9)-(line 444,col 63)",
        "(line 457,col 9)-(line 457,col 97)",
        "(line 458,col 9)-(line 458,col 90)",
        "(line 460,col 9)-(line 460,col 97)",
        "(line 461,col 9)-(line 461,col 90)",
        "(line 463,col 9)-(line 463,col 70)",
        "(line 464,col 9)-(line 464,col 70)",
        "(line 465,col 9)-(line 465,col 62)",
        "(line 466,col 9)-(line 466,col 84)",
        "(line 467,col 9)-(line 467,col 84)",
        "(line 469,col 9)-(line 469,col 103)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 472,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 474,col 9)-(line 474,col 58)",
        "(line 476,col 9)-(line 476,col 74)",
        "(line 477,col 9)-(line 477,col 79)",
        "(line 479,col 9)-(line 479,col 77)",
        "(line 480,col 9)-(line 480,col 80)",
        "(line 481,col 9)-(line 481,col 58)",
        "(line 482,col 9)-(line 482,col 60)",
        "(line 483,col 9)-(line 483,col 60)",
        "(line 485,col 9)-(line 485,col 70)",
        "(line 486,col 9)-(line 486,col 71)",
        "(line 488,col 9)-(line 488,col 61)",
        "(line 490,col 9)-(line 490,col 74)",
        "(line 491,col 9)-(line 491,col 75)",
        "(line 492,col 9)-(line 492,col 74)",
        "(line 493,col 9)-(line 493,col 73)",
        "(line 495,col 9)-(line 495,col 76)",
        "(line 496,col 9)-(line 496,col 77)",
        "(line 497,col 9)-(line 497,col 76)",
        "(line 498,col 9)-(line 498,col 77)",
        "(line 500,col 9)-(line 500,col 99)",
        "(line 501,col 9)-(line 501,col 91)",
        "(line 503,col 9)-(line 503,col 99)",
        "(line 504,col 9)-(line 504,col 92)",
        "(line 506,col 9)-(line 506,col 72)",
        "(line 507,col 9)-(line 507,col 72)",
        "(line 508,col 9)-(line 508,col 63)",
        "(line 509,col 9)-(line 509,col 86)",
        "(line 510,col 9)-(line 510,col 86)",
        "(line 512,col 9)-(line 512,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 515,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 517,col 9)-(line 517,col 70)",
        "(line 519,col 9)-(line 519,col 86)",
        "(line 520,col 9)-(line 520,col 91)",
        "(line 522,col 9)-(line 522,col 77)",
        "(line 523,col 9)-(line 523,col 80)",
        "(line 524,col 9)-(line 524,col 70)",
        "(line 525,col 9)-(line 525,col 72)",
        "(line 526,col 9)-(line 526,col 72)",
        "(line 528,col 9)-(line 528,col 82)",
        "(line 529,col 9)-(line 529,col 83)",
        "(line 531,col 9)-(line 531,col 73)",
        "(line 533,col 9)-(line 533,col 86)",
        "(line 534,col 9)-(line 534,col 87)",
        "(line 535,col 9)-(line 535,col 86)",
        "(line 536,col 9)-(line 536,col 85)",
        "(line 538,col 9)-(line 538,col 88)",
        "(line 539,col 9)-(line 539,col 89)",
        "(line 540,col 9)-(line 540,col 88)",
        "(line 541,col 9)-(line 541,col 89)",
        "(line 543,col 9)-(line 543,col 111)",
        "(line 544,col 9)-(line 544,col 103)",
        "(line 546,col 9)-(line 546,col 111)",
        "(line 547,col 9)-(line 547,col 104)",
        "(line 549,col 9)-(line 549,col 83)",
        "(line 551,col 9)-(line 551,col 117)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 554,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 72)",
        "(line 557,col 9)-(line 557,col 72)",
        "(line 558,col 9)-(line 558,col 78)",
        "(line 560,col 9)-(line 560,col 81)",
        "(line 561,col 9)-(line 561,col 86)",
        "(line 562,col 9)-(line 568,col 40)",
        "(line 569,col 9)-(line 570,col 67)",
        "(line 571,col 9)-(line 572,col 81)",
        "(line 573,col 9)-(line 574,col 107)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 578,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 84)",
        "(line 581,col 9)-(line 581,col 84)",
        "(line 582,col 9)-(line 582,col 90)",
        "(line 584,col 9)-(line 584,col 93)",
        "(line 585,col 9)-(line 585,col 98)",
        "(line 586,col 9)-(line 592,col 20)",
        "(line 593,col 9)-(line 594,col 93)",
        "(line 595,col 9)-(line 596,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 599,
      "end_line": 610,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 605,col 9)",
        "(line 607,col 9)-(line 607,col 60)",
        "(line 608,col 9)-(line 608,col 76)",
        "(line 609,col 9)-(line 609,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 612,
      "end_line": 639,
      "comment": "",
      "child_ranges": [
        "(line 614,col 9)-(line 619,col 9)",
        "(line 620,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 637,col 9)",
        "(line 638,col 9)-(line 638,col 115)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 641,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 19)",
        "(line 644,col 9)-(line 644,col 19)",
        "(line 645,col 9)-(line 645,col 19)",
        "(line 647,col 9)-(line 647,col 52)",
        "(line 649,col 9)-(line 649,col 52)",
        "(line 650,col 9)-(line 650,col 52)",
        "(line 651,col 9)-(line 651,col 53)",
        "(line 652,col 9)-(line 652,col 53)",
        "(line 654,col 9)-(line 654,col 53)",
        "(line 655,col 9)-(line 655,col 54)",
        "(line 656,col 9)-(line 656,col 54)",
        "(line 657,col 9)-(line 657,col 55)",
        "(line 659,col 9)-(line 659,col 52)",
        "(line 660,col 9)-(line 660,col 53)",
        "(line 661,col 9)-(line 661,col 53)",
        "(line 662,col 9)-(line 662,col 54)",
        "(line 664,col 9)-(line 664,col 82)",
        "(line 666,col 9)-(line 666,col 84)",
        "(line 667,col 9)-(line 667,col 85)",
        "(line 668,col 9)-(line 668,col 77)",
        "(line 669,col 9)-(line 675,col 9)",
        "(line 676,col 9)-(line 682,col 9)",
        "(line 683,col 9)-(line 689,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 692,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 20)",
        "(line 695,col 9)-(line 695,col 20)",
        "(line 696,col 9)-(line 696,col 20)",
        "(line 698,col 9)-(line 698,col 53)",
        "(line 700,col 9)-(line 700,col 52)",
        "(line 701,col 9)-(line 701,col 52)",
        "(line 702,col 9)-(line 702,col 53)",
        "(line 703,col 9)-(line 703,col 53)",
        "(line 705,col 9)-(line 705,col 53)",
        "(line 706,col 9)-(line 706,col 54)",
        "(line 707,col 9)-(line 707,col 54)",
        "(line 708,col 9)-(line 708,col 55)",
        "(line 710,col 9)-(line 710,col 52)",
        "(line 711,col 9)-(line 711,col 53)",
        "(line 712,col 9)-(line 712,col 53)",
        "(line 713,col 9)-(line 713,col 54)",
        "(line 715,col 9)-(line 715,col 88)",
        "(line 717,col 9)-(line 717,col 75)",
        "(line 719,col 9)-(line 719,col 79)",
        "(line 720,col 9)-(line 720,col 80)",
        "(line 721,col 9)-(line 721,col 72)",
        "(line 722,col 9)-(line 728,col 9)",
        "(line 729,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 742,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 745,
      "end_line": 767,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 71)",
        "(line 748,col 9)-(line 748,col 61)",
        "(line 749,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 57)",
        "(line 753,col 9)-(line 766,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 769,
      "end_line": 792,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 780,col 31)",
        "(line 781,col 9)-(line 791,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 794,
      "end_line": 809,
      "comment": "",
      "child_ranges": [
        "(line 796,col 9)-(line 796,col 64)",
        "(line 797,col 9)-(line 804,col 40)",
        "(line 805,col 9)-(line 806,col 81)",
        "(line 807,col 9)-(line 808,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 814,
      "end_line": 839,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 43)",
        "(line 817,col 9)-(line 817,col 43)",
        "(line 818,col 9)-(line 818,col 53)",
        "(line 821,col 9)-(line 823,col 9)",
        "(line 826,col 9)-(line 826,col 34)",
        "(line 827,col 9)-(line 835,col 29)",
        "(line 838,col 9)-(line 838,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 841,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 843,col 9)-(line 843,col 67)",
        "(line 844,col 9)-(line 844,col 67)",
        "(line 845,col 9)-(line 845,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 848,
      "end_line": 855,
      "comment": "",
      "child_ranges": [
        "(line 850,col 9)-(line 850,col 27)",
        "(line 851,col 9)-(line 851,col 66)",
        "(line 852,col 9)-(line 852,col 66)",
        "(line 853,col 9)-(line 853,col 68)",
        "(line 854,col 9)-(line 854,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 857,
      "end_line": 863,
      "comment": "",
      "child_ranges": [
        "(line 859,col 9)-(line 859,col 27)",
        "(line 860,col 9)-(line 860,col 68)",
        "(line 861,col 9)-(line 861,col 68)",
        "(line 862,col 9)-(line 862,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 865,
      "end_line": 870,
      "comment": "",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 57)",
        "(line 868,col 9)-(line 868,col 57)",
        "(line 869,col 9)-(line 869,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 872,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 57)",
        "(line 875,col 9)-(line 875,col 57)",
        "(line 876,col 9)-(line 876,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 879,
      "end_line": 884,
      "comment": "",
      "child_ranges": [
        "(line 881,col 9)-(line 881,col 69)",
        "(line 882,col 9)-(line 882,col 69)",
        "(line 883,col 9)-(line 883,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 886,
      "end_line": 931,
      "comment": "",
      "child_ranges": [
        "(line 888,col 9)-(line 888,col 19)",
        "(line 889,col 9)-(line 889,col 19)",
        "(line 890,col 9)-(line 890,col 19)",
        "(line 892,col 9)-(line 892,col 52)",
        "(line 893,col 9)-(line 893,col 52)",
        "(line 894,col 9)-(line 894,col 52)",
        "(line 895,col 9)-(line 895,col 52)",
        "(line 896,col 9)-(line 896,col 54)",
        "(line 897,col 9)-(line 897,col 55)",
        "(line 898,col 9)-(line 898,col 55)",
        "(line 899,col 9)-(line 899,col 56)",
        "(line 900,col 9)-(line 900,col 55)",
        "(line 904,col 9)-(line 904,col 77)",
        "(line 907,col 9)-(line 907,col 52)",
        "(line 909,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 923,col 9)",
        "(line 925,col 9)-(line 930,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 933,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 20)",
        "(line 936,col 9)-(line 936,col 20)",
        "(line 937,col 9)-(line 937,col 20)",
        "(line 939,col 9)-(line 939,col 52)",
        "(line 940,col 9)-(line 940,col 52)",
        "(line 941,col 9)-(line 941,col 52)",
        "(line 942,col 9)-(line 942,col 52)",
        "(line 943,col 9)-(line 943,col 54)",
        "(line 944,col 9)-(line 944,col 55)",
        "(line 945,col 9)-(line 945,col 55)",
        "(line 946,col 9)-(line 946,col 56)",
        "(line 947,col 9)-(line 947,col 55)",
        "(line 949,col 9)-(line 949,col 85)",
        "(line 953,col 9)-(line 953,col 80)",
        "(line 956,col 9)-(line 956,col 55)",
        "(line 958,col 9)-(line 964,col 9)",
        "(line 966,col 9)-(line 972,col 9)",
        "(line 974,col 9)-(line 975,col 75)",
        "(line 976,col 9)-(line 981,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 984,
      "end_line": 993,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 57)",
        "(line 987,col 9)-(line 987,col 57)",
        "(line 988,col 9)-(line 988,col 62)",
        "(line 989,col 9)-(line 989,col 62)",
        "(line 990,col 9)-(line 990,col 61)",
        "(line 991,col 9)-(line 991,col 56)",
        "(line 992,col 9)-(line 992,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 995,
      "end_line": 1010,
      "comment": "",
      "child_ranges": [
        "(line 997,col 9)-(line 997,col 36)",
        "(line 998,col 9)-(line 998,col 39)",
        "(line 999,col 9)-(line 999,col 64)",
        "(line 1000,col 9)-(line 1004,col 9)",
        "(line 1005,col 9)-(line 1009,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 1012,
      "end_line": 1032,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 34)",
        "(line 1015,col 9)-(line 1015,col 34)",
        "(line 1016,col 9)-(line 1016,col 65)",
        "(line 1017,col 9)-(line 1017,col 65)",
        "(line 1018,col 9)-(line 1018,col 64)",
        "(line 1019,col 9)-(line 1019,col 64)",
        "(line 1020,col 9)-(line 1020,col 65)",
        "(line 1021,col 9)-(line 1021,col 65)",
        "(line 1022,col 9)-(line 1022,col 64)",
        "(line 1023,col 9)-(line 1023,col 64)",
        "(line 1024,col 9)-(line 1024,col 65)",
        "(line 1025,col 9)-(line 1025,col 68)",
        "(line 1026,col 9)-(line 1026,col 44)",
        "(line 1027,col 9)-(line 1027,col 44)",
        "(line 1028,col 9)-(line 1028,col 44)",
        "(line 1029,col 9)-(line 1029,col 44)",
        "(line 1030,col 9)-(line 1030,col 45)",
        "(line 1031,col 9)-(line 1031,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 1034,
      "end_line": 1041,
      "comment": "",
      "child_ranges": [
        "(line 1035,col 9)-(line 1040,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 1043,
      "end_line": 1054,
      "comment": "",
      "child_ranges": [
        "(line 1045,col 9)-(line 1053,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduce()",
      "begin_line": 1056,
      "end_line": 1107,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 38)",
        "(line 1059,col 9)-(line 1059,col 33)",
        "(line 1061,col 9)-(line 1061,col 33)",
        "(line 1063,col 9)-(line 1063,col 58)",
        "(line 1064,col 9)-(line 1064,col 32)",
        "(line 1065,col 9)-(line 1067,col 34)",
        "(line 1068,col 9)-(line 1070,col 34)",
        "(line 1072,col 9)-(line 1072,col 51)",
        "(line 1073,col 9)-(line 1073,col 44)",
        "(line 1074,col 9)-(line 1076,col 34)",
        "(line 1077,col 9)-(line 1079,col 34)",
        "(line 1081,col 9)-(line 1081,col 51)",
        "(line 1082,col 9)-(line 1082,col 25)",
        "(line 1083,col 9)-(line 1085,col 34)",
        "(line 1086,col 9)-(line 1088,col 34)",
        "(line 1090,col 9)-(line 1090,col 84)",
        "(line 1091,col 9)-(line 1091,col 86)",
        "(line 1092,col 9)-(line 1092,col 84)",
        "(line 1093,col 9)-(line 1094,col 44)",
        "(line 1095,col 9)-(line 1096,col 34)",
        "(line 1097,col 9)-(line 1098,col 52)",
        "(line 1099,col 9)-(line 1100,col 70)",
        "(line 1101,col 9)-(line 1102,col 52)",
        "(line 1103,col 9)-(line 1104,col 52)",
        "(line 1105,col 9)-(line 1106,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testReduceComparedWithNormalizeAngle()",
      "begin_line": 1109,
      "end_line": 1121,
      "comment": "",
      "child_ranges": [
        "(line 1111,col 9)-(line 1111,col 40)",
        "(line 1112,col 9)-(line 1112,col 42)",
        "(line 1113,col 9)-(line 1120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1123,
      "end_line": 1170,
      "comment": "",
      "child_ranges": [
        "(line 1125,col 9)-(line 1125,col 54)",
        "(line 1126,col 9)-(line 1129,col 34)",
        "(line 1131,col 9)-(line 1131,col 56)",
        "(line 1132,col 9)-(line 1135,col 34)",
        "(line 1138,col 9)-(line 1138,col 80)",
        "(line 1139,col 9)-(line 1142,col 34)",
        "(line 1145,col 9)-(line 1145,col 48)",
        "(line 1146,col 9)-(line 1149,col 47)",
        "(line 1152,col 9)-(line 1152,col 75)",
        "(line 1153,col 9)-(line 1156,col 52)",
        "(line 1159,col 9)-(line 1162,col 52)",
        "(line 1165,col 9)-(line 1168,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1172,
      "end_line": 1279,
      "comment": "",
      "child_ranges": [
        "(line 1174,col 9)-(line 1174,col 31)",
        "(line 1175,col 9)-(line 1175,col 62)",
        "(line 1176,col 9)-(line 1176,col 63)",
        "(line 1177,col 9)-(line 1177,col 64)",
        "(line 1180,col 9)-(line 1180,col 68)",
        "(line 1181,col 9)-(line 1181,col 91)",
        "(line 1182,col 9)-(line 1182,col 25)",
        "(line 1183,col 9)-(line 1183,col 31)",
        "(line 1184,col 9)-(line 1184,col 64)",
        "(line 1187,col 9)-(line 1187,col 70)",
        "(line 1188,col 9)-(line 1188,col 70)",
        "(line 1189,col 9)-(line 1189,col 70)",
        "(line 1190,col 9)-(line 1190,col 70)",
        "(line 1191,col 9)-(line 1191,col 71)",
        "(line 1192,col 9)-(line 1192,col 71)",
        "(line 1193,col 9)-(line 1193,col 71)",
        "(line 1194,col 9)-(line 1194,col 71)",
        "(line 1195,col 9)-(line 1195,col 71)",
        "(line 1197,col 9)-(line 1197,col 88)",
        "(line 1198,col 9)-(line 1198,col 89)",
        "(line 1199,col 9)-(line 1199,col 90)",
        "(line 1200,col 9)-(line 1200,col 90)",
        "(line 1201,col 9)-(line 1201,col 91)",
        "(line 1202,col 9)-(line 1202,col 92)",
        "(line 1204,col 9)-(line 1204,col 85)",
        "(line 1205,col 9)-(line 1205,col 86)",
        "(line 1206,col 9)-(line 1206,col 87)",
        "(line 1207,col 9)-(line 1207,col 87)",
        "(line 1208,col 9)-(line 1208,col 88)",
        "(line 1209,col 9)-(line 1209,col 89)",
        "(line 1211,col 9)-(line 1211,col 86)",
        "(line 1212,col 9)-(line 1212,col 87)",
        "(line 1213,col 9)-(line 1213,col 88)",
        "(line 1214,col 9)-(line 1214,col 88)",
        "(line 1215,col 9)-(line 1215,col 89)",
        "(line 1216,col 9)-(line 1216,col 90)",
        "(line 1218,col 9)-(line 1218,col 90)",
        "(line 1219,col 9)-(line 1219,col 91)",
        "(line 1220,col 9)-(line 1220,col 92)",
        "(line 1221,col 9)-(line 1221,col 92)",
        "(line 1222,col 9)-(line 1222,col 93)",
        "(line 1223,col 9)-(line 1223,col 94)",
        "(line 1224,col 9)-(line 1224,col 96)",
        "(line 1225,col 9)-(line 1225,col 98)",
        "(line 1227,col 9)-(line 1227,col 90)",
        "(line 1228,col 9)-(line 1228,col 91)",
        "(line 1229,col 9)-(line 1229,col 92)",
        "(line 1230,col 9)-(line 1230,col 92)",
        "(line 1231,col 9)-(line 1231,col 93)",
        "(line 1232,col 9)-(line 1232,col 94)",
        "(line 1233,col 9)-(line 1233,col 96)",
        "(line 1234,col 9)-(line 1234,col 98)",
        "(line 1235,col 9)-(line 1235,col 96)",
        "(line 1236,col 9)-(line 1236,col 98)",
        "(line 1238,col 9)-(line 1238,col 88)",
        "(line 1239,col 9)-(line 1239,col 89)",
        "(line 1240,col 9)-(line 1240,col 90)",
        "(line 1241,col 9)-(line 1241,col 90)",
        "(line 1242,col 9)-(line 1242,col 91)",
        "(line 1243,col 9)-(line 1243,col 92)",
        "(line 1244,col 9)-(line 1244,col 94)",
        "(line 1245,col 9)-(line 1245,col 96)",
        "(line 1247,col 9)-(line 1247,col 97)",
        "(line 1248,col 9)-(line 1248,col 95)",
        "(line 1250,col 9)-(line 1255,col 9)",
        "(line 1257,col 9)-(line 1257,col 83)",
        "(line 1258,col 9)-(line 1258,col 84)",
        "(line 1259,col 9)-(line 1259,col 85)",
        "(line 1260,col 9)-(line 1260,col 85)",
        "(line 1261,col 9)-(line 1261,col 86)",
        "(line 1262,col 9)-(line 1262,col 87)",
        "(line 1264,col 9)-(line 1269,col 9)",
        "(line 1272,col 9)-(line 1272,col 94)",
        "(line 1275,col 9)-(line 1275,col 80)",
        "(line 1276,col 9)-(line 1276,col 63)",
        "(line 1277,col 9)-(line 1277,col 105)",
        "(line 1278,col 9)-(line 1278,col 105)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1281,
      "end_line": 1376,
      "comment": "",
      "child_ranges": [
        "(line 1283,col 9)-(line 1283,col 31)",
        "(line 1284,col 9)-(line 1284,col 63)",
        "(line 1285,col 9)-(line 1285,col 64)",
        "(line 1286,col 9)-(line 1286,col 65)",
        "(line 1289,col 9)-(line 1289,col 70)",
        "(line 1290,col 9)-(line 1290,col 70)",
        "(line 1291,col 9)-(line 1291,col 71)",
        "(line 1292,col 9)-(line 1292,col 71)",
        "(line 1293,col 9)-(line 1293,col 71)",
        "(line 1294,col 9)-(line 1294,col 71)",
        "(line 1295,col 9)-(line 1295,col 71)",
        "(line 1297,col 9)-(line 1297,col 89)",
        "(line 1298,col 9)-(line 1298,col 90)",
        "(line 1299,col 9)-(line 1299,col 91)",
        "(line 1300,col 9)-(line 1300,col 91)",
        "(line 1301,col 9)-(line 1301,col 92)",
        "(line 1302,col 9)-(line 1302,col 93)",
        "(line 1304,col 9)-(line 1304,col 86)",
        "(line 1305,col 9)-(line 1305,col 87)",
        "(line 1306,col 9)-(line 1306,col 88)",
        "(line 1307,col 9)-(line 1307,col 88)",
        "(line 1308,col 9)-(line 1308,col 89)",
        "(line 1309,col 9)-(line 1309,col 90)",
        "(line 1311,col 9)-(line 1311,col 87)",
        "(line 1312,col 9)-(line 1312,col 88)",
        "(line 1313,col 9)-(line 1313,col 89)",
        "(line 1314,col 9)-(line 1314,col 89)",
        "(line 1315,col 9)-(line 1315,col 90)",
        "(line 1316,col 9)-(line 1316,col 91)",
        "(line 1318,col 9)-(line 1318,col 91)",
        "(line 1319,col 9)-(line 1319,col 92)",
        "(line 1320,col 9)-(line 1320,col 93)",
        "(line 1321,col 9)-(line 1321,col 93)",
        "(line 1322,col 9)-(line 1322,col 94)",
        "(line 1323,col 9)-(line 1323,col 95)",
        "(line 1324,col 9)-(line 1324,col 98)",
        "(line 1325,col 9)-(line 1325,col 100)",
        "(line 1327,col 9)-(line 1327,col 91)",
        "(line 1328,col 9)-(line 1328,col 92)",
        "(line 1329,col 9)-(line 1329,col 93)",
        "(line 1330,col 9)-(line 1330,col 93)",
        "(line 1331,col 9)-(line 1331,col 94)",
        "(line 1332,col 9)-(line 1332,col 95)",
        "(line 1333,col 9)-(line 1333,col 98)",
        "(line 1334,col 9)-(line 1334,col 100)",
        "(line 1335,col 9)-(line 1335,col 98)",
        "(line 1336,col 9)-(line 1336,col 100)",
        "(line 1338,col 9)-(line 1338,col 89)",
        "(line 1339,col 9)-(line 1339,col 90)",
        "(line 1340,col 9)-(line 1340,col 91)",
        "(line 1341,col 9)-(line 1341,col 91)",
        "(line 1342,col 9)-(line 1342,col 92)",
        "(line 1343,col 9)-(line 1343,col 93)",
        "(line 1344,col 9)-(line 1344,col 96)",
        "(line 1345,col 9)-(line 1345,col 98)",
        "(line 1347,col 9)-(line 1347,col 99)",
        "(line 1348,col 9)-(line 1348,col 97)",
        "(line 1350,col 9)-(line 1355,col 9)",
        "(line 1357,col 9)-(line 1357,col 84)",
        "(line 1358,col 9)-(line 1358,col 85)",
        "(line 1359,col 9)-(line 1359,col 86)",
        "(line 1360,col 9)-(line 1360,col 86)",
        "(line 1361,col 9)-(line 1361,col 87)",
        "(line 1362,col 9)-(line 1362,col 88)",
        "(line 1364,col 9)-(line 1369,col 9)",
        "(line 1372,col 9)-(line 1372,col 79)",
        "(line 1373,col 9)-(line 1373,col 66)",
        "(line 1374,col 9)-(line 1374,col 104)",
        "(line 1375,col 9)-(line 1375,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1378,
      "end_line": 1383,
      "comment": "",
      "child_ranges": [
        "(line 1380,col 9)-(line 1380,col 64)",
        "(line 1381,col 9)-(line 1381,col 64)",
        "(line 1382,col 9)-(line 1382,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1385,
      "end_line": 1392,
      "comment": "",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 27)",
        "(line 1388,col 9)-(line 1388,col 61)",
        "(line 1389,col 9)-(line 1389,col 61)",
        "(line 1390,col 9)-(line 1390,col 63)",
        "(line 1391,col 9)-(line 1391,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1394,
      "end_line": 1401,
      "comment": "",
      "child_ranges": [
        "(line 1396,col 9)-(line 1396,col 27)",
        "(line 1397,col 9)-(line 1397,col 63)",
        "(line 1398,col 9)-(line 1398,col 63)",
        "(line 1399,col 9)-(line 1399,col 65)",
        "(line 1400,col 9)-(line 1400,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1403,
      "end_line": 1408,
      "comment": "",
      "child_ranges": [
        "(line 1405,col 9)-(line 1405,col 50)",
        "(line 1406,col 9)-(line 1406,col 50)",
        "(line 1407,col 9)-(line 1407,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1410,
      "end_line": 1415,
      "comment": "",
      "child_ranges": [
        "(line 1412,col 9)-(line 1412,col 52)",
        "(line 1413,col 9)-(line 1413,col 52)",
        "(line 1414,col 9)-(line 1414,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1417,
      "end_line": 1422,
      "comment": "",
      "child_ranges": [
        "(line 1419,col 9)-(line 1419,col 66)",
        "(line 1420,col 9)-(line 1420,col 66)",
        "(line 1421,col 9)-(line 1421,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1424,
      "end_line": 1429,
      "comment": "",
      "child_ranges": [
        "(line 1426,col 9)-(line 1426,col 23)",
        "(line 1427,col 9)-(line 1427,col 35)",
        "(line 1428,col 9)-(line 1428,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1431,
      "end_line": 1434,
      "comment": "",
      "child_ranges": [
        "(line 1433,col 9)-(line 1433,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1436,
      "end_line": 1453,
      "comment": "",
      "child_ranges": [
        "(line 1438,col 9)-(line 1438,col 36)",
        "(line 1439,col 9)-(line 1439,col 39)",
        "(line 1440,col 9)-(line 1440,col 64)",
        "(line 1441,col 9)-(line 1441,col 75)",
        "(line 1442,col 9)-(line 1442,col 69)",
        "(line 1443,col 9)-(line 1447,col 9)",
        "(line 1448,col 9)-(line 1452,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1455,
      "end_line": 1464,
      "comment": "",
      "child_ranges": [
        "(line 1457,col 9)-(line 1457,col 36)",
        "(line 1458,col 9)-(line 1463,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1466,
      "end_line": 1480,
      "comment": "",
      "child_ranges": [
        "(line 1468,col 9)-(line 1468,col 34)",
        "(line 1469,col 9)-(line 1469,col 34)",
        "(line 1470,col 9)-(line 1470,col 64)",
        "(line 1471,col 9)-(line 1471,col 64)",
        "(line 1472,col 9)-(line 1472,col 65)",
        "(line 1473,col 9)-(line 1473,col 69)",
        "(line 1475,col 9)-(line 1475,col 71)",
        "(line 1476,col 9)-(line 1476,col 70)",
        "(line 1477,col 9)-(line 1477,col 44)",
        "(line 1478,col 9)-(line 1478,col 45)",
        "(line 1479,col 9)-(line 1479,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1482,
      "end_line": 1490,
      "comment": "",
      "child_ranges": [
        "(line 1483,col 9)-(line 1488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1492,
      "end_line": 1567,
      "comment": "",
      "child_ranges": [
        "(line 1495,col 9)-(line 1495,col 62)",
        "(line 1496,col 9)-(line 1496,col 53)",
        "(line 1497,col 9)-(line 1502,col 9)",
        "(line 1504,col 9)-(line 1504,col 63)",
        "(line 1505,col 9)-(line 1505,col 54)",
        "(line 1506,col 9)-(line 1511,col 9)",
        "(line 1513,col 9)-(line 1513,col 64)",
        "(line 1514,col 9)-(line 1514,col 55)",
        "(line 1515,col 9)-(line 1520,col 9)",
        "(line 1522,col 9)-(line 1522,col 65)",
        "(line 1523,col 9)-(line 1523,col 56)",
        "(line 1524,col 9)-(line 1529,col 9)",
        "(line 1531,col 9)-(line 1531,col 55)",
        "(line 1532,col 9)-(line 1532,col 90)",
        "(line 1533,col 9)-(line 1533,col 73)",
        "(line 1534,col 9)-(line 1539,col 9)",
        "(line 1541,col 9)-(line 1541,col 91)",
        "(line 1542,col 9)-(line 1542,col 74)",
        "(line 1543,col 9)-(line 1548,col 9)",
        "(line 1550,col 9)-(line 1550,col 111)",
        "(line 1551,col 9)-(line 1551,col 87)",
        "(line 1552,col 9)-(line 1557,col 9)",
        "(line 1559,col 9)-(line 1562,col 76)",
        "(line 1563,col 9)-(line 1563,col 67)",
        "(line 1564,col 9)-(line 1564,col 68)",
        "(line 1565,col 9)-(line 1565,col 88)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1569,
      "end_line": 1574,
      "comment": "",
      "child_ranges": [
        "(line 1571,col 9)-(line 1571,col 36)",
        "(line 1572,col 9)-(line 1572,col 36)",
        "(line 1573,col 9)-(line 1573,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1576,
      "end_line": 1581,
      "comment": "",
      "child_ranges": [
        "(line 1578,col 9)-(line 1578,col 28)",
        "(line 1579,col 9)-(line 1579,col 28)",
        "(line 1580,col 9)-(line 1580,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1583,
      "end_line": 1588,
      "comment": "",
      "child_ranges": [
        "(line 1585,col 9)-(line 1585,col 36)",
        "(line 1586,col 9)-(line 1586,col 36)",
        "(line 1587,col 9)-(line 1587,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1590,
      "end_line": 1595,
      "comment": "",
      "child_ranges": [
        "(line 1592,col 9)-(line 1592,col 28)",
        "(line 1593,col 9)-(line 1593,col 28)",
        "(line 1594,col 9)-(line 1594,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1597,
      "end_line": 1602,
      "comment": "",
      "child_ranges": [
        "(line 1599,col 9)-(line 1599,col 36)",
        "(line 1600,col 9)-(line 1600,col 36)",
        "(line 1601,col 9)-(line 1601,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1604,
      "end_line": 1609,
      "comment": "",
      "child_ranges": [
        "(line 1606,col 9)-(line 1606,col 28)",
        "(line 1607,col 9)-(line 1607,col 28)",
        "(line 1608,col 9)-(line 1608,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1611,
      "end_line": 1650,
      "comment": "",
      "child_ranges": [
        "(line 1613,col 9)-(line 1614,col 72)",
        "(line 1615,col 9)-(line 1616,col 73)",
        "(line 1617,col 9)-(line 1618,col 72)",
        "(line 1619,col 9)-(line 1620,col 73)",
        "(line 1622,col 9)-(line 1628,col 9)",
        "(line 1629,col 9)-(line 1635,col 9)",
        "(line 1636,col 9)-(line 1642,col 9)",
        "(line 1643,col 9)-(line 1649,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckFinite()",
      "begin_line": 1652,
      "end_line": 1691,
      "comment": "",
      "child_ranges": [
        "(line 1654,col 9)-(line 1659,col 9)",
        "(line 1660,col 9)-(line 1665,col 9)",
        "(line 1666,col 9)-(line 1671,col 9)",
        "(line 1673,col 9)-(line 1678,col 9)",
        "(line 1679,col 9)-(line 1684,col 9)",
        "(line 1685,col 9)-(line 1690,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSortInPlace()",
      "begin_line": 1693,
      "end_line": 1720,
      "comment": "",
      "child_ranges": [
        "(line 1695,col 9)-(line 1695,col 49)",
        "(line 1696,col 9)-(line 1696,col 49)",
        "(line 1697,col 9)-(line 1697,col 49)",
        "(line 1699,col 9)-(line 1699,col 42)",
        "(line 1701,col 9)-(line 1701,col 54)",
        "(line 1702,col 9)-(line 1702,col 54)",
        "(line 1703,col 9)-(line 1703,col 54)",
        "(line 1705,col 9)-(line 1705,col 52)",
        "(line 1706,col 9)-(line 1706,col 52)",
        "(line 1707,col 9)-(line 1707,col 52)",
        "(line 1709,col 9)-(line 1709,col 52)",
        "(line 1710,col 9)-(line 1710,col 52)",
        "(line 1711,col 9)-(line 1711,col 52)",
        "(line 1713,col 9)-(line 1713,col 53)",
        "(line 1714,col 9)-(line 1714,col 53)",
        "(line 1715,col 9)-(line 1715,col 53)",
        "(line 1717,col 9)-(line 1717,col 54)",
        "(line 1718,col 9)-(line 1718,col 54)",
        "(line 1719,col 9)-(line 1719,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt()",
      "begin_line": 1722,
      "end_line": 1733,
      "comment": "",
      "child_ranges": [
        "(line 1724,col 9)-(line 1726,col 51)",
        "(line 1727,col 9)-(line 1727,col 52)",
        "(line 1729,col 9)-(line 1729,col 56)",
        "(line 1730,col 9)-(line 1732,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt2()",
      "begin_line": 1735,
      "end_line": 1747,
      "comment": "",
      "child_ranges": [
        "(line 1737,col 9)-(line 1739,col 51)",
        "(line 1740,col 9)-(line 1740,col 29)",
        "(line 1741,col 9)-(line 1741,col 76)",
        "(line 1743,col 9)-(line 1743,col 65)",
        "(line 1744,col 9)-(line 1746,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfInt3()",
      "begin_line": 1749,
      "end_line": 1764,
      "comment": "",
      "child_ranges": [
        "(line 1751,col 9)-(line 1753,col 51)",
        "(line 1754,col 9)-(line 1754,col 29)",
        "(line 1755,col 9)-(line 1755,col 76)",
        "(line 1757,col 9)-(line 1757,col 65)",
        "(line 1758,col 9)-(line 1760,col 9)",
        "(line 1761,col 9)-(line 1763,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble()",
      "begin_line": 1766,
      "end_line": 1782,
      "comment": "",
      "child_ranges": [
        "(line 1768,col 9)-(line 1775,col 61)",
        "(line 1776,col 9)-(line 1776,col 55)",
        "(line 1778,col 9)-(line 1778,col 56)",
        "(line 1779,col 9)-(line 1781,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble2()",
      "begin_line": 1784,
      "end_line": 1801,
      "comment": "",
      "child_ranges": [
        "(line 1786,col 9)-(line 1793,col 61)",
        "(line 1794,col 9)-(line 1794,col 29)",
        "(line 1795,col 9)-(line 1795,col 79)",
        "(line 1797,col 9)-(line 1797,col 65)",
        "(line 1798,col 9)-(line 1800,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCopyOfDouble3()",
      "begin_line": 1803,
      "end_line": 1823,
      "comment": "",
      "child_ranges": [
        "(line 1805,col 9)-(line 1812,col 61)",
        "(line 1813,col 9)-(line 1813,col 29)",
        "(line 1814,col 9)-(line 1814,col 79)",
        "(line 1816,col 9)-(line 1816,col 65)",
        "(line 1817,col 9)-(line 1819,col 9)",
        "(line 1820,col 9)-(line 1822,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull1()",
      "begin_line": 1825,
      "end_line": 1833,
      "comment": "",
      "child_ranges": [
        "(line 1827,col 9)-(line 1832,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckNotNull2()",
      "begin_line": 1835,
      "end_line": 1843,
      "comment": "",
      "child_ranges": [
        "(line 1837,col 9)-(line 1842,col 9)"
      ]
    }
  ]
}
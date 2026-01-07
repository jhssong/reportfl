{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 1157,
      "comment": "\n * Test cases for the MathUtils class.\n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.suite()",
      "begin_line": 41,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 61)",
        "(line 43,col 9)-(line 43,col 41)",
        "(line 44,col 9)-(line 44,col 21)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 53,
      "end_line": 85,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 79,col 9)",
        "(line 80,col 9)-(line 82,col 9)",
        "(line 83,col 9)-(line 83,col 67)",
        "(line 84,col 9)-(line 84,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 90,
      "end_line": 96,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 24)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 99,
      "end_line": 103,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 100,col 9)-(line 100,col 71)",
        "(line 101,col 9)-(line 101,col 68)",
        "(line 102,col 9)-(line 102,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 105,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 36)",
        "(line 107,col 9)-(line 107,col 39)",
        "(line 108,col 9)-(line 108,col 57)",
        "(line 109,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 121,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 34)",
        "(line 123,col 9)-(line 123,col 34)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 125,col 9)-(line 125,col 58)",
        "(line 126,col 9)-(line 126,col 58)",
        "(line 127,col 9)-(line 127,col 58)",
        "(line 128,col 9)-(line 128,col 56)",
        "(line 129,col 9)-(line 129,col 56)",
        "(line 130,col 9)-(line 130,col 58)",
        "(line 131,col 9)-(line 131,col 63)",
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
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 148,col 9)-(line 154,col 16)",
        "(line 155,col 9)-(line 162,col 16)",
        "(line 163,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 168,col 9)",
        "(line 170,col 9)-(line 176,col 9)",
        "(line 178,col 9)-(line 178,col 46)",
        "(line 179,col 9)-(line 179,col 46)",
        "(line 180,col 9)-(line 188,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 195,
      "end_line": 249,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 63)",
        "(line 227,col 9)-(line 227,col 55)",
        "(line 228,col 9)-(line 228,col 45)",
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 45)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)",
        "(line 243,col 9)-(line 243,col 56)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 45)",
        "(line 246,col 9)-(line 246,col 88)",
        "(line 247,col 9)-(line 247,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 251,
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 309,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 310,col 7)-(line 310,col 65)",
        "(line 311,col 7)-(line 311,col 65)",
        "(line 312,col 7)-(line 312,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 315,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 23)",
        "(line 317,col 9)-(line 317,col 35)",
        "(line 318,col 9)-(line 318,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 321,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 325,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 331,col 17)",
        "(line 332,col 9)-(line 342,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 345,
      "end_line": 355,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 64)",
        "(line 347,col 9)-(line 347,col 64)",
        "(line 348,col 9)-(line 348,col 64)",
        "(line 349,col 9)-(line 349,col 66)",
        "(line 350,col 9)-(line 350,col 94)",
        "(line 351,col 9)-(line 351,col 94)",
        "(line 352,col 9)-(line 352,col 95)",
        "(line 353,col 9)-(line 353,col 65)",
        "(line 354,col 9)-(line 354,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 357,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 65)",
        "(line 359,col 9)-(line 359,col 65)",
        "(line 360,col 9)-(line 360,col 71)",
        "(line 362,col 9)-(line 362,col 74)",
        "(line 363,col 9)-(line 363,col 79)",
        "(line 364,col 9)-(line 370,col 40)",
        "(line 371,col 9)-(line 372,col 81)",
        "(line 373,col 9)-(line 374,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 378,
      "end_line": 388,
      "comment": "",
      "child_ranges": [
        "(line 379,col 9)-(line 383,col 9)",
        "(line 385,col 9)-(line 385,col 53)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 390,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 391,col 9)-(line 396,col 9)",
        "(line 397,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 408,col 9)",
        "(line 409,col 9)-(line 414,col 9)",
        "(line 415,col 9)-(line 415,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 418,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 19)",
        "(line 420,col 9)-(line 420,col 19)",
        "(line 421,col 9)-(line 421,col 19)",
        "(line 423,col 9)-(line 423,col 45)",
        "(line 425,col 9)-(line 425,col 45)",
        "(line 426,col 9)-(line 426,col 45)",
        "(line 427,col 9)-(line 427,col 46)",
        "(line 428,col 9)-(line 428,col 46)",
        "(line 430,col 9)-(line 430,col 46)",
        "(line 431,col 9)-(line 431,col 47)",
        "(line 432,col 9)-(line 432,col 47)",
        "(line 433,col 9)-(line 433,col 48)",
        "(line 435,col 9)-(line 435,col 45)",
        "(line 436,col 9)-(line 436,col 46)",
        "(line 437,col 9)-(line 437,col 46)",
        "(line 438,col 9)-(line 438,col 47)",
        "(line 440,col 9)-(line 440,col 75)",
        "(line 442,col 9)-(line 442,col 77)",
        "(line 443,col 9)-(line 443,col 78)",
        "(line 444,col 9)-(line 444,col 70)",
        "(line 445,col 9)-(line 451,col 9)",
        "(line 452,col 9)-(line 458,col 9)",
        "(line 459,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 468,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 478,col 31)",
        "(line 479,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 492,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 57)",
        "(line 494,col 9)-(line 501,col 40)",
        "(line 502,col 9)-(line 503,col 82)",
        "(line 504,col 9)-(line 505,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 511,
      "end_line": 535,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 43)",
        "(line 513,col 9)-(line 513,col 43)",
        "(line 514,col 9)-(line 514,col 53)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 522,col 9)-(line 522,col 34)",
        "(line 523,col 9)-(line 531,col 29)",
        "(line 534,col 9)-(line 534,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 537,
      "end_line": 541,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 60)",
        "(line 539,col 9)-(line 539,col 60)",
        "(line 540,col 9)-(line 540,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 543,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 27)",
        "(line 545,col 9)-(line 545,col 59)",
        "(line 546,col 9)-(line 546,col 59)",
        "(line 547,col 9)-(line 547,col 61)",
        "(line 548,col 9)-(line 548,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 551,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 27)",
        "(line 553,col 9)-(line 553,col 61)",
        "(line 554,col 9)-(line 554,col 61)",
        "(line 555,col 9)-(line 555,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 558,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 50)",
        "(line 560,col 9)-(line 560,col 50)",
        "(line 561,col 9)-(line 561,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 564,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 50)",
        "(line 566,col 9)-(line 566,col 50)",
        "(line 567,col 9)-(line 567,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 570,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 571,col 9)-(line 571,col 62)",
        "(line 572,col 9)-(line 572,col 62)",
        "(line 573,col 9)-(line 573,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 576,
      "end_line": 620,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 19)",
        "(line 578,col 9)-(line 578,col 19)",
        "(line 579,col 9)-(line 579,col 19)",
        "(line 581,col 9)-(line 581,col 45)",
        "(line 582,col 9)-(line 582,col 45)",
        "(line 583,col 9)-(line 583,col 45)",
        "(line 584,col 9)-(line 584,col 45)",
        "(line 585,col 9)-(line 585,col 47)",
        "(line 586,col 9)-(line 586,col 48)",
        "(line 587,col 9)-(line 587,col 48)",
        "(line 588,col 9)-(line 588,col 49)",
        "(line 589,col 9)-(line 589,col 48)",
        "(line 593,col 9)-(line 593,col 70)",
        "(line 596,col 9)-(line 596,col 45)",
        "(line 598,col 9)-(line 604,col 9)",
        "(line 606,col 9)-(line 612,col 9)",
        "(line 614,col 9)-(line 619,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 622,
      "end_line": 630,
      "comment": "",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 50)",
        "(line 624,col 9)-(line 624,col 50)",
        "(line 625,col 9)-(line 625,col 55)",
        "(line 626,col 9)-(line 626,col 55)",
        "(line 627,col 9)-(line 627,col 54)",
        "(line 628,col 9)-(line 628,col 49)",
        "(line 629,col 9)-(line 629,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 632,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 633,col 9)-(line 633,col 36)",
        "(line 634,col 9)-(line 634,col 39)",
        "(line 635,col 9)-(line 635,col 57)",
        "(line 636,col 9)-(line 640,col 9)",
        "(line 641,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 648,
      "end_line": 667,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 649,col 34)",
        "(line 650,col 9)-(line 650,col 34)",
        "(line 651,col 9)-(line 651,col 58)",
        "(line 652,col 9)-(line 652,col 58)",
        "(line 653,col 9)-(line 653,col 57)",
        "(line 654,col 9)-(line 654,col 57)",
        "(line 655,col 9)-(line 655,col 58)",
        "(line 656,col 9)-(line 656,col 58)",
        "(line 657,col 9)-(line 657,col 57)",
        "(line 658,col 9)-(line 658,col 57)",
        "(line 659,col 9)-(line 659,col 58)",
        "(line 660,col 9)-(line 660,col 61)",
        "(line 661,col 9)-(line 661,col 44)",
        "(line 662,col 9)-(line 662,col 44)",
        "(line 663,col 9)-(line 663,col 44)",
        "(line 664,col 9)-(line 664,col 44)",
        "(line 665,col 9)-(line 665,col 45)",
        "(line 666,col 9)-(line 666,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 669,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 670,col 9)-(line 675,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 678,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 92)",
        "(line 683,col 9)-(line 683,col 108)",
        "(line 686,col 9)-(line 686,col 106)",
        "(line 689,col 9)-(line 689,col 108)",
        "(line 692,col 9)-(line 692,col 90)",
        "(line 695,col 9)-(line 695,col 92)",
        "(line 698,col 9)-(line 698,col 90)",
        "(line 701,col 9)-(line 701,col 92)",
        "(line 704,col 9)-(line 704,col 114)",
        "(line 707,col 9)-(line 707,col 115)",
        "(line 710,col 9)-(line 710,col 116)",
        "(line 713,col 9)-(line 713,col 116)",
        "(line 716,col 9)-(line 716,col 117)",
        "(line 719,col 9)-(line 719,col 117)",
        "(line 722,col 9)-(line 722,col 117)",
        "(line 725,col 9)-(line 725,col 118)",
        "(line 728,col 9)-(line 728,col 118)",
        "(line 731,col 9)-(line 731,col 117)",
        "(line 734,col 9)-(line 734,col 118)",
        "(line 737,col 9)-(line 737,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 741,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 742,col 9)-(line 742,col 88)",
        "(line 743,col 9)-(line 743,col 88)",
        "(line 744,col 9)-(line 744,col 69)",
        "(line 745,col 9)-(line 745,col 103)",
        "(line 746,col 9)-(line 746,col 104)",
        "(line 747,col 9)-(line 747,col 69)",
        "(line 748,col 9)-(line 748,col 71)",
        "(line 749,col 9)-(line 749,col 70)",
        "(line 750,col 9)-(line 750,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 753,
      "end_line": 761,
      "comment": "",
      "child_ranges": [
        "(line 754,col 9)-(line 754,col 61)",
        "(line 755,col 9)-(line 755,col 61)",
        "(line 756,col 9)-(line 756,col 69)",
        "(line 757,col 9)-(line 757,col 68)",
        "(line 758,col 9)-(line 758,col 84)",
        "(line 759,col 9)-(line 759,col 84)",
        "(line 760,col 9)-(line 760,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 763,
      "end_line": 773,
      "comment": "",
      "child_ranges": [
        "(line 764,col 9)-(line 772,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 775,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 776,col 9)-(line 776,col 31)",
        "(line 777,col 9)-(line 777,col 55)",
        "(line 778,col 9)-(line 778,col 56)",
        "(line 779,col 9)-(line 779,col 57)",
        "(line 782,col 9)-(line 782,col 61)",
        "(line 783,col 9)-(line 783,col 84)",
        "(line 784,col 9)-(line 784,col 25)",
        "(line 785,col 9)-(line 785,col 31)",
        "(line 786,col 9)-(line 786,col 57)",
        "(line 789,col 9)-(line 789,col 63)",
        "(line 790,col 9)-(line 790,col 63)",
        "(line 791,col 9)-(line 791,col 63)",
        "(line 792,col 9)-(line 792,col 63)",
        "(line 793,col 9)-(line 793,col 64)",
        "(line 794,col 9)-(line 794,col 64)",
        "(line 795,col 9)-(line 795,col 64)",
        "(line 796,col 9)-(line 796,col 64)",
        "(line 797,col 9)-(line 797,col 64)",
        "(line 799,col 9)-(line 799,col 81)",
        "(line 800,col 9)-(line 800,col 82)",
        "(line 801,col 9)-(line 801,col 83)",
        "(line 802,col 9)-(line 802,col 83)",
        "(line 803,col 9)-(line 803,col 84)",
        "(line 804,col 9)-(line 804,col 85)",
        "(line 806,col 9)-(line 806,col 78)",
        "(line 807,col 9)-(line 807,col 79)",
        "(line 808,col 9)-(line 808,col 80)",
        "(line 809,col 9)-(line 809,col 80)",
        "(line 810,col 9)-(line 810,col 81)",
        "(line 811,col 9)-(line 811,col 82)",
        "(line 813,col 9)-(line 813,col 79)",
        "(line 814,col 9)-(line 814,col 80)",
        "(line 815,col 9)-(line 815,col 81)",
        "(line 816,col 9)-(line 816,col 81)",
        "(line 817,col 9)-(line 817,col 82)",
        "(line 818,col 9)-(line 818,col 83)",
        "(line 820,col 9)-(line 820,col 83)",
        "(line 821,col 9)-(line 821,col 84)",
        "(line 822,col 9)-(line 822,col 85)",
        "(line 823,col 9)-(line 823,col 85)",
        "(line 824,col 9)-(line 824,col 86)",
        "(line 825,col 9)-(line 825,col 87)",
        "(line 826,col 9)-(line 826,col 89)",
        "(line 827,col 9)-(line 827,col 91)",
        "(line 829,col 9)-(line 829,col 83)",
        "(line 830,col 9)-(line 830,col 84)",
        "(line 831,col 9)-(line 831,col 85)",
        "(line 832,col 9)-(line 832,col 85)",
        "(line 833,col 9)-(line 833,col 86)",
        "(line 834,col 9)-(line 834,col 87)",
        "(line 835,col 9)-(line 835,col 89)",
        "(line 836,col 9)-(line 836,col 91)",
        "(line 837,col 9)-(line 837,col 89)",
        "(line 838,col 9)-(line 838,col 91)",
        "(line 840,col 9)-(line 840,col 81)",
        "(line 841,col 9)-(line 841,col 82)",
        "(line 842,col 9)-(line 842,col 83)",
        "(line 843,col 9)-(line 843,col 83)",
        "(line 844,col 9)-(line 844,col 84)",
        "(line 845,col 9)-(line 845,col 85)",
        "(line 846,col 9)-(line 846,col 87)",
        "(line 847,col 9)-(line 847,col 89)",
        "(line 849,col 9)-(line 849,col 90)",
        "(line 850,col 9)-(line 850,col 88)",
        "(line 852,col 9)-(line 857,col 9)",
        "(line 859,col 9)-(line 859,col 76)",
        "(line 860,col 9)-(line 860,col 77)",
        "(line 861,col 9)-(line 861,col 78)",
        "(line 862,col 9)-(line 862,col 78)",
        "(line 863,col 9)-(line 863,col 79)",
        "(line 864,col 9)-(line 864,col 80)",
        "(line 866,col 9)-(line 871,col 9)",
        "(line 874,col 9)-(line 874,col 87)",
        "(line 877,col 9)-(line 877,col 80)",
        "(line 878,col 9)-(line 878,col 56)",
        "(line 879,col 9)-(line 879,col 98)",
        "(line 880,col 9)-(line 880,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 883,
      "end_line": 977,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 31)",
        "(line 885,col 9)-(line 885,col 56)",
        "(line 886,col 9)-(line 886,col 57)",
        "(line 887,col 9)-(line 887,col 58)",
        "(line 890,col 9)-(line 890,col 63)",
        "(line 891,col 9)-(line 891,col 63)",
        "(line 892,col 9)-(line 892,col 64)",
        "(line 893,col 9)-(line 893,col 64)",
        "(line 894,col 9)-(line 894,col 64)",
        "(line 895,col 9)-(line 895,col 64)",
        "(line 896,col 9)-(line 896,col 64)",
        "(line 898,col 9)-(line 898,col 82)",
        "(line 899,col 9)-(line 899,col 83)",
        "(line 900,col 9)-(line 900,col 84)",
        "(line 901,col 9)-(line 901,col 84)",
        "(line 902,col 9)-(line 902,col 85)",
        "(line 903,col 9)-(line 903,col 86)",
        "(line 905,col 9)-(line 905,col 79)",
        "(line 906,col 9)-(line 906,col 80)",
        "(line 907,col 9)-(line 907,col 81)",
        "(line 908,col 9)-(line 908,col 81)",
        "(line 909,col 9)-(line 909,col 82)",
        "(line 910,col 9)-(line 910,col 83)",
        "(line 912,col 9)-(line 912,col 80)",
        "(line 913,col 9)-(line 913,col 81)",
        "(line 914,col 9)-(line 914,col 82)",
        "(line 915,col 9)-(line 915,col 82)",
        "(line 916,col 9)-(line 916,col 83)",
        "(line 917,col 9)-(line 917,col 84)",
        "(line 919,col 9)-(line 919,col 84)",
        "(line 920,col 9)-(line 920,col 85)",
        "(line 921,col 9)-(line 921,col 86)",
        "(line 922,col 9)-(line 922,col 86)",
        "(line 923,col 9)-(line 923,col 87)",
        "(line 924,col 9)-(line 924,col 88)",
        "(line 925,col 9)-(line 925,col 91)",
        "(line 926,col 9)-(line 926,col 93)",
        "(line 928,col 9)-(line 928,col 84)",
        "(line 929,col 9)-(line 929,col 85)",
        "(line 930,col 9)-(line 930,col 86)",
        "(line 931,col 9)-(line 931,col 86)",
        "(line 932,col 9)-(line 932,col 87)",
        "(line 933,col 9)-(line 933,col 88)",
        "(line 934,col 9)-(line 934,col 91)",
        "(line 935,col 9)-(line 935,col 93)",
        "(line 936,col 9)-(line 936,col 91)",
        "(line 937,col 9)-(line 937,col 93)",
        "(line 939,col 9)-(line 939,col 82)",
        "(line 940,col 9)-(line 940,col 83)",
        "(line 941,col 9)-(line 941,col 84)",
        "(line 942,col 9)-(line 942,col 84)",
        "(line 943,col 9)-(line 943,col 85)",
        "(line 944,col 9)-(line 944,col 86)",
        "(line 945,col 9)-(line 945,col 89)",
        "(line 946,col 9)-(line 946,col 91)",
        "(line 948,col 9)-(line 948,col 92)",
        "(line 949,col 9)-(line 949,col 90)",
        "(line 951,col 9)-(line 956,col 9)",
        "(line 958,col 9)-(line 958,col 77)",
        "(line 959,col 9)-(line 959,col 78)",
        "(line 960,col 9)-(line 960,col 79)",
        "(line 961,col 9)-(line 961,col 79)",
        "(line 962,col 9)-(line 962,col 80)",
        "(line 963,col 9)-(line 963,col 81)",
        "(line 965,col 9)-(line 970,col 9)",
        "(line 973,col 9)-(line 973,col 79)",
        "(line 974,col 9)-(line 974,col 59)",
        "(line 975,col 9)-(line 975,col 97)",
        "(line 976,col 9)-(line 976,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 979,
      "end_line": 983,
      "comment": "",
      "child_ranges": [
        "(line 980,col 9)-(line 980,col 57)",
        "(line 981,col 9)-(line 981,col 57)",
        "(line 982,col 9)-(line 982,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 985,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 27)",
        "(line 987,col 9)-(line 987,col 54)",
        "(line 988,col 9)-(line 988,col 54)",
        "(line 989,col 9)-(line 989,col 56)",
        "(line 990,col 9)-(line 990,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 993,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 994,col 9)-(line 994,col 27)",
        "(line 995,col 9)-(line 995,col 56)",
        "(line 996,col 9)-(line 996,col 56)",
        "(line 997,col 9)-(line 997,col 58)",
        "(line 998,col 9)-(line 998,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1001,
      "end_line": 1005,
      "comment": "",
      "child_ranges": [
        "(line 1002,col 9)-(line 1002,col 43)",
        "(line 1003,col 9)-(line 1003,col 43)",
        "(line 1004,col 9)-(line 1004,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1007,
      "end_line": 1011,
      "comment": "",
      "child_ranges": [
        "(line 1008,col 9)-(line 1008,col 45)",
        "(line 1009,col 9)-(line 1009,col 45)",
        "(line 1010,col 9)-(line 1010,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1013,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1014,col 9)-(line 1014,col 59)",
        "(line 1015,col 9)-(line 1015,col 59)",
        "(line 1016,col 9)-(line 1016,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1019,
      "end_line": 1023,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 23)",
        "(line 1021,col 9)-(line 1021,col 35)",
        "(line 1022,col 9)-(line 1022,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1025,
      "end_line": 1027,
      "comment": "",
      "child_ranges": [
        "(line 1026,col 9)-(line 1026,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1029,
      "end_line": 1045,
      "comment": "",
      "child_ranges": [
        "(line 1030,col 9)-(line 1030,col 36)",
        "(line 1031,col 9)-(line 1031,col 39)",
        "(line 1032,col 9)-(line 1032,col 57)",
        "(line 1033,col 9)-(line 1033,col 68)",
        "(line 1034,col 9)-(line 1034,col 62)",
        "(line 1035,col 9)-(line 1039,col 9)",
        "(line 1040,col 9)-(line 1044,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1047,
      "end_line": 1055,
      "comment": "",
      "child_ranges": [
        "(line 1048,col 9)-(line 1048,col 36)",
        "(line 1049,col 9)-(line 1054,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1057,
      "end_line": 1070,
      "comment": "",
      "child_ranges": [
        "(line 1058,col 9)-(line 1058,col 34)",
        "(line 1059,col 9)-(line 1059,col 34)",
        "(line 1060,col 9)-(line 1060,col 57)",
        "(line 1061,col 9)-(line 1061,col 57)",
        "(line 1062,col 9)-(line 1062,col 58)",
        "(line 1063,col 9)-(line 1063,col 62)",
        "(line 1065,col 9)-(line 1065,col 64)",
        "(line 1066,col 9)-(line 1066,col 63)",
        "(line 1067,col 9)-(line 1067,col 44)",
        "(line 1068,col 9)-(line 1068,col 45)",
        "(line 1069,col 9)-(line 1069,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1072,
      "end_line": 1080,
      "comment": "",
      "child_ranges": [
        "(line 1073,col 9)-(line 1078,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1082,
      "end_line": 1156,
      "comment": "",
      "child_ranges": [
        "(line 1084,col 9)-(line 1084,col 55)",
        "(line 1085,col 9)-(line 1085,col 46)",
        "(line 1086,col 9)-(line 1091,col 9)",
        "(line 1093,col 9)-(line 1093,col 56)",
        "(line 1094,col 9)-(line 1094,col 47)",
        "(line 1095,col 9)-(line 1100,col 9)",
        "(line 1102,col 9)-(line 1102,col 57)",
        "(line 1103,col 9)-(line 1103,col 48)",
        "(line 1104,col 9)-(line 1109,col 9)",
        "(line 1111,col 9)-(line 1111,col 58)",
        "(line 1112,col 9)-(line 1112,col 49)",
        "(line 1113,col 9)-(line 1118,col 9)",
        "(line 1120,col 9)-(line 1120,col 55)",
        "(line 1121,col 9)-(line 1121,col 83)",
        "(line 1122,col 9)-(line 1122,col 66)",
        "(line 1123,col 9)-(line 1128,col 9)",
        "(line 1130,col 9)-(line 1130,col 84)",
        "(line 1131,col 9)-(line 1131,col 67)",
        "(line 1132,col 9)-(line 1137,col 9)",
        "(line 1139,col 9)-(line 1139,col 104)",
        "(line 1140,col 9)-(line 1140,col 80)",
        "(line 1141,col 9)-(line 1146,col 9)",
        "(line 1148,col 9)-(line 1151,col 76)",
        "(line 1152,col 9)-(line 1152,col 60)",
        "(line 1153,col 9)-(line 1153,col 61)",
        "(line 1154,col 9)-(line 1154,col 81)"
      ]
    }
  ]
}
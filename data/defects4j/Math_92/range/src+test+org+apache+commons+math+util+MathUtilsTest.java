{
  "filepath": "/tmp/Math-92b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 954,
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
      "end_line": 77,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 59,col 25)",
        "(line 60,col 9)-(line 67,col 9)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 74,col 9)",
        "(line 75,col 9)-(line 75,col 67)",
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
      "end_line": 126,
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
        "(line 122,col 9)-(line 122,col 44)",
        "(line 123,col 9)-(line 123,col 45)",
        "(line 124,col 9)-(line 124,col 44)",
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 128,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 129,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 137,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 144,col 16)",
        "(line 145,col 9)-(line 152,col 16)",
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 169,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 176,
      "end_line": 225,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 198,col 9)",
        "(line 200,col 9)-(line 200,col 63)",
        "(line 201,col 9)-(line 201,col 55)",
        "(line 202,col 9)-(line 202,col 45)",
        "(line 204,col 9)-(line 204,col 60)",
        "(line 205,col 9)-(line 205,col 52)",
        "(line 206,col 9)-(line 206,col 45)",
        "(line 209,col 9)-(line 214,col 9)",
        "(line 219,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 227,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 228,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 66)",
        "(line 261,col 9)-(line 262,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 265,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 23)",
        "(line 267,col 9)-(line 267,col 35)",
        "(line 268,col 9)-(line 268,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 275,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 281,col 17)",
        "(line 282,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 295,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 65)",
        "(line 297,col 9)-(line 297,col 65)",
        "(line 298,col 9)-(line 298,col 71)",
        "(line 300,col 9)-(line 300,col 74)",
        "(line 301,col 9)-(line 301,col 79)",
        "(line 302,col 9)-(line 308,col 40)",
        "(line 309,col 9)-(line 310,col 81)",
        "(line 311,col 9)-(line 312,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 316,
      "end_line": 326,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 323,col 53)",
        "(line 324,col 9)-(line 324,col 69)",
        "(line 325,col 9)-(line 325,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 328,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 329,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 340,col 9)",
        "(line 341,col 9)-(line 346,col 9)",
        "(line 347,col 9)-(line 352,col 9)",
        "(line 353,col 9)-(line 353,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 356,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 19)",
        "(line 358,col 9)-(line 358,col 19)",
        "(line 359,col 9)-(line 359,col 19)",
        "(line 361,col 9)-(line 361,col 45)",
        "(line 363,col 9)-(line 363,col 45)",
        "(line 364,col 9)-(line 364,col 45)",
        "(line 365,col 9)-(line 365,col 46)",
        "(line 366,col 9)-(line 366,col 46)",
        "(line 368,col 9)-(line 368,col 46)",
        "(line 369,col 9)-(line 369,col 47)",
        "(line 370,col 9)-(line 370,col 47)",
        "(line 371,col 9)-(line 371,col 48)",
        "(line 373,col 9)-(line 373,col 45)",
        "(line 374,col 9)-(line 374,col 46)",
        "(line 375,col 9)-(line 375,col 46)",
        "(line 376,col 9)-(line 376,col 47)",
        "(line 378,col 9)-(line 378,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 382,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 392,col 31)",
        "(line 393,col 9)-(line 403,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 406,
      "end_line": 420,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 57)",
        "(line 408,col 9)-(line 415,col 40)",
        "(line 416,col 9)-(line 417,col 82)",
        "(line 418,col 9)-(line 419,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 425,
      "end_line": 449,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 426,col 9)-(line 426,col 43)",
        "(line 427,col 9)-(line 427,col 43)",
        "(line 428,col 9)-(line 428,col 53)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 445,col 29)",
        "(line 448,col 9)-(line 448,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 451,
      "end_line": 455,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 60)",
        "(line 453,col 9)-(line 453,col 60)",
        "(line 454,col 9)-(line 454,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 457,
      "end_line": 462,
      "comment": "",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 27)",
        "(line 459,col 9)-(line 459,col 59)",
        "(line 460,col 9)-(line 460,col 59)",
        "(line 461,col 9)-(line 461,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 464,
      "end_line": 469,
      "comment": "",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 27)",
        "(line 466,col 9)-(line 466,col 61)",
        "(line 467,col 9)-(line 467,col 61)",
        "(line 468,col 9)-(line 468,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 471,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 60)",
        "(line 473,col 9)-(line 473,col 60)",
        "(line 474,col 9)-(line 474,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 477,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 50)",
        "(line 479,col 9)-(line 479,col 50)",
        "(line 480,col 9)-(line 480,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 483,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 62)",
        "(line 485,col 9)-(line 485,col 62)",
        "(line 486,col 9)-(line 486,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 489,
      "end_line": 509,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 19)",
        "(line 491,col 9)-(line 491,col 19)",
        "(line 492,col 9)-(line 492,col 19)",
        "(line 494,col 9)-(line 494,col 45)",
        "(line 495,col 9)-(line 495,col 45)",
        "(line 496,col 9)-(line 496,col 45)",
        "(line 497,col 9)-(line 497,col 45)",
        "(line 498,col 9)-(line 498,col 47)",
        "(line 499,col 9)-(line 499,col 48)",
        "(line 500,col 9)-(line 500,col 48)",
        "(line 501,col 9)-(line 501,col 48)",
        "(line 503,col 9)-(line 508,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 511,
      "end_line": 519,
      "comment": "",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 50)",
        "(line 513,col 9)-(line 513,col 50)",
        "(line 514,col 9)-(line 514,col 55)",
        "(line 515,col 9)-(line 515,col 55)",
        "(line 516,col 9)-(line 516,col 54)",
        "(line 517,col 9)-(line 517,col 49)",
        "(line 518,col 9)-(line 518,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 521,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 36)",
        "(line 523,col 9)-(line 523,col 39)",
        "(line 524,col 9)-(line 524,col 57)",
        "(line 525,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 537,
      "end_line": 554,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 34)",
        "(line 539,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 540,col 58)",
        "(line 541,col 9)-(line 541,col 58)",
        "(line 542,col 9)-(line 542,col 57)",
        "(line 543,col 9)-(line 543,col 57)",
        "(line 544,col 9)-(line 544,col 58)",
        "(line 545,col 9)-(line 545,col 58)",
        "(line 546,col 9)-(line 546,col 57)",
        "(line 547,col 9)-(line 547,col 57)",
        "(line 548,col 9)-(line 548,col 44)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 550,col 44)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 552,col 45)",
        "(line 553,col 9)-(line 553,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 556,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 565,
      "end_line": 626,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 92)",
        "(line 570,col 9)-(line 570,col 108)",
        "(line 573,col 9)-(line 573,col 106)",
        "(line 576,col 9)-(line 576,col 108)",
        "(line 579,col 9)-(line 579,col 90)",
        "(line 582,col 9)-(line 582,col 92)",
        "(line 585,col 9)-(line 585,col 90)",
        "(line 588,col 9)-(line 588,col 92)",
        "(line 591,col 9)-(line 591,col 114)",
        "(line 594,col 9)-(line 594,col 115)",
        "(line 597,col 9)-(line 597,col 116)",
        "(line 600,col 9)-(line 600,col 116)",
        "(line 603,col 9)-(line 603,col 117)",
        "(line 606,col 9)-(line 606,col 117)",
        "(line 609,col 9)-(line 609,col 117)",
        "(line 612,col 9)-(line 612,col 118)",
        "(line 615,col 9)-(line 615,col 118)",
        "(line 618,col 9)-(line 618,col 117)",
        "(line 621,col 9)-(line 621,col 118)",
        "(line 624,col 9)-(line 624,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 628,
      "end_line": 638,
      "comment": "",
      "child_ranges": [
        "(line 629,col 9)-(line 629,col 88)",
        "(line 630,col 9)-(line 630,col 88)",
        "(line 631,col 9)-(line 631,col 69)",
        "(line 632,col 9)-(line 632,col 103)",
        "(line 633,col 9)-(line 633,col 104)",
        "(line 634,col 9)-(line 634,col 69)",
        "(line 635,col 9)-(line 635,col 71)",
        "(line 636,col 9)-(line 636,col 70)",
        "(line 637,col 9)-(line 637,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 640,
      "end_line": 648,
      "comment": "",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 61)",
        "(line 642,col 9)-(line 642,col 61)",
        "(line 643,col 9)-(line 643,col 69)",
        "(line 644,col 9)-(line 644,col 68)",
        "(line 645,col 9)-(line 645,col 84)",
        "(line 646,col 9)-(line 646,col 84)",
        "(line 647,col 9)-(line 647,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 650,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 662,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 31)",
        "(line 664,col 9)-(line 664,col 55)",
        "(line 665,col 9)-(line 665,col 56)",
        "(line 666,col 9)-(line 666,col 57)",
        "(line 669,col 9)-(line 669,col 61)",
        "(line 670,col 9)-(line 670,col 84)",
        "(line 671,col 9)-(line 671,col 25)",
        "(line 672,col 9)-(line 672,col 31)",
        "(line 673,col 9)-(line 673,col 57)",
        "(line 676,col 9)-(line 676,col 63)",
        "(line 677,col 9)-(line 677,col 63)",
        "(line 678,col 9)-(line 678,col 63)",
        "(line 679,col 9)-(line 679,col 63)",
        "(line 680,col 9)-(line 680,col 64)",
        "(line 681,col 9)-(line 681,col 64)",
        "(line 682,col 9)-(line 682,col 64)",
        "(line 683,col 9)-(line 683,col 64)",
        "(line 684,col 9)-(line 684,col 64)",
        "(line 686,col 9)-(line 686,col 81)",
        "(line 687,col 9)-(line 687,col 82)",
        "(line 688,col 9)-(line 688,col 83)",
        "(line 689,col 9)-(line 689,col 83)",
        "(line 690,col 9)-(line 690,col 84)",
        "(line 691,col 9)-(line 691,col 85)",
        "(line 693,col 9)-(line 693,col 78)",
        "(line 694,col 9)-(line 694,col 79)",
        "(line 695,col 9)-(line 695,col 80)",
        "(line 696,col 9)-(line 696,col 80)",
        "(line 697,col 9)-(line 697,col 81)",
        "(line 698,col 9)-(line 698,col 82)",
        "(line 700,col 9)-(line 700,col 79)",
        "(line 701,col 9)-(line 701,col 80)",
        "(line 702,col 9)-(line 702,col 81)",
        "(line 703,col 9)-(line 703,col 81)",
        "(line 704,col 9)-(line 704,col 82)",
        "(line 705,col 9)-(line 705,col 83)",
        "(line 707,col 9)-(line 707,col 83)",
        "(line 708,col 9)-(line 708,col 84)",
        "(line 709,col 9)-(line 709,col 85)",
        "(line 710,col 9)-(line 710,col 85)",
        "(line 711,col 9)-(line 711,col 86)",
        "(line 712,col 9)-(line 712,col 87)",
        "(line 713,col 9)-(line 713,col 89)",
        "(line 714,col 9)-(line 714,col 91)",
        "(line 716,col 9)-(line 716,col 83)",
        "(line 717,col 9)-(line 717,col 84)",
        "(line 718,col 9)-(line 718,col 85)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 86)",
        "(line 721,col 9)-(line 721,col 87)",
        "(line 722,col 9)-(line 722,col 89)",
        "(line 723,col 9)-(line 723,col 91)",
        "(line 724,col 9)-(line 724,col 89)",
        "(line 725,col 9)-(line 725,col 91)",
        "(line 727,col 9)-(line 727,col 81)",
        "(line 728,col 9)-(line 728,col 82)",
        "(line 729,col 9)-(line 729,col 83)",
        "(line 730,col 9)-(line 730,col 83)",
        "(line 731,col 9)-(line 731,col 84)",
        "(line 732,col 9)-(line 732,col 85)",
        "(line 733,col 9)-(line 733,col 87)",
        "(line 734,col 9)-(line 734,col 89)",
        "(line 736,col 9)-(line 736,col 90)",
        "(line 737,col 9)-(line 737,col 88)",
        "(line 739,col 9)-(line 744,col 9)",
        "(line 746,col 9)-(line 746,col 76)",
        "(line 747,col 9)-(line 747,col 77)",
        "(line 748,col 9)-(line 748,col 78)",
        "(line 749,col 9)-(line 749,col 78)",
        "(line 750,col 9)-(line 750,col 79)",
        "(line 751,col 9)-(line 751,col 80)",
        "(line 753,col 9)-(line 758,col 9)",
        "(line 761,col 9)-(line 761,col 87)",
        "(line 764,col 9)-(line 764,col 80)",
        "(line 765,col 9)-(line 765,col 56)",
        "(line 766,col 9)-(line 766,col 98)",
        "(line 767,col 9)-(line 767,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 770,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 771,col 9)-(line 771,col 31)",
        "(line 772,col 9)-(line 772,col 56)",
        "(line 773,col 9)-(line 773,col 57)",
        "(line 774,col 9)-(line 774,col 58)",
        "(line 777,col 9)-(line 777,col 63)",
        "(line 778,col 9)-(line 778,col 63)",
        "(line 779,col 9)-(line 779,col 64)",
        "(line 780,col 9)-(line 780,col 64)",
        "(line 781,col 9)-(line 781,col 64)",
        "(line 782,col 9)-(line 782,col 64)",
        "(line 783,col 9)-(line 783,col 64)",
        "(line 785,col 9)-(line 785,col 82)",
        "(line 786,col 9)-(line 786,col 83)",
        "(line 787,col 9)-(line 787,col 84)",
        "(line 788,col 9)-(line 788,col 84)",
        "(line 789,col 9)-(line 789,col 85)",
        "(line 790,col 9)-(line 790,col 86)",
        "(line 792,col 9)-(line 792,col 79)",
        "(line 793,col 9)-(line 793,col 80)",
        "(line 794,col 9)-(line 794,col 81)",
        "(line 795,col 9)-(line 795,col 81)",
        "(line 796,col 9)-(line 796,col 82)",
        "(line 797,col 9)-(line 797,col 83)",
        "(line 799,col 9)-(line 799,col 80)",
        "(line 800,col 9)-(line 800,col 81)",
        "(line 801,col 9)-(line 801,col 82)",
        "(line 802,col 9)-(line 802,col 82)",
        "(line 803,col 9)-(line 803,col 83)",
        "(line 804,col 9)-(line 804,col 84)",
        "(line 806,col 9)-(line 806,col 84)",
        "(line 807,col 9)-(line 807,col 85)",
        "(line 808,col 9)-(line 808,col 86)",
        "(line 809,col 9)-(line 809,col 86)",
        "(line 810,col 9)-(line 810,col 87)",
        "(line 811,col 9)-(line 811,col 88)",
        "(line 812,col 9)-(line 812,col 91)",
        "(line 813,col 9)-(line 813,col 93)",
        "(line 815,col 9)-(line 815,col 84)",
        "(line 816,col 9)-(line 816,col 85)",
        "(line 817,col 9)-(line 817,col 86)",
        "(line 818,col 9)-(line 818,col 86)",
        "(line 819,col 9)-(line 819,col 87)",
        "(line 820,col 9)-(line 820,col 88)",
        "(line 821,col 9)-(line 821,col 91)",
        "(line 822,col 9)-(line 822,col 93)",
        "(line 823,col 9)-(line 823,col 91)",
        "(line 824,col 9)-(line 824,col 93)",
        "(line 826,col 9)-(line 826,col 82)",
        "(line 827,col 9)-(line 827,col 83)",
        "(line 828,col 9)-(line 828,col 84)",
        "(line 829,col 9)-(line 829,col 84)",
        "(line 830,col 9)-(line 830,col 85)",
        "(line 831,col 9)-(line 831,col 86)",
        "(line 832,col 9)-(line 832,col 89)",
        "(line 833,col 9)-(line 833,col 91)",
        "(line 835,col 9)-(line 835,col 92)",
        "(line 836,col 9)-(line 836,col 90)",
        "(line 838,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 77)",
        "(line 846,col 9)-(line 846,col 78)",
        "(line 847,col 9)-(line 847,col 79)",
        "(line 848,col 9)-(line 848,col 79)",
        "(line 849,col 9)-(line 849,col 80)",
        "(line 850,col 9)-(line 850,col 81)",
        "(line 852,col 9)-(line 857,col 9)",
        "(line 860,col 9)-(line 860,col 79)",
        "(line 861,col 9)-(line 861,col 59)",
        "(line 862,col 9)-(line 862,col 97)",
        "(line 863,col 9)-(line 863,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 866,
      "end_line": 869,
      "comment": "",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 60)",
        "(line 868,col 9)-(line 868,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 871,
      "end_line": 875,
      "comment": "",
      "child_ranges": [
        "(line 872,col 9)-(line 872,col 27)",
        "(line 873,col 9)-(line 873,col 59)",
        "(line 874,col 9)-(line 874,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 877,
      "end_line": 881,
      "comment": "",
      "child_ranges": [
        "(line 878,col 9)-(line 878,col 27)",
        "(line 879,col 9)-(line 879,col 61)",
        "(line 880,col 9)-(line 880,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 883,
      "end_line": 886,
      "comment": "",
      "child_ranges": [
        "(line 884,col 9)-(line 884,col 60)",
        "(line 885,col 9)-(line 885,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 888,
      "end_line": 891,
      "comment": "",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 50)",
        "(line 890,col 9)-(line 890,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 893,
      "end_line": 896,
      "comment": "",
      "child_ranges": [
        "(line 894,col 9)-(line 894,col 62)",
        "(line 895,col 9)-(line 895,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 898,
      "end_line": 902,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 899,col 23)",
        "(line 900,col 9)-(line 900,col 35)",
        "(line 901,col 9)-(line 901,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 904,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 905,col 9)-(line 905,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 908,
      "end_line": 922,
      "comment": "",
      "child_ranges": [
        "(line 909,col 9)-(line 909,col 36)",
        "(line 910,col 9)-(line 910,col 39)",
        "(line 911,col 9)-(line 911,col 57)",
        "(line 912,col 9)-(line 916,col 9)",
        "(line 917,col 9)-(line 921,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 924,
      "end_line": 932,
      "comment": "",
      "child_ranges": [
        "(line 925,col 9)-(line 925,col 36)",
        "(line 926,col 9)-(line 931,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 934,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 34)",
        "(line 936,col 9)-(line 936,col 34)",
        "(line 937,col 9)-(line 937,col 57)",
        "(line 938,col 9)-(line 938,col 57)",
        "(line 939,col 9)-(line 939,col 58)",
        "(line 940,col 9)-(line 940,col 44)",
        "(line 941,col 9)-(line 941,col 45)",
        "(line 942,col 9)-(line 942,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 945,
      "end_line": 953,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 951,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 1267,
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
        "(line 83,col 9)-(line 83,col 75)",
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 357,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 50)",
        "(line 360,col 9)-(line 360,col 65)",
        "(line 361,col 9)-(line 361,col 66)",
        "(line 362,col 9)-(line 362,col 65)",
        "(line 363,col 9)-(line 363,col 66)",
        "(line 365,col 9)-(line 365,col 67)",
        "(line 366,col 9)-(line 366,col 68)",
        "(line 367,col 9)-(line 367,col 67)",
        "(line 368,col 9)-(line 368,col 68)",
        "(line 370,col 9)-(line 370,col 92)",
        "(line 371,col 9)-(line 371,col 84)",
        "(line 373,col 9)-(line 373,col 92)",
        "(line 374,col 9)-(line 374,col 85)",
        "(line 377,col 9)-(line 377,col 64)",
        "(line 379,col 9)-(line 379,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 382,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 65)",
        "(line 384,col 9)-(line 384,col 65)",
        "(line 385,col 9)-(line 385,col 71)",
        "(line 387,col 9)-(line 387,col 74)",
        "(line 388,col 9)-(line 388,col 79)",
        "(line 389,col 9)-(line 395,col 40)",
        "(line 396,col 9)-(line 397,col 81)",
        "(line 398,col 9)-(line 399,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 403,
      "end_line": 413,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 408,col 9)",
        "(line 410,col 9)-(line 410,col 53)",
        "(line 411,col 9)-(line 411,col 69)",
        "(line 412,col 9)-(line 412,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 415,
      "end_line": 441,
      "comment": "",
      "child_ranges": [
        "(line 416,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 439,col 9)",
        "(line 440,col 9)-(line 440,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 443,
      "end_line": 491,
      "comment": "",
      "child_ranges": [
        "(line 444,col 9)-(line 444,col 19)",
        "(line 445,col 9)-(line 445,col 19)",
        "(line 446,col 9)-(line 446,col 19)",
        "(line 448,col 9)-(line 448,col 45)",
        "(line 450,col 9)-(line 450,col 45)",
        "(line 451,col 9)-(line 451,col 45)",
        "(line 452,col 9)-(line 452,col 46)",
        "(line 453,col 9)-(line 453,col 46)",
        "(line 455,col 9)-(line 455,col 46)",
        "(line 456,col 9)-(line 456,col 47)",
        "(line 457,col 9)-(line 457,col 47)",
        "(line 458,col 9)-(line 458,col 48)",
        "(line 460,col 9)-(line 460,col 45)",
        "(line 461,col 9)-(line 461,col 46)",
        "(line 462,col 9)-(line 462,col 46)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 465,col 9)-(line 465,col 75)",
        "(line 467,col 9)-(line 467,col 77)",
        "(line 468,col 9)-(line 468,col 78)",
        "(line 469,col 9)-(line 469,col 70)",
        "(line 470,col 9)-(line 476,col 9)",
        "(line 477,col 9)-(line 483,col 9)",
        "(line 484,col 9)-(line 490,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 493,
      "end_line": 515,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 503,col 31)",
        "(line 504,col 9)-(line 514,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 517,
      "end_line": 531,
      "comment": "",
      "child_ranges": [
        "(line 518,col 9)-(line 518,col 57)",
        "(line 519,col 9)-(line 526,col 40)",
        "(line 527,col 9)-(line 528,col 82)",
        "(line 529,col 9)-(line 530,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 536,
      "end_line": 560,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 43)",
        "(line 538,col 9)-(line 538,col 43)",
        "(line 539,col 9)-(line 539,col 53)",
        "(line 542,col 9)-(line 544,col 9)",
        "(line 547,col 9)-(line 547,col 34)",
        "(line 548,col 9)-(line 556,col 29)",
        "(line 559,col 9)-(line 559,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 562,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 60)",
        "(line 564,col 9)-(line 564,col 60)",
        "(line 565,col 9)-(line 565,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 568,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 27)",
        "(line 570,col 9)-(line 570,col 59)",
        "(line 571,col 9)-(line 571,col 59)",
        "(line 572,col 9)-(line 572,col 61)",
        "(line 573,col 9)-(line 573,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 576,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 27)",
        "(line 578,col 9)-(line 578,col 61)",
        "(line 579,col 9)-(line 579,col 61)",
        "(line 580,col 9)-(line 580,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 583,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 50)",
        "(line 585,col 9)-(line 585,col 50)",
        "(line 586,col 9)-(line 586,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 589,
      "end_line": 593,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 50)",
        "(line 591,col 9)-(line 591,col 50)",
        "(line 592,col 9)-(line 592,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 595,
      "end_line": 599,
      "comment": "",
      "child_ranges": [
        "(line 596,col 9)-(line 596,col 62)",
        "(line 597,col 9)-(line 597,col 62)",
        "(line 598,col 9)-(line 598,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 601,
      "end_line": 645,
      "comment": "",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 19)",
        "(line 603,col 9)-(line 603,col 19)",
        "(line 604,col 9)-(line 604,col 19)",
        "(line 606,col 9)-(line 606,col 45)",
        "(line 607,col 9)-(line 607,col 45)",
        "(line 608,col 9)-(line 608,col 45)",
        "(line 609,col 9)-(line 609,col 45)",
        "(line 610,col 9)-(line 610,col 47)",
        "(line 611,col 9)-(line 611,col 48)",
        "(line 612,col 9)-(line 612,col 48)",
        "(line 613,col 9)-(line 613,col 49)",
        "(line 614,col 9)-(line 614,col 48)",
        "(line 618,col 9)-(line 618,col 70)",
        "(line 621,col 9)-(line 621,col 45)",
        "(line 623,col 9)-(line 629,col 9)",
        "(line 631,col 9)-(line 637,col 9)",
        "(line 639,col 9)-(line 644,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 647,
      "end_line": 655,
      "comment": "",
      "child_ranges": [
        "(line 648,col 9)-(line 648,col 50)",
        "(line 649,col 9)-(line 649,col 50)",
        "(line 650,col 9)-(line 650,col 55)",
        "(line 651,col 9)-(line 651,col 55)",
        "(line 652,col 9)-(line 652,col 54)",
        "(line 653,col 9)-(line 653,col 49)",
        "(line 654,col 9)-(line 654,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 657,
      "end_line": 671,
      "comment": "",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 36)",
        "(line 659,col 9)-(line 659,col 39)",
        "(line 660,col 9)-(line 660,col 57)",
        "(line 661,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 670,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 673,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 34)",
        "(line 675,col 9)-(line 675,col 34)",
        "(line 676,col 9)-(line 676,col 58)",
        "(line 677,col 9)-(line 677,col 58)",
        "(line 678,col 9)-(line 678,col 57)",
        "(line 679,col 9)-(line 679,col 57)",
        "(line 680,col 9)-(line 680,col 58)",
        "(line 681,col 9)-(line 681,col 58)",
        "(line 682,col 9)-(line 682,col 57)",
        "(line 683,col 9)-(line 683,col 57)",
        "(line 684,col 9)-(line 684,col 58)",
        "(line 685,col 9)-(line 685,col 61)",
        "(line 686,col 9)-(line 686,col 44)",
        "(line 687,col 9)-(line 687,col 44)",
        "(line 688,col 9)-(line 688,col 44)",
        "(line 689,col 9)-(line 689,col 44)",
        "(line 690,col 9)-(line 690,col 45)",
        "(line 691,col 9)-(line 691,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 694,
      "end_line": 701,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 700,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 703,
      "end_line": 764,
      "comment": "",
      "child_ranges": [
        "(line 705,col 9)-(line 705,col 92)",
        "(line 708,col 9)-(line 708,col 108)",
        "(line 711,col 9)-(line 711,col 106)",
        "(line 714,col 9)-(line 714,col 108)",
        "(line 717,col 9)-(line 717,col 90)",
        "(line 720,col 9)-(line 720,col 92)",
        "(line 723,col 9)-(line 723,col 90)",
        "(line 726,col 9)-(line 726,col 92)",
        "(line 729,col 9)-(line 729,col 114)",
        "(line 732,col 9)-(line 732,col 115)",
        "(line 735,col 9)-(line 735,col 116)",
        "(line 738,col 9)-(line 738,col 116)",
        "(line 741,col 9)-(line 741,col 117)",
        "(line 744,col 9)-(line 744,col 117)",
        "(line 747,col 9)-(line 747,col 117)",
        "(line 750,col 9)-(line 750,col 118)",
        "(line 753,col 9)-(line 753,col 118)",
        "(line 756,col 9)-(line 756,col 117)",
        "(line 759,col 9)-(line 759,col 118)",
        "(line 762,col 9)-(line 762,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 766,
      "end_line": 776,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 88)",
        "(line 768,col 9)-(line 768,col 88)",
        "(line 769,col 9)-(line 769,col 69)",
        "(line 770,col 9)-(line 770,col 103)",
        "(line 771,col 9)-(line 771,col 104)",
        "(line 772,col 9)-(line 772,col 69)",
        "(line 773,col 9)-(line 773,col 71)",
        "(line 774,col 9)-(line 774,col 70)",
        "(line 775,col 9)-(line 775,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 778,
      "end_line": 786,
      "comment": "",
      "child_ranges": [
        "(line 779,col 9)-(line 779,col 61)",
        "(line 780,col 9)-(line 780,col 61)",
        "(line 781,col 9)-(line 781,col 69)",
        "(line 782,col 9)-(line 782,col 68)",
        "(line 783,col 9)-(line 783,col 84)",
        "(line 784,col 9)-(line 784,col 84)",
        "(line 785,col 9)-(line 785,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 788,
      "end_line": 798,
      "comment": "",
      "child_ranges": [
        "(line 789,col 9)-(line 797,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 800,
      "end_line": 846,
      "comment": "",
      "child_ranges": [
        "(line 801,col 9)-(line 801,col 54)",
        "(line 802,col 9)-(line 805,col 34)",
        "(line 807,col 9)-(line 807,col 56)",
        "(line 808,col 9)-(line 811,col 34)",
        "(line 814,col 9)-(line 814,col 80)",
        "(line 815,col 9)-(line 818,col 34)",
        "(line 821,col 9)-(line 821,col 48)",
        "(line 822,col 9)-(line 825,col 43)",
        "(line 828,col 9)-(line 828,col 75)",
        "(line 829,col 9)-(line 832,col 43)",
        "(line 835,col 9)-(line 838,col 48)",
        "(line 841,col 9)-(line 844,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 848,
      "end_line": 954,
      "comment": "",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 31)",
        "(line 850,col 9)-(line 850,col 55)",
        "(line 851,col 9)-(line 851,col 56)",
        "(line 852,col 9)-(line 852,col 57)",
        "(line 855,col 9)-(line 855,col 61)",
        "(line 856,col 9)-(line 856,col 84)",
        "(line 857,col 9)-(line 857,col 25)",
        "(line 858,col 9)-(line 858,col 31)",
        "(line 859,col 9)-(line 859,col 57)",
        "(line 862,col 9)-(line 862,col 63)",
        "(line 863,col 9)-(line 863,col 63)",
        "(line 864,col 9)-(line 864,col 63)",
        "(line 865,col 9)-(line 865,col 63)",
        "(line 866,col 9)-(line 866,col 64)",
        "(line 867,col 9)-(line 867,col 64)",
        "(line 868,col 9)-(line 868,col 64)",
        "(line 869,col 9)-(line 869,col 64)",
        "(line 870,col 9)-(line 870,col 64)",
        "(line 872,col 9)-(line 872,col 81)",
        "(line 873,col 9)-(line 873,col 82)",
        "(line 874,col 9)-(line 874,col 83)",
        "(line 875,col 9)-(line 875,col 83)",
        "(line 876,col 9)-(line 876,col 84)",
        "(line 877,col 9)-(line 877,col 85)",
        "(line 879,col 9)-(line 879,col 78)",
        "(line 880,col 9)-(line 880,col 79)",
        "(line 881,col 9)-(line 881,col 80)",
        "(line 882,col 9)-(line 882,col 80)",
        "(line 883,col 9)-(line 883,col 81)",
        "(line 884,col 9)-(line 884,col 82)",
        "(line 886,col 9)-(line 886,col 79)",
        "(line 887,col 9)-(line 887,col 80)",
        "(line 888,col 9)-(line 888,col 81)",
        "(line 889,col 9)-(line 889,col 81)",
        "(line 890,col 9)-(line 890,col 82)",
        "(line 891,col 9)-(line 891,col 83)",
        "(line 893,col 9)-(line 893,col 83)",
        "(line 894,col 9)-(line 894,col 84)",
        "(line 895,col 9)-(line 895,col 85)",
        "(line 896,col 9)-(line 896,col 85)",
        "(line 897,col 9)-(line 897,col 86)",
        "(line 898,col 9)-(line 898,col 87)",
        "(line 899,col 9)-(line 899,col 89)",
        "(line 900,col 9)-(line 900,col 91)",
        "(line 902,col 9)-(line 902,col 83)",
        "(line 903,col 9)-(line 903,col 84)",
        "(line 904,col 9)-(line 904,col 85)",
        "(line 905,col 9)-(line 905,col 85)",
        "(line 906,col 9)-(line 906,col 86)",
        "(line 907,col 9)-(line 907,col 87)",
        "(line 908,col 9)-(line 908,col 89)",
        "(line 909,col 9)-(line 909,col 91)",
        "(line 910,col 9)-(line 910,col 89)",
        "(line 911,col 9)-(line 911,col 91)",
        "(line 913,col 9)-(line 913,col 81)",
        "(line 914,col 9)-(line 914,col 82)",
        "(line 915,col 9)-(line 915,col 83)",
        "(line 916,col 9)-(line 916,col 83)",
        "(line 917,col 9)-(line 917,col 84)",
        "(line 918,col 9)-(line 918,col 85)",
        "(line 919,col 9)-(line 919,col 87)",
        "(line 920,col 9)-(line 920,col 89)",
        "(line 922,col 9)-(line 922,col 90)",
        "(line 923,col 9)-(line 923,col 88)",
        "(line 925,col 9)-(line 930,col 9)",
        "(line 932,col 9)-(line 932,col 76)",
        "(line 933,col 9)-(line 933,col 77)",
        "(line 934,col 9)-(line 934,col 78)",
        "(line 935,col 9)-(line 935,col 78)",
        "(line 936,col 9)-(line 936,col 79)",
        "(line 937,col 9)-(line 937,col 80)",
        "(line 939,col 9)-(line 944,col 9)",
        "(line 947,col 9)-(line 947,col 87)",
        "(line 950,col 9)-(line 950,col 80)",
        "(line 951,col 9)-(line 951,col 56)",
        "(line 952,col 9)-(line 952,col 98)",
        "(line 953,col 9)-(line 953,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 956,
      "end_line": 1050,
      "comment": "",
      "child_ranges": [
        "(line 957,col 9)-(line 957,col 31)",
        "(line 958,col 9)-(line 958,col 56)",
        "(line 959,col 9)-(line 959,col 57)",
        "(line 960,col 9)-(line 960,col 58)",
        "(line 963,col 9)-(line 963,col 63)",
        "(line 964,col 9)-(line 964,col 63)",
        "(line 965,col 9)-(line 965,col 64)",
        "(line 966,col 9)-(line 966,col 64)",
        "(line 967,col 9)-(line 967,col 64)",
        "(line 968,col 9)-(line 968,col 64)",
        "(line 969,col 9)-(line 969,col 64)",
        "(line 971,col 9)-(line 971,col 82)",
        "(line 972,col 9)-(line 972,col 83)",
        "(line 973,col 9)-(line 973,col 84)",
        "(line 974,col 9)-(line 974,col 84)",
        "(line 975,col 9)-(line 975,col 85)",
        "(line 976,col 9)-(line 976,col 86)",
        "(line 978,col 9)-(line 978,col 79)",
        "(line 979,col 9)-(line 979,col 80)",
        "(line 980,col 9)-(line 980,col 81)",
        "(line 981,col 9)-(line 981,col 81)",
        "(line 982,col 9)-(line 982,col 82)",
        "(line 983,col 9)-(line 983,col 83)",
        "(line 985,col 9)-(line 985,col 80)",
        "(line 986,col 9)-(line 986,col 81)",
        "(line 987,col 9)-(line 987,col 82)",
        "(line 988,col 9)-(line 988,col 82)",
        "(line 989,col 9)-(line 989,col 83)",
        "(line 990,col 9)-(line 990,col 84)",
        "(line 992,col 9)-(line 992,col 84)",
        "(line 993,col 9)-(line 993,col 85)",
        "(line 994,col 9)-(line 994,col 86)",
        "(line 995,col 9)-(line 995,col 86)",
        "(line 996,col 9)-(line 996,col 87)",
        "(line 997,col 9)-(line 997,col 88)",
        "(line 998,col 9)-(line 998,col 91)",
        "(line 999,col 9)-(line 999,col 93)",
        "(line 1001,col 9)-(line 1001,col 84)",
        "(line 1002,col 9)-(line 1002,col 85)",
        "(line 1003,col 9)-(line 1003,col 86)",
        "(line 1004,col 9)-(line 1004,col 86)",
        "(line 1005,col 9)-(line 1005,col 87)",
        "(line 1006,col 9)-(line 1006,col 88)",
        "(line 1007,col 9)-(line 1007,col 91)",
        "(line 1008,col 9)-(line 1008,col 93)",
        "(line 1009,col 9)-(line 1009,col 91)",
        "(line 1010,col 9)-(line 1010,col 93)",
        "(line 1012,col 9)-(line 1012,col 82)",
        "(line 1013,col 9)-(line 1013,col 83)",
        "(line 1014,col 9)-(line 1014,col 84)",
        "(line 1015,col 9)-(line 1015,col 84)",
        "(line 1016,col 9)-(line 1016,col 85)",
        "(line 1017,col 9)-(line 1017,col 86)",
        "(line 1018,col 9)-(line 1018,col 89)",
        "(line 1019,col 9)-(line 1019,col 91)",
        "(line 1021,col 9)-(line 1021,col 92)",
        "(line 1022,col 9)-(line 1022,col 90)",
        "(line 1024,col 9)-(line 1029,col 9)",
        "(line 1031,col 9)-(line 1031,col 77)",
        "(line 1032,col 9)-(line 1032,col 78)",
        "(line 1033,col 9)-(line 1033,col 79)",
        "(line 1034,col 9)-(line 1034,col 79)",
        "(line 1035,col 9)-(line 1035,col 80)",
        "(line 1036,col 9)-(line 1036,col 81)",
        "(line 1038,col 9)-(line 1043,col 9)",
        "(line 1046,col 9)-(line 1046,col 79)",
        "(line 1047,col 9)-(line 1047,col 59)",
        "(line 1048,col 9)-(line 1048,col 97)",
        "(line 1049,col 9)-(line 1049,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1052,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1053,col 9)-(line 1053,col 57)",
        "(line 1054,col 9)-(line 1054,col 57)",
        "(line 1055,col 9)-(line 1055,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1058,
      "end_line": 1064,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 27)",
        "(line 1060,col 9)-(line 1060,col 54)",
        "(line 1061,col 9)-(line 1061,col 54)",
        "(line 1062,col 9)-(line 1062,col 56)",
        "(line 1063,col 9)-(line 1063,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1066,
      "end_line": 1072,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 9)-(line 1067,col 27)",
        "(line 1068,col 9)-(line 1068,col 56)",
        "(line 1069,col 9)-(line 1069,col 56)",
        "(line 1070,col 9)-(line 1070,col 58)",
        "(line 1071,col 9)-(line 1071,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1074,
      "end_line": 1078,
      "comment": "",
      "child_ranges": [
        "(line 1075,col 9)-(line 1075,col 43)",
        "(line 1076,col 9)-(line 1076,col 43)",
        "(line 1077,col 9)-(line 1077,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1080,
      "end_line": 1084,
      "comment": "",
      "child_ranges": [
        "(line 1081,col 9)-(line 1081,col 45)",
        "(line 1082,col 9)-(line 1082,col 45)",
        "(line 1083,col 9)-(line 1083,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1086,
      "end_line": 1090,
      "comment": "",
      "child_ranges": [
        "(line 1087,col 9)-(line 1087,col 59)",
        "(line 1088,col 9)-(line 1088,col 59)",
        "(line 1089,col 9)-(line 1089,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1092,
      "end_line": 1096,
      "comment": "",
      "child_ranges": [
        "(line 1093,col 9)-(line 1093,col 23)",
        "(line 1094,col 9)-(line 1094,col 35)",
        "(line 1095,col 9)-(line 1095,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1098,
      "end_line": 1100,
      "comment": "",
      "child_ranges": [
        "(line 1099,col 9)-(line 1099,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1102,
      "end_line": 1118,
      "comment": "",
      "child_ranges": [
        "(line 1103,col 9)-(line 1103,col 36)",
        "(line 1104,col 9)-(line 1104,col 39)",
        "(line 1105,col 9)-(line 1105,col 57)",
        "(line 1106,col 9)-(line 1106,col 68)",
        "(line 1107,col 9)-(line 1107,col 62)",
        "(line 1108,col 9)-(line 1112,col 9)",
        "(line 1113,col 9)-(line 1117,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1120,
      "end_line": 1128,
      "comment": "",
      "child_ranges": [
        "(line 1121,col 9)-(line 1121,col 36)",
        "(line 1122,col 9)-(line 1127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1130,
      "end_line": 1143,
      "comment": "",
      "child_ranges": [
        "(line 1131,col 9)-(line 1131,col 34)",
        "(line 1132,col 9)-(line 1132,col 34)",
        "(line 1133,col 9)-(line 1133,col 57)",
        "(line 1134,col 9)-(line 1134,col 57)",
        "(line 1135,col 9)-(line 1135,col 58)",
        "(line 1136,col 9)-(line 1136,col 62)",
        "(line 1138,col 9)-(line 1138,col 64)",
        "(line 1139,col 9)-(line 1139,col 63)",
        "(line 1140,col 9)-(line 1140,col 44)",
        "(line 1141,col 9)-(line 1141,col 45)",
        "(line 1142,col 9)-(line 1142,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1145,
      "end_line": 1153,
      "comment": "",
      "child_ranges": [
        "(line 1146,col 9)-(line 1151,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1155,
      "end_line": 1229,
      "comment": "",
      "child_ranges": [
        "(line 1157,col 9)-(line 1157,col 55)",
        "(line 1158,col 9)-(line 1158,col 46)",
        "(line 1159,col 9)-(line 1164,col 9)",
        "(line 1166,col 9)-(line 1166,col 56)",
        "(line 1167,col 9)-(line 1167,col 47)",
        "(line 1168,col 9)-(line 1173,col 9)",
        "(line 1175,col 9)-(line 1175,col 57)",
        "(line 1176,col 9)-(line 1176,col 48)",
        "(line 1177,col 9)-(line 1182,col 9)",
        "(line 1184,col 9)-(line 1184,col 58)",
        "(line 1185,col 9)-(line 1185,col 49)",
        "(line 1186,col 9)-(line 1191,col 9)",
        "(line 1193,col 9)-(line 1193,col 55)",
        "(line 1194,col 9)-(line 1194,col 83)",
        "(line 1195,col 9)-(line 1195,col 66)",
        "(line 1196,col 9)-(line 1201,col 9)",
        "(line 1203,col 9)-(line 1203,col 84)",
        "(line 1204,col 9)-(line 1204,col 67)",
        "(line 1205,col 9)-(line 1210,col 9)",
        "(line 1212,col 9)-(line 1212,col 104)",
        "(line 1213,col 9)-(line 1213,col 80)",
        "(line 1214,col 9)-(line 1219,col 9)",
        "(line 1221,col 9)-(line 1224,col 76)",
        "(line 1225,col 9)-(line 1225,col 60)",
        "(line 1226,col 9)-(line 1226,col 61)",
        "(line 1227,col 9)-(line 1227,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1231,
      "end_line": 1235,
      "comment": "",
      "child_ranges": [
        "(line 1232,col 9)-(line 1232,col 36)",
        "(line 1233,col 9)-(line 1233,col 36)",
        "(line 1234,col 9)-(line 1234,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1237,
      "end_line": 1241,
      "comment": "",
      "child_ranges": [
        "(line 1238,col 9)-(line 1238,col 28)",
        "(line 1239,col 9)-(line 1239,col 28)",
        "(line 1240,col 9)-(line 1240,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1243,
      "end_line": 1247,
      "comment": "",
      "child_ranges": [
        "(line 1244,col 9)-(line 1244,col 36)",
        "(line 1245,col 9)-(line 1245,col 36)",
        "(line 1246,col 9)-(line 1246,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1249,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1250,col 9)-(line 1250,col 28)",
        "(line 1251,col 9)-(line 1251,col 28)",
        "(line 1252,col 9)-(line 1252,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1255,
      "end_line": 1259,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 36)",
        "(line 1257,col 9)-(line 1257,col 36)",
        "(line 1258,col 9)-(line 1258,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1261,
      "end_line": 1265,
      "comment": "",
      "child_ranges": [
        "(line 1262,col 9)-(line 1262,col 28)",
        "(line 1263,col 9)-(line 1263,col 28)",
        "(line 1264,col 9)-(line 1264,col 55)"
      ]
    }
  ]
}
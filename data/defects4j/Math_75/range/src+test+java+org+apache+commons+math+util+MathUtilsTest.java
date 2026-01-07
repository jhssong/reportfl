{
  "filepath": "/tmp/Math-75b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 1392,
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
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 493,
      "end_line": 543,
      "comment": "",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 20)",
        "(line 495,col 9)-(line 495,col 20)",
        "(line 496,col 9)-(line 496,col 20)",
        "(line 498,col 9)-(line 498,col 46)",
        "(line 500,col 9)-(line 500,col 45)",
        "(line 501,col 9)-(line 501,col 45)",
        "(line 502,col 9)-(line 502,col 46)",
        "(line 503,col 9)-(line 503,col 46)",
        "(line 505,col 9)-(line 505,col 46)",
        "(line 506,col 9)-(line 506,col 47)",
        "(line 507,col 9)-(line 507,col 47)",
        "(line 508,col 9)-(line 508,col 48)",
        "(line 510,col 9)-(line 510,col 45)",
        "(line 511,col 9)-(line 511,col 46)",
        "(line 512,col 9)-(line 512,col 46)",
        "(line 513,col 9)-(line 513,col 47)",
        "(line 515,col 9)-(line 515,col 81)",
        "(line 517,col 9)-(line 517,col 68)",
        "(line 519,col 9)-(line 519,col 72)",
        "(line 520,col 9)-(line 520,col 73)",
        "(line 521,col 9)-(line 521,col 65)",
        "(line 522,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 542,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 545,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 71)",
        "(line 547,col 9)-(line 547,col 61)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 57)",
        "(line 552,col 9)-(line 565,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 568,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 569,col 9)-(line 578,col 31)",
        "(line 579,col 9)-(line 589,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 592,
      "end_line": 606,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 57)",
        "(line 594,col 9)-(line 601,col 40)",
        "(line 602,col 9)-(line 603,col 82)",
        "(line 604,col 9)-(line 605,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 611,
      "end_line": 635,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 43)",
        "(line 613,col 9)-(line 613,col 43)",
        "(line 614,col 9)-(line 614,col 53)",
        "(line 617,col 9)-(line 619,col 9)",
        "(line 622,col 9)-(line 622,col 34)",
        "(line 623,col 9)-(line 631,col 29)",
        "(line 634,col 9)-(line 634,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 637,
      "end_line": 641,
      "comment": "",
      "child_ranges": [
        "(line 638,col 9)-(line 638,col 60)",
        "(line 639,col 9)-(line 639,col 60)",
        "(line 640,col 9)-(line 640,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 643,
      "end_line": 649,
      "comment": "",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 27)",
        "(line 645,col 9)-(line 645,col 59)",
        "(line 646,col 9)-(line 646,col 59)",
        "(line 647,col 9)-(line 647,col 61)",
        "(line 648,col 9)-(line 648,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 651,
      "end_line": 656,
      "comment": "",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 27)",
        "(line 653,col 9)-(line 653,col 61)",
        "(line 654,col 9)-(line 654,col 61)",
        "(line 655,col 9)-(line 655,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 658,
      "end_line": 662,
      "comment": "",
      "child_ranges": [
        "(line 659,col 9)-(line 659,col 50)",
        "(line 660,col 9)-(line 660,col 50)",
        "(line 661,col 9)-(line 661,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 664,
      "end_line": 668,
      "comment": "",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 50)",
        "(line 666,col 9)-(line 666,col 50)",
        "(line 667,col 9)-(line 667,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 670,
      "end_line": 674,
      "comment": "",
      "child_ranges": [
        "(line 671,col 9)-(line 671,col 62)",
        "(line 672,col 9)-(line 672,col 62)",
        "(line 673,col 9)-(line 673,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 676,
      "end_line": 720,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 677,col 19)",
        "(line 678,col 9)-(line 678,col 19)",
        "(line 679,col 9)-(line 679,col 19)",
        "(line 681,col 9)-(line 681,col 45)",
        "(line 682,col 9)-(line 682,col 45)",
        "(line 683,col 9)-(line 683,col 45)",
        "(line 684,col 9)-(line 684,col 45)",
        "(line 685,col 9)-(line 685,col 47)",
        "(line 686,col 9)-(line 686,col 48)",
        "(line 687,col 9)-(line 687,col 48)",
        "(line 688,col 9)-(line 688,col 49)",
        "(line 689,col 9)-(line 689,col 48)",
        "(line 693,col 9)-(line 693,col 70)",
        "(line 696,col 9)-(line 696,col 45)",
        "(line 698,col 9)-(line 704,col 9)",
        "(line 706,col 9)-(line 712,col 9)",
        "(line 714,col 9)-(line 719,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 722,
      "end_line": 770,
      "comment": "",
      "child_ranges": [
        "(line 723,col 9)-(line 723,col 20)",
        "(line 724,col 9)-(line 724,col 20)",
        "(line 725,col 9)-(line 725,col 20)",
        "(line 727,col 9)-(line 727,col 45)",
        "(line 728,col 9)-(line 728,col 45)",
        "(line 729,col 9)-(line 729,col 45)",
        "(line 730,col 9)-(line 730,col 45)",
        "(line 731,col 9)-(line 731,col 47)",
        "(line 732,col 9)-(line 732,col 48)",
        "(line 733,col 9)-(line 733,col 48)",
        "(line 734,col 9)-(line 734,col 49)",
        "(line 735,col 9)-(line 735,col 48)",
        "(line 737,col 9)-(line 737,col 78)",
        "(line 741,col 9)-(line 741,col 73)",
        "(line 744,col 9)-(line 744,col 48)",
        "(line 746,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 760,col 9)",
        "(line 762,col 9)-(line 763,col 75)",
        "(line 764,col 9)-(line 769,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 772,
      "end_line": 780,
      "comment": "",
      "child_ranges": [
        "(line 773,col 9)-(line 773,col 50)",
        "(line 774,col 9)-(line 774,col 50)",
        "(line 775,col 9)-(line 775,col 55)",
        "(line 776,col 9)-(line 776,col 55)",
        "(line 777,col 9)-(line 777,col 54)",
        "(line 778,col 9)-(line 778,col 49)",
        "(line 779,col 9)-(line 779,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 782,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 783,col 9)-(line 783,col 36)",
        "(line 784,col 9)-(line 784,col 39)",
        "(line 785,col 9)-(line 785,col 57)",
        "(line 786,col 9)-(line 790,col 9)",
        "(line 791,col 9)-(line 795,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 798,
      "end_line": 817,
      "comment": "",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 34)",
        "(line 800,col 9)-(line 800,col 34)",
        "(line 801,col 9)-(line 801,col 58)",
        "(line 802,col 9)-(line 802,col 58)",
        "(line 803,col 9)-(line 803,col 57)",
        "(line 804,col 9)-(line 804,col 57)",
        "(line 805,col 9)-(line 805,col 58)",
        "(line 806,col 9)-(line 806,col 58)",
        "(line 807,col 9)-(line 807,col 57)",
        "(line 808,col 9)-(line 808,col 57)",
        "(line 809,col 9)-(line 809,col 58)",
        "(line 810,col 9)-(line 810,col 61)",
        "(line 811,col 9)-(line 811,col 44)",
        "(line 812,col 9)-(line 812,col 44)",
        "(line 813,col 9)-(line 813,col 44)",
        "(line 814,col 9)-(line 814,col 44)",
        "(line 815,col 9)-(line 815,col 45)",
        "(line 816,col 9)-(line 816,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 819,
      "end_line": 826,
      "comment": "",
      "child_ranges": [
        "(line 820,col 9)-(line 825,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 828,
      "end_line": 889,
      "comment": "",
      "child_ranges": [
        "(line 830,col 9)-(line 830,col 92)",
        "(line 833,col 9)-(line 833,col 108)",
        "(line 836,col 9)-(line 836,col 106)",
        "(line 839,col 9)-(line 839,col 108)",
        "(line 842,col 9)-(line 842,col 90)",
        "(line 845,col 9)-(line 845,col 92)",
        "(line 848,col 9)-(line 848,col 90)",
        "(line 851,col 9)-(line 851,col 92)",
        "(line 854,col 9)-(line 854,col 114)",
        "(line 857,col 9)-(line 857,col 115)",
        "(line 860,col 9)-(line 860,col 116)",
        "(line 863,col 9)-(line 863,col 116)",
        "(line 866,col 9)-(line 866,col 117)",
        "(line 869,col 9)-(line 869,col 117)",
        "(line 872,col 9)-(line 872,col 117)",
        "(line 875,col 9)-(line 875,col 118)",
        "(line 878,col 9)-(line 878,col 118)",
        "(line 881,col 9)-(line 881,col 117)",
        "(line 884,col 9)-(line 884,col 118)",
        "(line 887,col 9)-(line 887,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 891,
      "end_line": 901,
      "comment": "",
      "child_ranges": [
        "(line 892,col 9)-(line 892,col 88)",
        "(line 893,col 9)-(line 893,col 88)",
        "(line 894,col 9)-(line 894,col 69)",
        "(line 895,col 9)-(line 895,col 103)",
        "(line 896,col 9)-(line 896,col 104)",
        "(line 897,col 9)-(line 897,col 69)",
        "(line 898,col 9)-(line 898,col 71)",
        "(line 899,col 9)-(line 899,col 70)",
        "(line 900,col 9)-(line 900,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 903,
      "end_line": 911,
      "comment": "",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 61)",
        "(line 905,col 9)-(line 905,col 61)",
        "(line 906,col 9)-(line 906,col 69)",
        "(line 907,col 9)-(line 907,col 68)",
        "(line 908,col 9)-(line 908,col 84)",
        "(line 909,col 9)-(line 909,col 84)",
        "(line 910,col 9)-(line 910,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 913,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 914,col 9)-(line 922,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 925,
      "end_line": 971,
      "comment": "",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 54)",
        "(line 927,col 9)-(line 930,col 34)",
        "(line 932,col 9)-(line 932,col 56)",
        "(line 933,col 9)-(line 936,col 34)",
        "(line 939,col 9)-(line 939,col 80)",
        "(line 940,col 9)-(line 943,col 34)",
        "(line 946,col 9)-(line 946,col 48)",
        "(line 947,col 9)-(line 950,col 43)",
        "(line 953,col 9)-(line 953,col 75)",
        "(line 954,col 9)-(line 957,col 43)",
        "(line 960,col 9)-(line 963,col 48)",
        "(line 966,col 9)-(line 969,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 973,
      "end_line": 1079,
      "comment": "",
      "child_ranges": [
        "(line 974,col 9)-(line 974,col 31)",
        "(line 975,col 9)-(line 975,col 55)",
        "(line 976,col 9)-(line 976,col 56)",
        "(line 977,col 9)-(line 977,col 57)",
        "(line 980,col 9)-(line 980,col 61)",
        "(line 981,col 9)-(line 981,col 84)",
        "(line 982,col 9)-(line 982,col 25)",
        "(line 983,col 9)-(line 983,col 31)",
        "(line 984,col 9)-(line 984,col 57)",
        "(line 987,col 9)-(line 987,col 63)",
        "(line 988,col 9)-(line 988,col 63)",
        "(line 989,col 9)-(line 989,col 63)",
        "(line 990,col 9)-(line 990,col 63)",
        "(line 991,col 9)-(line 991,col 64)",
        "(line 992,col 9)-(line 992,col 64)",
        "(line 993,col 9)-(line 993,col 64)",
        "(line 994,col 9)-(line 994,col 64)",
        "(line 995,col 9)-(line 995,col 64)",
        "(line 997,col 9)-(line 997,col 81)",
        "(line 998,col 9)-(line 998,col 82)",
        "(line 999,col 9)-(line 999,col 83)",
        "(line 1000,col 9)-(line 1000,col 83)",
        "(line 1001,col 9)-(line 1001,col 84)",
        "(line 1002,col 9)-(line 1002,col 85)",
        "(line 1004,col 9)-(line 1004,col 78)",
        "(line 1005,col 9)-(line 1005,col 79)",
        "(line 1006,col 9)-(line 1006,col 80)",
        "(line 1007,col 9)-(line 1007,col 80)",
        "(line 1008,col 9)-(line 1008,col 81)",
        "(line 1009,col 9)-(line 1009,col 82)",
        "(line 1011,col 9)-(line 1011,col 79)",
        "(line 1012,col 9)-(line 1012,col 80)",
        "(line 1013,col 9)-(line 1013,col 81)",
        "(line 1014,col 9)-(line 1014,col 81)",
        "(line 1015,col 9)-(line 1015,col 82)",
        "(line 1016,col 9)-(line 1016,col 83)",
        "(line 1018,col 9)-(line 1018,col 83)",
        "(line 1019,col 9)-(line 1019,col 84)",
        "(line 1020,col 9)-(line 1020,col 85)",
        "(line 1021,col 9)-(line 1021,col 85)",
        "(line 1022,col 9)-(line 1022,col 86)",
        "(line 1023,col 9)-(line 1023,col 87)",
        "(line 1024,col 9)-(line 1024,col 89)",
        "(line 1025,col 9)-(line 1025,col 91)",
        "(line 1027,col 9)-(line 1027,col 83)",
        "(line 1028,col 9)-(line 1028,col 84)",
        "(line 1029,col 9)-(line 1029,col 85)",
        "(line 1030,col 9)-(line 1030,col 85)",
        "(line 1031,col 9)-(line 1031,col 86)",
        "(line 1032,col 9)-(line 1032,col 87)",
        "(line 1033,col 9)-(line 1033,col 89)",
        "(line 1034,col 9)-(line 1034,col 91)",
        "(line 1035,col 9)-(line 1035,col 89)",
        "(line 1036,col 9)-(line 1036,col 91)",
        "(line 1038,col 9)-(line 1038,col 81)",
        "(line 1039,col 9)-(line 1039,col 82)",
        "(line 1040,col 9)-(line 1040,col 83)",
        "(line 1041,col 9)-(line 1041,col 83)",
        "(line 1042,col 9)-(line 1042,col 84)",
        "(line 1043,col 9)-(line 1043,col 85)",
        "(line 1044,col 9)-(line 1044,col 87)",
        "(line 1045,col 9)-(line 1045,col 89)",
        "(line 1047,col 9)-(line 1047,col 90)",
        "(line 1048,col 9)-(line 1048,col 88)",
        "(line 1050,col 9)-(line 1055,col 9)",
        "(line 1057,col 9)-(line 1057,col 76)",
        "(line 1058,col 9)-(line 1058,col 77)",
        "(line 1059,col 9)-(line 1059,col 78)",
        "(line 1060,col 9)-(line 1060,col 78)",
        "(line 1061,col 9)-(line 1061,col 79)",
        "(line 1062,col 9)-(line 1062,col 80)",
        "(line 1064,col 9)-(line 1069,col 9)",
        "(line 1072,col 9)-(line 1072,col 87)",
        "(line 1075,col 9)-(line 1075,col 80)",
        "(line 1076,col 9)-(line 1076,col 56)",
        "(line 1077,col 9)-(line 1077,col 98)",
        "(line 1078,col 9)-(line 1078,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1081,
      "end_line": 1175,
      "comment": "",
      "child_ranges": [
        "(line 1082,col 9)-(line 1082,col 31)",
        "(line 1083,col 9)-(line 1083,col 56)",
        "(line 1084,col 9)-(line 1084,col 57)",
        "(line 1085,col 9)-(line 1085,col 58)",
        "(line 1088,col 9)-(line 1088,col 63)",
        "(line 1089,col 9)-(line 1089,col 63)",
        "(line 1090,col 9)-(line 1090,col 64)",
        "(line 1091,col 9)-(line 1091,col 64)",
        "(line 1092,col 9)-(line 1092,col 64)",
        "(line 1093,col 9)-(line 1093,col 64)",
        "(line 1094,col 9)-(line 1094,col 64)",
        "(line 1096,col 9)-(line 1096,col 82)",
        "(line 1097,col 9)-(line 1097,col 83)",
        "(line 1098,col 9)-(line 1098,col 84)",
        "(line 1099,col 9)-(line 1099,col 84)",
        "(line 1100,col 9)-(line 1100,col 85)",
        "(line 1101,col 9)-(line 1101,col 86)",
        "(line 1103,col 9)-(line 1103,col 79)",
        "(line 1104,col 9)-(line 1104,col 80)",
        "(line 1105,col 9)-(line 1105,col 81)",
        "(line 1106,col 9)-(line 1106,col 81)",
        "(line 1107,col 9)-(line 1107,col 82)",
        "(line 1108,col 9)-(line 1108,col 83)",
        "(line 1110,col 9)-(line 1110,col 80)",
        "(line 1111,col 9)-(line 1111,col 81)",
        "(line 1112,col 9)-(line 1112,col 82)",
        "(line 1113,col 9)-(line 1113,col 82)",
        "(line 1114,col 9)-(line 1114,col 83)",
        "(line 1115,col 9)-(line 1115,col 84)",
        "(line 1117,col 9)-(line 1117,col 84)",
        "(line 1118,col 9)-(line 1118,col 85)",
        "(line 1119,col 9)-(line 1119,col 86)",
        "(line 1120,col 9)-(line 1120,col 86)",
        "(line 1121,col 9)-(line 1121,col 87)",
        "(line 1122,col 9)-(line 1122,col 88)",
        "(line 1123,col 9)-(line 1123,col 91)",
        "(line 1124,col 9)-(line 1124,col 93)",
        "(line 1126,col 9)-(line 1126,col 84)",
        "(line 1127,col 9)-(line 1127,col 85)",
        "(line 1128,col 9)-(line 1128,col 86)",
        "(line 1129,col 9)-(line 1129,col 86)",
        "(line 1130,col 9)-(line 1130,col 87)",
        "(line 1131,col 9)-(line 1131,col 88)",
        "(line 1132,col 9)-(line 1132,col 91)",
        "(line 1133,col 9)-(line 1133,col 93)",
        "(line 1134,col 9)-(line 1134,col 91)",
        "(line 1135,col 9)-(line 1135,col 93)",
        "(line 1137,col 9)-(line 1137,col 82)",
        "(line 1138,col 9)-(line 1138,col 83)",
        "(line 1139,col 9)-(line 1139,col 84)",
        "(line 1140,col 9)-(line 1140,col 84)",
        "(line 1141,col 9)-(line 1141,col 85)",
        "(line 1142,col 9)-(line 1142,col 86)",
        "(line 1143,col 9)-(line 1143,col 89)",
        "(line 1144,col 9)-(line 1144,col 91)",
        "(line 1146,col 9)-(line 1146,col 92)",
        "(line 1147,col 9)-(line 1147,col 90)",
        "(line 1149,col 9)-(line 1154,col 9)",
        "(line 1156,col 9)-(line 1156,col 77)",
        "(line 1157,col 9)-(line 1157,col 78)",
        "(line 1158,col 9)-(line 1158,col 79)",
        "(line 1159,col 9)-(line 1159,col 79)",
        "(line 1160,col 9)-(line 1160,col 80)",
        "(line 1161,col 9)-(line 1161,col 81)",
        "(line 1163,col 9)-(line 1168,col 9)",
        "(line 1171,col 9)-(line 1171,col 79)",
        "(line 1172,col 9)-(line 1172,col 59)",
        "(line 1173,col 9)-(line 1173,col 97)",
        "(line 1174,col 9)-(line 1174,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1177,
      "end_line": 1181,
      "comment": "",
      "child_ranges": [
        "(line 1178,col 9)-(line 1178,col 57)",
        "(line 1179,col 9)-(line 1179,col 57)",
        "(line 1180,col 9)-(line 1180,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1183,
      "end_line": 1189,
      "comment": "",
      "child_ranges": [
        "(line 1184,col 9)-(line 1184,col 27)",
        "(line 1185,col 9)-(line 1185,col 54)",
        "(line 1186,col 9)-(line 1186,col 54)",
        "(line 1187,col 9)-(line 1187,col 56)",
        "(line 1188,col 9)-(line 1188,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1191,
      "end_line": 1197,
      "comment": "",
      "child_ranges": [
        "(line 1192,col 9)-(line 1192,col 27)",
        "(line 1193,col 9)-(line 1193,col 56)",
        "(line 1194,col 9)-(line 1194,col 56)",
        "(line 1195,col 9)-(line 1195,col 58)",
        "(line 1196,col 9)-(line 1196,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1199,
      "end_line": 1203,
      "comment": "",
      "child_ranges": [
        "(line 1200,col 9)-(line 1200,col 43)",
        "(line 1201,col 9)-(line 1201,col 43)",
        "(line 1202,col 9)-(line 1202,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1205,
      "end_line": 1209,
      "comment": "",
      "child_ranges": [
        "(line 1206,col 9)-(line 1206,col 45)",
        "(line 1207,col 9)-(line 1207,col 45)",
        "(line 1208,col 9)-(line 1208,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1211,
      "end_line": 1215,
      "comment": "",
      "child_ranges": [
        "(line 1212,col 9)-(line 1212,col 59)",
        "(line 1213,col 9)-(line 1213,col 59)",
        "(line 1214,col 9)-(line 1214,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1217,
      "end_line": 1221,
      "comment": "",
      "child_ranges": [
        "(line 1218,col 9)-(line 1218,col 23)",
        "(line 1219,col 9)-(line 1219,col 35)",
        "(line 1220,col 9)-(line 1220,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1223,
      "end_line": 1225,
      "comment": "",
      "child_ranges": [
        "(line 1224,col 9)-(line 1224,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1227,
      "end_line": 1243,
      "comment": "",
      "child_ranges": [
        "(line 1228,col 9)-(line 1228,col 36)",
        "(line 1229,col 9)-(line 1229,col 39)",
        "(line 1230,col 9)-(line 1230,col 57)",
        "(line 1231,col 9)-(line 1231,col 68)",
        "(line 1232,col 9)-(line 1232,col 62)",
        "(line 1233,col 9)-(line 1237,col 9)",
        "(line 1238,col 9)-(line 1242,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1245,
      "end_line": 1253,
      "comment": "",
      "child_ranges": [
        "(line 1246,col 9)-(line 1246,col 36)",
        "(line 1247,col 9)-(line 1252,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1255,
      "end_line": 1268,
      "comment": "",
      "child_ranges": [
        "(line 1256,col 9)-(line 1256,col 34)",
        "(line 1257,col 9)-(line 1257,col 34)",
        "(line 1258,col 9)-(line 1258,col 57)",
        "(line 1259,col 9)-(line 1259,col 57)",
        "(line 1260,col 9)-(line 1260,col 58)",
        "(line 1261,col 9)-(line 1261,col 62)",
        "(line 1263,col 9)-(line 1263,col 64)",
        "(line 1264,col 9)-(line 1264,col 63)",
        "(line 1265,col 9)-(line 1265,col 44)",
        "(line 1266,col 9)-(line 1266,col 45)",
        "(line 1267,col 9)-(line 1267,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1270,
      "end_line": 1278,
      "comment": "",
      "child_ranges": [
        "(line 1271,col 9)-(line 1276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1280,
      "end_line": 1354,
      "comment": "",
      "child_ranges": [
        "(line 1282,col 9)-(line 1282,col 55)",
        "(line 1283,col 9)-(line 1283,col 46)",
        "(line 1284,col 9)-(line 1289,col 9)",
        "(line 1291,col 9)-(line 1291,col 56)",
        "(line 1292,col 9)-(line 1292,col 47)",
        "(line 1293,col 9)-(line 1298,col 9)",
        "(line 1300,col 9)-(line 1300,col 57)",
        "(line 1301,col 9)-(line 1301,col 48)",
        "(line 1302,col 9)-(line 1307,col 9)",
        "(line 1309,col 9)-(line 1309,col 58)",
        "(line 1310,col 9)-(line 1310,col 49)",
        "(line 1311,col 9)-(line 1316,col 9)",
        "(line 1318,col 9)-(line 1318,col 55)",
        "(line 1319,col 9)-(line 1319,col 83)",
        "(line 1320,col 9)-(line 1320,col 66)",
        "(line 1321,col 9)-(line 1326,col 9)",
        "(line 1328,col 9)-(line 1328,col 84)",
        "(line 1329,col 9)-(line 1329,col 67)",
        "(line 1330,col 9)-(line 1335,col 9)",
        "(line 1337,col 9)-(line 1337,col 104)",
        "(line 1338,col 9)-(line 1338,col 80)",
        "(line 1339,col 9)-(line 1344,col 9)",
        "(line 1346,col 9)-(line 1349,col 76)",
        "(line 1350,col 9)-(line 1350,col 60)",
        "(line 1351,col 9)-(line 1351,col 61)",
        "(line 1352,col 9)-(line 1352,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1356,
      "end_line": 1360,
      "comment": "",
      "child_ranges": [
        "(line 1357,col 9)-(line 1357,col 36)",
        "(line 1358,col 9)-(line 1358,col 36)",
        "(line 1359,col 9)-(line 1359,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1362,
      "end_line": 1366,
      "comment": "",
      "child_ranges": [
        "(line 1363,col 9)-(line 1363,col 28)",
        "(line 1364,col 9)-(line 1364,col 28)",
        "(line 1365,col 9)-(line 1365,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1368,
      "end_line": 1372,
      "comment": "",
      "child_ranges": [
        "(line 1369,col 9)-(line 1369,col 36)",
        "(line 1370,col 9)-(line 1370,col 36)",
        "(line 1371,col 9)-(line 1371,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1374,
      "end_line": 1378,
      "comment": "",
      "child_ranges": [
        "(line 1375,col 9)-(line 1375,col 28)",
        "(line 1376,col 9)-(line 1376,col 28)",
        "(line 1377,col 9)-(line 1377,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1380,
      "end_line": 1384,
      "comment": "",
      "child_ranges": [
        "(line 1381,col 9)-(line 1381,col 36)",
        "(line 1382,col 9)-(line 1382,col 36)",
        "(line 1383,col 9)-(line 1383,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1386,
      "end_line": 1390,
      "comment": "",
      "child_ranges": [
        "(line 1387,col 9)-(line 1387,col 28)",
        "(line 1388,col 9)-(line 1388,col 28)",
        "(line 1389,col 9)-(line 1389,col 55)"
      ]
    }
  ]
}
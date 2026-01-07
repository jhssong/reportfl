{
  "filepath": "/tmp/Math-67b/src/test/java/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 1511,
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
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 46,
      "end_line": 78,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 52,col 9)",
        "(line 53,col 9)-(line 53,col 25)",
        "(line 54,col 9)-(line 68,col 9)",
        "(line 69,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 75,col 9)",
        "(line 76,col 9)-(line 76,col 75)",
        "(line 77,col 9)-(line 77,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 83,
      "end_line": 89,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 24)",
        "(line 85,col 9)-(line 87,col 9)",
        "(line 88,col 9)-(line 88,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 92,
      "end_line": 96,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 71)",
        "(line 94,col 9)-(line 94,col 68)",
        "(line 95,col 9)-(line 95,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 98,
      "end_line": 112,
      "comment": "",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 36)",
        "(line 100,col 9)-(line 100,col 39)",
        "(line 101,col 9)-(line 101,col 57)",
        "(line 102,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 111,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLong()",
      "begin_line": 114,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 34)",
        "(line 116,col 9)-(line 116,col 34)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 58)",
        "(line 121,col 9)-(line 121,col 56)",
        "(line 122,col 9)-(line 122,col 56)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 63)",
        "(line 125,col 9)-(line 125,col 44)",
        "(line 126,col 9)-(line 126,col 45)",
        "(line 127,col 9)-(line 127,col 44)",
        "(line 128,col 9)-(line 128,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 131,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 140,
      "end_line": 182,
      "comment": "",
      "child_ranges": [
        "(line 141,col 9)-(line 147,col 16)",
        "(line 148,col 9)-(line 155,col 16)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 163,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 46)",
        "(line 172,col 9)-(line 172,col 46)",
        "(line 173,col 9)-(line 181,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 188,
      "end_line": 242,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 217,col 9)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 55)",
        "(line 221,col 9)-(line 221,col 45)",
        "(line 223,col 9)-(line 223,col 60)",
        "(line 224,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 225,col 45)",
        "(line 228,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 235,col 22)",
        "(line 236,col 9)-(line 236,col 56)",
        "(line 237,col 9)-(line 237,col 48)",
        "(line 238,col 9)-(line 238,col 45)",
        "(line 239,col 9)-(line 239,col 88)",
        "(line 240,col 9)-(line 240,col 95)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 244,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 264,col 9)",
        "(line 266,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 285,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 297,col 66)",
        "(line 298,col 9)-(line 299,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCompareTo()",
      "begin_line": 302,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 303,col 7)-(line 303,col 65)",
        "(line 304,col 7)-(line 304,col 65)",
        "(line 305,col 7)-(line 305,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 308,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 23)",
        "(line 310,col 9)-(line 310,col 35)",
        "(line 311,col 9)-(line 311,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaN()",
      "begin_line": 318,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 324,col 17)",
        "(line 325,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedDelta()",
      "begin_line": 338,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 64)",
        "(line 340,col 9)-(line 340,col 64)",
        "(line 341,col 9)-(line 341,col 64)",
        "(line 342,col 9)-(line 342,col 67)",
        "(line 343,col 9)-(line 343,col 94)",
        "(line 344,col 9)-(line 344,col 94)",
        "(line 345,col 9)-(line 345,col 95)",
        "(line 346,col 9)-(line 346,col 65)",
        "(line 347,col 9)-(line 347,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedDelta()",
      "begin_line": 350,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 76)",
        "(line 352,col 9)-(line 352,col 76)",
        "(line 353,col 9)-(line 353,col 76)",
        "(line 354,col 9)-(line 354,col 78)",
        "(line 355,col 9)-(line 355,col 106)",
        "(line 356,col 9)-(line 356,col 106)",
        "(line 357,col 9)-(line 357,col 107)",
        "(line 358,col 9)-(line 358,col 77)",
        "(line 359,col 9)-(line 359,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsWithAllowedUlps()",
      "begin_line": 362,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 51)",
        "(line 365,col 9)-(line 365,col 63)",
        "(line 366,col 9)-(line 366,col 68)",
        "(line 368,col 9)-(line 368,col 44)",
        "(line 369,col 9)-(line 369,col 47)",
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 371,col 53)",
        "(line 372,col 9)-(line 372,col 53)",
        "(line 374,col 9)-(line 374,col 59)",
        "(line 375,col 9)-(line 375,col 60)",
        "(line 377,col 9)-(line 377,col 54)",
        "(line 379,col 9)-(line 379,col 67)",
        "(line 380,col 9)-(line 380,col 68)",
        "(line 381,col 9)-(line 381,col 67)",
        "(line 382,col 9)-(line 382,col 66)",
        "(line 384,col 9)-(line 384,col 69)",
        "(line 385,col 9)-(line 385,col 70)",
        "(line 386,col 9)-(line 386,col 69)",
        "(line 387,col 9)-(line 387,col 70)",
        "(line 389,col 9)-(line 389,col 92)",
        "(line 390,col 9)-(line 390,col 84)",
        "(line 392,col 9)-(line 392,col 92)",
        "(line 393,col 9)-(line 393,col 85)",
        "(line 395,col 9)-(line 395,col 65)",
        "(line 397,col 9)-(line 397,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEqualsIncludingNaNWithAllowedUlps()",
      "begin_line": 400,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 63)",
        "(line 403,col 9)-(line 403,col 75)",
        "(line 404,col 9)-(line 404,col 80)",
        "(line 406,col 9)-(line 406,col 44)",
        "(line 407,col 9)-(line 407,col 47)",
        "(line 408,col 9)-(line 408,col 63)",
        "(line 409,col 9)-(line 409,col 65)",
        "(line 410,col 9)-(line 410,col 65)",
        "(line 412,col 9)-(line 412,col 71)",
        "(line 413,col 9)-(line 413,col 72)",
        "(line 415,col 9)-(line 415,col 66)",
        "(line 417,col 9)-(line 417,col 79)",
        "(line 418,col 9)-(line 418,col 80)",
        "(line 419,col 9)-(line 419,col 79)",
        "(line 420,col 9)-(line 420,col 78)",
        "(line 422,col 9)-(line 422,col 81)",
        "(line 423,col 9)-(line 423,col 82)",
        "(line 424,col 9)-(line 424,col 81)",
        "(line 425,col 9)-(line 425,col 82)",
        "(line 427,col 9)-(line 427,col 104)",
        "(line 428,col 9)-(line 428,col 96)",
        "(line 430,col 9)-(line 430,col 104)",
        "(line 431,col 9)-(line 431,col 97)",
        "(line 433,col 9)-(line 433,col 76)",
        "(line 435,col 9)-(line 435,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEquals()",
      "begin_line": 442,
      "end_line": 461,
      "comment": "\n     * @deprecated To be removed in release 3.0 (replaced by {@link\n     * #testArrayEqualsIncludingNaN()}.\n     ",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 65)",
        "(line 444,col 9)-(line 444,col 65)",
        "(line 445,col 9)-(line 445,col 71)",
        "(line 447,col 9)-(line 447,col 74)",
        "(line 448,col 9)-(line 448,col 79)",
        "(line 449,col 9)-(line 455,col 40)",
        "(line 456,col 9)-(line 457,col 81)",
        "(line 458,col 9)-(line 459,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayEqualsIncludingNaN()",
      "begin_line": 463,
      "end_line": 481,
      "comment": "",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 77)",
        "(line 465,col 9)-(line 465,col 77)",
        "(line 466,col 9)-(line 466,col 83)",
        "(line 468,col 9)-(line 468,col 86)",
        "(line 469,col 9)-(line 469,col 91)",
        "(line 470,col 9)-(line 476,col 20)",
        "(line 477,col 9)-(line 478,col 93)",
        "(line 479,col 9)-(line 480,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 483,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 484,col 9)-(line 488,col 9)",
        "(line 490,col 9)-(line 490,col 53)",
        "(line 491,col 9)-(line 491,col 69)",
        "(line 492,col 9)-(line 492,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 495,
      "end_line": 521,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 507,col 9)",
        "(line 508,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 108)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 523,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 19)",
        "(line 525,col 9)-(line 525,col 19)",
        "(line 526,col 9)-(line 526,col 19)",
        "(line 528,col 9)-(line 528,col 45)",
        "(line 530,col 9)-(line 530,col 45)",
        "(line 531,col 9)-(line 531,col 45)",
        "(line 532,col 9)-(line 532,col 46)",
        "(line 533,col 9)-(line 533,col 46)",
        "(line 535,col 9)-(line 535,col 46)",
        "(line 536,col 9)-(line 536,col 47)",
        "(line 537,col 9)-(line 537,col 47)",
        "(line 538,col 9)-(line 538,col 48)",
        "(line 540,col 9)-(line 540,col 45)",
        "(line 541,col 9)-(line 541,col 46)",
        "(line 542,col 9)-(line 542,col 46)",
        "(line 543,col 9)-(line 543,col 47)",
        "(line 545,col 9)-(line 545,col 75)",
        "(line 547,col 9)-(line 547,col 77)",
        "(line 548,col 9)-(line 548,col 78)",
        "(line 549,col 9)-(line 549,col 70)",
        "(line 550,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 563,col 9)",
        "(line 564,col 9)-(line 570,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdLong()",
      "begin_line": 573,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 20)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 20)",
        "(line 578,col 9)-(line 578,col 46)",
        "(line 580,col 9)-(line 580,col 45)",
        "(line 581,col 9)-(line 581,col 45)",
        "(line 582,col 9)-(line 582,col 46)",
        "(line 583,col 9)-(line 583,col 46)",
        "(line 585,col 9)-(line 585,col 46)",
        "(line 586,col 9)-(line 586,col 47)",
        "(line 587,col 9)-(line 587,col 47)",
        "(line 588,col 9)-(line 588,col 48)",
        "(line 590,col 9)-(line 590,col 45)",
        "(line 591,col 9)-(line 591,col 46)",
        "(line 592,col 9)-(line 592,col 46)",
        "(line 593,col 9)-(line 593,col 47)",
        "(line 595,col 9)-(line 595,col 81)",
        "(line 597,col 9)-(line 597,col 68)",
        "(line 599,col 9)-(line 599,col 72)",
        "(line 600,col 9)-(line 600,col 73)",
        "(line 601,col 9)-(line 601,col 65)",
        "(line 602,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcdConsistency()",
      "begin_line": 625,
      "end_line": 646,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 71)",
        "(line 627,col 9)-(line 627,col 61)",
        "(line 628,col 9)-(line 630,col 9)",
        "(line 631,col 9)-(line 631,col 57)",
        "(line 632,col 9)-(line 645,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 648,
      "end_line": 670,
      "comment": "",
      "child_ranges": [
        "(line 649,col 9)-(line 658,col 31)",
        "(line 659,col 9)-(line 669,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testArrayHash()",
      "begin_line": 672,
      "end_line": 686,
      "comment": "",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 57)",
        "(line 674,col 9)-(line 681,col 40)",
        "(line 682,col 9)-(line 683,col 82)",
        "(line 684,col 9)-(line 685,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPermutedArrayHash()",
      "begin_line": 691,
      "end_line": 715,
      "comment": "\n     * Make sure that permuted arrays do not hash to the same value.\n     ",
      "child_ranges": [
        "(line 692,col 9)-(line 692,col 43)",
        "(line 693,col 9)-(line 693,col 43)",
        "(line 694,col 9)-(line 694,col 53)",
        "(line 697,col 9)-(line 699,col 9)",
        "(line 702,col 9)-(line 702,col 34)",
        "(line 703,col 9)-(line 711,col 29)",
        "(line 714,col 9)-(line 714,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 717,
      "end_line": 721,
      "comment": "",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 60)",
        "(line 719,col 9)-(line 719,col 60)",
        "(line 720,col 9)-(line 720,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 723,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 724,col 9)-(line 724,col 27)",
        "(line 725,col 9)-(line 725,col 59)",
        "(line 726,col 9)-(line 726,col 59)",
        "(line 727,col 9)-(line 727,col 61)",
        "(line 728,col 9)-(line 728,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 731,
      "end_line": 736,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 27)",
        "(line 733,col 9)-(line 733,col 61)",
        "(line 734,col 9)-(line 734,col 61)",
        "(line 735,col 9)-(line 735,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 738,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 739,col 9)-(line 739,col 50)",
        "(line 740,col 9)-(line 740,col 50)",
        "(line 741,col 9)-(line 741,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 744,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 50)",
        "(line 746,col 9)-(line 746,col 50)",
        "(line 747,col 9)-(line 747,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 750,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 751,col 9)-(line 751,col 62)",
        "(line 752,col 9)-(line 752,col 62)",
        "(line 753,col 9)-(line 753,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 756,
      "end_line": 800,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 19)",
        "(line 758,col 9)-(line 758,col 19)",
        "(line 759,col 9)-(line 759,col 19)",
        "(line 761,col 9)-(line 761,col 45)",
        "(line 762,col 9)-(line 762,col 45)",
        "(line 763,col 9)-(line 763,col 45)",
        "(line 764,col 9)-(line 764,col 45)",
        "(line 765,col 9)-(line 765,col 47)",
        "(line 766,col 9)-(line 766,col 48)",
        "(line 767,col 9)-(line 767,col 48)",
        "(line 768,col 9)-(line 768,col 49)",
        "(line 769,col 9)-(line 769,col 48)",
        "(line 773,col 9)-(line 773,col 70)",
        "(line 776,col 9)-(line 776,col 45)",
        "(line 778,col 9)-(line 784,col 9)",
        "(line 786,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 799,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcmLong()",
      "begin_line": 802,
      "end_line": 850,
      "comment": "",
      "child_ranges": [
        "(line 803,col 9)-(line 803,col 20)",
        "(line 804,col 9)-(line 804,col 20)",
        "(line 805,col 9)-(line 805,col 20)",
        "(line 807,col 9)-(line 807,col 45)",
        "(line 808,col 9)-(line 808,col 45)",
        "(line 809,col 9)-(line 809,col 45)",
        "(line 810,col 9)-(line 810,col 45)",
        "(line 811,col 9)-(line 811,col 47)",
        "(line 812,col 9)-(line 812,col 48)",
        "(line 813,col 9)-(line 813,col 48)",
        "(line 814,col 9)-(line 814,col 49)",
        "(line 815,col 9)-(line 815,col 48)",
        "(line 817,col 9)-(line 817,col 78)",
        "(line 821,col 9)-(line 821,col 73)",
        "(line 824,col 9)-(line 824,col 48)",
        "(line 826,col 9)-(line 832,col 9)",
        "(line 834,col 9)-(line 840,col 9)",
        "(line 842,col 9)-(line 843,col 75)",
        "(line 844,col 9)-(line 849,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLog()",
      "begin_line": 852,
      "end_line": 860,
      "comment": "",
      "child_ranges": [
        "(line 853,col 9)-(line 853,col 50)",
        "(line 854,col 9)-(line 854,col 50)",
        "(line 855,col 9)-(line 855,col 55)",
        "(line 856,col 9)-(line 856,col 55)",
        "(line 857,col 9)-(line 857,col 54)",
        "(line 858,col 9)-(line 858,col 49)",
        "(line 859,col 9)-(line 859,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 862,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 863,col 9)-(line 863,col 36)",
        "(line 864,col 9)-(line 864,col 39)",
        "(line 865,col 9)-(line 865,col 57)",
        "(line 866,col 9)-(line 870,col 9)",
        "(line 871,col 9)-(line 875,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLong()",
      "begin_line": 878,
      "end_line": 897,
      "comment": "",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 34)",
        "(line 880,col 9)-(line 880,col 34)",
        "(line 881,col 9)-(line 881,col 58)",
        "(line 882,col 9)-(line 882,col 58)",
        "(line 883,col 9)-(line 883,col 57)",
        "(line 884,col 9)-(line 884,col 57)",
        "(line 885,col 9)-(line 885,col 58)",
        "(line 886,col 9)-(line 886,col 58)",
        "(line 887,col 9)-(line 887,col 57)",
        "(line 888,col 9)-(line 888,col 57)",
        "(line 889,col 9)-(line 889,col 58)",
        "(line 890,col 9)-(line 890,col 61)",
        "(line 891,col 9)-(line 891,col 44)",
        "(line 892,col 9)-(line 892,col 44)",
        "(line 893,col 9)-(line 893,col 44)",
        "(line 894,col 9)-(line 894,col 44)",
        "(line 895,col 9)-(line 895,col 45)",
        "(line 896,col 9)-(line 896,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 899,
      "end_line": 906,
      "comment": "",
      "child_ranges": [
        "(line 900,col 9)-(line 905,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 908,
      "end_line": 969,
      "comment": "",
      "child_ranges": [
        "(line 910,col 9)-(line 910,col 92)",
        "(line 913,col 9)-(line 913,col 108)",
        "(line 916,col 9)-(line 916,col 106)",
        "(line 919,col 9)-(line 919,col 108)",
        "(line 922,col 9)-(line 922,col 90)",
        "(line 925,col 9)-(line 925,col 92)",
        "(line 928,col 9)-(line 928,col 90)",
        "(line 931,col 9)-(line 931,col 92)",
        "(line 934,col 9)-(line 934,col 114)",
        "(line 937,col 9)-(line 937,col 115)",
        "(line 940,col 9)-(line 940,col 116)",
        "(line 943,col 9)-(line 943,col 116)",
        "(line 946,col 9)-(line 946,col 117)",
        "(line 949,col 9)-(line 949,col 117)",
        "(line 952,col 9)-(line 952,col 117)",
        "(line 955,col 9)-(line 955,col 118)",
        "(line 958,col 9)-(line 958,col 118)",
        "(line 961,col 9)-(line 961,col 117)",
        "(line 964,col 9)-(line 964,col 118)",
        "(line 967,col 9)-(line 967,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 971,
      "end_line": 981,
      "comment": "",
      "child_ranges": [
        "(line 972,col 9)-(line 972,col 88)",
        "(line 973,col 9)-(line 973,col 88)",
        "(line 974,col 9)-(line 974,col 69)",
        "(line 975,col 9)-(line 975,col 103)",
        "(line 976,col 9)-(line 976,col 104)",
        "(line 977,col 9)-(line 977,col 69)",
        "(line 978,col 9)-(line 978,col 71)",
        "(line 979,col 9)-(line 979,col 70)",
        "(line 980,col 9)-(line 980,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testScalb()",
      "begin_line": 983,
      "end_line": 991,
      "comment": "",
      "child_ranges": [
        "(line 984,col 9)-(line 984,col 61)",
        "(line 985,col 9)-(line 985,col 61)",
        "(line 986,col 9)-(line 986,col 69)",
        "(line 987,col 9)-(line 987,col 68)",
        "(line 988,col 9)-(line 988,col 84)",
        "(line 989,col 9)-(line 989,col 84)",
        "(line 990,col 9)-(line 990,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeAngle()",
      "begin_line": 993,
      "end_line": 1003,
      "comment": "",
      "child_ranges": [
        "(line 994,col 9)-(line 1002,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNormalizeArray()",
      "begin_line": 1005,
      "end_line": 1051,
      "comment": "",
      "child_ranges": [
        "(line 1006,col 9)-(line 1006,col 54)",
        "(line 1007,col 9)-(line 1010,col 34)",
        "(line 1012,col 9)-(line 1012,col 56)",
        "(line 1013,col 9)-(line 1016,col 34)",
        "(line 1019,col 9)-(line 1019,col 80)",
        "(line 1020,col 9)-(line 1023,col 34)",
        "(line 1026,col 9)-(line 1026,col 48)",
        "(line 1027,col 9)-(line 1030,col 43)",
        "(line 1033,col 9)-(line 1033,col 75)",
        "(line 1034,col 9)-(line 1037,col 43)",
        "(line 1040,col 9)-(line 1043,col 48)",
        "(line 1046,col 9)-(line 1049,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 1053,
      "end_line": 1159,
      "comment": "",
      "child_ranges": [
        "(line 1054,col 9)-(line 1054,col 31)",
        "(line 1055,col 9)-(line 1055,col 55)",
        "(line 1056,col 9)-(line 1056,col 56)",
        "(line 1057,col 9)-(line 1057,col 57)",
        "(line 1060,col 9)-(line 1060,col 61)",
        "(line 1061,col 9)-(line 1061,col 84)",
        "(line 1062,col 9)-(line 1062,col 25)",
        "(line 1063,col 9)-(line 1063,col 31)",
        "(line 1064,col 9)-(line 1064,col 57)",
        "(line 1067,col 9)-(line 1067,col 63)",
        "(line 1068,col 9)-(line 1068,col 63)",
        "(line 1069,col 9)-(line 1069,col 63)",
        "(line 1070,col 9)-(line 1070,col 63)",
        "(line 1071,col 9)-(line 1071,col 64)",
        "(line 1072,col 9)-(line 1072,col 64)",
        "(line 1073,col 9)-(line 1073,col 64)",
        "(line 1074,col 9)-(line 1074,col 64)",
        "(line 1075,col 9)-(line 1075,col 64)",
        "(line 1077,col 9)-(line 1077,col 81)",
        "(line 1078,col 9)-(line 1078,col 82)",
        "(line 1079,col 9)-(line 1079,col 83)",
        "(line 1080,col 9)-(line 1080,col 83)",
        "(line 1081,col 9)-(line 1081,col 84)",
        "(line 1082,col 9)-(line 1082,col 85)",
        "(line 1084,col 9)-(line 1084,col 78)",
        "(line 1085,col 9)-(line 1085,col 79)",
        "(line 1086,col 9)-(line 1086,col 80)",
        "(line 1087,col 9)-(line 1087,col 80)",
        "(line 1088,col 9)-(line 1088,col 81)",
        "(line 1089,col 9)-(line 1089,col 82)",
        "(line 1091,col 9)-(line 1091,col 79)",
        "(line 1092,col 9)-(line 1092,col 80)",
        "(line 1093,col 9)-(line 1093,col 81)",
        "(line 1094,col 9)-(line 1094,col 81)",
        "(line 1095,col 9)-(line 1095,col 82)",
        "(line 1096,col 9)-(line 1096,col 83)",
        "(line 1098,col 9)-(line 1098,col 83)",
        "(line 1099,col 9)-(line 1099,col 84)",
        "(line 1100,col 9)-(line 1100,col 85)",
        "(line 1101,col 9)-(line 1101,col 85)",
        "(line 1102,col 9)-(line 1102,col 86)",
        "(line 1103,col 9)-(line 1103,col 87)",
        "(line 1104,col 9)-(line 1104,col 89)",
        "(line 1105,col 9)-(line 1105,col 91)",
        "(line 1107,col 9)-(line 1107,col 83)",
        "(line 1108,col 9)-(line 1108,col 84)",
        "(line 1109,col 9)-(line 1109,col 85)",
        "(line 1110,col 9)-(line 1110,col 85)",
        "(line 1111,col 9)-(line 1111,col 86)",
        "(line 1112,col 9)-(line 1112,col 87)",
        "(line 1113,col 9)-(line 1113,col 89)",
        "(line 1114,col 9)-(line 1114,col 91)",
        "(line 1115,col 9)-(line 1115,col 89)",
        "(line 1116,col 9)-(line 1116,col 91)",
        "(line 1118,col 9)-(line 1118,col 81)",
        "(line 1119,col 9)-(line 1119,col 82)",
        "(line 1120,col 9)-(line 1120,col 83)",
        "(line 1121,col 9)-(line 1121,col 83)",
        "(line 1122,col 9)-(line 1122,col 84)",
        "(line 1123,col 9)-(line 1123,col 85)",
        "(line 1124,col 9)-(line 1124,col 87)",
        "(line 1125,col 9)-(line 1125,col 89)",
        "(line 1127,col 9)-(line 1127,col 90)",
        "(line 1128,col 9)-(line 1128,col 88)",
        "(line 1130,col 9)-(line 1135,col 9)",
        "(line 1137,col 9)-(line 1137,col 76)",
        "(line 1138,col 9)-(line 1138,col 77)",
        "(line 1139,col 9)-(line 1139,col 78)",
        "(line 1140,col 9)-(line 1140,col 78)",
        "(line 1141,col 9)-(line 1141,col 79)",
        "(line 1142,col 9)-(line 1142,col 80)",
        "(line 1144,col 9)-(line 1149,col 9)",
        "(line 1152,col 9)-(line 1152,col 87)",
        "(line 1155,col 9)-(line 1155,col 80)",
        "(line 1156,col 9)-(line 1156,col 56)",
        "(line 1157,col 9)-(line 1157,col 98)",
        "(line 1158,col 9)-(line 1158,col 98)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 1161,
      "end_line": 1255,
      "comment": "",
      "child_ranges": [
        "(line 1162,col 9)-(line 1162,col 31)",
        "(line 1163,col 9)-(line 1163,col 56)",
        "(line 1164,col 9)-(line 1164,col 57)",
        "(line 1165,col 9)-(line 1165,col 58)",
        "(line 1168,col 9)-(line 1168,col 63)",
        "(line 1169,col 9)-(line 1169,col 63)",
        "(line 1170,col 9)-(line 1170,col 64)",
        "(line 1171,col 9)-(line 1171,col 64)",
        "(line 1172,col 9)-(line 1172,col 64)",
        "(line 1173,col 9)-(line 1173,col 64)",
        "(line 1174,col 9)-(line 1174,col 64)",
        "(line 1176,col 9)-(line 1176,col 82)",
        "(line 1177,col 9)-(line 1177,col 83)",
        "(line 1178,col 9)-(line 1178,col 84)",
        "(line 1179,col 9)-(line 1179,col 84)",
        "(line 1180,col 9)-(line 1180,col 85)",
        "(line 1181,col 9)-(line 1181,col 86)",
        "(line 1183,col 9)-(line 1183,col 79)",
        "(line 1184,col 9)-(line 1184,col 80)",
        "(line 1185,col 9)-(line 1185,col 81)",
        "(line 1186,col 9)-(line 1186,col 81)",
        "(line 1187,col 9)-(line 1187,col 82)",
        "(line 1188,col 9)-(line 1188,col 83)",
        "(line 1190,col 9)-(line 1190,col 80)",
        "(line 1191,col 9)-(line 1191,col 81)",
        "(line 1192,col 9)-(line 1192,col 82)",
        "(line 1193,col 9)-(line 1193,col 82)",
        "(line 1194,col 9)-(line 1194,col 83)",
        "(line 1195,col 9)-(line 1195,col 84)",
        "(line 1197,col 9)-(line 1197,col 84)",
        "(line 1198,col 9)-(line 1198,col 85)",
        "(line 1199,col 9)-(line 1199,col 86)",
        "(line 1200,col 9)-(line 1200,col 86)",
        "(line 1201,col 9)-(line 1201,col 87)",
        "(line 1202,col 9)-(line 1202,col 88)",
        "(line 1203,col 9)-(line 1203,col 91)",
        "(line 1204,col 9)-(line 1204,col 93)",
        "(line 1206,col 9)-(line 1206,col 84)",
        "(line 1207,col 9)-(line 1207,col 85)",
        "(line 1208,col 9)-(line 1208,col 86)",
        "(line 1209,col 9)-(line 1209,col 86)",
        "(line 1210,col 9)-(line 1210,col 87)",
        "(line 1211,col 9)-(line 1211,col 88)",
        "(line 1212,col 9)-(line 1212,col 91)",
        "(line 1213,col 9)-(line 1213,col 93)",
        "(line 1214,col 9)-(line 1214,col 91)",
        "(line 1215,col 9)-(line 1215,col 93)",
        "(line 1217,col 9)-(line 1217,col 82)",
        "(line 1218,col 9)-(line 1218,col 83)",
        "(line 1219,col 9)-(line 1219,col 84)",
        "(line 1220,col 9)-(line 1220,col 84)",
        "(line 1221,col 9)-(line 1221,col 85)",
        "(line 1222,col 9)-(line 1222,col 86)",
        "(line 1223,col 9)-(line 1223,col 89)",
        "(line 1224,col 9)-(line 1224,col 91)",
        "(line 1226,col 9)-(line 1226,col 92)",
        "(line 1227,col 9)-(line 1227,col 90)",
        "(line 1229,col 9)-(line 1234,col 9)",
        "(line 1236,col 9)-(line 1236,col 77)",
        "(line 1237,col 9)-(line 1237,col 78)",
        "(line 1238,col 9)-(line 1238,col 79)",
        "(line 1239,col 9)-(line 1239,col 79)",
        "(line 1240,col 9)-(line 1240,col 80)",
        "(line 1241,col 9)-(line 1241,col 81)",
        "(line 1243,col 9)-(line 1248,col 9)",
        "(line 1251,col 9)-(line 1251,col 79)",
        "(line 1252,col 9)-(line 1252,col 59)",
        "(line 1253,col 9)-(line 1253,col 97)",
        "(line 1254,col 9)-(line 1254,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 1257,
      "end_line": 1261,
      "comment": "",
      "child_ranges": [
        "(line 1258,col 9)-(line 1258,col 57)",
        "(line 1259,col 9)-(line 1259,col 57)",
        "(line 1260,col 9)-(line 1260,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 1263,
      "end_line": 1269,
      "comment": "",
      "child_ranges": [
        "(line 1264,col 9)-(line 1264,col 27)",
        "(line 1265,col 9)-(line 1265,col 54)",
        "(line 1266,col 9)-(line 1266,col 54)",
        "(line 1267,col 9)-(line 1267,col 56)",
        "(line 1268,col 9)-(line 1268,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 1271,
      "end_line": 1277,
      "comment": "",
      "child_ranges": [
        "(line 1272,col 9)-(line 1272,col 27)",
        "(line 1273,col 9)-(line 1273,col 56)",
        "(line 1274,col 9)-(line 1274,col 56)",
        "(line 1275,col 9)-(line 1275,col 58)",
        "(line 1276,col 9)-(line 1276,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 1279,
      "end_line": 1283,
      "comment": "",
      "child_ranges": [
        "(line 1280,col 9)-(line 1280,col 43)",
        "(line 1281,col 9)-(line 1281,col 43)",
        "(line 1282,col 9)-(line 1282,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 1285,
      "end_line": 1289,
      "comment": "",
      "child_ranges": [
        "(line 1286,col 9)-(line 1286,col 45)",
        "(line 1287,col 9)-(line 1287,col 45)",
        "(line 1288,col 9)-(line 1288,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 1291,
      "end_line": 1295,
      "comment": "",
      "child_ranges": [
        "(line 1292,col 9)-(line 1292,col 59)",
        "(line 1293,col 9)-(line 1293,col 59)",
        "(line 1294,col 9)-(line 1294,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 1297,
      "end_line": 1301,
      "comment": "",
      "child_ranges": [
        "(line 1298,col 9)-(line 1298,col 23)",
        "(line 1299,col 9)-(line 1299,col 35)",
        "(line 1300,col 9)-(line 1300,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 1303,
      "end_line": 1305,
      "comment": "",
      "child_ranges": [
        "(line 1304,col 9)-(line 1304,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 1307,
      "end_line": 1323,
      "comment": "",
      "child_ranges": [
        "(line 1308,col 9)-(line 1308,col 36)",
        "(line 1309,col 9)-(line 1309,col 39)",
        "(line 1310,col 9)-(line 1310,col 57)",
        "(line 1311,col 9)-(line 1311,col 68)",
        "(line 1312,col 9)-(line 1312,col 62)",
        "(line 1313,col 9)-(line 1317,col 9)",
        "(line 1318,col 9)-(line 1322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 1325,
      "end_line": 1333,
      "comment": "",
      "child_ranges": [
        "(line 1326,col 9)-(line 1326,col 36)",
        "(line 1327,col 9)-(line 1332,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLong()",
      "begin_line": 1335,
      "end_line": 1348,
      "comment": "",
      "child_ranges": [
        "(line 1336,col 9)-(line 1336,col 34)",
        "(line 1337,col 9)-(line 1337,col 34)",
        "(line 1338,col 9)-(line 1338,col 57)",
        "(line 1339,col 9)-(line 1339,col 57)",
        "(line 1340,col 9)-(line 1340,col 58)",
        "(line 1341,col 9)-(line 1341,col 62)",
        "(line 1343,col 9)-(line 1343,col 64)",
        "(line 1344,col 9)-(line 1344,col 63)",
        "(line 1345,col 9)-(line 1345,col 44)",
        "(line 1346,col 9)-(line 1346,col 45)",
        "(line 1347,col 9)-(line 1347,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 1350,
      "end_line": 1358,
      "comment": "",
      "child_ranges": [
        "(line 1351,col 9)-(line 1356,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testPow()",
      "begin_line": 1360,
      "end_line": 1434,
      "comment": "",
      "child_ranges": [
        "(line 1362,col 9)-(line 1362,col 55)",
        "(line 1363,col 9)-(line 1363,col 46)",
        "(line 1364,col 9)-(line 1369,col 9)",
        "(line 1371,col 9)-(line 1371,col 56)",
        "(line 1372,col 9)-(line 1372,col 47)",
        "(line 1373,col 9)-(line 1378,col 9)",
        "(line 1380,col 9)-(line 1380,col 57)",
        "(line 1381,col 9)-(line 1381,col 48)",
        "(line 1382,col 9)-(line 1387,col 9)",
        "(line 1389,col 9)-(line 1389,col 58)",
        "(line 1390,col 9)-(line 1390,col 49)",
        "(line 1391,col 9)-(line 1396,col 9)",
        "(line 1398,col 9)-(line 1398,col 55)",
        "(line 1399,col 9)-(line 1399,col 83)",
        "(line 1400,col 9)-(line 1400,col 66)",
        "(line 1401,col 9)-(line 1406,col 9)",
        "(line 1408,col 9)-(line 1408,col 84)",
        "(line 1409,col 9)-(line 1409,col 67)",
        "(line 1410,col 9)-(line 1415,col 9)",
        "(line 1417,col 9)-(line 1417,col 104)",
        "(line 1418,col 9)-(line 1418,col 80)",
        "(line 1419,col 9)-(line 1424,col 9)",
        "(line 1426,col 9)-(line 1429,col 76)",
        "(line 1430,col 9)-(line 1430,col 60)",
        "(line 1431,col 9)-(line 1431,col 61)",
        "(line 1432,col 9)-(line 1432,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceDouble()",
      "begin_line": 1436,
      "end_line": 1440,
      "comment": "",
      "child_ranges": [
        "(line 1437,col 9)-(line 1437,col 36)",
        "(line 1438,col 9)-(line 1438,col 36)",
        "(line 1439,col 9)-(line 1439,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL1DistanceInt()",
      "begin_line": 1442,
      "end_line": 1446,
      "comment": "",
      "child_ranges": [
        "(line 1443,col 9)-(line 1443,col 28)",
        "(line 1444,col 9)-(line 1444,col 28)",
        "(line 1445,col 9)-(line 1445,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceDouble()",
      "begin_line": 1448,
      "end_line": 1452,
      "comment": "",
      "child_ranges": [
        "(line 1449,col 9)-(line 1449,col 36)",
        "(line 1450,col 9)-(line 1450,col 36)",
        "(line 1451,col 9)-(line 1451,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testL2DistanceInt()",
      "begin_line": 1454,
      "end_line": 1458,
      "comment": "",
      "child_ranges": [
        "(line 1455,col 9)-(line 1455,col 28)",
        "(line 1456,col 9)-(line 1456,col 28)",
        "(line 1457,col 9)-(line 1457,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceDouble()",
      "begin_line": 1460,
      "end_line": 1464,
      "comment": "",
      "child_ranges": [
        "(line 1461,col 9)-(line 1461,col 36)",
        "(line 1462,col 9)-(line 1462,col 36)",
        "(line 1463,col 9)-(line 1463,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLInfDistanceInt()",
      "begin_line": 1466,
      "end_line": 1470,
      "comment": "",
      "child_ranges": [
        "(line 1467,col 9)-(line 1467,col 28)",
        "(line 1468,col 9)-(line 1468,col 28)",
        "(line 1469,col 9)-(line 1469,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCheckOrder()",
      "begin_line": 1472,
      "end_line": 1510,
      "comment": "",
      "child_ranges": [
        "(line 1473,col 9)-(line 1474,col 73)",
        "(line 1475,col 9)-(line 1476,col 74)",
        "(line 1477,col 9)-(line 1478,col 73)",
        "(line 1479,col 9)-(line 1480,col 74)",
        "(line 1482,col 9)-(line 1488,col 9)",
        "(line 1489,col 9)-(line 1495,col 9)",
        "(line 1496,col 9)-(line 1502,col 9)",
        "(line 1503,col 9)-(line 1509,col 9)"
      ]
    }
  ]
}
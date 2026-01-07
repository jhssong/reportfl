{
  "filepath": "/tmp/Math-40b/src/test/java/org/apache/commons/math/util/ArithmeticUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 755,
      "comment": "\n * Test cases for the {@link ArithmeticUtils} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.test0Choose0()",
      "begin_line": 42,
      "end_line": 47,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 84)",
        "(line 45,col 9)-(line 45,col 81)",
        "(line 46,col 9)-(line 46,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheck()",
      "begin_line": 49,
      "end_line": 64,
      "comment": "",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 36)",
        "(line 52,col 9)-(line 52,col 39)",
        "(line 53,col 9)-(line 53,col 70)",
        "(line 54,col 9)-(line 58,col 9)",
        "(line 59,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheckLong()",
      "begin_line": 66,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 71)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 71)",
        "(line 73,col 9)-(line 73,col 71)",
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 75,col 69)",
        "(line 76,col 9)-(line 76,col 71)",
        "(line 77,col 9)-(line 77,col 76)",
        "(line 78,col 9)-(line 78,col 44)",
        "(line 79,col 9)-(line 79,col 45)",
        "(line 80,col 9)-(line 80,col 44)",
        "(line 81,col 9)-(line 81,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficient()",
      "begin_line": 85,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 101,col 16)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 127,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 130,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 132,col 9)-(line 137,col 9)",
        "(line 139,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 184,col 72)",
        "(line 185,col 9)-(line 186,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 193,
      "end_line": 248,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 225,col 69)",
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 227,col 52)",
        "(line 229,col 9)-(line 229,col 66)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 234,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 241,col 22)",
        "(line 242,col 9)-(line 242,col 62)",
        "(line 243,col 9)-(line 243,col 48)",
        "(line 244,col 9)-(line 244,col 52)",
        "(line 245,col 9)-(line 245,col 101)",
        "(line 246,col 9)-(line 246,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testFactorial()",
      "begin_line": 250,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 258,col 66)",
        "(line 259,col 9)-(line 259,col 82)",
        "(line 260,col 9)-(line 260,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testFactorialFail()",
      "begin_line": 263,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcd()",
      "begin_line": 292,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 19)",
        "(line 295,col 9)-(line 295,col 19)",
        "(line 296,col 9)-(line 296,col 19)",
        "(line 298,col 9)-(line 298,col 58)",
        "(line 300,col 9)-(line 300,col 58)",
        "(line 301,col 9)-(line 301,col 58)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 303,col 9)-(line 303,col 59)",
        "(line 305,col 9)-(line 305,col 59)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 307,col 9)-(line 307,col 60)",
        "(line 308,col 9)-(line 308,col 61)",
        "(line 310,col 9)-(line 310,col 58)",
        "(line 311,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 313,col 60)",
        "(line 315,col 9)-(line 315,col 88)",
        "(line 317,col 9)-(line 317,col 90)",
        "(line 318,col 9)-(line 318,col 91)",
        "(line 319,col 9)-(line 319,col 83)",
        "(line 320,col 9)-(line 326,col 9)",
        "(line 327,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcdConsistency()",
      "begin_line": 343,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 71)",
        "(line 346,col 9)-(line 346,col 61)",
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 57)",
        "(line 351,col 9)-(line 364,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcdLong()",
      "begin_line": 367,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 20)",
        "(line 370,col 9)-(line 370,col 20)",
        "(line 371,col 9)-(line 371,col 20)",
        "(line 373,col 9)-(line 373,col 59)",
        "(line 375,col 9)-(line 375,col 58)",
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 377,col 59)",
        "(line 378,col 9)-(line 378,col 59)",
        "(line 380,col 9)-(line 380,col 59)",
        "(line 381,col 9)-(line 381,col 60)",
        "(line 382,col 9)-(line 382,col 60)",
        "(line 383,col 9)-(line 383,col 61)",
        "(line 385,col 9)-(line 385,col 58)",
        "(line 386,col 9)-(line 386,col 59)",
        "(line 387,col 9)-(line 387,col 59)",
        "(line 388,col 9)-(line 388,col 60)",
        "(line 390,col 9)-(line 390,col 94)",
        "(line 392,col 9)-(line 392,col 81)",
        "(line 394,col 9)-(line 394,col 85)",
        "(line 395,col 9)-(line 395,col 86)",
        "(line 396,col 9)-(line 396,col 78)",
        "(line 397,col 9)-(line 403,col 9)",
        "(line 404,col 9)-(line 410,col 9)",
        "(line 411,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testLcm()",
      "begin_line": 421,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 19)",
        "(line 424,col 9)-(line 424,col 19)",
        "(line 425,col 9)-(line 425,col 19)",
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 58)",
        "(line 430,col 9)-(line 430,col 58)",
        "(line 431,col 9)-(line 431,col 60)",
        "(line 432,col 9)-(line 432,col 61)",
        "(line 433,col 9)-(line 433,col 61)",
        "(line 434,col 9)-(line 434,col 62)",
        "(line 435,col 9)-(line 435,col 61)",
        "(line 439,col 9)-(line 439,col 83)",
        "(line 442,col 9)-(line 442,col 58)",
        "(line 444,col 9)-(line 450,col 9)",
        "(line 452,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 465,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testLcmLong()",
      "begin_line": 468,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 20)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 58)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 60)",
        "(line 479,col 9)-(line 479,col 61)",
        "(line 480,col 9)-(line 480,col 61)",
        "(line 481,col 9)-(line 481,col 62)",
        "(line 482,col 9)-(line 482,col 61)",
        "(line 484,col 9)-(line 484,col 91)",
        "(line 488,col 9)-(line 488,col 86)",
        "(line 491,col 9)-(line 491,col 61)",
        "(line 493,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 510,col 81)",
        "(line 511,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheck()",
      "begin_line": 519,
      "end_line": 534,
      "comment": "",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 36)",
        "(line 522,col 9)-(line 522,col 39)",
        "(line 523,col 9)-(line 523,col 70)",
        "(line 524,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 533,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheckLong()",
      "begin_line": 536,
      "end_line": 556,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 34)",
        "(line 539,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 540,col 71)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 542,col 9)-(line 542,col 70)",
        "(line 543,col 9)-(line 543,col 70)",
        "(line 544,col 9)-(line 544,col 71)",
        "(line 545,col 9)-(line 545,col 71)",
        "(line 546,col 9)-(line 546,col 70)",
        "(line 547,col 9)-(line 547,col 70)",
        "(line 548,col 9)-(line 548,col 71)",
        "(line 549,col 9)-(line 549,col 74)",
        "(line 550,col 9)-(line 550,col 44)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 553,col 44)",
        "(line 554,col 9)-(line 554,col 45)",
        "(line 555,col 9)-(line 555,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheck()",
      "begin_line": 558,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 36)",
        "(line 561,col 9)-(line 561,col 39)",
        "(line 562,col 9)-(line 562,col 70)",
        "(line 563,col 9)-(line 563,col 81)",
        "(line 564,col 9)-(line 564,col 75)",
        "(line 565,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 574,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 577,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 36)",
        "(line 580,col 9)-(line 585,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckLong()",
      "begin_line": 588,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 34)",
        "(line 591,col 9)-(line 591,col 34)",
        "(line 592,col 9)-(line 592,col 70)",
        "(line 593,col 9)-(line 593,col 70)",
        "(line 594,col 9)-(line 594,col 71)",
        "(line 595,col 9)-(line 595,col 75)",
        "(line 597,col 9)-(line 597,col 77)",
        "(line 598,col 9)-(line 598,col 76)",
        "(line 599,col 9)-(line 599,col 44)",
        "(line 600,col 9)-(line 600,col 45)",
        "(line 601,col 9)-(line 601,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testPow()",
      "begin_line": 604,
      "end_line": 679,
      "comment": "",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 68)",
        "(line 608,col 9)-(line 608,col 59)",
        "(line 609,col 9)-(line 614,col 9)",
        "(line 616,col 9)-(line 616,col 69)",
        "(line 617,col 9)-(line 617,col 60)",
        "(line 618,col 9)-(line 623,col 9)",
        "(line 625,col 9)-(line 625,col 70)",
        "(line 626,col 9)-(line 626,col 61)",
        "(line 627,col 9)-(line 632,col 9)",
        "(line 634,col 9)-(line 634,col 71)",
        "(line 635,col 9)-(line 635,col 62)",
        "(line 636,col 9)-(line 641,col 9)",
        "(line 643,col 9)-(line 643,col 55)",
        "(line 644,col 9)-(line 644,col 96)",
        "(line 645,col 9)-(line 645,col 79)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 653,col 9)-(line 653,col 97)",
        "(line 654,col 9)-(line 654,col 80)",
        "(line 655,col 9)-(line 660,col 9)",
        "(line 662,col 9)-(line 662,col 117)",
        "(line 663,col 9)-(line 663,col 93)",
        "(line 664,col 9)-(line 669,col 9)",
        "(line 671,col 9)-(line 674,col 76)",
        "(line 675,col 9)-(line 675,col 73)",
        "(line 676,col 9)-(line 676,col 74)",
        "(line 677,col 9)-(line 677,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 684,
      "end_line": 715,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 691,col 25)",
        "(line 692,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 712,col 9)",
        "(line 713,col 9)-(line 713,col 75)",
        "(line 714,col 9)-(line 714,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.factorial(int)",
      "begin_line": 720,
      "end_line": 726,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 721,col 9)-(line 721,col 24)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 725,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 728,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 729,col 9)-(line 734,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 737,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 738,col 9)-(line 743,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 746,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 747,col 9)-(line 752,col 9)"
      ]
    }
  ]
}
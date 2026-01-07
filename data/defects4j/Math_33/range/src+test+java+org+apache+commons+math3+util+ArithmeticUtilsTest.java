{
  "filepath": "/tmp/Math-33b/src/test/java/org/apache/commons/math3/util/ArithmeticUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 37,
      "end_line": 769,
      "comment": "\n * Test cases for the {@link ArithmeticUtils} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.test0Choose0()",
      "begin_line": 43,
      "end_line": 48,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 84)",
        "(line 46,col 9)-(line 46,col 81)",
        "(line 47,col 9)-(line 47,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheck()",
      "begin_line": 50,
      "end_line": 65,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 36)",
        "(line 53,col 9)-(line 53,col 39)",
        "(line 54,col 9)-(line 54,col 70)",
        "(line 55,col 9)-(line 59,col 9)",
        "(line 60,col 9)-(line 64,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheckLong()",
      "begin_line": 67,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 34)",
        "(line 70,col 9)-(line 70,col 34)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 71)",
        "(line 73,col 9)-(line 73,col 71)",
        "(line 74,col 9)-(line 74,col 71)",
        "(line 75,col 9)-(line 75,col 69)",
        "(line 76,col 9)-(line 76,col 69)",
        "(line 77,col 9)-(line 77,col 71)",
        "(line 78,col 9)-(line 78,col 76)",
        "(line 79,col 9)-(line 79,col 44)",
        "(line 80,col 9)-(line 80,col 45)",
        "(line 81,col 9)-(line 81,col 44)",
        "(line 82,col 9)-(line 82,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficient()",
      "begin_line": 86,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 88,col 9)-(line 94,col 16)",
        "(line 95,col 9)-(line 102,col 16)",
        "(line 103,col 9)-(line 105,col 9)",
        "(line 106,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 116,col 9)",
        "(line 118,col 9)-(line 118,col 46)",
        "(line 119,col 9)-(line 119,col 46)",
        "(line 120,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 131,
      "end_line": 188,
      "comment": "",
      "child_ranges": [
        "(line 133,col 9)-(line 138,col 9)",
        "(line 140,col 9)-(line 145,col 9)",
        "(line 147,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 171,col 9)",
        "(line 173,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 185,col 72)",
        "(line 186,col 9)-(line 187,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 194,
      "end_line": 249,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 224,col 9)",
        "(line 226,col 9)-(line 226,col 69)",
        "(line 227,col 9)-(line 227,col 55)",
        "(line 228,col 9)-(line 228,col 52)",
        "(line 230,col 9)-(line 230,col 66)",
        "(line 231,col 9)-(line 231,col 52)",
        "(line 232,col 9)-(line 232,col 52)",
        "(line 235,col 9)-(line 240,col 9)",
        "(line 242,col 9)-(line 242,col 22)",
        "(line 243,col 9)-(line 243,col 62)",
        "(line 244,col 9)-(line 244,col 48)",
        "(line 245,col 9)-(line 245,col 52)",
        "(line 246,col 9)-(line 246,col 101)",
        "(line 247,col 9)-(line 247,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testFactorial()",
      "begin_line": 251,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 66)",
        "(line 260,col 9)-(line 260,col 82)",
        "(line 261,col 9)-(line 261,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testFactorialFail()",
      "begin_line": 264,
      "end_line": 291,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 277,col 9)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 290,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcd()",
      "begin_line": 293,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 19)",
        "(line 296,col 9)-(line 296,col 19)",
        "(line 297,col 9)-(line 297,col 19)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 301,col 9)-(line 301,col 58)",
        "(line 302,col 9)-(line 302,col 58)",
        "(line 303,col 9)-(line 303,col 59)",
        "(line 304,col 9)-(line 304,col 59)",
        "(line 306,col 9)-(line 306,col 59)",
        "(line 307,col 9)-(line 307,col 60)",
        "(line 308,col 9)-(line 308,col 60)",
        "(line 309,col 9)-(line 309,col 61)",
        "(line 311,col 9)-(line 311,col 58)",
        "(line 312,col 9)-(line 312,col 59)",
        "(line 313,col 9)-(line 313,col 59)",
        "(line 314,col 9)-(line 314,col 60)",
        "(line 316,col 9)-(line 316,col 88)",
        "(line 318,col 9)-(line 318,col 90)",
        "(line 319,col 9)-(line 319,col 91)",
        "(line 320,col 9)-(line 320,col 83)",
        "(line 321,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdConsistency()",
      "begin_line": 344,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 71)",
        "(line 347,col 9)-(line 347,col 61)",
        "(line 348,col 9)-(line 350,col 9)",
        "(line 351,col 9)-(line 351,col 57)",
        "(line 352,col 9)-(line 365,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testGcdLong()",
      "begin_line": 368,
      "end_line": 419,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 20)",
        "(line 371,col 9)-(line 371,col 20)",
        "(line 372,col 9)-(line 372,col 20)",
        "(line 374,col 9)-(line 374,col 59)",
        "(line 376,col 9)-(line 376,col 58)",
        "(line 377,col 9)-(line 377,col 58)",
        "(line 378,col 9)-(line 378,col 59)",
        "(line 379,col 9)-(line 379,col 59)",
        "(line 381,col 9)-(line 381,col 59)",
        "(line 382,col 9)-(line 382,col 60)",
        "(line 383,col 9)-(line 383,col 60)",
        "(line 384,col 9)-(line 384,col 61)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 387,col 59)",
        "(line 388,col 9)-(line 388,col 59)",
        "(line 389,col 9)-(line 389,col 60)",
        "(line 391,col 9)-(line 391,col 94)",
        "(line 393,col 9)-(line 393,col 81)",
        "(line 395,col 9)-(line 395,col 85)",
        "(line 396,col 9)-(line 396,col 86)",
        "(line 397,col 9)-(line 397,col 78)",
        "(line 398,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 412,col 9)-(line 418,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testLcm()",
      "begin_line": 422,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 19)",
        "(line 425,col 9)-(line 425,col 19)",
        "(line 426,col 9)-(line 426,col 19)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 58)",
        "(line 430,col 9)-(line 430,col 58)",
        "(line 431,col 9)-(line 431,col 58)",
        "(line 432,col 9)-(line 432,col 60)",
        "(line 433,col 9)-(line 433,col 61)",
        "(line 434,col 9)-(line 434,col 61)",
        "(line 435,col 9)-(line 435,col 62)",
        "(line 436,col 9)-(line 436,col 61)",
        "(line 440,col 9)-(line 440,col 83)",
        "(line 443,col 9)-(line 443,col 58)",
        "(line 445,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 466,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testLcmLong()",
      "begin_line": 469,
      "end_line": 518,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 20)",
        "(line 472,col 9)-(line 472,col 20)",
        "(line 473,col 9)-(line 473,col 20)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 58)",
        "(line 477,col 9)-(line 477,col 58)",
        "(line 478,col 9)-(line 478,col 58)",
        "(line 479,col 9)-(line 479,col 60)",
        "(line 480,col 9)-(line 480,col 61)",
        "(line 481,col 9)-(line 481,col 61)",
        "(line 482,col 9)-(line 482,col 62)",
        "(line 483,col 9)-(line 483,col 61)",
        "(line 485,col 9)-(line 485,col 91)",
        "(line 489,col 9)-(line 489,col 86)",
        "(line 492,col 9)-(line 492,col 61)",
        "(line 494,col 9)-(line 500,col 9)",
        "(line 502,col 9)-(line 508,col 9)",
        "(line 510,col 9)-(line 511,col 81)",
        "(line 512,col 9)-(line 517,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheck()",
      "begin_line": 520,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 36)",
        "(line 523,col 9)-(line 523,col 39)",
        "(line 524,col 9)-(line 524,col 70)",
        "(line 525,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheckLong()",
      "begin_line": 537,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 34)",
        "(line 540,col 9)-(line 540,col 34)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 542,col 9)-(line 542,col 71)",
        "(line 543,col 9)-(line 543,col 70)",
        "(line 544,col 9)-(line 544,col 70)",
        "(line 545,col 9)-(line 545,col 71)",
        "(line 546,col 9)-(line 546,col 71)",
        "(line 547,col 9)-(line 547,col 70)",
        "(line 548,col 9)-(line 548,col 70)",
        "(line 549,col 9)-(line 549,col 71)",
        "(line 550,col 9)-(line 550,col 74)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 553,col 44)",
        "(line 554,col 9)-(line 554,col 44)",
        "(line 555,col 9)-(line 555,col 45)",
        "(line 556,col 9)-(line 556,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheck()",
      "begin_line": 559,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 36)",
        "(line 562,col 9)-(line 562,col 39)",
        "(line 563,col 9)-(line 563,col 70)",
        "(line 564,col 9)-(line 564,col 81)",
        "(line 565,col 9)-(line 565,col 75)",
        "(line 566,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 575,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 578,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 36)",
        "(line 581,col 9)-(line 586,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckLong()",
      "begin_line": 589,
      "end_line": 603,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 34)",
        "(line 592,col 9)-(line 592,col 34)",
        "(line 593,col 9)-(line 593,col 70)",
        "(line 594,col 9)-(line 594,col 70)",
        "(line 595,col 9)-(line 595,col 71)",
        "(line 596,col 9)-(line 596,col 75)",
        "(line 598,col 9)-(line 598,col 77)",
        "(line 599,col 9)-(line 599,col 76)",
        "(line 600,col 9)-(line 600,col 44)",
        "(line 601,col 9)-(line 601,col 45)",
        "(line 602,col 9)-(line 602,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testPow()",
      "begin_line": 605,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 68)",
        "(line 609,col 9)-(line 609,col 59)",
        "(line 610,col 9)-(line 615,col 9)",
        "(line 617,col 9)-(line 617,col 69)",
        "(line 618,col 9)-(line 618,col 60)",
        "(line 619,col 9)-(line 624,col 9)",
        "(line 626,col 9)-(line 626,col 70)",
        "(line 627,col 9)-(line 627,col 61)",
        "(line 628,col 9)-(line 633,col 9)",
        "(line 635,col 9)-(line 635,col 71)",
        "(line 636,col 9)-(line 636,col 62)",
        "(line 637,col 9)-(line 642,col 9)",
        "(line 644,col 9)-(line 644,col 55)",
        "(line 645,col 9)-(line 645,col 96)",
        "(line 646,col 9)-(line 646,col 79)",
        "(line 647,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 654,col 97)",
        "(line 655,col 9)-(line 655,col 80)",
        "(line 656,col 9)-(line 661,col 9)",
        "(line 663,col 9)-(line 663,col 117)",
        "(line 664,col 9)-(line 664,col 93)",
        "(line 665,col 9)-(line 670,col 9)",
        "(line 672,col 9)-(line 675,col 76)",
        "(line 676,col 9)-(line 676,col 73)",
        "(line 677,col 9)-(line 677,col 74)",
        "(line 678,col 9)-(line 678,col 94)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testIsPowerOfTwo()",
      "begin_line": 682,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 27)",
        "(line 685,col 9)-(line 685,col 50)",
        "(line 686,col 9)-(line 686,col 37)",
        "(line 687,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 699,
      "end_line": 730,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 25)",
        "(line 707,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 724,col 9)",
        "(line 725,col 9)-(line 727,col 9)",
        "(line 728,col 9)-(line 728,col 75)",
        "(line 729,col 9)-(line 729,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.factorial(int)",
      "begin_line": 735,
      "end_line": 741,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 736,col 9)-(line 736,col 24)",
        "(line 737,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 743,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 749,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 752,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 753,col 9)-(line 758,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.util.ArithmeticUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 761,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 767,col 9)"
      ]
    }
  ]
}
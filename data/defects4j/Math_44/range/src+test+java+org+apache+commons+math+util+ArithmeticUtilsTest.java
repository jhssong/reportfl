{
  "filepath": "/tmp/Math-44b/src/test/java/org/apache/commons/math/util/ArithmeticUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArithmeticUtilsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 35,
      "end_line": 677,
      "comment": "\n * Test cases for the {@link ArithmeticUtils} class.\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "binomialCache"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " cached binomial coefficients "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.test0Choose0()",
      "begin_line": 41,
      "end_line": 46,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 84)",
        "(line 44,col 9)-(line 44,col 81)",
        "(line 45,col 9)-(line 45,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheck()",
      "begin_line": 48,
      "end_line": 63,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 36)",
        "(line 51,col 9)-(line 51,col 39)",
        "(line 52,col 9)-(line 52,col 70)",
        "(line 53,col 9)-(line 57,col 9)",
        "(line 58,col 9)-(line 62,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheckLong()",
      "begin_line": 65,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 67,col 9)-(line 67,col 34)",
        "(line 68,col 9)-(line 68,col 34)",
        "(line 69,col 9)-(line 69,col 71)",
        "(line 70,col 9)-(line 70,col 71)",
        "(line 71,col 9)-(line 71,col 71)",
        "(line 72,col 9)-(line 72,col 71)",
        "(line 73,col 9)-(line 73,col 69)",
        "(line 74,col 9)-(line 74,col 69)",
        "(line 75,col 9)-(line 75,col 71)",
        "(line 76,col 9)-(line 76,col 76)",
        "(line 77,col 9)-(line 77,col 44)",
        "(line 78,col 9)-(line 78,col 45)",
        "(line 79,col 9)-(line 79,col 44)",
        "(line 80,col 9)-(line 80,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficient()",
      "begin_line": 84,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 92,col 16)",
        "(line 93,col 9)-(line 100,col 16)",
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 114,col 9)",
        "(line 116,col 9)-(line 116,col 46)",
        "(line 117,col 9)-(line 117,col 46)",
        "(line 118,col 9)-(line 126,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 129,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 136,col 9)",
        "(line 138,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 72)",
        "(line 184,col 9)-(line 185,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testBinomialCoefficientLarge()",
      "begin_line": 192,
      "end_line": 247,
      "comment": "\n     * Tests correctness for large n and sharpness of upper bound in API doc\n     * JIRA: MATH-241\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 222,col 9)",
        "(line 224,col 9)-(line 224,col 69)",
        "(line 225,col 9)-(line 225,col 55)",
        "(line 226,col 9)-(line 226,col 52)",
        "(line 228,col 9)-(line 228,col 66)",
        "(line 229,col 9)-(line 229,col 52)",
        "(line 230,col 9)-(line 230,col 52)",
        "(line 233,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 240,col 22)",
        "(line 241,col 9)-(line 241,col 62)",
        "(line 242,col 9)-(line 242,col 48)",
        "(line 243,col 9)-(line 243,col 52)",
        "(line 244,col 9)-(line 244,col 101)",
        "(line 245,col 9)-(line 245,col 112)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testFactorial()",
      "begin_line": 249,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 66)",
        "(line 258,col 9)-(line 258,col 82)",
        "(line 259,col 9)-(line 259,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testFactorialFail()",
      "begin_line": 262,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 269,col 9)",
        "(line 270,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcd()",
      "begin_line": 291,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 19)",
        "(line 294,col 9)-(line 294,col 19)",
        "(line 295,col 9)-(line 295,col 19)",
        "(line 297,col 9)-(line 297,col 58)",
        "(line 299,col 9)-(line 299,col 58)",
        "(line 300,col 9)-(line 300,col 58)",
        "(line 301,col 9)-(line 301,col 59)",
        "(line 302,col 9)-(line 302,col 59)",
        "(line 304,col 9)-(line 304,col 59)",
        "(line 305,col 9)-(line 305,col 60)",
        "(line 306,col 9)-(line 306,col 60)",
        "(line 307,col 9)-(line 307,col 61)",
        "(line 309,col 9)-(line 309,col 58)",
        "(line 310,col 9)-(line 310,col 59)",
        "(line 311,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 60)",
        "(line 314,col 9)-(line 314,col 88)",
        "(line 316,col 9)-(line 316,col 90)",
        "(line 317,col 9)-(line 317,col 91)",
        "(line 318,col 9)-(line 318,col 83)",
        "(line 319,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 332,col 9)",
        "(line 333,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcdConsistency()",
      "begin_line": 342,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 71)",
        "(line 345,col 9)-(line 345,col 61)",
        "(line 346,col 9)-(line 348,col 9)",
        "(line 349,col 9)-(line 349,col 57)",
        "(line 350,col 9)-(line 363,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testGcdLong()",
      "begin_line": 366,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 20)",
        "(line 369,col 9)-(line 369,col 20)",
        "(line 370,col 9)-(line 370,col 20)",
        "(line 372,col 9)-(line 372,col 59)",
        "(line 374,col 9)-(line 374,col 58)",
        "(line 375,col 9)-(line 375,col 58)",
        "(line 376,col 9)-(line 376,col 59)",
        "(line 377,col 9)-(line 377,col 59)",
        "(line 379,col 9)-(line 379,col 59)",
        "(line 380,col 9)-(line 380,col 60)",
        "(line 381,col 9)-(line 381,col 60)",
        "(line 382,col 9)-(line 382,col 61)",
        "(line 384,col 9)-(line 384,col 58)",
        "(line 385,col 9)-(line 385,col 59)",
        "(line 386,col 9)-(line 386,col 59)",
        "(line 387,col 9)-(line 387,col 60)",
        "(line 389,col 9)-(line 389,col 94)",
        "(line 391,col 9)-(line 391,col 81)",
        "(line 393,col 9)-(line 393,col 85)",
        "(line 394,col 9)-(line 394,col 86)",
        "(line 395,col 9)-(line 395,col 78)",
        "(line 396,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 409,col 9)",
        "(line 410,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testLcm()",
      "begin_line": 420,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 19)",
        "(line 423,col 9)-(line 423,col 19)",
        "(line 424,col 9)-(line 424,col 19)",
        "(line 426,col 9)-(line 426,col 58)",
        "(line 427,col 9)-(line 427,col 58)",
        "(line 428,col 9)-(line 428,col 58)",
        "(line 429,col 9)-(line 429,col 58)",
        "(line 430,col 9)-(line 430,col 60)",
        "(line 431,col 9)-(line 431,col 61)",
        "(line 432,col 9)-(line 432,col 61)",
        "(line 433,col 9)-(line 433,col 62)",
        "(line 434,col 9)-(line 434,col 61)",
        "(line 438,col 9)-(line 438,col 83)",
        "(line 441,col 9)-(line 441,col 58)",
        "(line 443,col 9)-(line 449,col 9)",
        "(line 451,col 9)-(line 457,col 9)",
        "(line 459,col 9)-(line 464,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testLcmLong()",
      "begin_line": 467,
      "end_line": 516,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 20)",
        "(line 470,col 9)-(line 470,col 20)",
        "(line 471,col 9)-(line 471,col 20)",
        "(line 473,col 9)-(line 473,col 58)",
        "(line 474,col 9)-(line 474,col 58)",
        "(line 475,col 9)-(line 475,col 58)",
        "(line 476,col 9)-(line 476,col 58)",
        "(line 477,col 9)-(line 477,col 60)",
        "(line 478,col 9)-(line 478,col 61)",
        "(line 479,col 9)-(line 479,col 61)",
        "(line 480,col 9)-(line 480,col 62)",
        "(line 481,col 9)-(line 481,col 61)",
        "(line 483,col 9)-(line 483,col 91)",
        "(line 487,col 9)-(line 487,col 86)",
        "(line 490,col 9)-(line 490,col 61)",
        "(line 492,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 509,col 81)",
        "(line 510,col 9)-(line 515,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheck()",
      "begin_line": 518,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 36)",
        "(line 521,col 9)-(line 521,col 39)",
        "(line 522,col 9)-(line 522,col 70)",
        "(line 523,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheckLong()",
      "begin_line": 535,
      "end_line": 555,
      "comment": "",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 34)",
        "(line 538,col 9)-(line 538,col 34)",
        "(line 539,col 9)-(line 539,col 71)",
        "(line 540,col 9)-(line 540,col 71)",
        "(line 541,col 9)-(line 541,col 70)",
        "(line 542,col 9)-(line 542,col 70)",
        "(line 543,col 9)-(line 543,col 71)",
        "(line 544,col 9)-(line 544,col 71)",
        "(line 545,col 9)-(line 545,col 70)",
        "(line 546,col 9)-(line 546,col 70)",
        "(line 547,col 9)-(line 547,col 71)",
        "(line 548,col 9)-(line 548,col 74)",
        "(line 549,col 9)-(line 549,col 44)",
        "(line 550,col 9)-(line 550,col 44)",
        "(line 551,col 9)-(line 551,col 44)",
        "(line 552,col 9)-(line 552,col 44)",
        "(line 553,col 9)-(line 553,col 45)",
        "(line 554,col 9)-(line 554,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheck()",
      "begin_line": 557,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 36)",
        "(line 560,col 9)-(line 560,col 39)",
        "(line 561,col 9)-(line 561,col 70)",
        "(line 562,col 9)-(line 562,col 81)",
        "(line 563,col 9)-(line 563,col 75)",
        "(line 564,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 573,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 576,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 36)",
        "(line 579,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckLong()",
      "begin_line": 587,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 34)",
        "(line 590,col 9)-(line 590,col 34)",
        "(line 591,col 9)-(line 591,col 70)",
        "(line 592,col 9)-(line 592,col 70)",
        "(line 593,col 9)-(line 593,col 71)",
        "(line 594,col 9)-(line 594,col 75)",
        "(line 596,col 9)-(line 596,col 77)",
        "(line 597,col 9)-(line 597,col 76)",
        "(line 598,col 9)-(line 598,col 44)",
        "(line 599,col 9)-(line 599,col 45)",
        "(line 600,col 9)-(line 600,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 606,
      "end_line": 637,
      "comment": "\n     * Exact (caching) recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 612,col 9)",
        "(line 613,col 9)-(line 613,col 25)",
        "(line 614,col 9)-(line 628,col 9)",
        "(line 629,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 634,col 9)",
        "(line 635,col 9)-(line 635,col 75)",
        "(line 636,col 9)-(line 636,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.factorial(int)",
      "begin_line": 642,
      "end_line": 648,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 24)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 647,col 9)-(line 647,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testAddAndCheckLongFailure(long, long)",
      "begin_line": 650,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 651,col 9)-(line 656,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testMulAndCheckLongFailure(long, long)",
      "begin_line": 659,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 665,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.ArithmeticUtilsTest.testSubAndCheckLongFailure(long, long)",
      "begin_line": 668,
      "end_line": 676,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 674,col 9)"
      ]
    }
  ]
}
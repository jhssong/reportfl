{
  "filepath": "/tmp/Math-104b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 32,
      "end_line": 770,
      "comment": "\n * Test cases for the MathUtils class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 34,
      "end_line": 36,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.suite()",
      "begin_line": 38,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 61)",
        "(line 40,col 9)-(line 40,col 41)",
        "(line 41,col 9)-(line 41,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 44,
      "end_line": 56,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 36)",
        "(line 46,col 9)-(line 46,col 39)",
        "(line 47,col 9)-(line 47,col 57)",
        "(line 48,col 9)-(line 51,col 43)",
        "(line 52,col 9)-(line 55,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 58,
      "end_line": 70,
      "comment": "",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 36)",
        "(line 60,col 9)-(line 60,col 39)",
        "(line 61,col 9)-(line 61,col 57)",
        "(line 62,col 9)-(line 65,col 43)",
        "(line 66,col 9)-(line 69,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 72,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 36)",
        "(line 74,col 9)-(line 74,col 39)",
        "(line 75,col 9)-(line 75,col 57)",
        "(line 76,col 9)-(line 79,col 43)",
        "(line 80,col 9)-(line 83,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 86,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 36)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 94,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 97,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 40)",
        "(line 99,col 9)-(line 99,col 43)",
        "(line 100,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 107,col 9)",
        "(line 109,col 9)-(line 119,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 131,
      "end_line": 135,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 71)",
        "(line 133,col 9)-(line 133,col 68)",
        "(line 134,col 9)-(line 134,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 137,
      "end_line": 167,
      "comment": "",
      "child_ranges": [
        "(line 138,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 150,col 9)",
        "(line 152,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 65)",
        "(line 165,col 9)-(line 166,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 169,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 170,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 177,col 53)",
        "(line 178,col 9)-(line 178,col 69)",
        "(line 179,col 9)-(line 179,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 182,
      "end_line": 209,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 208,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 215,
      "end_line": 224,
      "comment": "\n     * Exact recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 221,col 9)",
        "(line 222,col 9)-(line 223,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.findBinomialLimits()",
      "begin_line": 236,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 35)",
        "(line 241,col 9)-(line 241,col 22)",
        "(line 242,col 9)-(line 251,col 9)",
        "(line 256,col 9)-(line 256,col 27)",
        "(line 257,col 9)-(line 257,col 18)",
        "(line 258,col 9)-(line 266,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.findFactorialLimits()",
      "begin_line": 279,
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 35)",
        "(line 284,col 9)-(line 284,col 22)",
        "(line 285,col 9)-(line 294,col 9)",
        "(line 299,col 9)-(line 299,col 27)",
        "(line 300,col 9)-(line 300,col 18)",
        "(line 301,col 9)-(line 309,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 316,
      "end_line": 322,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 24)",
        "(line 318,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 321,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 324,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 28)",
        "(line 326,col 9)-(line 326,col 64)",
        "(line 327,col 9)-(line 327,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 330,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 28)",
        "(line 332,col 9)-(line 332,col 66)",
        "(line 333,col 9)-(line 333,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 336,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 65)",
        "(line 338,col 9)-(line 338,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 341,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 67)",
        "(line 343,col 9)-(line 343,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 65)",
        "(line 348,col 9)-(line 348,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 351,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 55)",
        "(line 353,col 9)-(line 353,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 356,
      "end_line": 361,
      "comment": "",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 28)",
        "(line 358,col 9)-(line 358,col 64)",
        "(line 359,col 9)-(line 359,col 64)",
        "(line 360,col 9)-(line 360,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 363,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 28)",
        "(line 365,col 9)-(line 365,col 66)",
        "(line 366,col 9)-(line 366,col 66)",
        "(line 367,col 9)-(line 367,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 370,
      "end_line": 374,
      "comment": "",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 65)",
        "(line 372,col 9)-(line 372,col 65)",
        "(line 373,col 9)-(line 373,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 376,
      "end_line": 380,
      "comment": "",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 67)",
        "(line 378,col 9)-(line 378,col 67)",
        "(line 379,col 9)-(line 379,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 382,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 65)",
        "(line 384,col 9)-(line 384,col 65)",
        "(line 385,col 9)-(line 385,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 388,
      "end_line": 392,
      "comment": "",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 55)",
        "(line 391,col 9)-(line 391,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 394,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 23)",
        "(line 396,col 9)-(line 396,col 35)",
        "(line 397,col 9)-(line 397,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 400,
      "end_line": 404,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 23)",
        "(line 402,col 9)-(line 402,col 35)",
        "(line 403,col 9)-(line 403,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 406,
      "end_line": 408,
      "comment": "",
      "child_ranges": [
        "(line 407,col 9)-(line 407,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 410,
      "end_line": 412,
      "comment": "",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 414,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 415,col 9)-(line 416,col 50)",
        "(line 417,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 430,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 433,col 52)",
        "(line 434,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 447,
      "end_line": 468,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 19)",
        "(line 449,col 9)-(line 449,col 19)",
        "(line 450,col 9)-(line 450,col 19)",
        "(line 452,col 9)-(line 452,col 45)",
        "(line 454,col 9)-(line 454,col 47)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 456,col 9)-(line 456,col 47)",
        "(line 457,col 9)-(line 457,col 47)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 48)",
        "(line 461,col 9)-(line 461,col 48)",
        "(line 462,col 9)-(line 462,col 48)",
        "(line 464,col 9)-(line 464,col 47)",
        "(line 465,col 9)-(line 465,col 47)",
        "(line 466,col 9)-(line 466,col 47)",
        "(line 467,col 9)-(line 467,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 470,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 19)",
        "(line 472,col 9)-(line 472,col 19)",
        "(line 473,col 9)-(line 473,col 19)",
        "(line 475,col 9)-(line 475,col 45)",
        "(line 476,col 9)-(line 476,col 45)",
        "(line 477,col 9)-(line 477,col 45)",
        "(line 478,col 9)-(line 478,col 45)",
        "(line 479,col 9)-(line 479,col 47)",
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 481,col 48)",
        "(line 482,col 9)-(line 482,col 48)",
        "(line 484,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 491,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 31)",
        "(line 493,col 9)-(line 493,col 56)",
        "(line 494,col 9)-(line 494,col 57)",
        "(line 495,col 9)-(line 495,col 58)",
        "(line 498,col 9)-(line 498,col 63)",
        "(line 499,col 9)-(line 499,col 63)",
        "(line 500,col 9)-(line 500,col 65)",
        "(line 501,col 9)-(line 501,col 65)",
        "(line 502,col 9)-(line 502,col 65)",
        "(line 503,col 9)-(line 503,col 65)",
        "(line 504,col 9)-(line 504,col 65)",
        "(line 506,col 9)-(line 506,col 82)",
        "(line 507,col 9)-(line 507,col 83)",
        "(line 508,col 9)-(line 508,col 84)",
        "(line 509,col 9)-(line 509,col 84)",
        "(line 510,col 9)-(line 510,col 85)",
        "(line 511,col 9)-(line 511,col 86)",
        "(line 513,col 9)-(line 513,col 79)",
        "(line 514,col 9)-(line 514,col 80)",
        "(line 515,col 9)-(line 515,col 81)",
        "(line 516,col 9)-(line 516,col 81)",
        "(line 517,col 9)-(line 517,col 82)",
        "(line 518,col 9)-(line 518,col 83)",
        "(line 520,col 9)-(line 520,col 80)",
        "(line 521,col 9)-(line 521,col 81)",
        "(line 522,col 9)-(line 522,col 82)",
        "(line 523,col 9)-(line 523,col 82)",
        "(line 524,col 9)-(line 524,col 83)",
        "(line 525,col 9)-(line 525,col 84)",
        "(line 527,col 9)-(line 527,col 84)",
        "(line 528,col 9)-(line 528,col 85)",
        "(line 529,col 9)-(line 529,col 86)",
        "(line 530,col 9)-(line 530,col 86)",
        "(line 531,col 9)-(line 531,col 87)",
        "(line 532,col 9)-(line 532,col 88)",
        "(line 533,col 9)-(line 533,col 91)",
        "(line 534,col 9)-(line 534,col 93)",
        "(line 536,col 9)-(line 536,col 84)",
        "(line 537,col 9)-(line 537,col 85)",
        "(line 538,col 9)-(line 538,col 86)",
        "(line 539,col 9)-(line 539,col 86)",
        "(line 540,col 9)-(line 540,col 87)",
        "(line 541,col 9)-(line 541,col 88)",
        "(line 542,col 9)-(line 542,col 91)",
        "(line 543,col 9)-(line 543,col 93)",
        "(line 544,col 9)-(line 544,col 91)",
        "(line 545,col 9)-(line 545,col 93)",
        "(line 547,col 9)-(line 547,col 82)",
        "(line 548,col 9)-(line 548,col 83)",
        "(line 549,col 9)-(line 549,col 84)",
        "(line 550,col 9)-(line 550,col 84)",
        "(line 551,col 9)-(line 551,col 85)",
        "(line 552,col 9)-(line 552,col 86)",
        "(line 553,col 9)-(line 553,col 89)",
        "(line 554,col 9)-(line 554,col 91)",
        "(line 556,col 9)-(line 556,col 92)",
        "(line 557,col 9)-(line 557,col 90)",
        "(line 559,col 9)-(line 564,col 9)",
        "(line 566,col 9)-(line 566,col 77)",
        "(line 567,col 9)-(line 567,col 78)",
        "(line 568,col 9)-(line 568,col 79)",
        "(line 569,col 9)-(line 569,col 79)",
        "(line 570,col 9)-(line 570,col 80)",
        "(line 571,col 9)-(line 571,col 81)",
        "(line 573,col 9)-(line 578,col 9)",
        "(line 581,col 9)-(line 581,col 79)",
        "(line 582,col 9)-(line 582,col 59)",
        "(line 583,col 9)-(line 583,col 97)",
        "(line 584,col 9)-(line 584,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfterSpecialCases()",
      "begin_line": 587,
      "end_line": 597,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 88)",
        "(line 589,col 9)-(line 589,col 88)",
        "(line 590,col 9)-(line 590,col 69)",
        "(line 591,col 9)-(line 591,col 104)",
        "(line 592,col 9)-(line 592,col 104)",
        "(line 593,col 9)-(line 593,col 71)",
        "(line 594,col 9)-(line 594,col 71)",
        "(line 595,col 9)-(line 595,col 71)",
        "(line 596,col 9)-(line 596,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testNextAfter()",
      "begin_line": 599,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 601,col 9)-(line 601,col 92)",
        "(line 604,col 9)-(line 604,col 108)",
        "(line 607,col 9)-(line 607,col 106)",
        "(line 610,col 9)-(line 610,col 108)",
        "(line 613,col 9)-(line 613,col 90)",
        "(line 616,col 9)-(line 616,col 92)",
        "(line 619,col 9)-(line 619,col 90)",
        "(line 622,col 9)-(line 622,col 92)",
        "(line 625,col 9)-(line 625,col 114)",
        "(line 628,col 9)-(line 628,col 115)",
        "(line 631,col 9)-(line 631,col 116)",
        "(line 634,col 9)-(line 634,col 116)",
        "(line 637,col 9)-(line 637,col 117)",
        "(line 640,col 9)-(line 640,col 117)",
        "(line 643,col 9)-(line 643,col 117)",
        "(line 646,col 9)-(line 646,col 118)",
        "(line 649,col 9)-(line 649,col 118)",
        "(line 652,col 9)-(line 652,col 117)",
        "(line 655,col 9)-(line 655,col 118)",
        "(line 658,col 9)-(line 658,col 119)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 662,
      "end_line": 769,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 31)",
        "(line 664,col 9)-(line 664,col 55)",
        "(line 665,col 9)-(line 665,col 56)",
        "(line 666,col 9)-(line 666,col 57)",
        "(line 669,col 9)-(line 669,col 60)",
        "(line 670,col 9)-(line 671,col 45)",
        "(line 672,col 9)-(line 672,col 25)",
        "(line 673,col 9)-(line 673,col 29)",
        "(line 674,col 9)-(line 674,col 56)",
        "(line 677,col 9)-(line 677,col 63)",
        "(line 678,col 9)-(line 678,col 63)",
        "(line 679,col 9)-(line 679,col 63)",
        "(line 680,col 9)-(line 680,col 63)",
        "(line 681,col 9)-(line 681,col 65)",
        "(line 682,col 9)-(line 682,col 65)",
        "(line 683,col 9)-(line 683,col 65)",
        "(line 684,col 9)-(line 684,col 65)",
        "(line 685,col 9)-(line 685,col 65)",
        "(line 687,col 9)-(line 687,col 81)",
        "(line 688,col 9)-(line 688,col 82)",
        "(line 689,col 9)-(line 689,col 83)",
        "(line 690,col 9)-(line 690,col 83)",
        "(line 691,col 9)-(line 691,col 84)",
        "(line 692,col 9)-(line 692,col 85)",
        "(line 694,col 9)-(line 694,col 78)",
        "(line 695,col 9)-(line 695,col 79)",
        "(line 696,col 9)-(line 696,col 80)",
        "(line 697,col 9)-(line 697,col 80)",
        "(line 698,col 9)-(line 698,col 81)",
        "(line 699,col 9)-(line 699,col 82)",
        "(line 701,col 9)-(line 701,col 79)",
        "(line 702,col 9)-(line 702,col 80)",
        "(line 703,col 9)-(line 703,col 81)",
        "(line 704,col 9)-(line 704,col 81)",
        "(line 705,col 9)-(line 705,col 82)",
        "(line 706,col 9)-(line 706,col 83)",
        "(line 708,col 9)-(line 708,col 83)",
        "(line 709,col 9)-(line 709,col 84)",
        "(line 710,col 9)-(line 710,col 85)",
        "(line 711,col 9)-(line 711,col 85)",
        "(line 712,col 9)-(line 712,col 86)",
        "(line 713,col 9)-(line 713,col 87)",
        "(line 714,col 9)-(line 714,col 89)",
        "(line 715,col 9)-(line 715,col 91)",
        "(line 717,col 9)-(line 717,col 83)",
        "(line 718,col 9)-(line 718,col 84)",
        "(line 719,col 9)-(line 719,col 85)",
        "(line 720,col 9)-(line 720,col 85)",
        "(line 721,col 9)-(line 721,col 86)",
        "(line 722,col 9)-(line 722,col 87)",
        "(line 723,col 9)-(line 723,col 89)",
        "(line 724,col 9)-(line 724,col 91)",
        "(line 725,col 9)-(line 725,col 89)",
        "(line 726,col 9)-(line 726,col 91)",
        "(line 728,col 9)-(line 728,col 81)",
        "(line 729,col 9)-(line 729,col 82)",
        "(line 730,col 9)-(line 730,col 83)",
        "(line 731,col 9)-(line 731,col 83)",
        "(line 732,col 9)-(line 732,col 84)",
        "(line 733,col 9)-(line 733,col 85)",
        "(line 734,col 9)-(line 734,col 87)",
        "(line 735,col 9)-(line 735,col 89)",
        "(line 737,col 9)-(line 737,col 90)",
        "(line 738,col 9)-(line 738,col 88)",
        "(line 740,col 9)-(line 745,col 9)",
        "(line 747,col 9)-(line 747,col 76)",
        "(line 748,col 9)-(line 748,col 77)",
        "(line 749,col 9)-(line 749,col 78)",
        "(line 750,col 9)-(line 750,col 78)",
        "(line 751,col 9)-(line 751,col 79)",
        "(line 752,col 9)-(line 752,col 80)",
        "(line 754,col 9)-(line 759,col 9)",
        "(line 762,col 9)-(line 762,col 87)",
        "(line 765,col 9)-(line 765,col 80)",
        "(line 766,col 9)-(line 766,col 56)",
        "(line 767,col 9)-(line 767,col 98)",
        "(line 768,col 9)-(line 768,col 98)"
      ]
    }
  ]
}
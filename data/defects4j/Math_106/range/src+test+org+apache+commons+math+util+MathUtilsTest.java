{
  "filepath": "/tmp/Math-106b/src/test/org/apache/commons/math/util/MathUtilsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MathUtilsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 681,
      "comment": "\n * Test cases for the MathUtils class.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.util.MathUtilsTest.MathUtilsTest(java.lang.String)",
      "begin_line": 33,
      "end_line": 35,
      "comment": "",
      "child_ranges": [
        "(line 34,col 9)-(line 34,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.suite()",
      "begin_line": 37,
      "end_line": 41,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 61)",
        "(line 39,col 9)-(line 39,col 41)",
        "(line 40,col 9)-(line 40,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testAddAndCheck()",
      "begin_line": 43,
      "end_line": 55,
      "comment": "",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 36)",
        "(line 45,col 9)-(line 45,col 39)",
        "(line 46,col 9)-(line 46,col 57)",
        "(line 47,col 9)-(line 50,col 43)",
        "(line 51,col 9)-(line 54,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testMulAndCheck()",
      "begin_line": 57,
      "end_line": 69,
      "comment": "",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 36)",
        "(line 59,col 9)-(line 59,col 39)",
        "(line 60,col 9)-(line 60,col 57)",
        "(line 61,col 9)-(line 64,col 43)",
        "(line 65,col 9)-(line 68,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheck()",
      "begin_line": 71,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 36)",
        "(line 73,col 9)-(line 73,col 39)",
        "(line 74,col 9)-(line 74,col 57)",
        "(line 75,col 9)-(line 78,col 43)",
        "(line 79,col 9)-(line 82,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSubAndCheckErrorMessage()",
      "begin_line": 85,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 36)",
        "(line 87,col 9)-(line 87,col 39)",
        "(line 88,col 9)-(line 93,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficient()",
      "begin_line": 96,
      "end_line": 127,
      "comment": "",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 43)",
        "(line 99,col 9)-(line 102,col 9)",
        "(line 103,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 118,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.test0Choose0()",
      "begin_line": 130,
      "end_line": 134,
      "comment": " Verify that b(0,0) \u003d 1 ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 71)",
        "(line 132,col 9)-(line 132,col 68)",
        "(line 133,col 9)-(line 133,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testBinomialCoefficientFail()",
      "begin_line": 136,
      "end_line": 166,
      "comment": "",
      "child_ranges": [
        "(line 137,col 9)-(line 142,col 9)",
        "(line 144,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 65)",
        "(line 164,col 9)-(line 165,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorial()",
      "begin_line": 168,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 177,col 69)",
        "(line 178,col 9)-(line 178,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testFactorialFail()",
      "begin_line": 181,
      "end_line": 208,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 207,col 63)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.binomialCoefficient(int, int)",
      "begin_line": 214,
      "end_line": 223,
      "comment": "\n     * Exact recursive implementation to test against\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 222,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.findBinomialLimits()",
      "begin_line": 235,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 35)",
        "(line 240,col 9)-(line 240,col 22)",
        "(line 241,col 9)-(line 250,col 9)",
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 18)",
        "(line 257,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.findFactorialLimits()",
      "begin_line": 278,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 35)",
        "(line 283,col 9)-(line 283,col 22)",
        "(line 284,col 9)-(line 293,col 9)",
        "(line 298,col 9)-(line 298,col 27)",
        "(line 299,col 9)-(line 299,col 18)",
        "(line 300,col 9)-(line 308,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.factorial(int)",
      "begin_line": 315,
      "end_line": 321,
      "comment": "\n     * Exact direct multiplication implementation to test against\n     ",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 24)",
        "(line 317,col 9)-(line 319,col 9)",
        "(line 320,col 9)-(line 320,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignDouble()",
      "begin_line": 323,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 28)",
        "(line 325,col 9)-(line 325,col 64)",
        "(line 326,col 9)-(line 326,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignFloat()",
      "begin_line": 329,
      "end_line": 333,
      "comment": "",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 28)",
        "(line 331,col 9)-(line 331,col 66)",
        "(line 332,col 9)-(line 332,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignByte()",
      "begin_line": 335,
      "end_line": 338,
      "comment": "",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 65)",
        "(line 337,col 9)-(line 337,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignShort()",
      "begin_line": 340,
      "end_line": 343,
      "comment": "",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 67)",
        "(line 342,col 9)-(line 342,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignInt()",
      "begin_line": 345,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 65)",
        "(line 347,col 9)-(line 347,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSignLong()",
      "begin_line": 350,
      "end_line": 353,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 55)",
        "(line 352,col 9)-(line 352,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorDouble()",
      "begin_line": 355,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 28)",
        "(line 357,col 9)-(line 357,col 64)",
        "(line 358,col 9)-(line 358,col 64)",
        "(line 359,col 9)-(line 359,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorFloat()",
      "begin_line": 362,
      "end_line": 367,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 28)",
        "(line 364,col 9)-(line 364,col 66)",
        "(line 365,col 9)-(line 365,col 66)",
        "(line 366,col 9)-(line 366,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorByte()",
      "begin_line": 369,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 65)",
        "(line 371,col 9)-(line 371,col 65)",
        "(line 372,col 9)-(line 372,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorShort()",
      "begin_line": 375,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 67)",
        "(line 377,col 9)-(line 377,col 67)",
        "(line 378,col 9)-(line 378,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorInt()",
      "begin_line": 381,
      "end_line": 385,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 65)",
        "(line 383,col 9)-(line 383,col 65)",
        "(line 384,col 9)-(line 384,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testIndicatorLong()",
      "begin_line": 387,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 55)",
        "(line 389,col 9)-(line 389,col 55)",
        "(line 390,col 9)-(line 390,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCosh()",
      "begin_line": 393,
      "end_line": 397,
      "comment": "",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 23)",
        "(line 395,col 9)-(line 395,col 35)",
        "(line 396,col 9)-(line 396,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinh()",
      "begin_line": 399,
      "end_line": 403,
      "comment": "",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 23)",
        "(line 401,col 9)-(line 401,col 35)",
        "(line 402,col 9)-(line 402,col 58)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testCoshNaN()",
      "begin_line": 405,
      "end_line": 407,
      "comment": "",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testSinhNaN()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testEquals()",
      "begin_line": 413,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 415,col 50)",
        "(line 416,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testHash()",
      "begin_line": 429,
      "end_line": 444,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 432,col 52)",
        "(line 433,col 9)-(line 443,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testGcd()",
      "begin_line": 446,
      "end_line": 467,
      "comment": "",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 19)",
        "(line 448,col 9)-(line 448,col 19)",
        "(line 449,col 9)-(line 449,col 19)",
        "(line 451,col 9)-(line 451,col 45)",
        "(line 453,col 9)-(line 453,col 47)",
        "(line 454,col 9)-(line 454,col 47)",
        "(line 455,col 9)-(line 455,col 47)",
        "(line 456,col 9)-(line 456,col 47)",
        "(line 458,col 9)-(line 458,col 48)",
        "(line 459,col 9)-(line 459,col 48)",
        "(line 460,col 9)-(line 460,col 48)",
        "(line 461,col 9)-(line 461,col 48)",
        "(line 463,col 9)-(line 463,col 47)",
        "(line 464,col 9)-(line 464,col 47)",
        "(line 465,col 9)-(line 465,col 47)",
        "(line 466,col 9)-(line 466,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testLcm()",
      "begin_line": 469,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 19)",
        "(line 471,col 9)-(line 471,col 19)",
        "(line 472,col 9)-(line 472,col 19)",
        "(line 474,col 9)-(line 474,col 45)",
        "(line 475,col 9)-(line 475,col 45)",
        "(line 476,col 9)-(line 476,col 45)",
        "(line 477,col 9)-(line 477,col 45)",
        "(line 478,col 9)-(line 478,col 47)",
        "(line 479,col 9)-(line 479,col 48)",
        "(line 480,col 9)-(line 480,col 48)",
        "(line 481,col 9)-(line 481,col 48)",
        "(line 483,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundFloat()",
      "begin_line": 490,
      "end_line": 584,
      "comment": "",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 31)",
        "(line 492,col 9)-(line 492,col 56)",
        "(line 493,col 9)-(line 493,col 57)",
        "(line 494,col 9)-(line 494,col 58)",
        "(line 497,col 9)-(line 497,col 63)",
        "(line 498,col 9)-(line 498,col 63)",
        "(line 499,col 9)-(line 499,col 65)",
        "(line 500,col 9)-(line 500,col 65)",
        "(line 501,col 9)-(line 501,col 65)",
        "(line 502,col 9)-(line 502,col 65)",
        "(line 503,col 9)-(line 503,col 65)",
        "(line 505,col 9)-(line 505,col 82)",
        "(line 506,col 9)-(line 506,col 83)",
        "(line 507,col 9)-(line 507,col 84)",
        "(line 508,col 9)-(line 508,col 84)",
        "(line 509,col 9)-(line 509,col 85)",
        "(line 510,col 9)-(line 510,col 86)",
        "(line 512,col 9)-(line 512,col 79)",
        "(line 513,col 9)-(line 513,col 80)",
        "(line 514,col 9)-(line 514,col 81)",
        "(line 515,col 9)-(line 515,col 81)",
        "(line 516,col 9)-(line 516,col 82)",
        "(line 517,col 9)-(line 517,col 83)",
        "(line 519,col 9)-(line 519,col 80)",
        "(line 520,col 9)-(line 520,col 81)",
        "(line 521,col 9)-(line 521,col 82)",
        "(line 522,col 9)-(line 522,col 82)",
        "(line 523,col 9)-(line 523,col 83)",
        "(line 524,col 9)-(line 524,col 84)",
        "(line 526,col 9)-(line 526,col 84)",
        "(line 527,col 9)-(line 527,col 85)",
        "(line 528,col 9)-(line 528,col 86)",
        "(line 529,col 9)-(line 529,col 86)",
        "(line 530,col 9)-(line 530,col 87)",
        "(line 531,col 9)-(line 531,col 88)",
        "(line 532,col 9)-(line 532,col 91)",
        "(line 533,col 9)-(line 533,col 93)",
        "(line 535,col 9)-(line 535,col 84)",
        "(line 536,col 9)-(line 536,col 85)",
        "(line 537,col 9)-(line 537,col 86)",
        "(line 538,col 9)-(line 538,col 86)",
        "(line 539,col 9)-(line 539,col 87)",
        "(line 540,col 9)-(line 540,col 88)",
        "(line 541,col 9)-(line 541,col 91)",
        "(line 542,col 9)-(line 542,col 93)",
        "(line 543,col 9)-(line 543,col 91)",
        "(line 544,col 9)-(line 544,col 93)",
        "(line 546,col 9)-(line 546,col 82)",
        "(line 547,col 9)-(line 547,col 83)",
        "(line 548,col 9)-(line 548,col 84)",
        "(line 549,col 9)-(line 549,col 84)",
        "(line 550,col 9)-(line 550,col 85)",
        "(line 551,col 9)-(line 551,col 86)",
        "(line 552,col 9)-(line 552,col 89)",
        "(line 553,col 9)-(line 553,col 91)",
        "(line 555,col 9)-(line 555,col 92)",
        "(line 556,col 9)-(line 556,col 90)",
        "(line 558,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 77)",
        "(line 566,col 9)-(line 566,col 78)",
        "(line 567,col 9)-(line 567,col 79)",
        "(line 568,col 9)-(line 568,col 79)",
        "(line 569,col 9)-(line 569,col 80)",
        "(line 570,col 9)-(line 570,col 81)",
        "(line 572,col 9)-(line 577,col 9)",
        "(line 580,col 9)-(line 580,col 79)",
        "(line 581,col 9)-(line 581,col 59)",
        "(line 582,col 9)-(line 582,col 97)",
        "(line 583,col 9)-(line 583,col 97)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.util.MathUtilsTest.testRoundDouble()",
      "begin_line": 586,
      "end_line": 680,
      "comment": "",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 31)",
        "(line 588,col 9)-(line 588,col 55)",
        "(line 589,col 9)-(line 589,col 56)",
        "(line 590,col 9)-(line 590,col 57)",
        "(line 593,col 9)-(line 593,col 63)",
        "(line 594,col 9)-(line 594,col 63)",
        "(line 595,col 9)-(line 595,col 65)",
        "(line 596,col 9)-(line 596,col 65)",
        "(line 597,col 9)-(line 597,col 65)",
        "(line 598,col 9)-(line 598,col 65)",
        "(line 599,col 9)-(line 599,col 65)",
        "(line 601,col 9)-(line 601,col 81)",
        "(line 602,col 9)-(line 602,col 82)",
        "(line 603,col 9)-(line 603,col 83)",
        "(line 604,col 9)-(line 604,col 83)",
        "(line 605,col 9)-(line 605,col 84)",
        "(line 606,col 9)-(line 606,col 85)",
        "(line 608,col 9)-(line 608,col 78)",
        "(line 609,col 9)-(line 609,col 79)",
        "(line 610,col 9)-(line 610,col 80)",
        "(line 611,col 9)-(line 611,col 80)",
        "(line 612,col 9)-(line 612,col 81)",
        "(line 613,col 9)-(line 613,col 82)",
        "(line 615,col 9)-(line 615,col 79)",
        "(line 616,col 9)-(line 616,col 80)",
        "(line 617,col 9)-(line 617,col 81)",
        "(line 618,col 9)-(line 618,col 81)",
        "(line 619,col 9)-(line 619,col 82)",
        "(line 620,col 9)-(line 620,col 83)",
        "(line 622,col 9)-(line 622,col 83)",
        "(line 623,col 9)-(line 623,col 84)",
        "(line 624,col 9)-(line 624,col 85)",
        "(line 625,col 9)-(line 625,col 85)",
        "(line 626,col 9)-(line 626,col 86)",
        "(line 627,col 9)-(line 627,col 87)",
        "(line 628,col 9)-(line 628,col 89)",
        "(line 629,col 9)-(line 629,col 91)",
        "(line 631,col 9)-(line 631,col 83)",
        "(line 632,col 9)-(line 632,col 84)",
        "(line 633,col 9)-(line 633,col 85)",
        "(line 634,col 9)-(line 634,col 85)",
        "(line 635,col 9)-(line 635,col 86)",
        "(line 636,col 9)-(line 636,col 87)",
        "(line 637,col 9)-(line 637,col 89)",
        "(line 638,col 9)-(line 638,col 91)",
        "(line 639,col 9)-(line 639,col 89)",
        "(line 640,col 9)-(line 640,col 91)",
        "(line 642,col 9)-(line 642,col 81)",
        "(line 643,col 9)-(line 643,col 82)",
        "(line 644,col 9)-(line 644,col 83)",
        "(line 645,col 9)-(line 645,col 83)",
        "(line 646,col 9)-(line 646,col 84)",
        "(line 647,col 9)-(line 647,col 85)",
        "(line 648,col 9)-(line 648,col 87)",
        "(line 649,col 9)-(line 649,col 89)",
        "(line 651,col 9)-(line 651,col 90)",
        "(line 652,col 9)-(line 652,col 88)",
        "(line 654,col 9)-(line 659,col 9)",
        "(line 661,col 9)-(line 661,col 76)",
        "(line 662,col 9)-(line 662,col 77)",
        "(line 663,col 9)-(line 663,col 78)",
        "(line 664,col 9)-(line 664,col 78)",
        "(line 665,col 9)-(line 665,col 79)",
        "(line 666,col 9)-(line 666,col 80)",
        "(line 668,col 9)-(line 673,col 9)",
        "(line 676,col 9)-(line 676,col 80)",
        "(line 677,col 9)-(line 677,col 56)",
        "(line 678,col 9)-(line 678,col 98)",
        "(line 679,col 9)-(line 679,col 98)"
      ]
    }
  ]
}
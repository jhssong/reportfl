{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 681,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 41,
      "end_line": 49,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 55,
      "end_line": 59,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 65,
      "end_line": 67,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint1"
      ],
      "begin_line": 89,
      "end_line": 101,
      "comment": "\n     * Data from NIST NOINT1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint2"
      ],
      "begin_line": 107,
      "end_line": 111,
      "comment": "\n     * Data from NIST NOINT2\n     *\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testAppend()",
      "begin_line": 119,
      "end_line": 123,
      "comment": "\n     * Test that the SimpleRegression objects generated from combining two\n     * SimpleRegression objects created from subsets of data are identical to\n     * SimpleRegression objects created from the combined data.\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 21)",
        "(line 122,col 9)-(line 122,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.check(boolean)",
      "begin_line": 132,
      "end_line": 150,
      "comment": "\n     * Checks that adding data to a single model gives the same result\n     * as adding \"parts\" of the dataset to smaller models and using append\n     * to aggregate the smaller models.\n     *\n     * @param includeIntercept\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 27)",
        "(line 134,col 9)-(line 134,col 54)",
        "(line 135,col 9)-(line 135,col 78)",
        "(line 136,col 9)-(line 136,col 78)",
        "(line 138,col 9)-(line 149,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.equals(org.apache.commons.math3.stat.regression.SimpleRegression, org.apache.commons.math3.stat.regression.SimpleRegression, double)",
      "begin_line": 161,
      "end_line": 208,
      "comment": "\n     * Returns true iff the statistics reported by model1 are all within tol of\n     * those reported by model2.\n     *\n     * @param model1 first model\n     * @param model2 second model\n     * @param tol tolerance\n     * @return true if the two models report the same regression stats\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 191,col 9)",
        "(line 192,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 198,col 9)-(line 200,col 9)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 207,col 9)-(line 207,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressIfaceMethod()",
      "begin_line": 210,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 71)",
        "(line 213,col 9)-(line 213,col 66)",
        "(line 214,col 9)-(line 214,col 79)",
        "(line 215,col 9)-(line 215,col 80)",
        "(line 216,col 9)-(line 220,col 9)",
        "(line 223,col 9)-(line 223,col 59)",
        "(line 224,col 9)-(line 224,col 38)",
        "(line 225,col 9)-(line 225,col 110)",
        "(line 226,col 9)-(line 226,col 123)",
        "(line 227,col 9)-(line 227,col 102)",
        "(line 228,col 9)-(line 228,col 115)",
        "(line 229,col 9)-(line 229,col 88)",
        "(line 230,col 9)-(line 230,col 96)",
        "(line 231,col 9)-(line 231,col 117)",
        "(line 232,col 9)-(line 232,col 107)",
        "(line 233,col 9)-(line 233,col 108)",
        "(line 236,col 9)-(line 236,col 72)",
        "(line 237,col 9)-(line 237,col 36)",
        "(line 238,col 9)-(line 238,col 105)",
        "(line 239,col 9)-(line 239,col 118)",
        "(line 240,col 9)-(line 240,col 91)",
        "(line 241,col 9)-(line 241,col 99)",
        "(line 242,col 9)-(line 242,col 119)",
        "(line 243,col 9)-(line 243,col 110)",
        "(line 244,col 9)-(line 244,col 111)",
        "(line 246,col 9)-(line 246,col 72)",
        "(line 247,col 9)-(line 247,col 38)",
        "(line 248,col 9)-(line 248,col 109)",
        "(line 249,col 9)-(line 249,col 122)",
        "(line 250,col 9)-(line 250,col 95)",
        "(line 251,col 9)-(line 251,col 103)",
        "(line 252,col 9)-(line 252,col 114)",
        "(line 253,col 9)-(line 253,col 123)",
        "(line 254,col 9)-(line 254,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressExceptions()",
      "begin_line": 261,
      "end_line": 340,
      "comment": "\n     * Verify that regress generates exceptions as advertised for bad model specifications.\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 77)",
        "(line 265,col 9)-(line 265,col 60)",
        "(line 266,col 9)-(line 266,col 60)",
        "(line 267,col 9)-(line 267,col 60)",
        "(line 268,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 291,col 9)",
        "(line 294,col 9)-(line 294,col 71)",
        "(line 295,col 9)-(line 295,col 55)",
        "(line 296,col 9)-(line 296,col 55)",
        "(line 297,col 9)-(line 297,col 55)",
        "(line 298,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 309,col 9)",
        "(line 310,col 9)-(line 315,col 9)",
        "(line 316,col 9)-(line 321,col 9)",
        "(line 322,col 9)-(line 327,col 9)",
        "(line 328,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 339,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoInterceot_noint2()",
      "begin_line": 342,
      "end_line": 362,
      "comment": "",
      "child_ranges": [
        "(line 344,col 10)-(line 344,col 67)",
        "(line 345,col 10)-(line 345,col 56)",
        "(line 346,col 10)-(line 346,col 56)",
        "(line 347,col 10)-(line 347,col 56)",
        "(line 348,col 10)-(line 348,col 75)",
        "(line 349,col 10)-(line 350,col 48)",
        "(line 351,col 10)-(line 352,col 52)",
        "(line 353,col 9)-(line 353,col 76)",
        "(line 354,col 9)-(line 355,col 45)",
        "(line 356,col 9)-(line 357,col 57)",
        "(line 358,col 9)-(line 359,col 53)",
        "(line 360,col 9)-(line 361,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoIntercept_noint1()",
      "begin_line": 364,
      "end_line": 384,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 66)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 74)",
        "(line 371,col 9)-(line 371,col 86)",
        "(line 372,col 9)-(line 373,col 52)",
        "(line 374,col 9)-(line 374,col 77)",
        "(line 375,col 9)-(line 376,col 45)",
        "(line 377,col 9)-(line 378,col 57)",
        "(line 379,col 9)-(line 380,col 53)",
        "(line 381,col 9)-(line 382,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 386,
      "end_line": 416,
      "comment": "",
      "child_ranges": [
        "(line 388,col 9)-(line 388,col 61)",
        "(line 389,col 9)-(line 391,col 9)",
        "(line 394,col 9)-(line 394,col 86)",
        "(line 395,col 9)-(line 396,col 52)",
        "(line 397,col 9)-(line 397,col 77)",
        "(line 398,col 9)-(line 399,col 46)",
        "(line 400,col 9)-(line 401,col 52)",
        "(line 402,col 9)-(line 403,col 45)",
        "(line 404,col 9)-(line 405,col 57)",
        "(line 406,col 9)-(line 407,col 53)",
        "(line 408,col 9)-(line 409,col 52)",
        "(line 412,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 415,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 418,
      "end_line": 425,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 61)",
        "(line 421,col 9)-(line 421,col 37)",
        "(line 422,col 9)-(line 422,col 77)",
        "(line 423,col 9)-(line 423,col 81)",
        "(line 424,col 9)-(line 424,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 427,
      "end_line": 484,
      "comment": "",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 61)",
        "(line 430,col 9)-(line 430,col 88)",
        "(line 431,col 9)-(line 431,col 80)",
        "(line 432,col 9)-(line 432,col 94)",
        "(line 433,col 9)-(line 433,col 102)",
        "(line 434,col 9)-(line 434,col 88)",
        "(line 435,col 9)-(line 435,col 72)",
        "(line 436,col 9)-(line 436,col 85)",
        "(line 437,col 9)-(line 437,col 94)",
        "(line 438,col 9)-(line 438,col 88)",
        "(line 439,col 9)-(line 439,col 89)",
        "(line 440,col 9)-(line 440,col 82)",
        "(line 442,col 9)-(line 442,col 33)",
        "(line 443,col 9)-(line 443,col 33)",
        "(line 446,col 9)-(line 446,col 88)",
        "(line 447,col 9)-(line 447,col 80)",
        "(line 448,col 9)-(line 448,col 94)",
        "(line 449,col 9)-(line 449,col 102)",
        "(line 450,col 9)-(line 450,col 88)",
        "(line 451,col 9)-(line 451,col 72)",
        "(line 452,col 9)-(line 452,col 85)",
        "(line 453,col 9)-(line 453,col 93)",
        "(line 454,col 9)-(line 454,col 89)",
        "(line 455,col 9)-(line 455,col 82)",
        "(line 458,col 9)-(line 458,col 86)",
        "(line 460,col 9)-(line 460,col 44)",
        "(line 462,col 9)-(line 462,col 33)",
        "(line 463,col 9)-(line 463,col 33)",
        "(line 466,col 9)-(line 466,col 84)",
        "(line 467,col 9)-(line 467,col 77)",
        "(line 468,col 9)-(line 468,col 94)",
        "(line 469,col 9)-(line 469,col 102)",
        "(line 470,col 9)-(line 470,col 88)",
        "(line 471,col 9)-(line 471,col 69)",
        "(line 472,col 9)-(line 472,col 82)",
        "(line 473,col 9)-(line 473,col 90)",
        "(line 474,col 9)-(line 474,col 86)",
        "(line 475,col 9)-(line 475,col 86)",
        "(line 476,col 9)-(line 476,col 79)",
        "(line 478,col 9)-(line 478,col 33)",
        "(line 481,col 9)-(line 481,col 85)",
        "(line 482,col 9)-(line 482,col 91)",
        "(line 483,col 9)-(line 483,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 486,
      "end_line": 497,
      "comment": "",
      "child_ranges": [
        "(line 488,col 9)-(line 488,col 61)",
        "(line 489,col 9)-(line 489,col 37)",
        "(line 490,col 9)-(line 490,col 77)",
        "(line 491,col 9)-(line 491,col 27)",
        "(line 492,col 9)-(line 492,col 76)",
        "(line 493,col 9)-(line 493,col 37)",
        "(line 494,col 9)-(line 494,col 81)",
        "(line 495,col 9)-(line 495,col 33)",
        "(line 496,col 9)-(line 496,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 499,
      "end_line": 537,
      "comment": "",
      "child_ranges": [
        "(line 503,col 9)-(line 503,col 61)",
        "(line 504,col 9)-(line 504,col 36)",
        "(line 505,col 9)-(line 506,col 52)",
        "(line 507,col 9)-(line 508,col 54)",
        "(line 509,col 9)-(line 510,col 51)",
        "(line 511,col 9)-(line 512,col 62)",
        "(line 514,col 9)-(line 514,col 44)",
        "(line 515,col 9)-(line 515,col 37)",
        "(line 516,col 9)-(line 517,col 51)",
        "(line 518,col 9)-(line 519,col 54)",
        "(line 520,col 9)-(line 521,col 52)",
        "(line 522,col 9)-(line 523,col 62)",
        "(line 527,col 9)-(line 528,col 103)",
        "(line 530,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 539,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 61)",
        "(line 542,col 9)-(line 542,col 20)",
        "(line 543,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 71)",
        "(line 547,col 9)-(line 547,col 55)",
        "(line 548,col 9)-(line 548,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 551,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 61)",
        "(line 554,col 9)-(line 554,col 20)",
        "(line 555,col 9)-(line 557,col 9)",
        "(line 559,col 9)-(line 559,col 71)",
        "(line 560,col 9)-(line 560,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 563,
      "end_line": 574,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 61)",
        "(line 566,col 9)-(line 566,col 38)",
        "(line 567,col 9)-(line 567,col 20)",
        "(line 568,col 9)-(line 570,col 9)",
        "(line 572,col 9)-(line 573,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 578,
      "end_line": 587,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 54)",
        "(line 581,col 9)-(line 581,col 69)",
        "(line 582,col 9)-(line 582,col 54)",
        "(line 583,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 590,
      "end_line": 606,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 61)",
        "(line 594,col 9)-(line 594,col 36)",
        "(line 595,col 9)-(line 595,col 48)",
        "(line 596,col 9)-(line 596,col 45)",
        "(line 598,col 9)-(line 599,col 52)",
        "(line 600,col 9)-(line 601,col 54)",
        "(line 602,col 9)-(line 603,col 51)",
        "(line 604,col 9)-(line 605,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 610,
      "end_line": 626,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 613,col 9)-(line 613,col 61)",
        "(line 614,col 9)-(line 614,col 36)",
        "(line 615,col 9)-(line 615,col 44)",
        "(line 616,col 9)-(line 616,col 41)",
        "(line 618,col 9)-(line 619,col 52)",
        "(line 620,col 9)-(line 621,col 54)",
        "(line 622,col 9)-(line 623,col 51)",
        "(line 624,col 9)-(line 625,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 629,
      "end_line": 645,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 632,col 9)-(line 632,col 61)",
        "(line 633,col 9)-(line 633,col 36)",
        "(line 634,col 9)-(line 634,col 46)",
        "(line 635,col 9)-(line 635,col 43)",
        "(line 637,col 9)-(line 638,col 52)",
        "(line 639,col 9)-(line 640,col 54)",
        "(line 641,col 9)-(line 642,col 51)",
        "(line 643,col 9)-(line 644,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 648,
      "end_line": 653,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 650,col 9)-(line 650,col 61)",
        "(line 651,col 9)-(line 651,col 48)",
        "(line 652,col 9)-(line 652,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 656,
      "end_line": 662,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 61)",
        "(line 659,col 9)-(line 659,col 45)",
        "(line 660,col 9)-(line 660,col 48)",
        "(line 661,col 9)-(line 661,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 665,
      "end_line": 671,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 61)",
        "(line 668,col 9)-(line 668,col 43)",
        "(line 669,col 9)-(line 669,col 46)",
        "(line 670,col 9)-(line 670,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 674,
      "end_line": 680,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 61)",
        "(line 677,col 9)-(line 677,col 45)",
        "(line 678,col 9)-(line 678,col 46)",
        "(line 679,col 9)-(line 679,col 50)"
      ]
    }
  ]
}
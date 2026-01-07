{
  "filepath": "/tmp/Math-11b/src/test/java/org/apache/commons/math3/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 583,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 40,
      "end_line": 48,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 80,
      "end_line": 82,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint1"
      ],
      "begin_line": 88,
      "end_line": 100,
      "comment": "\n     * Data from NIST NOINT1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint2"
      ],
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Data from NIST NOINT2\n     *\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressIfaceMethod()",
      "begin_line": 112,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 71)",
        "(line 115,col 9)-(line 115,col 66)",
        "(line 116,col 9)-(line 116,col 79)",
        "(line 117,col 9)-(line 117,col 80)",
        "(line 118,col 9)-(line 122,col 9)",
        "(line 125,col 9)-(line 125,col 59)",
        "(line 126,col 9)-(line 126,col 38)",
        "(line 127,col 9)-(line 127,col 110)",
        "(line 128,col 9)-(line 128,col 123)",
        "(line 129,col 9)-(line 129,col 102)",
        "(line 130,col 9)-(line 130,col 115)",
        "(line 131,col 9)-(line 131,col 88)",
        "(line 132,col 9)-(line 132,col 96)",
        "(line 133,col 9)-(line 133,col 117)",
        "(line 134,col 9)-(line 134,col 107)",
        "(line 135,col 9)-(line 135,col 108)",
        "(line 138,col 9)-(line 138,col 72)",
        "(line 139,col 9)-(line 139,col 36)",
        "(line 140,col 9)-(line 140,col 105)",
        "(line 141,col 9)-(line 141,col 118)",
        "(line 142,col 9)-(line 142,col 91)",
        "(line 143,col 9)-(line 143,col 99)",
        "(line 144,col 9)-(line 144,col 119)",
        "(line 145,col 9)-(line 145,col 110)",
        "(line 146,col 9)-(line 146,col 111)",
        "(line 148,col 9)-(line 148,col 72)",
        "(line 149,col 9)-(line 149,col 38)",
        "(line 150,col 9)-(line 150,col 109)",
        "(line 151,col 9)-(line 151,col 122)",
        "(line 152,col 9)-(line 152,col 95)",
        "(line 153,col 9)-(line 153,col 103)",
        "(line 154,col 9)-(line 154,col 114)",
        "(line 155,col 9)-(line 155,col 123)",
        "(line 156,col 9)-(line 156,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressExceptions()",
      "begin_line": 163,
      "end_line": 242,
      "comment": "\n     * Verify that regress generates exceptions as advertised for bad model specifications.\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 77)",
        "(line 167,col 9)-(line 167,col 60)",
        "(line 168,col 9)-(line 168,col 60)",
        "(line 169,col 9)-(line 169,col 60)",
        "(line 170,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 193,col 9)",
        "(line 196,col 9)-(line 196,col 71)",
        "(line 197,col 9)-(line 197,col 55)",
        "(line 198,col 9)-(line 198,col 55)",
        "(line 199,col 9)-(line 199,col 55)",
        "(line 200,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoInterceot_noint2()",
      "begin_line": 244,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 246,col 10)-(line 246,col 67)",
        "(line 247,col 10)-(line 247,col 56)",
        "(line 248,col 10)-(line 248,col 56)",
        "(line 249,col 10)-(line 249,col 56)",
        "(line 250,col 10)-(line 250,col 75)",
        "(line 251,col 10)-(line 252,col 48)",
        "(line 253,col 10)-(line 254,col 52)",
        "(line 255,col 9)-(line 255,col 76)",
        "(line 256,col 9)-(line 257,col 45)",
        "(line 258,col 9)-(line 259,col 57)",
        "(line 260,col 9)-(line 261,col 53)",
        "(line 262,col 9)-(line 263,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoIntercept_noint1()",
      "begin_line": 266,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 66)",
        "(line 269,col 9)-(line 271,col 9)",
        "(line 272,col 9)-(line 272,col 74)",
        "(line 273,col 9)-(line 273,col 86)",
        "(line 274,col 9)-(line 275,col 52)",
        "(line 276,col 9)-(line 276,col 77)",
        "(line 277,col 9)-(line 278,col 45)",
        "(line 279,col 9)-(line 280,col 57)",
        "(line 281,col 9)-(line 282,col 53)",
        "(line 283,col 9)-(line 284,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 288,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 61)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 296,col 9)-(line 296,col 86)",
        "(line 297,col 9)-(line 298,col 52)",
        "(line 299,col 9)-(line 299,col 77)",
        "(line 300,col 9)-(line 301,col 46)",
        "(line 302,col 9)-(line 303,col 52)",
        "(line 304,col 9)-(line 305,col 45)",
        "(line 306,col 9)-(line 307,col 57)",
        "(line 308,col 9)-(line 309,col 53)",
        "(line 310,col 9)-(line 311,col 52)",
        "(line 314,col 9)-(line 315,col 43)",
        "(line 316,col 9)-(line 317,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 320,
      "end_line": 327,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 61)",
        "(line 323,col 9)-(line 323,col 37)",
        "(line 324,col 9)-(line 324,col 77)",
        "(line 325,col 9)-(line 325,col 81)",
        "(line 326,col 9)-(line 326,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 329,
      "end_line": 386,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 61)",
        "(line 332,col 9)-(line 332,col 88)",
        "(line 333,col 9)-(line 333,col 80)",
        "(line 334,col 9)-(line 334,col 94)",
        "(line 335,col 9)-(line 335,col 102)",
        "(line 336,col 9)-(line 336,col 88)",
        "(line 337,col 9)-(line 337,col 72)",
        "(line 338,col 9)-(line 338,col 85)",
        "(line 339,col 9)-(line 339,col 94)",
        "(line 340,col 9)-(line 340,col 88)",
        "(line 341,col 9)-(line 341,col 89)",
        "(line 342,col 9)-(line 342,col 82)",
        "(line 344,col 9)-(line 344,col 33)",
        "(line 345,col 9)-(line 345,col 33)",
        "(line 348,col 9)-(line 348,col 88)",
        "(line 349,col 9)-(line 349,col 80)",
        "(line 350,col 9)-(line 350,col 94)",
        "(line 351,col 9)-(line 351,col 102)",
        "(line 352,col 9)-(line 352,col 88)",
        "(line 353,col 9)-(line 353,col 72)",
        "(line 354,col 9)-(line 354,col 85)",
        "(line 355,col 9)-(line 355,col 93)",
        "(line 356,col 9)-(line 356,col 89)",
        "(line 357,col 9)-(line 357,col 82)",
        "(line 360,col 9)-(line 360,col 86)",
        "(line 362,col 9)-(line 362,col 44)",
        "(line 364,col 9)-(line 364,col 33)",
        "(line 365,col 9)-(line 365,col 33)",
        "(line 368,col 9)-(line 368,col 84)",
        "(line 369,col 9)-(line 369,col 77)",
        "(line 370,col 9)-(line 370,col 94)",
        "(line 371,col 9)-(line 371,col 102)",
        "(line 372,col 9)-(line 372,col 88)",
        "(line 373,col 9)-(line 373,col 69)",
        "(line 374,col 9)-(line 374,col 82)",
        "(line 375,col 9)-(line 375,col 90)",
        "(line 376,col 9)-(line 376,col 86)",
        "(line 377,col 9)-(line 377,col 86)",
        "(line 378,col 9)-(line 378,col 79)",
        "(line 380,col 9)-(line 380,col 33)",
        "(line 383,col 9)-(line 383,col 85)",
        "(line 384,col 9)-(line 384,col 91)",
        "(line 385,col 9)-(line 385,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 388,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 61)",
        "(line 391,col 9)-(line 391,col 37)",
        "(line 392,col 9)-(line 392,col 77)",
        "(line 393,col 9)-(line 393,col 27)",
        "(line 394,col 9)-(line 394,col 76)",
        "(line 395,col 9)-(line 395,col 37)",
        "(line 396,col 9)-(line 396,col 81)",
        "(line 397,col 9)-(line 397,col 33)",
        "(line 398,col 9)-(line 398,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 401,
      "end_line": 439,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 61)",
        "(line 406,col 9)-(line 406,col 36)",
        "(line 407,col 9)-(line 408,col 52)",
        "(line 409,col 9)-(line 410,col 54)",
        "(line 411,col 9)-(line 412,col 51)",
        "(line 413,col 9)-(line 414,col 62)",
        "(line 416,col 9)-(line 416,col 44)",
        "(line 417,col 9)-(line 417,col 37)",
        "(line 418,col 9)-(line 419,col 51)",
        "(line 420,col 9)-(line 421,col 54)",
        "(line 422,col 9)-(line 423,col 52)",
        "(line 424,col 9)-(line 425,col 62)",
        "(line 429,col 9)-(line 430,col 103)",
        "(line 432,col 9)-(line 437,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 441,
      "end_line": 451,
      "comment": "",
      "child_ranges": [
        "(line 443,col 9)-(line 443,col 61)",
        "(line 444,col 9)-(line 444,col 20)",
        "(line 445,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 71)",
        "(line 449,col 9)-(line 449,col 55)",
        "(line 450,col 9)-(line 450,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 453,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 61)",
        "(line 456,col 9)-(line 456,col 20)",
        "(line 457,col 9)-(line 459,col 9)",
        "(line 461,col 9)-(line 461,col 71)",
        "(line 462,col 9)-(line 462,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 465,
      "end_line": 476,
      "comment": "",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 61)",
        "(line 468,col 9)-(line 468,col 38)",
        "(line 469,col 9)-(line 469,col 20)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 475,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 480,
      "end_line": 489,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 54)",
        "(line 483,col 9)-(line 483,col 69)",
        "(line 484,col 9)-(line 484,col 54)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 488,col 9)-(line 488,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 492,
      "end_line": 508,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 495,col 9)-(line 495,col 61)",
        "(line 496,col 9)-(line 496,col 36)",
        "(line 497,col 9)-(line 497,col 48)",
        "(line 498,col 9)-(line 498,col 45)",
        "(line 500,col 9)-(line 501,col 52)",
        "(line 502,col 9)-(line 503,col 54)",
        "(line 504,col 9)-(line 505,col 51)",
        "(line 506,col 9)-(line 507,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 512,
      "end_line": 528,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 61)",
        "(line 516,col 9)-(line 516,col 36)",
        "(line 517,col 9)-(line 517,col 44)",
        "(line 518,col 9)-(line 518,col 41)",
        "(line 520,col 9)-(line 521,col 52)",
        "(line 522,col 9)-(line 523,col 54)",
        "(line 524,col 9)-(line 525,col 51)",
        "(line 526,col 9)-(line 527,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 531,
      "end_line": 547,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 61)",
        "(line 535,col 9)-(line 535,col 36)",
        "(line 536,col 9)-(line 536,col 46)",
        "(line 537,col 9)-(line 537,col 43)",
        "(line 539,col 9)-(line 540,col 52)",
        "(line 541,col 9)-(line 542,col 54)",
        "(line 543,col 9)-(line 544,col 51)",
        "(line 545,col 9)-(line 546,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 550,
      "end_line": 555,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 61)",
        "(line 553,col 9)-(line 553,col 48)",
        "(line 554,col 9)-(line 554,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 558,
      "end_line": 564,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 61)",
        "(line 561,col 9)-(line 561,col 45)",
        "(line 562,col 9)-(line 562,col 48)",
        "(line 563,col 9)-(line 563,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 567,
      "end_line": 573,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 61)",
        "(line 570,col 9)-(line 570,col 43)",
        "(line 571,col 9)-(line 571,col 46)",
        "(line 572,col 9)-(line 572,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 576,
      "end_line": 582,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 61)",
        "(line 579,col 9)-(line 579,col 45)",
        "(line 580,col 9)-(line 580,col 46)",
        "(line 581,col 9)-(line 581,col 50)"
      ]
    }
  ]
}
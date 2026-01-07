{
  "filepath": "/tmp/Math-27b/src/test/java/org/apache/commons/math3/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 498,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 39,
      "end_line": 47,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 53,
      "end_line": 57,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint1"
      ],
      "begin_line": 87,
      "end_line": 99,
      "comment": "\n     * Data from NIST NOINT1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "noint2"
      ],
      "begin_line": 105,
      "end_line": 109,
      "comment": "\n     * Data from NIST NOINT2\n     *\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRegressIfaceMethod()",
      "begin_line": 111,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 71)",
        "(line 114,col 9)-(line 114,col 66)",
        "(line 115,col 9)-(line 115,col 79)",
        "(line 116,col 9)-(line 116,col 80)",
        "(line 117,col 9)-(line 121,col 9)",
        "(line 124,col 9)-(line 124,col 59)",
        "(line 125,col 9)-(line 125,col 38)",
        "(line 126,col 9)-(line 126,col 110)",
        "(line 127,col 9)-(line 127,col 123)",
        "(line 128,col 9)-(line 128,col 102)",
        "(line 129,col 9)-(line 129,col 115)",
        "(line 130,col 9)-(line 130,col 88)",
        "(line 131,col 9)-(line 131,col 96)",
        "(line 132,col 9)-(line 132,col 117)",
        "(line 133,col 9)-(line 133,col 107)",
        "(line 134,col 9)-(line 134,col 108)",
        "(line 137,col 9)-(line 137,col 72)",
        "(line 138,col 9)-(line 138,col 36)",
        "(line 139,col 9)-(line 139,col 105)",
        "(line 140,col 9)-(line 140,col 118)",
        "(line 141,col 9)-(line 141,col 91)",
        "(line 142,col 9)-(line 142,col 99)",
        "(line 143,col 9)-(line 143,col 119)",
        "(line 144,col 9)-(line 144,col 110)",
        "(line 145,col 9)-(line 145,col 111)",
        "(line 147,col 9)-(line 147,col 72)",
        "(line 148,col 9)-(line 148,col 38)",
        "(line 149,col 9)-(line 149,col 109)",
        "(line 150,col 9)-(line 150,col 122)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 152,col 9)-(line 152,col 103)",
        "(line 153,col 9)-(line 153,col 114)",
        "(line 154,col 9)-(line 154,col 123)",
        "(line 155,col 9)-(line 155,col 113)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoInterceot_noint2()",
      "begin_line": 159,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 161,col 10)-(line 161,col 67)",
        "(line 162,col 10)-(line 162,col 56)",
        "(line 163,col 10)-(line 163,col 56)",
        "(line 164,col 10)-(line 164,col 56)",
        "(line 165,col 10)-(line 165,col 75)",
        "(line 166,col 10)-(line 167,col 48)",
        "(line 168,col 10)-(line 169,col 52)",
        "(line 170,col 9)-(line 170,col 76)",
        "(line 171,col 9)-(line 172,col 45)",
        "(line 173,col 9)-(line 174,col 57)",
        "(line 175,col 9)-(line 176,col 53)",
        "(line 177,col 9)-(line 178,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNoIntercept_noint1()",
      "begin_line": 181,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 74)",
        "(line 188,col 9)-(line 188,col 86)",
        "(line 189,col 9)-(line 190,col 52)",
        "(line 191,col 9)-(line 191,col 77)",
        "(line 192,col 9)-(line 193,col 45)",
        "(line 194,col 9)-(line 195,col 57)",
        "(line 196,col 9)-(line 197,col 53)",
        "(line 198,col 9)-(line 199,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 203,
      "end_line": 233,
      "comment": "",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 61)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 211,col 9)-(line 211,col 86)",
        "(line 212,col 9)-(line 213,col 52)",
        "(line 214,col 9)-(line 214,col 77)",
        "(line 215,col 9)-(line 216,col 46)",
        "(line 217,col 9)-(line 218,col 52)",
        "(line 219,col 9)-(line 220,col 45)",
        "(line 221,col 9)-(line 222,col 57)",
        "(line 223,col 9)-(line 224,col 53)",
        "(line 225,col 9)-(line 226,col 52)",
        "(line 229,col 9)-(line 230,col 43)",
        "(line 231,col 9)-(line 232,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 235,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 61)",
        "(line 238,col 9)-(line 238,col 37)",
        "(line 239,col 9)-(line 239,col 77)",
        "(line 240,col 9)-(line 240,col 81)",
        "(line 241,col 9)-(line 241,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 244,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 61)",
        "(line 247,col 9)-(line 247,col 88)",
        "(line 248,col 9)-(line 248,col 80)",
        "(line 249,col 9)-(line 249,col 94)",
        "(line 250,col 9)-(line 250,col 102)",
        "(line 251,col 9)-(line 251,col 88)",
        "(line 252,col 9)-(line 252,col 72)",
        "(line 253,col 9)-(line 253,col 85)",
        "(line 254,col 9)-(line 254,col 94)",
        "(line 255,col 9)-(line 255,col 88)",
        "(line 256,col 9)-(line 256,col 89)",
        "(line 257,col 9)-(line 257,col 82)",
        "(line 259,col 9)-(line 259,col 33)",
        "(line 260,col 9)-(line 260,col 33)",
        "(line 263,col 9)-(line 263,col 88)",
        "(line 264,col 9)-(line 264,col 80)",
        "(line 265,col 9)-(line 265,col 94)",
        "(line 266,col 9)-(line 266,col 102)",
        "(line 267,col 9)-(line 267,col 88)",
        "(line 268,col 9)-(line 268,col 72)",
        "(line 269,col 9)-(line 269,col 85)",
        "(line 270,col 9)-(line 270,col 93)",
        "(line 271,col 9)-(line 271,col 89)",
        "(line 272,col 9)-(line 272,col 82)",
        "(line 275,col 9)-(line 275,col 86)",
        "(line 277,col 9)-(line 277,col 44)",
        "(line 279,col 9)-(line 279,col 33)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 283,col 9)-(line 283,col 84)",
        "(line 284,col 9)-(line 284,col 77)",
        "(line 285,col 9)-(line 285,col 94)",
        "(line 286,col 9)-(line 286,col 102)",
        "(line 287,col 9)-(line 287,col 88)",
        "(line 288,col 9)-(line 288,col 69)",
        "(line 289,col 9)-(line 289,col 82)",
        "(line 290,col 9)-(line 290,col 90)",
        "(line 291,col 9)-(line 291,col 86)",
        "(line 292,col 9)-(line 292,col 86)",
        "(line 293,col 9)-(line 293,col 79)",
        "(line 295,col 9)-(line 295,col 33)",
        "(line 298,col 9)-(line 298,col 85)",
        "(line 299,col 9)-(line 299,col 91)",
        "(line 300,col 9)-(line 300,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 303,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 61)",
        "(line 306,col 9)-(line 306,col 37)",
        "(line 307,col 9)-(line 307,col 77)",
        "(line 308,col 9)-(line 308,col 27)",
        "(line 309,col 9)-(line 309,col 76)",
        "(line 310,col 9)-(line 310,col 37)",
        "(line 311,col 9)-(line 311,col 81)",
        "(line 312,col 9)-(line 312,col 33)",
        "(line 313,col 9)-(line 313,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 316,
      "end_line": 354,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 61)",
        "(line 321,col 9)-(line 321,col 36)",
        "(line 322,col 9)-(line 323,col 52)",
        "(line 324,col 9)-(line 325,col 54)",
        "(line 326,col 9)-(line 327,col 51)",
        "(line 328,col 9)-(line 329,col 62)",
        "(line 331,col 9)-(line 331,col 44)",
        "(line 332,col 9)-(line 332,col 37)",
        "(line 333,col 9)-(line 334,col 51)",
        "(line 335,col 9)-(line 336,col 54)",
        "(line 337,col 9)-(line 338,col 52)",
        "(line 339,col 9)-(line 340,col 62)",
        "(line 344,col 9)-(line 345,col 103)",
        "(line 347,col 9)-(line 352,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 356,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 61)",
        "(line 359,col 9)-(line 359,col 20)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 71)",
        "(line 364,col 9)-(line 364,col 55)",
        "(line 365,col 9)-(line 365,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 368,
      "end_line": 378,
      "comment": "",
      "child_ranges": [
        "(line 370,col 9)-(line 370,col 61)",
        "(line 371,col 9)-(line 371,col 20)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 376,col 9)-(line 376,col 71)",
        "(line 377,col 9)-(line 377,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 380,
      "end_line": 391,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 61)",
        "(line 383,col 9)-(line 383,col 38)",
        "(line 384,col 9)-(line 384,col 20)",
        "(line 385,col 9)-(line 387,col 9)",
        "(line 389,col 9)-(line 390,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 395,
      "end_line": 404,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 54)",
        "(line 398,col 9)-(line 398,col 69)",
        "(line 399,col 9)-(line 399,col 54)",
        "(line 400,col 9)-(line 402,col 9)",
        "(line 403,col 9)-(line 403,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 407,
      "end_line": 423,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 61)",
        "(line 411,col 9)-(line 411,col 36)",
        "(line 412,col 9)-(line 412,col 48)",
        "(line 413,col 9)-(line 413,col 45)",
        "(line 415,col 9)-(line 416,col 52)",
        "(line 417,col 9)-(line 418,col 54)",
        "(line 419,col 9)-(line 420,col 51)",
        "(line 421,col 9)-(line 422,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 427,
      "end_line": 443,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 61)",
        "(line 431,col 9)-(line 431,col 36)",
        "(line 432,col 9)-(line 432,col 44)",
        "(line 433,col 9)-(line 433,col 41)",
        "(line 435,col 9)-(line 436,col 52)",
        "(line 437,col 9)-(line 438,col 54)",
        "(line 439,col 9)-(line 440,col 51)",
        "(line 441,col 9)-(line 442,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 446,
      "end_line": 462,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 61)",
        "(line 450,col 9)-(line 450,col 36)",
        "(line 451,col 9)-(line 451,col 46)",
        "(line 452,col 9)-(line 452,col 43)",
        "(line 454,col 9)-(line 455,col 52)",
        "(line 456,col 9)-(line 457,col 54)",
        "(line 458,col 9)-(line 459,col 51)",
        "(line 460,col 9)-(line 461,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 465,
      "end_line": 470,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 61)",
        "(line 468,col 9)-(line 468,col 48)",
        "(line 469,col 9)-(line 469,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 473,
      "end_line": 479,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 61)",
        "(line 476,col 9)-(line 476,col 45)",
        "(line 477,col 9)-(line 477,col 48)",
        "(line 478,col 9)-(line 478,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 482,
      "end_line": 488,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 61)",
        "(line 485,col 9)-(line 485,col 43)",
        "(line 486,col 9)-(line 486,col 46)",
        "(line 487,col 9)-(line 487,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 491,
      "end_line": 497,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 61)",
        "(line 494,col 9)-(line 494,col 45)",
        "(line 495,col 9)-(line 495,col 46)",
        "(line 496,col 9)-(line 496,col 50)"
      ]
    }
  ]
}
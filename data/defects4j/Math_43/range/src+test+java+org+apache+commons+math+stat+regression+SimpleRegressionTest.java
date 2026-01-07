{
  "filepath": "/tmp/Math-43b/src/test/java/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 496,
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
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRegressIfaceMethod()",
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
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNoInterceot_noint2()",
      "begin_line": 159,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 161,col 10)-(line 161,col 67)",
        "(line 162,col 10)-(line 162,col 56)",
        "(line 163,col 10)-(line 163,col 56)",
        "(line 164,col 10)-(line 164,col 56)",
        "(line 165,col 10)-(line 166,col 48)",
        "(line 167,col 10)-(line 168,col 52)",
        "(line 169,col 9)-(line 169,col 76)",
        "(line 170,col 9)-(line 171,col 45)",
        "(line 172,col 9)-(line 173,col 57)",
        "(line 174,col 9)-(line 175,col 53)",
        "(line 176,col 9)-(line 177,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNoIntercept_noint1()",
      "begin_line": 180,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 66)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 86)",
        "(line 187,col 9)-(line 188,col 52)",
        "(line 189,col 9)-(line 189,col 77)",
        "(line 190,col 9)-(line 191,col 45)",
        "(line 192,col 9)-(line 193,col 57)",
        "(line 194,col 9)-(line 195,col 53)",
        "(line 196,col 9)-(line 197,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 201,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 209,col 9)-(line 209,col 86)",
        "(line 210,col 9)-(line 211,col 52)",
        "(line 212,col 9)-(line 212,col 77)",
        "(line 213,col 9)-(line 214,col 46)",
        "(line 215,col 9)-(line 216,col 52)",
        "(line 217,col 9)-(line 218,col 45)",
        "(line 219,col 9)-(line 220,col 57)",
        "(line 221,col 9)-(line 222,col 53)",
        "(line 223,col 9)-(line 224,col 52)",
        "(line 227,col 9)-(line 228,col 43)",
        "(line 229,col 9)-(line 230,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 233,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 61)",
        "(line 236,col 9)-(line 236,col 37)",
        "(line 237,col 9)-(line 237,col 77)",
        "(line 238,col 9)-(line 238,col 81)",
        "(line 239,col 9)-(line 239,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 242,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 61)",
        "(line 245,col 9)-(line 245,col 88)",
        "(line 246,col 9)-(line 246,col 80)",
        "(line 247,col 9)-(line 247,col 94)",
        "(line 248,col 9)-(line 248,col 102)",
        "(line 249,col 9)-(line 249,col 88)",
        "(line 250,col 9)-(line 250,col 72)",
        "(line 251,col 9)-(line 251,col 85)",
        "(line 252,col 9)-(line 252,col 94)",
        "(line 253,col 9)-(line 253,col 88)",
        "(line 254,col 9)-(line 254,col 89)",
        "(line 255,col 9)-(line 255,col 82)",
        "(line 257,col 9)-(line 257,col 33)",
        "(line 258,col 9)-(line 258,col 33)",
        "(line 261,col 9)-(line 261,col 88)",
        "(line 262,col 9)-(line 262,col 80)",
        "(line 263,col 9)-(line 263,col 94)",
        "(line 264,col 9)-(line 264,col 102)",
        "(line 265,col 9)-(line 265,col 88)",
        "(line 266,col 9)-(line 266,col 72)",
        "(line 267,col 9)-(line 267,col 85)",
        "(line 268,col 9)-(line 268,col 93)",
        "(line 269,col 9)-(line 269,col 89)",
        "(line 270,col 9)-(line 270,col 82)",
        "(line 273,col 9)-(line 273,col 86)",
        "(line 275,col 9)-(line 275,col 44)",
        "(line 277,col 9)-(line 277,col 33)",
        "(line 278,col 9)-(line 278,col 33)",
        "(line 281,col 9)-(line 281,col 84)",
        "(line 282,col 9)-(line 282,col 77)",
        "(line 283,col 9)-(line 283,col 94)",
        "(line 284,col 9)-(line 284,col 102)",
        "(line 285,col 9)-(line 285,col 88)",
        "(line 286,col 9)-(line 286,col 69)",
        "(line 287,col 9)-(line 287,col 82)",
        "(line 288,col 9)-(line 288,col 90)",
        "(line 289,col 9)-(line 289,col 86)",
        "(line 290,col 9)-(line 290,col 86)",
        "(line 291,col 9)-(line 291,col 79)",
        "(line 293,col 9)-(line 293,col 33)",
        "(line 296,col 9)-(line 296,col 85)",
        "(line 297,col 9)-(line 297,col 91)",
        "(line 298,col 9)-(line 298,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 301,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 61)",
        "(line 304,col 9)-(line 304,col 37)",
        "(line 305,col 9)-(line 305,col 77)",
        "(line 306,col 9)-(line 306,col 27)",
        "(line 307,col 9)-(line 307,col 76)",
        "(line 308,col 9)-(line 308,col 37)",
        "(line 309,col 9)-(line 309,col 81)",
        "(line 310,col 9)-(line 310,col 33)",
        "(line 311,col 9)-(line 311,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 314,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 61)",
        "(line 319,col 9)-(line 319,col 36)",
        "(line 320,col 9)-(line 321,col 52)",
        "(line 322,col 9)-(line 323,col 54)",
        "(line 324,col 9)-(line 325,col 51)",
        "(line 326,col 9)-(line 327,col 62)",
        "(line 329,col 9)-(line 329,col 44)",
        "(line 330,col 9)-(line 330,col 37)",
        "(line 331,col 9)-(line 332,col 51)",
        "(line 333,col 9)-(line 334,col 54)",
        "(line 335,col 9)-(line 336,col 52)",
        "(line 337,col 9)-(line 338,col 62)",
        "(line 342,col 9)-(line 343,col 103)",
        "(line 345,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 354,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 61)",
        "(line 357,col 9)-(line 357,col 20)",
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 361,col 71)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 363,col 9)-(line 363,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 366,
      "end_line": 376,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 61)",
        "(line 369,col 9)-(line 369,col 20)",
        "(line 370,col 9)-(line 372,col 9)",
        "(line 374,col 9)-(line 374,col 71)",
        "(line 375,col 9)-(line 375,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 378,
      "end_line": 389,
      "comment": "",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 61)",
        "(line 381,col 9)-(line 381,col 38)",
        "(line 382,col 9)-(line 382,col 20)",
        "(line 383,col 9)-(line 385,col 9)",
        "(line 387,col 9)-(line 388,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 393,
      "end_line": 402,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 54)",
        "(line 396,col 9)-(line 396,col 69)",
        "(line 397,col 9)-(line 397,col 54)",
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 405,
      "end_line": 421,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 61)",
        "(line 409,col 9)-(line 409,col 36)",
        "(line 410,col 9)-(line 410,col 48)",
        "(line 411,col 9)-(line 411,col 45)",
        "(line 413,col 9)-(line 414,col 52)",
        "(line 415,col 9)-(line 416,col 54)",
        "(line 417,col 9)-(line 418,col 51)",
        "(line 419,col 9)-(line 420,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 425,
      "end_line": 441,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 61)",
        "(line 429,col 9)-(line 429,col 36)",
        "(line 430,col 9)-(line 430,col 44)",
        "(line 431,col 9)-(line 431,col 41)",
        "(line 433,col 9)-(line 434,col 52)",
        "(line 435,col 9)-(line 436,col 54)",
        "(line 437,col 9)-(line 438,col 51)",
        "(line 439,col 9)-(line 440,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 444,
      "end_line": 460,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 61)",
        "(line 448,col 9)-(line 448,col 36)",
        "(line 449,col 9)-(line 449,col 46)",
        "(line 450,col 9)-(line 450,col 43)",
        "(line 452,col 9)-(line 453,col 52)",
        "(line 454,col 9)-(line 455,col 54)",
        "(line 456,col 9)-(line 457,col 51)",
        "(line 458,col 9)-(line 459,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 463,
      "end_line": 468,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 465,col 9)-(line 465,col 61)",
        "(line 466,col 9)-(line 466,col 48)",
        "(line 467,col 9)-(line 467,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 471,
      "end_line": 477,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 61)",
        "(line 474,col 9)-(line 474,col 45)",
        "(line 475,col 9)-(line 475,col 48)",
        "(line 476,col 9)-(line 476,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 480,
      "end_line": 486,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 61)",
        "(line 483,col 9)-(line 483,col 43)",
        "(line 484,col 9)-(line 484,col 46)",
        "(line 485,col 9)-(line 485,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 489,
      "end_line": 495,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 61)",
        "(line 492,col 9)-(line 492,col 45)",
        "(line 493,col 9)-(line 493,col 46)",
        "(line 494,col 9)-(line 494,col 50)"
      ]
    }
  ]
}
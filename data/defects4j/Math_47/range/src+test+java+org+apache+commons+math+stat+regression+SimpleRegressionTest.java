{
  "filepath": "/tmp/Math-47b/src/test/java/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 32,
      "end_line": 378,
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
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 83,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 91,col 86)",
        "(line 92,col 9)-(line 93,col 52)",
        "(line 94,col 9)-(line 94,col 77)",
        "(line 95,col 9)-(line 96,col 46)",
        "(line 97,col 9)-(line 98,col 52)",
        "(line 99,col 9)-(line 100,col 45)",
        "(line 101,col 9)-(line 102,col 57)",
        "(line 103,col 9)-(line 104,col 53)",
        "(line 105,col 9)-(line 106,col 52)",
        "(line 109,col 9)-(line 110,col 43)",
        "(line 111,col 9)-(line 112,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 115,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 61)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 77)",
        "(line 120,col 9)-(line 120,col 81)",
        "(line 121,col 9)-(line 121,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 124,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)",
        "(line 127,col 9)-(line 127,col 88)",
        "(line 128,col 9)-(line 128,col 80)",
        "(line 129,col 9)-(line 129,col 94)",
        "(line 130,col 9)-(line 130,col 102)",
        "(line 131,col 9)-(line 131,col 88)",
        "(line 132,col 9)-(line 132,col 72)",
        "(line 133,col 9)-(line 133,col 85)",
        "(line 134,col 9)-(line 134,col 94)",
        "(line 135,col 9)-(line 135,col 88)",
        "(line 136,col 9)-(line 136,col 89)",
        "(line 137,col 9)-(line 137,col 82)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 143,col 9)-(line 143,col 88)",
        "(line 144,col 9)-(line 144,col 80)",
        "(line 145,col 9)-(line 145,col 94)",
        "(line 146,col 9)-(line 146,col 102)",
        "(line 147,col 9)-(line 147,col 88)",
        "(line 148,col 9)-(line 148,col 72)",
        "(line 149,col 9)-(line 149,col 85)",
        "(line 150,col 9)-(line 150,col 93)",
        "(line 151,col 9)-(line 151,col 89)",
        "(line 152,col 9)-(line 152,col 82)",
        "(line 155,col 9)-(line 155,col 86)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 163,col 9)-(line 163,col 84)",
        "(line 164,col 9)-(line 164,col 77)",
        "(line 165,col 9)-(line 165,col 94)",
        "(line 166,col 9)-(line 166,col 102)",
        "(line 167,col 9)-(line 167,col 88)",
        "(line 168,col 9)-(line 168,col 69)",
        "(line 169,col 9)-(line 169,col 82)",
        "(line 170,col 9)-(line 170,col 90)",
        "(line 171,col 9)-(line 171,col 86)",
        "(line 172,col 9)-(line 172,col 86)",
        "(line 173,col 9)-(line 173,col 79)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 178,col 9)-(line 178,col 85)",
        "(line 179,col 9)-(line 179,col 91)",
        "(line 180,col 9)-(line 180,col 99)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 183,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 61)",
        "(line 186,col 9)-(line 186,col 37)",
        "(line 187,col 9)-(line 187,col 77)",
        "(line 188,col 9)-(line 188,col 27)",
        "(line 189,col 9)-(line 189,col 76)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 81)",
        "(line 192,col 9)-(line 192,col 33)",
        "(line 193,col 9)-(line 193,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 196,
      "end_line": 234,
      "comment": "",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 61)",
        "(line 201,col 9)-(line 201,col 36)",
        "(line 202,col 9)-(line 203,col 52)",
        "(line 204,col 9)-(line 205,col 54)",
        "(line 206,col 9)-(line 207,col 51)",
        "(line 208,col 9)-(line 209,col 62)",
        "(line 211,col 9)-(line 211,col 44)",
        "(line 212,col 9)-(line 212,col 37)",
        "(line 213,col 9)-(line 214,col 51)",
        "(line 215,col 9)-(line 216,col 54)",
        "(line 217,col 9)-(line 218,col 52)",
        "(line 219,col 9)-(line 220,col 62)",
        "(line 224,col 9)-(line 225,col 103)",
        "(line 227,col 9)-(line 232,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 236,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 61)",
        "(line 239,col 9)-(line 239,col 20)",
        "(line 240,col 9)-(line 242,col 9)",
        "(line 243,col 9)-(line 243,col 71)",
        "(line 244,col 9)-(line 244,col 55)",
        "(line 245,col 9)-(line 245,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 248,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 61)",
        "(line 251,col 9)-(line 251,col 20)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 256,col 9)-(line 256,col 71)",
        "(line 257,col 9)-(line 257,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 260,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 61)",
        "(line 263,col 9)-(line 263,col 38)",
        "(line 264,col 9)-(line 264,col 20)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 270,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 275,
      "end_line": 284,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 54)",
        "(line 278,col 9)-(line 278,col 69)",
        "(line 279,col 9)-(line 279,col 54)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 283,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 287,
      "end_line": 303,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 61)",
        "(line 291,col 9)-(line 291,col 36)",
        "(line 292,col 9)-(line 292,col 48)",
        "(line 293,col 9)-(line 293,col 45)",
        "(line 295,col 9)-(line 296,col 52)",
        "(line 297,col 9)-(line 298,col 54)",
        "(line 299,col 9)-(line 300,col 51)",
        "(line 301,col 9)-(line 302,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 307,
      "end_line": 323,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 61)",
        "(line 311,col 9)-(line 311,col 36)",
        "(line 312,col 9)-(line 312,col 44)",
        "(line 313,col 9)-(line 313,col 41)",
        "(line 315,col 9)-(line 316,col 52)",
        "(line 317,col 9)-(line 318,col 54)",
        "(line 319,col 9)-(line 320,col 51)",
        "(line 321,col 9)-(line 322,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 326,
      "end_line": 342,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 61)",
        "(line 330,col 9)-(line 330,col 36)",
        "(line 331,col 9)-(line 331,col 46)",
        "(line 332,col 9)-(line 332,col 43)",
        "(line 334,col 9)-(line 335,col 52)",
        "(line 336,col 9)-(line 337,col 54)",
        "(line 338,col 9)-(line 339,col 51)",
        "(line 340,col 9)-(line 341,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 345,
      "end_line": 350,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 61)",
        "(line 348,col 9)-(line 348,col 48)",
        "(line 349,col 9)-(line 349,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 353,
      "end_line": 359,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 61)",
        "(line 356,col 9)-(line 356,col 45)",
        "(line 357,col 9)-(line 357,col 48)",
        "(line 358,col 9)-(line 358,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 362,
      "end_line": 368,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 61)",
        "(line 365,col 9)-(line 365,col 43)",
        "(line 366,col 9)-(line 366,col 46)",
        "(line 367,col 9)-(line 367,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 371,
      "end_line": 377,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 61)",
        "(line 374,col 9)-(line 374,col 45)",
        "(line 375,col 9)-(line 375,col 46)",
        "(line 376,col 9)-(line 376,col 50)"
      ]
    }
  ]
}
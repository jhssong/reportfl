{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 370,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 37,
      "end_line": 45,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 51,
      "end_line": 55,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.SimpleRegressionTest(java.lang.String)",
      "begin_line": 81,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.suite()",
      "begin_line": 85,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 68)",
        "(line 87,col 9)-(line 87,col 51)",
        "(line 88,col 9)-(line 88,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 91,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 61)",
        "(line 93,col 9)-(line 95,col 9)",
        "(line 98,col 9)-(line 98,col 79)",
        "(line 99,col 9)-(line 100,col 52)",
        "(line 101,col 9)-(line 101,col 70)",
        "(line 102,col 9)-(line 103,col 46)",
        "(line 104,col 9)-(line 105,col 52)",
        "(line 106,col 9)-(line 107,col 45)",
        "(line 108,col 9)-(line 109,col 57)",
        "(line 110,col 9)-(line 111,col 53)",
        "(line 112,col 9)-(line 113,col 52)",
        "(line 116,col 9)-(line 117,col 43)",
        "(line 118,col 9)-(line 119,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 122,
      "end_line": 128,
      "comment": "",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 61)",
        "(line 124,col 9)-(line 124,col 37)",
        "(line 125,col 9)-(line 125,col 70)",
        "(line 126,col 9)-(line 126,col 74)",
        "(line 127,col 9)-(line 127,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 130,
      "end_line": 186,
      "comment": "",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 61)",
        "(line 132,col 9)-(line 132,col 81)",
        "(line 133,col 9)-(line 133,col 73)",
        "(line 134,col 9)-(line 134,col 87)",
        "(line 135,col 9)-(line 135,col 95)",
        "(line 136,col 9)-(line 136,col 81)",
        "(line 137,col 9)-(line 137,col 65)",
        "(line 138,col 9)-(line 138,col 78)",
        "(line 139,col 9)-(line 139,col 87)",
        "(line 140,col 9)-(line 140,col 81)",
        "(line 141,col 9)-(line 141,col 82)",
        "(line 142,col 9)-(line 142,col 75)",
        "(line 144,col 9)-(line 144,col 33)",
        "(line 145,col 9)-(line 145,col 33)",
        "(line 148,col 9)-(line 148,col 81)",
        "(line 149,col 9)-(line 149,col 73)",
        "(line 150,col 9)-(line 150,col 87)",
        "(line 151,col 9)-(line 151,col 95)",
        "(line 152,col 9)-(line 152,col 81)",
        "(line 153,col 9)-(line 153,col 65)",
        "(line 154,col 9)-(line 154,col 78)",
        "(line 155,col 9)-(line 155,col 86)",
        "(line 156,col 9)-(line 156,col 82)",
        "(line 157,col 9)-(line 157,col 75)",
        "(line 160,col 9)-(line 160,col 79)",
        "(line 162,col 9)-(line 162,col 44)",
        "(line 164,col 9)-(line 164,col 33)",
        "(line 165,col 9)-(line 165,col 33)",
        "(line 168,col 9)-(line 168,col 77)",
        "(line 169,col 9)-(line 169,col 70)",
        "(line 170,col 9)-(line 170,col 88)",
        "(line 171,col 9)-(line 171,col 95)",
        "(line 172,col 9)-(line 172,col 81)",
        "(line 173,col 9)-(line 173,col 62)",
        "(line 174,col 9)-(line 174,col 75)",
        "(line 175,col 9)-(line 175,col 83)",
        "(line 176,col 9)-(line 176,col 79)",
        "(line 177,col 9)-(line 177,col 79)",
        "(line 178,col 9)-(line 178,col 72)",
        "(line 180,col 9)-(line 180,col 33)",
        "(line 183,col 9)-(line 183,col 78)",
        "(line 184,col 9)-(line 184,col 84)",
        "(line 185,col 9)-(line 185,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 188,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 61)",
        "(line 190,col 9)-(line 190,col 37)",
        "(line 191,col 9)-(line 191,col 70)",
        "(line 192,col 9)-(line 192,col 27)",
        "(line 193,col 9)-(line 193,col 69)",
        "(line 194,col 9)-(line 194,col 37)",
        "(line 195,col 9)-(line 195,col 74)",
        "(line 196,col 9)-(line 196,col 33)",
        "(line 197,col 9)-(line 197,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 200,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 61)",
        "(line 204,col 9)-(line 204,col 36)",
        "(line 205,col 9)-(line 206,col 52)",
        "(line 207,col 9)-(line 208,col 54)",
        "(line 209,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 212,col 62)",
        "(line 214,col 9)-(line 214,col 44)",
        "(line 215,col 9)-(line 215,col 37)",
        "(line 216,col 9)-(line 217,col 51)",
        "(line 218,col 9)-(line 219,col 54)",
        "(line 220,col 9)-(line 221,col 52)",
        "(line 222,col 9)-(line 223,col 62)",
        "(line 227,col 9)-(line 228,col 103)",
        "(line 230,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 239,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 61)",
        "(line 241,col 9)-(line 241,col 20)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 245,col 64)",
        "(line 246,col 9)-(line 246,col 48)",
        "(line 247,col 9)-(line 247,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 250,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 61)",
        "(line 252,col 9)-(line 252,col 20)",
        "(line 253,col 9)-(line 255,col 9)",
        "(line 257,col 9)-(line 257,col 64)",
        "(line 258,col 9)-(line 258,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 261,
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
      "end_line": 283,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 54)",
        "(line 277,col 9)-(line 277,col 69)",
        "(line 278,col 9)-(line 278,col 54)",
        "(line 279,col 9)-(line 281,col 9)",
        "(line 282,col 9)-(line 282,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 286,
      "end_line": 301,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 61)",
        "(line 289,col 9)-(line 289,col 36)",
        "(line 290,col 9)-(line 290,col 48)",
        "(line 291,col 9)-(line 291,col 45)",
        "(line 293,col 9)-(line 294,col 52)",
        "(line 295,col 9)-(line 296,col 54)",
        "(line 297,col 9)-(line 298,col 51)",
        "(line 299,col 9)-(line 300,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 305,
      "end_line": 320,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 61)",
        "(line 308,col 9)-(line 308,col 36)",
        "(line 309,col 9)-(line 309,col 44)",
        "(line 310,col 9)-(line 310,col 41)",
        "(line 312,col 9)-(line 313,col 52)",
        "(line 314,col 9)-(line 315,col 54)",
        "(line 316,col 9)-(line 317,col 51)",
        "(line 318,col 9)-(line 319,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 323,
      "end_line": 338,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 61)",
        "(line 326,col 9)-(line 326,col 36)",
        "(line 327,col 9)-(line 327,col 46)",
        "(line 328,col 9)-(line 328,col 43)",
        "(line 330,col 9)-(line 331,col 52)",
        "(line 332,col 9)-(line 333,col 54)",
        "(line 334,col 9)-(line 335,col 51)",
        "(line 336,col 9)-(line 337,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 341,
      "end_line": 345,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 61)",
        "(line 343,col 9)-(line 343,col 48)",
        "(line 344,col 9)-(line 344,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 348,
      "end_line": 353,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 61)",
        "(line 350,col 9)-(line 350,col 45)",
        "(line 351,col 9)-(line 351,col 48)",
        "(line 352,col 9)-(line 352,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 356,
      "end_line": 361,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 61)",
        "(line 358,col 9)-(line 358,col 43)",
        "(line 359,col 9)-(line 359,col 46)",
        "(line 360,col 9)-(line 360,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 364,
      "end_line": 369,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 61)",
        "(line 366,col 9)-(line 366,col 45)",
        "(line 367,col 9)-(line 367,col 46)",
        "(line 368,col 9)-(line 368,col 43)"
      ]
    }
  ]
}
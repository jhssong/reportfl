{
  "filepath": "/tmp/Math-58b/src/test/java/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 31,
      "end_line": 365,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 38,
      "end_line": 46,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 52,
      "end_line": 56,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 78,
      "end_line": 80,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.SimpleRegressionTest(java.lang.String)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 86,
      "end_line": 115,
      "comment": "",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 61)",
        "(line 88,col 9)-(line 90,col 9)",
        "(line 93,col 9)-(line 93,col 79)",
        "(line 94,col 9)-(line 95,col 52)",
        "(line 96,col 9)-(line 96,col 70)",
        "(line 97,col 9)-(line 98,col 46)",
        "(line 99,col 9)-(line 100,col 52)",
        "(line 101,col 9)-(line 102,col 45)",
        "(line 103,col 9)-(line 104,col 57)",
        "(line 105,col 9)-(line 106,col 53)",
        "(line 107,col 9)-(line 108,col 52)",
        "(line 111,col 9)-(line 112,col 43)",
        "(line 113,col 9)-(line 114,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 117,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 61)",
        "(line 119,col 9)-(line 119,col 37)",
        "(line 120,col 9)-(line 120,col 70)",
        "(line 121,col 9)-(line 121,col 74)",
        "(line 122,col 9)-(line 122,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 125,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)",
        "(line 127,col 9)-(line 127,col 81)",
        "(line 128,col 9)-(line 128,col 73)",
        "(line 129,col 9)-(line 129,col 87)",
        "(line 130,col 9)-(line 130,col 95)",
        "(line 131,col 9)-(line 131,col 81)",
        "(line 132,col 9)-(line 132,col 65)",
        "(line 133,col 9)-(line 133,col 78)",
        "(line 134,col 9)-(line 134,col 87)",
        "(line 135,col 9)-(line 135,col 81)",
        "(line 136,col 9)-(line 136,col 82)",
        "(line 137,col 9)-(line 137,col 75)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 140,col 9)-(line 140,col 33)",
        "(line 143,col 9)-(line 143,col 81)",
        "(line 144,col 9)-(line 144,col 73)",
        "(line 145,col 9)-(line 145,col 87)",
        "(line 146,col 9)-(line 146,col 95)",
        "(line 147,col 9)-(line 147,col 81)",
        "(line 148,col 9)-(line 148,col 65)",
        "(line 149,col 9)-(line 149,col 78)",
        "(line 150,col 9)-(line 150,col 86)",
        "(line 151,col 9)-(line 151,col 82)",
        "(line 152,col 9)-(line 152,col 75)",
        "(line 155,col 9)-(line 155,col 79)",
        "(line 157,col 9)-(line 157,col 44)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 160,col 9)-(line 160,col 33)",
        "(line 163,col 9)-(line 163,col 77)",
        "(line 164,col 9)-(line 164,col 70)",
        "(line 165,col 9)-(line 165,col 88)",
        "(line 166,col 9)-(line 166,col 95)",
        "(line 167,col 9)-(line 167,col 81)",
        "(line 168,col 9)-(line 168,col 62)",
        "(line 169,col 9)-(line 169,col 75)",
        "(line 170,col 9)-(line 170,col 83)",
        "(line 171,col 9)-(line 171,col 79)",
        "(line 172,col 9)-(line 172,col 79)",
        "(line 173,col 9)-(line 173,col 72)",
        "(line 175,col 9)-(line 175,col 33)",
        "(line 178,col 9)-(line 178,col 78)",
        "(line 179,col 9)-(line 179,col 84)",
        "(line 180,col 9)-(line 180,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 183,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 61)",
        "(line 185,col 9)-(line 185,col 37)",
        "(line 186,col 9)-(line 186,col 70)",
        "(line 187,col 9)-(line 187,col 27)",
        "(line 188,col 9)-(line 188,col 69)",
        "(line 189,col 9)-(line 189,col 37)",
        "(line 190,col 9)-(line 190,col 74)",
        "(line 191,col 9)-(line 191,col 33)",
        "(line 192,col 9)-(line 192,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 195,
      "end_line": 232,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 61)",
        "(line 199,col 9)-(line 199,col 36)",
        "(line 200,col 9)-(line 201,col 52)",
        "(line 202,col 9)-(line 203,col 54)",
        "(line 204,col 9)-(line 205,col 51)",
        "(line 206,col 9)-(line 207,col 62)",
        "(line 209,col 9)-(line 209,col 44)",
        "(line 210,col 9)-(line 210,col 37)",
        "(line 211,col 9)-(line 212,col 51)",
        "(line 213,col 9)-(line 214,col 54)",
        "(line 215,col 9)-(line 216,col 52)",
        "(line 217,col 9)-(line 218,col 62)",
        "(line 222,col 9)-(line 223,col 103)",
        "(line 225,col 9)-(line 230,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 234,
      "end_line": 243,
      "comment": "",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 61)",
        "(line 236,col 9)-(line 236,col 20)",
        "(line 237,col 9)-(line 239,col 9)",
        "(line 240,col 9)-(line 240,col 64)",
        "(line 241,col 9)-(line 241,col 48)",
        "(line 242,col 9)-(line 242,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 245,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 61)",
        "(line 247,col 9)-(line 247,col 20)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 64)",
        "(line 253,col 9)-(line 253,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 256,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 61)",
        "(line 258,col 9)-(line 258,col 38)",
        "(line 259,col 9)-(line 259,col 20)",
        "(line 260,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 265,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 270,
      "end_line": 278,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 54)",
        "(line 272,col 9)-(line 272,col 69)",
        "(line 273,col 9)-(line 273,col 54)",
        "(line 274,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 277,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 281,
      "end_line": 296,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 61)",
        "(line 284,col 9)-(line 284,col 36)",
        "(line 285,col 9)-(line 285,col 48)",
        "(line 286,col 9)-(line 286,col 45)",
        "(line 288,col 9)-(line 289,col 52)",
        "(line 290,col 9)-(line 291,col 54)",
        "(line 292,col 9)-(line 293,col 51)",
        "(line 294,col 9)-(line 295,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 300,
      "end_line": 315,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 302,col 9)-(line 302,col 61)",
        "(line 303,col 9)-(line 303,col 36)",
        "(line 304,col 9)-(line 304,col 44)",
        "(line 305,col 9)-(line 305,col 41)",
        "(line 307,col 9)-(line 308,col 52)",
        "(line 309,col 9)-(line 310,col 54)",
        "(line 311,col 9)-(line 312,col 51)",
        "(line 313,col 9)-(line 314,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 318,
      "end_line": 333,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 61)",
        "(line 321,col 9)-(line 321,col 36)",
        "(line 322,col 9)-(line 322,col 46)",
        "(line 323,col 9)-(line 323,col 43)",
        "(line 325,col 9)-(line 326,col 52)",
        "(line 327,col 9)-(line 328,col 54)",
        "(line 329,col 9)-(line 330,col 51)",
        "(line 331,col 9)-(line 332,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 336,
      "end_line": 340,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 61)",
        "(line 338,col 9)-(line 338,col 48)",
        "(line 339,col 9)-(line 339,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 343,
      "end_line": 348,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 61)",
        "(line 345,col 9)-(line 345,col 45)",
        "(line 346,col 9)-(line 346,col 48)",
        "(line 347,col 9)-(line 347,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 351,
      "end_line": 356,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 61)",
        "(line 353,col 9)-(line 353,col 43)",
        "(line 354,col 9)-(line 354,col 46)",
        "(line 355,col 9)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 359,
      "end_line": 364,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 61)",
        "(line 361,col 9)-(line 361,col 45)",
        "(line 362,col 9)-(line 362,col 46)",
        "(line 363,col 9)-(line 363,col 43)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 363,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 36,
      "end_line": 44,
      "comment": "\n     * NIST \"Norris\" refernce data set from\n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 50,
      "end_line": 54,
      "comment": "\n     * Correlation example from\n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeSingle"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Points to remove in the remove tests\n     "
    },
    {
      "type": "field",
      "varNames": [
        "removeMultiple"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeX"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "removeY"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "infData2"
      ],
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.SimpleRegressionTest(java.lang.String)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 84,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 61)",
        "(line 86,col 9)-(line 88,col 9)",
        "(line 91,col 9)-(line 91,col 79)",
        "(line 92,col 9)-(line 93,col 52)",
        "(line 94,col 9)-(line 94,col 70)",
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
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 61)",
        "(line 117,col 9)-(line 117,col 37)",
        "(line 118,col 9)-(line 118,col 70)",
        "(line 119,col 9)-(line 119,col 74)",
        "(line 120,col 9)-(line 120,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 123,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 61)",
        "(line 125,col 9)-(line 125,col 81)",
        "(line 126,col 9)-(line 126,col 73)",
        "(line 127,col 9)-(line 127,col 87)",
        "(line 128,col 9)-(line 128,col 95)",
        "(line 129,col 9)-(line 129,col 81)",
        "(line 130,col 9)-(line 130,col 65)",
        "(line 131,col 9)-(line 131,col 78)",
        "(line 132,col 9)-(line 132,col 87)",
        "(line 133,col 9)-(line 133,col 81)",
        "(line 134,col 9)-(line 134,col 82)",
        "(line 135,col 9)-(line 135,col 75)",
        "(line 137,col 9)-(line 137,col 33)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 141,col 9)-(line 141,col 81)",
        "(line 142,col 9)-(line 142,col 73)",
        "(line 143,col 9)-(line 143,col 87)",
        "(line 144,col 9)-(line 144,col 95)",
        "(line 145,col 9)-(line 145,col 81)",
        "(line 146,col 9)-(line 146,col 65)",
        "(line 147,col 9)-(line 147,col 78)",
        "(line 148,col 9)-(line 148,col 86)",
        "(line 149,col 9)-(line 149,col 82)",
        "(line 150,col 9)-(line 150,col 75)",
        "(line 153,col 9)-(line 153,col 79)",
        "(line 155,col 9)-(line 155,col 44)",
        "(line 157,col 9)-(line 157,col 33)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 161,col 9)-(line 161,col 77)",
        "(line 162,col 9)-(line 162,col 70)",
        "(line 163,col 9)-(line 163,col 88)",
        "(line 164,col 9)-(line 164,col 95)",
        "(line 165,col 9)-(line 165,col 81)",
        "(line 166,col 9)-(line 166,col 62)",
        "(line 167,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 168,col 83)",
        "(line 169,col 9)-(line 169,col 79)",
        "(line 170,col 9)-(line 170,col 79)",
        "(line 171,col 9)-(line 171,col 72)",
        "(line 173,col 9)-(line 173,col 33)",
        "(line 176,col 9)-(line 176,col 78)",
        "(line 177,col 9)-(line 177,col 84)",
        "(line 178,col 9)-(line 178,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 181,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 61)",
        "(line 183,col 9)-(line 183,col 37)",
        "(line 184,col 9)-(line 184,col 70)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 69)",
        "(line 187,col 9)-(line 187,col 37)",
        "(line 188,col 9)-(line 188,col 74)",
        "(line 189,col 9)-(line 189,col 33)",
        "(line 190,col 9)-(line 190,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 193,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 61)",
        "(line 197,col 9)-(line 197,col 36)",
        "(line 198,col 9)-(line 199,col 52)",
        "(line 200,col 9)-(line 201,col 54)",
        "(line 202,col 9)-(line 203,col 51)",
        "(line 204,col 9)-(line 205,col 62)",
        "(line 207,col 9)-(line 207,col 44)",
        "(line 208,col 9)-(line 208,col 37)",
        "(line 209,col 9)-(line 210,col 51)",
        "(line 211,col 9)-(line 212,col 54)",
        "(line 213,col 9)-(line 214,col 52)",
        "(line 215,col 9)-(line 216,col 62)",
        "(line 220,col 9)-(line 221,col 103)",
        "(line 223,col 9)-(line 228,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 232,
      "end_line": 241,
      "comment": "",
      "child_ranges": [
        "(line 233,col 9)-(line 233,col 61)",
        "(line 234,col 9)-(line 234,col 20)",
        "(line 235,col 9)-(line 237,col 9)",
        "(line 238,col 9)-(line 238,col 64)",
        "(line 239,col 9)-(line 239,col 48)",
        "(line 240,col 9)-(line 240,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 243,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 61)",
        "(line 245,col 9)-(line 245,col 20)",
        "(line 246,col 9)-(line 248,col 9)",
        "(line 250,col 9)-(line 250,col 64)",
        "(line 251,col 9)-(line 251,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 254,
      "end_line": 264,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 61)",
        "(line 256,col 9)-(line 256,col 38)",
        "(line 257,col 9)-(line 257,col 20)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 263,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 268,
      "end_line": 276,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 54)",
        "(line 270,col 9)-(line 270,col 69)",
        "(line 271,col 9)-(line 271,col 54)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 275,col 9)-(line 275,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 279,
      "end_line": 294,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 61)",
        "(line 282,col 9)-(line 282,col 36)",
        "(line 283,col 9)-(line 283,col 48)",
        "(line 284,col 9)-(line 284,col 45)",
        "(line 286,col 9)-(line 287,col 52)",
        "(line 288,col 9)-(line 289,col 54)",
        "(line 290,col 9)-(line 291,col 51)",
        "(line 292,col 9)-(line 293,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 298,
      "end_line": 313,
      "comment": " Test remove single observation in array",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 61)",
        "(line 301,col 9)-(line 301,col 36)",
        "(line 302,col 9)-(line 302,col 44)",
        "(line 303,col 9)-(line 303,col 41)",
        "(line 305,col 9)-(line 306,col 52)",
        "(line 307,col 9)-(line 308,col 54)",
        "(line 309,col 9)-(line 310,col 51)",
        "(line 311,col 9)-(line 312,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiple()",
      "begin_line": 316,
      "end_line": 331,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 61)",
        "(line 319,col 9)-(line 319,col 36)",
        "(line 320,col 9)-(line 320,col 46)",
        "(line 321,col 9)-(line 321,col 43)",
        "(line 323,col 9)-(line 324,col 52)",
        "(line 325,col 9)-(line 326,col 54)",
        "(line 327,col 9)-(line 328,col 51)",
        "(line 329,col 9)-(line 330,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 334,
      "end_line": 338,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 61)",
        "(line 336,col 9)-(line 336,col 48)",
        "(line 337,col 9)-(line 337,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 341,
      "end_line": 346,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 61)",
        "(line 343,col 9)-(line 343,col 45)",
        "(line 344,col 9)-(line 344,col 48)",
        "(line 345,col 9)-(line 345,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 349,
      "end_line": 354,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 61)",
        "(line 351,col 9)-(line 351,col 43)",
        "(line 352,col 9)-(line 352,col 46)",
        "(line 353,col 9)-(line 353,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 357,
      "end_line": 362,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 358,col 9)-(line 358,col 61)",
        "(line 359,col 9)-(line 359,col 45)",
        "(line 360,col 9)-(line 360,col 46)",
        "(line 361,col 9)-(line 361,col 43)"
      ]
    }
  ]
}
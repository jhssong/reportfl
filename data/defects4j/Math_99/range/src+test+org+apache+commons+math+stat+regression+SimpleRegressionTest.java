{
  "filepath": "/tmp/Math-99b/src/test/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 373,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "data"
      ],
      "begin_line": 37,
      "end_line": 45,
      "comment": " \n     * NIST \"Norris\" refernce data set from \n     * http://www.itl.nist.gov/div898/strd/lls/data/LINKS/DATA/Norris.dat\n     * Strangely, order is {y,x}\n     "
    },
    {
      "type": "field",
      "varNames": [
        "corrData"
      ],
      "begin_line": 51,
      "end_line": 55,
      "comment": " \n     * Correlation example from \n     * http://www.xycoon.com/correlation.htm\n     "
    },
    {
      "type": "field",
      "varNames": [
        "infData"
      ],
      "begin_line": 61,
      "end_line": 63,
      "comment": "\n     * From Moore and Mcabe, \"Introduction to the Practice of Statistics\"\n     * Example 10.3 \n     "
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
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.setUp()",
      "begin_line": 85,
      "end_line": 86,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.suite()",
      "begin_line": 88,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 68)",
        "(line 90,col 9)-(line 90,col 51)",
        "(line 91,col 9)-(line 91,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 94,
      "end_line": 123,
      "comment": "",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 61)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 101,col 9)-(line 101,col 79)",
        "(line 102,col 9)-(line 103,col 52)",
        "(line 104,col 9)-(line 104,col 70)",
        "(line 105,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 108,col 52)",
        "(line 109,col 9)-(line 110,col 45)",
        "(line 111,col 9)-(line 112,col 57)",
        "(line 113,col 9)-(line 114,col 53)",
        "(line 115,col 9)-(line 116,col 52)",
        "(line 119,col 9)-(line 120,col 43)",
        "(line 121,col 9)-(line 122,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 125,
      "end_line": 131,
      "comment": "",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 61)",
        "(line 127,col 9)-(line 127,col 37)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 74)",
        "(line 130,col 9)-(line 130,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 133,
      "end_line": 189,
      "comment": "",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 61)",
        "(line 135,col 9)-(line 135,col 81)",
        "(line 136,col 9)-(line 136,col 73)",
        "(line 137,col 9)-(line 137,col 87)",
        "(line 138,col 9)-(line 138,col 95)",
        "(line 139,col 9)-(line 139,col 81)",
        "(line 140,col 9)-(line 140,col 65)",
        "(line 141,col 9)-(line 141,col 78)",
        "(line 142,col 9)-(line 142,col 87)",
        "(line 143,col 9)-(line 143,col 81)",
        "(line 144,col 9)-(line 144,col 82)",
        "(line 145,col 9)-(line 145,col 75)",
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 151,col 9)-(line 151,col 81)",
        "(line 152,col 9)-(line 152,col 73)",
        "(line 153,col 9)-(line 153,col 87)",
        "(line 154,col 9)-(line 154,col 95)",
        "(line 155,col 9)-(line 155,col 81)",
        "(line 156,col 9)-(line 156,col 65)",
        "(line 157,col 9)-(line 157,col 78)",
        "(line 158,col 9)-(line 158,col 86)",
        "(line 159,col 9)-(line 159,col 82)",
        "(line 160,col 9)-(line 160,col 75)",
        "(line 163,col 9)-(line 163,col 79)",
        "(line 165,col 9)-(line 165,col 44)",
        "(line 167,col 9)-(line 167,col 33)",
        "(line 168,col 9)-(line 168,col 33)",
        "(line 171,col 9)-(line 171,col 77)",
        "(line 172,col 9)-(line 172,col 70)",
        "(line 173,col 9)-(line 173,col 88)",
        "(line 174,col 9)-(line 174,col 95)",
        "(line 175,col 9)-(line 175,col 81)",
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 177,col 75)",
        "(line 178,col 9)-(line 178,col 83)",
        "(line 179,col 9)-(line 179,col 79)",
        "(line 180,col 9)-(line 180,col 79)",
        "(line 181,col 9)-(line 181,col 72)",
        "(line 183,col 9)-(line 183,col 33)",
        "(line 186,col 9)-(line 186,col 78)",
        "(line 187,col 9)-(line 187,col 84)",
        "(line 188,col 9)-(line 188,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 191,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 61)",
        "(line 193,col 9)-(line 193,col 37)",
        "(line 194,col 9)-(line 194,col 70)",
        "(line 195,col 9)-(line 195,col 27)",
        "(line 196,col 9)-(line 196,col 69)",
        "(line 197,col 9)-(line 197,col 37)",
        "(line 198,col 9)-(line 198,col 74)",
        "(line 199,col 9)-(line 199,col 33)",
        "(line 200,col 9)-(line 200,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 203,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 61)",
        "(line 207,col 9)-(line 207,col 36)",
        "(line 208,col 9)-(line 209,col 52)",
        "(line 210,col 9)-(line 211,col 54)",
        "(line 212,col 9)-(line 213,col 51)",
        "(line 214,col 9)-(line 215,col 62)",
        "(line 217,col 9)-(line 217,col 44)",
        "(line 218,col 9)-(line 218,col 37)",
        "(line 219,col 9)-(line 220,col 51)",
        "(line 221,col 9)-(line 222,col 54)",
        "(line 223,col 9)-(line 224,col 52)",
        "(line 225,col 9)-(line 226,col 62)",
        "(line 230,col 9)-(line 231,col 103)",
        "(line 233,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 242,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 61)",
        "(line 244,col 9)-(line 244,col 20)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 64)",
        "(line 249,col 9)-(line 249,col 48)",
        "(line 250,col 9)-(line 250,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 253,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 61)",
        "(line 255,col 9)-(line 255,col 20)",
        "(line 256,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 64)",
        "(line 261,col 9)-(line 261,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 264,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 61)",
        "(line 266,col 9)-(line 266,col 38)",
        "(line 267,col 9)-(line 267,col 20)",
        "(line 268,col 9)-(line 270,col 9)",
        "(line 272,col 9)-(line 273,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 278,
      "end_line": 286,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 54)",
        "(line 280,col 9)-(line 280,col 69)",
        "(line 281,col 9)-(line 281,col 54)",
        "(line 282,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveXY()",
      "begin_line": 289,
      "end_line": 304,
      "comment": " Test remove X,Y (single observation)",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 61)",
        "(line 292,col 9)-(line 292,col 36)",
        "(line 293,col 9)-(line 293,col 48)",
        "(line 294,col 9)-(line 294,col 45)",
        "(line 296,col 9)-(line 297,col 52)",
        "(line 298,col 9)-(line 299,col 54)",
        "(line 300,col 9)-(line 301,col 51)",
        "(line 302,col 9)-(line 303,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveSingle()",
      "begin_line": 308,
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
      "end_line": 341,
      "comment": " Test remove multiple observations",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 61)",
        "(line 329,col 9)-(line 329,col 36)",
        "(line 330,col 9)-(line 330,col 46)",
        "(line 331,col 9)-(line 331,col 43)",
        "(line 333,col 9)-(line 334,col 52)",
        "(line 335,col 9)-(line 336,col 54)",
        "(line 337,col 9)-(line 338,col 51)",
        "(line 339,col 9)-(line 340,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromEmpty()",
      "begin_line": 344,
      "end_line": 348,
      "comment": " Remove observation when empty",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 61)",
        "(line 346,col 9)-(line 346,col 48)",
        "(line 347,col 9)-(line 347,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveObsFromSingle()",
      "begin_line": 351,
      "end_line": 356,
      "comment": " Remove single observation to empty",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 61)",
        "(line 353,col 9)-(line 353,col 45)",
        "(line 354,col 9)-(line 354,col 48)",
        "(line 355,col 9)-(line 355,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultipleToEmpty()",
      "begin_line": 359,
      "end_line": 364,
      "comment": " Remove multiple observations to empty",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 61)",
        "(line 361,col 9)-(line 361,col 43)",
        "(line 362,col 9)-(line 362,col 46)",
        "(line 363,col 9)-(line 363,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRemoveMultiplePastEmpty()",
      "begin_line": 367,
      "end_line": 372,
      "comment": " Remove multiple observations past empty (i.e. size of array \u003e n)",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 61)",
        "(line 369,col 9)-(line 369,col 45)",
        "(line 370,col 9)-(line 370,col 46)",
        "(line 371,col 9)-(line 371,col 43)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/stat/regression/SimpleRegressionTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SimpleRegressionTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 30,
      "end_line": 278,
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
        "infData2"
      ],
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * Data with bad linear fit\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.SimpleRegressionTest(java.lang.String)",
      "begin_line": 72,
      "end_line": 74,
      "comment": "",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.setUp()",
      "begin_line": 76,
      "end_line": 77,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.suite()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 68)",
        "(line 81,col 9)-(line 81,col 51)",
        "(line 82,col 9)-(line 82,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNorris()",
      "begin_line": 85,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 61)",
        "(line 87,col 9)-(line 89,col 9)",
        "(line 92,col 9)-(line 92,col 79)",
        "(line 93,col 9)-(line 94,col 52)",
        "(line 95,col 9)-(line 95,col 70)",
        "(line 96,col 9)-(line 97,col 46)",
        "(line 98,col 9)-(line 99,col 52)",
        "(line 100,col 9)-(line 101,col 45)",
        "(line 102,col 9)-(line 103,col 57)",
        "(line 104,col 9)-(line 105,col 53)",
        "(line 106,col 9)-(line 107,col 52)",
        "(line 110,col 9)-(line 111,col 43)",
        "(line 112,col 9)-(line 113,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testCorr()",
      "begin_line": 116,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 61)",
        "(line 118,col 9)-(line 118,col 37)",
        "(line 119,col 9)-(line 119,col 70)",
        "(line 120,col 9)-(line 120,col 74)",
        "(line 121,col 9)-(line 121,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testNaNs()",
      "begin_line": 124,
      "end_line": 180,
      "comment": "",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 61)",
        "(line 126,col 9)-(line 126,col 81)",
        "(line 127,col 9)-(line 127,col 73)",
        "(line 128,col 9)-(line 128,col 87)",
        "(line 129,col 9)-(line 129,col 95)",
        "(line 130,col 9)-(line 130,col 81)",
        "(line 131,col 9)-(line 131,col 65)",
        "(line 132,col 9)-(line 132,col 78)",
        "(line 133,col 9)-(line 133,col 87)",
        "(line 134,col 9)-(line 134,col 81)",
        "(line 135,col 9)-(line 135,col 82)",
        "(line 136,col 9)-(line 136,col 75)",
        "(line 138,col 9)-(line 138,col 33)",
        "(line 139,col 9)-(line 139,col 33)",
        "(line 142,col 9)-(line 142,col 81)",
        "(line 143,col 9)-(line 143,col 73)",
        "(line 144,col 9)-(line 144,col 87)",
        "(line 145,col 9)-(line 145,col 95)",
        "(line 146,col 9)-(line 146,col 81)",
        "(line 147,col 9)-(line 147,col 65)",
        "(line 148,col 9)-(line 148,col 78)",
        "(line 149,col 9)-(line 149,col 86)",
        "(line 150,col 9)-(line 150,col 82)",
        "(line 151,col 9)-(line 151,col 75)",
        "(line 154,col 9)-(line 154,col 79)",
        "(line 156,col 9)-(line 156,col 44)",
        "(line 158,col 9)-(line 158,col 33)",
        "(line 159,col 9)-(line 159,col 33)",
        "(line 162,col 9)-(line 162,col 77)",
        "(line 163,col 9)-(line 163,col 70)",
        "(line 164,col 9)-(line 164,col 88)",
        "(line 165,col 9)-(line 165,col 95)",
        "(line 166,col 9)-(line 166,col 81)",
        "(line 167,col 9)-(line 167,col 62)",
        "(line 168,col 9)-(line 168,col 75)",
        "(line 169,col 9)-(line 169,col 83)",
        "(line 170,col 9)-(line 170,col 79)",
        "(line 171,col 9)-(line 171,col 79)",
        "(line 172,col 9)-(line 172,col 72)",
        "(line 174,col 9)-(line 174,col 33)",
        "(line 177,col 9)-(line 177,col 78)",
        "(line 178,col 9)-(line 178,col 84)",
        "(line 179,col 9)-(line 179,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testClear()",
      "begin_line": 182,
      "end_line": 192,
      "comment": "",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 61)",
        "(line 184,col 9)-(line 184,col 37)",
        "(line 185,col 9)-(line 185,col 70)",
        "(line 186,col 9)-(line 186,col 27)",
        "(line 187,col 9)-(line 187,col 69)",
        "(line 188,col 9)-(line 188,col 37)",
        "(line 189,col 9)-(line 189,col 74)",
        "(line 190,col 9)-(line 190,col 33)",
        "(line 191,col 9)-(line 191,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testInference()",
      "begin_line": 194,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 61)",
        "(line 198,col 9)-(line 198,col 36)",
        "(line 199,col 9)-(line 200,col 52)",
        "(line 201,col 9)-(line 202,col 54)",
        "(line 203,col 9)-(line 204,col 51)",
        "(line 205,col 9)-(line 206,col 62)",
        "(line 208,col 9)-(line 208,col 44)",
        "(line 209,col 9)-(line 209,col 37)",
        "(line 210,col 9)-(line 211,col 51)",
        "(line 212,col 9)-(line 213,col 54)",
        "(line 214,col 9)-(line 215,col 52)",
        "(line 216,col 9)-(line 217,col 62)",
        "(line 221,col 9)-(line 222,col 103)",
        "(line 224,col 9)-(line 229,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfect()",
      "begin_line": 233,
      "end_line": 242,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 61)",
        "(line 235,col 9)-(line 235,col 20)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 64)",
        "(line 240,col 9)-(line 240,col 48)",
        "(line 241,col 9)-(line 241,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testPerfectNegative()",
      "begin_line": 244,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 61)",
        "(line 246,col 9)-(line 246,col 20)",
        "(line 247,col 9)-(line 249,col 9)",
        "(line 251,col 9)-(line 251,col 64)",
        "(line 252,col 9)-(line 252,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testRandom()",
      "begin_line": 255,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 61)",
        "(line 257,col 9)-(line 257,col 38)",
        "(line 258,col 9)-(line 258,col 20)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 264,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.regression.SimpleRegressionTest.testSSENonNegative()",
      "begin_line": 269,
      "end_line": 277,
      "comment": " Jira MATH-85 \u003d Bugzilla 39432",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 54)",
        "(line 271,col 9)-(line 271,col 69)",
        "(line 272,col 9)-(line 272,col 54)",
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 276,col 53)"
      ]
    }
  ]
}
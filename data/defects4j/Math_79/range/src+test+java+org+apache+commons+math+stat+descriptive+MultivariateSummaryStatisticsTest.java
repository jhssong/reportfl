{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.MultivariateSummaryStatisticsTest(java.lang.String)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.suite()",
      "begin_line": 42,
      "end_line": 46,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 81)",
        "(line 44,col 9)-(line 44,col 61)",
        "(line 45,col 9)-(line 45,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.createMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterInjection()",
      "begin_line": 52,
      "end_line": 75,
      "comment": "",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 87)",
        "(line 54,col 9)-(line 56,col 25)",
        "(line 57,col 9)-(line 57,col 42)",
        "(line 58,col 9)-(line 58,col 42)",
        "(line 59,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 47)",
        "(line 61,col 9)-(line 61,col 18)",
        "(line 62,col 9)-(line 62,col 42)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 47)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 42)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 72,col 47)",
        "(line 73,col 9)-(line 73,col 47)",
        "(line 74,col 9)-(line 74,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterIllegalState()",
      "begin_line": 77,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 87)",
        "(line 79,col 9)-(line 79,col 42)",
        "(line 80,col 9)-(line 80,col 42)",
        "(line 81,col 9)-(line 88,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testToString()",
      "begin_line": 91,
      "end_line": 110,
      "comment": "",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 91)",
        "(line 93,col 9)-(line 93,col 44)",
        "(line 94,col 9)-(line 94,col 44)",
        "(line 95,col 9)-(line 95,col 44)",
        "(line 96,col 9)-(line 96,col 39)",
        "(line 97,col 9)-(line 97,col 37)",
        "(line 98,col 9)-(line 108,col 95)",
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testShuffledStatistics()",
      "begin_line": 112,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 95)",
        "(line 117,col 9)-(line 117,col 95)",
        "(line 119,col 9)-(line 119,col 71)",
        "(line 120,col 9)-(line 120,col 56)",
        "(line 121,col 9)-(line 121,col 52)",
        "(line 122,col 9)-(line 122,col 51)",
        "(line 123,col 9)-(line 123,col 51)",
        "(line 124,col 9)-(line 124,col 53)",
        "(line 125,col 9)-(line 125,col 56)",
        "(line 126,col 9)-(line 126,col 36)",
        "(line 128,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 133,col 99)",
        "(line 134,col 9)-(line 134,col 99)",
        "(line 135,col 9)-(line 135,col 99)",
        "(line 136,col 9)-(line 136,col 99)",
        "(line 137,col 9)-(line 137,col 99)",
        "(line 138,col 9)-(line 138,col 99)",
        "(line 139,col 9)-(line 139,col 99)"
      ]
    },
    {
      "type": "class_interface",
      "name": "sumMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 147,
      "end_line": 177,
      "comment": "\n     * Bogus mean implementation to test setter injection.\n     * Returns the sum instead of the mean.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[], int, int)",
      "begin_line": 150,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[])",
      "begin_line": 153,
      "end_line": 155,
      "comment": "",
      "child_ranges": [
        "(line 154,col 13)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.clear()",
      "begin_line": 156,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 157,col 11)-(line 157,col 18)",
        "(line 158,col 11)-(line 158,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getN()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getResult()",
      "begin_line": 163,
      "end_line": 165,
      "comment": "",
      "child_ranges": [
        "(line 164,col 13)-(line 164,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.increment(double)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 21)",
        "(line 168,col 13)-(line 168,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[], int, int)",
      "begin_line": 170,
      "end_line": 171,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[])",
      "begin_line": 172,
      "end_line": 173,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.copy()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 175,col 13)-(line 175,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension()",
      "begin_line": 179,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 180,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testStats()",
      "begin_line": 190,
      "end_line": 220,
      "comment": " test stats ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 87)",
        "(line 192,col 9)-(line 192,col 34)",
        "(line 193,col 9)-(line 193,col 42)",
        "(line 194,col 9)-(line 194,col 42)",
        "(line 195,col 9)-(line 195,col 42)",
        "(line 196,col 9)-(line 196,col 42)",
        "(line 197,col 9)-(line 197,col 35)",
        "(line 198,col 9)-(line 198,col 49)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 200,col 9)-(line 200,col 51)",
        "(line 201,col 9)-(line 201,col 51)",
        "(line 202,col 9)-(line 202,col 49)",
        "(line 203,col 9)-(line 203,col 49)",
        "(line 204,col 9)-(line 204,col 49)",
        "(line 205,col 9)-(line 205,col 49)",
        "(line 206,col 9)-(line 206,col 71)",
        "(line 207,col 9)-(line 207,col 71)",
        "(line 208,col 9)-(line 208,col 79)",
        "(line 209,col 9)-(line 209,col 79)",
        "(line 210,col 9)-(line 210,col 50)",
        "(line 211,col 9)-(line 211,col 50)",
        "(line 212,col 9)-(line 212,col 81)",
        "(line 213,col 9)-(line 213,col 81)",
        "(line 214,col 9)-(line 214,col 75)",
        "(line 215,col 9)-(line 215,col 75)",
        "(line 216,col 9)-(line 216,col 75)",
        "(line 217,col 9)-(line 217,col 75)",
        "(line 218,col 9)-(line 218,col 18)",
        "(line 219,col 9)-(line 219,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions()",
      "begin_line": 222,
      "end_line": 237,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 87)",
        "(line 224,col 9)-(line 224,col 49)",
        "(line 225,col 9)-(line 225,col 62)",
        "(line 228,col 9)-(line 228,col 39)",
        "(line 229,col 9)-(line 229,col 51)",
        "(line 230,col 9)-(line 230,col 60)",
        "(line 231,col 9)-(line 231,col 64)",
        "(line 234,col 9)-(line 234,col 39)",
        "(line 235,col 9)-(line 235,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts()",
      "begin_line": 239,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 87)",
        "(line 241,col 9)-(line 241,col 49)",
        "(line 242,col 9)-(line 242,col 48)",
        "(line 243,col 9)-(line 243,col 62)",
        "(line 244,col 9)-(line 244,col 58)",
        "(line 246,col 9)-(line 246,col 41)",
        "(line 247,col 9)-(line 247,col 50)",
        "(line 248,col 9)-(line 248,col 49)",
        "(line 249,col 9)-(line 249,col 63)",
        "(line 250,col 9)-(line 250,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization()",
      "begin_line": 254,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 87)",
        "(line 257,col 9)-(line 257,col 45)",
        "(line 258,col 9)-(line 258,col 107)",
        "(line 259,col 9)-(line 259,col 27)",
        "(line 262,col 9)-(line 262,col 44)",
        "(line 263,col 9)-(line 263,col 44)",
        "(line 264,col 9)-(line 264,col 44)",
        "(line 265,col 9)-(line 265,col 44)",
        "(line 266,col 9)-(line 266,col 44)",
        "(line 269,col 9)-(line 269,col 45)",
        "(line 270,col 9)-(line 270,col 77)",
        "(line 271,col 9)-(line 271,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode()",
      "begin_line": 275,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 87)",
        "(line 277,col 9)-(line 277,col 47)",
        "(line 278,col 9)-(line 278,col 37)",
        "(line 279,col 9)-(line 279,col 32)",
        "(line 280,col 9)-(line 280,col 33)",
        "(line 281,col 9)-(line 281,col 49)",
        "(line 282,col 9)-(line 282,col 57)",
        "(line 283,col 9)-(line 283,col 32)",
        "(line 284,col 9)-(line 284,col 32)",
        "(line 285,col 9)-(line 285,col 46)",
        "(line 288,col 9)-(line 288,col 44)",
        "(line 289,col 9)-(line 289,col 44)",
        "(line 290,col 9)-(line 290,col 44)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 33)",
        "(line 294,col 9)-(line 294,col 33)",
        "(line 295,col 9)-(line 295,col 49)",
        "(line 298,col 9)-(line 298,col 44)",
        "(line 299,col 9)-(line 299,col 44)",
        "(line 300,col 9)-(line 300,col 44)",
        "(line 301,col 9)-(line 301,col 44)",
        "(line 302,col 9)-(line 302,col 44)",
        "(line 303,col 9)-(line 303,col 32)",
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 305,col 49)",
        "(line 308,col 9)-(line 308,col 18)",
        "(line 309,col 9)-(line 309,col 18)",
        "(line 310,col 9)-(line 310,col 32)",
        "(line 311,col 9)-(line 311,col 32)",
        "(line 312,col 9)-(line 312,col 46)",
        "(line 313,col 9)-(line 313,col 46)"
      ]
    }
  ]
}
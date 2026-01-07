{
  "filepath": "/tmp/Math-62b/src/test/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 35,
      "end_line": 310,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.MultivariateSummaryStatisticsTest(java.lang.String)",
      "begin_line": 37,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 38,col 9)-(line 38,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.createMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterInjection()",
      "begin_line": 45,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 87)",
        "(line 47,col 9)-(line 49,col 25)",
        "(line 50,col 9)-(line 50,col 42)",
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 52,col 47)",
        "(line 53,col 9)-(line 53,col 47)",
        "(line 54,col 9)-(line 54,col 18)",
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 57,col 47)",
        "(line 58,col 9)-(line 58,col 47)",
        "(line 59,col 9)-(line 59,col 18)",
        "(line 60,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 42)",
        "(line 65,col 9)-(line 65,col 47)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterIllegalState()",
      "begin_line": 70,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 87)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 73,col 42)",
        "(line 74,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testToString()",
      "begin_line": 84,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 91)",
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 44)",
        "(line 89,col 9)-(line 89,col 39)",
        "(line 90,col 9)-(line 90,col 37)",
        "(line 91,col 9)-(line 91,col 67)",
        "(line 92,col 9)-(line 102,col 95)",
        "(line 103,col 9)-(line 103,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testShuffledStatistics()",
      "begin_line": 106,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 95)",
        "(line 111,col 9)-(line 111,col 95)",
        "(line 113,col 9)-(line 113,col 71)",
        "(line 114,col 9)-(line 114,col 56)",
        "(line 115,col 9)-(line 115,col 52)",
        "(line 116,col 9)-(line 116,col 51)",
        "(line 117,col 9)-(line 117,col 51)",
        "(line 118,col 9)-(line 118,col 53)",
        "(line 119,col 9)-(line 119,col 56)",
        "(line 120,col 9)-(line 120,col 36)",
        "(line 122,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 99)",
        "(line 128,col 9)-(line 128,col 99)",
        "(line 129,col 9)-(line 129,col 99)",
        "(line 130,col 9)-(line 130,col 99)",
        "(line 131,col 9)-(line 131,col 99)",
        "(line 132,col 9)-(line 132,col 99)",
        "(line 133,col 9)-(line 133,col 99)"
      ]
    },
    {
      "type": "class_interface",
      "name": "sumMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 141,
      "end_line": 171,
      "comment": "\n     * Bogus mean implementation to test setter injection.\n     * Returns the sum instead of the mean.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[], int, int)",
      "begin_line": 144,
      "end_line": 146,
      "comment": "",
      "child_ranges": [
        "(line 145,col 13)-(line 145,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[])",
      "begin_line": 147,
      "end_line": 149,
      "comment": "",
      "child_ranges": [
        "(line 148,col 13)-(line 148,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.clear()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "",
      "child_ranges": [
        "(line 151,col 11)-(line 151,col 18)",
        "(line 152,col 11)-(line 152,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getN()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getResult()",
      "begin_line": 157,
      "end_line": 159,
      "comment": "",
      "child_ranges": [
        "(line 158,col 13)-(line 158,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.increment(double)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "",
      "child_ranges": [
        "(line 161,col 13)-(line 161,col 21)",
        "(line 162,col 13)-(line 162,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[], int, int)",
      "begin_line": 164,
      "end_line": 165,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[])",
      "begin_line": 166,
      "end_line": 167,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.copy()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "",
      "child_ranges": [
        "(line 169,col 13)-(line 169,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension()",
      "begin_line": 173,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 174,col 9)-(line 180,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testStats()",
      "begin_line": 184,
      "end_line": 214,
      "comment": " test stats ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 87)",
        "(line 186,col 9)-(line 186,col 34)",
        "(line 187,col 9)-(line 187,col 42)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 42)",
        "(line 190,col 9)-(line 190,col 42)",
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 192,col 49)",
        "(line 193,col 9)-(line 193,col 49)",
        "(line 194,col 9)-(line 194,col 51)",
        "(line 195,col 9)-(line 195,col 51)",
        "(line 196,col 9)-(line 196,col 49)",
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 198,col 49)",
        "(line 199,col 9)-(line 199,col 49)",
        "(line 200,col 9)-(line 200,col 71)",
        "(line 201,col 9)-(line 201,col 71)",
        "(line 202,col 9)-(line 202,col 79)",
        "(line 203,col 9)-(line 203,col 79)",
        "(line 204,col 9)-(line 204,col 50)",
        "(line 205,col 9)-(line 205,col 50)",
        "(line 206,col 9)-(line 206,col 85)",
        "(line 207,col 9)-(line 207,col 85)",
        "(line 208,col 9)-(line 208,col 75)",
        "(line 209,col 9)-(line 209,col 75)",
        "(line 210,col 9)-(line 210,col 75)",
        "(line 211,col 9)-(line 211,col 75)",
        "(line 212,col 9)-(line 212,col 18)",
        "(line 213,col 9)-(line 213,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions()",
      "begin_line": 216,
      "end_line": 231,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 87)",
        "(line 218,col 9)-(line 218,col 49)",
        "(line 219,col 9)-(line 219,col 62)",
        "(line 222,col 9)-(line 222,col 39)",
        "(line 223,col 9)-(line 223,col 51)",
        "(line 224,col 9)-(line 224,col 60)",
        "(line 225,col 9)-(line 225,col 64)",
        "(line 228,col 9)-(line 228,col 39)",
        "(line 229,col 9)-(line 229,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts()",
      "begin_line": 233,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 87)",
        "(line 235,col 9)-(line 235,col 49)",
        "(line 236,col 9)-(line 236,col 48)",
        "(line 237,col 9)-(line 237,col 62)",
        "(line 238,col 9)-(line 238,col 58)",
        "(line 240,col 9)-(line 240,col 41)",
        "(line 241,col 9)-(line 241,col 50)",
        "(line 242,col 9)-(line 242,col 49)",
        "(line 243,col 9)-(line 243,col 63)",
        "(line 244,col 9)-(line 244,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization()",
      "begin_line": 248,
      "end_line": 267,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 87)",
        "(line 251,col 9)-(line 251,col 45)",
        "(line 252,col 9)-(line 252,col 107)",
        "(line 253,col 9)-(line 253,col 27)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 44)",
        "(line 259,col 9)-(line 259,col 44)",
        "(line 260,col 9)-(line 260,col 44)",
        "(line 263,col 9)-(line 263,col 45)",
        "(line 264,col 9)-(line 264,col 77)",
        "(line 265,col 9)-(line 265,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode()",
      "begin_line": 269,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 87)",
        "(line 271,col 9)-(line 271,col 47)",
        "(line 272,col 9)-(line 272,col 37)",
        "(line 273,col 9)-(line 273,col 32)",
        "(line 274,col 9)-(line 274,col 33)",
        "(line 275,col 9)-(line 275,col 49)",
        "(line 276,col 9)-(line 276,col 57)",
        "(line 277,col 9)-(line 277,col 32)",
        "(line 278,col 9)-(line 278,col 32)",
        "(line 279,col 9)-(line 279,col 46)",
        "(line 282,col 9)-(line 282,col 44)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 44)",
        "(line 286,col 9)-(line 286,col 44)",
        "(line 287,col 9)-(line 287,col 33)",
        "(line 288,col 9)-(line 288,col 33)",
        "(line 289,col 9)-(line 289,col 49)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 44)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 44)",
        "(line 296,col 9)-(line 296,col 44)",
        "(line 297,col 9)-(line 297,col 32)",
        "(line 298,col 9)-(line 298,col 32)",
        "(line 299,col 9)-(line 299,col 49)",
        "(line 302,col 9)-(line 302,col 18)",
        "(line 303,col 9)-(line 303,col 18)",
        "(line 304,col 9)-(line 304,col 32)",
        "(line 305,col 9)-(line 305,col 32)",
        "(line 306,col 9)-(line 306,col 46)",
        "(line 307,col 9)-(line 307,col 46)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 308,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.MultivariateSummaryStatisticsTest(java.lang.String)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.createMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 79)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterInjection()",
      "begin_line": 44,
      "end_line": 67,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 87)",
        "(line 46,col 9)-(line 48,col 25)",
        "(line 49,col 9)-(line 49,col 42)",
        "(line 50,col 9)-(line 50,col 42)",
        "(line 51,col 9)-(line 51,col 47)",
        "(line 52,col 9)-(line 52,col 47)",
        "(line 53,col 9)-(line 53,col 18)",
        "(line 54,col 9)-(line 54,col 42)",
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 56,col 47)",
        "(line 57,col 9)-(line 57,col 47)",
        "(line 58,col 9)-(line 58,col 18)",
        "(line 59,col 9)-(line 61,col 25)",
        "(line 62,col 9)-(line 62,col 42)",
        "(line 63,col 9)-(line 63,col 42)",
        "(line 64,col 9)-(line 64,col 47)",
        "(line 65,col 9)-(line 65,col 47)",
        "(line 66,col 9)-(line 66,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterIllegalState()",
      "begin_line": 69,
      "end_line": 81,
      "comment": "",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 87)",
        "(line 71,col 9)-(line 71,col 42)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 80,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testToString()",
      "begin_line": 83,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 91)",
        "(line 85,col 9)-(line 85,col 44)",
        "(line 86,col 9)-(line 86,col 44)",
        "(line 87,col 9)-(line 87,col 44)",
        "(line 88,col 9)-(line 88,col 39)",
        "(line 89,col 9)-(line 89,col 37)",
        "(line 90,col 9)-(line 100,col 95)",
        "(line 101,col 9)-(line 101,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testShuffledStatistics()",
      "begin_line": 104,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 95)",
        "(line 109,col 9)-(line 109,col 95)",
        "(line 111,col 9)-(line 111,col 71)",
        "(line 112,col 9)-(line 112,col 56)",
        "(line 113,col 9)-(line 113,col 52)",
        "(line 114,col 9)-(line 114,col 51)",
        "(line 115,col 9)-(line 115,col 51)",
        "(line 116,col 9)-(line 116,col 53)",
        "(line 117,col 9)-(line 117,col 56)",
        "(line 118,col 9)-(line 118,col 36)",
        "(line 120,col 9)-(line 123,col 9)",
        "(line 125,col 9)-(line 125,col 99)",
        "(line 126,col 9)-(line 126,col 99)",
        "(line 127,col 9)-(line 127,col 99)",
        "(line 128,col 9)-(line 128,col 99)",
        "(line 129,col 9)-(line 129,col 99)",
        "(line 130,col 9)-(line 130,col 99)",
        "(line 131,col 9)-(line 131,col 99)"
      ]
    },
    {
      "type": "class_interface",
      "name": "sumMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 139,
      "end_line": 169,
      "comment": "\n     * Bogus mean implementation to test setter injection.\n     * Returns the sum instead of the mean.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[], int, int)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "",
      "child_ranges": [
        "(line 143,col 13)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[])",
      "begin_line": 145,
      "end_line": 147,
      "comment": "",
      "child_ranges": [
        "(line 146,col 13)-(line 146,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.clear()",
      "begin_line": 148,
      "end_line": 151,
      "comment": "",
      "child_ranges": [
        "(line 149,col 11)-(line 149,col 18)",
        "(line 150,col 11)-(line 150,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getN()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getResult()",
      "begin_line": 155,
      "end_line": 157,
      "comment": "",
      "child_ranges": [
        "(line 156,col 13)-(line 156,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.increment(double)",
      "begin_line": 158,
      "end_line": 161,
      "comment": "",
      "child_ranges": [
        "(line 159,col 13)-(line 159,col 21)",
        "(line 160,col 13)-(line 160,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[], int, int)",
      "begin_line": 162,
      "end_line": 163,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[])",
      "begin_line": 164,
      "end_line": 165,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.copy()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "",
      "child_ranges": [
        "(line 167,col 13)-(line 167,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension()",
      "begin_line": 171,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 172,col 9)-(line 178,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testStats()",
      "begin_line": 182,
      "end_line": 212,
      "comment": " test stats ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 87)",
        "(line 184,col 9)-(line 184,col 34)",
        "(line 185,col 9)-(line 185,col 42)",
        "(line 186,col 9)-(line 186,col 42)",
        "(line 187,col 9)-(line 187,col 42)",
        "(line 188,col 9)-(line 188,col 42)",
        "(line 189,col 9)-(line 189,col 35)",
        "(line 190,col 9)-(line 190,col 49)",
        "(line 191,col 9)-(line 191,col 49)",
        "(line 192,col 9)-(line 192,col 51)",
        "(line 193,col 9)-(line 193,col 51)",
        "(line 194,col 9)-(line 194,col 49)",
        "(line 195,col 9)-(line 195,col 49)",
        "(line 196,col 9)-(line 196,col 49)",
        "(line 197,col 9)-(line 197,col 49)",
        "(line 198,col 9)-(line 198,col 71)",
        "(line 199,col 9)-(line 199,col 71)",
        "(line 200,col 9)-(line 200,col 79)",
        "(line 201,col 9)-(line 201,col 79)",
        "(line 202,col 9)-(line 202,col 50)",
        "(line 203,col 9)-(line 203,col 50)",
        "(line 204,col 9)-(line 204,col 81)",
        "(line 205,col 9)-(line 205,col 81)",
        "(line 206,col 9)-(line 206,col 75)",
        "(line 207,col 9)-(line 207,col 75)",
        "(line 208,col 9)-(line 208,col 75)",
        "(line 209,col 9)-(line 209,col 75)",
        "(line 210,col 9)-(line 210,col 18)",
        "(line 211,col 9)-(line 211,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions()",
      "begin_line": 214,
      "end_line": 229,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 87)",
        "(line 216,col 9)-(line 216,col 49)",
        "(line 217,col 9)-(line 217,col 62)",
        "(line 220,col 9)-(line 220,col 39)",
        "(line 221,col 9)-(line 221,col 51)",
        "(line 222,col 9)-(line 222,col 60)",
        "(line 223,col 9)-(line 223,col 64)",
        "(line 226,col 9)-(line 226,col 39)",
        "(line 227,col 9)-(line 227,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts()",
      "begin_line": 231,
      "end_line": 244,
      "comment": "",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 87)",
        "(line 233,col 9)-(line 233,col 49)",
        "(line 234,col 9)-(line 234,col 48)",
        "(line 235,col 9)-(line 235,col 62)",
        "(line 236,col 9)-(line 236,col 58)",
        "(line 238,col 9)-(line 238,col 41)",
        "(line 239,col 9)-(line 239,col 50)",
        "(line 240,col 9)-(line 240,col 49)",
        "(line 241,col 9)-(line 241,col 63)",
        "(line 242,col 9)-(line 242,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization()",
      "begin_line": 246,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 87)",
        "(line 249,col 9)-(line 249,col 45)",
        "(line 250,col 9)-(line 250,col 107)",
        "(line 251,col 9)-(line 251,col 27)",
        "(line 254,col 9)-(line 254,col 44)",
        "(line 255,col 9)-(line 255,col 44)",
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 257,col 44)",
        "(line 258,col 9)-(line 258,col 44)",
        "(line 261,col 9)-(line 261,col 45)",
        "(line 262,col 9)-(line 262,col 77)",
        "(line 263,col 9)-(line 263,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode()",
      "begin_line": 267,
      "end_line": 306,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 87)",
        "(line 269,col 9)-(line 269,col 47)",
        "(line 270,col 9)-(line 270,col 37)",
        "(line 271,col 9)-(line 271,col 32)",
        "(line 272,col 9)-(line 272,col 33)",
        "(line 273,col 9)-(line 273,col 49)",
        "(line 274,col 9)-(line 274,col 57)",
        "(line 275,col 9)-(line 275,col 32)",
        "(line 276,col 9)-(line 276,col 32)",
        "(line 277,col 9)-(line 277,col 46)",
        "(line 280,col 9)-(line 280,col 44)",
        "(line 281,col 9)-(line 281,col 44)",
        "(line 282,col 9)-(line 282,col 44)",
        "(line 283,col 9)-(line 283,col 44)",
        "(line 284,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 33)",
        "(line 286,col 9)-(line 286,col 33)",
        "(line 287,col 9)-(line 287,col 49)",
        "(line 290,col 9)-(line 290,col 44)",
        "(line 291,col 9)-(line 291,col 44)",
        "(line 292,col 9)-(line 292,col 44)",
        "(line 293,col 9)-(line 293,col 44)",
        "(line 294,col 9)-(line 294,col 44)",
        "(line 295,col 9)-(line 295,col 32)",
        "(line 296,col 9)-(line 296,col 32)",
        "(line 297,col 9)-(line 297,col 49)",
        "(line 300,col 9)-(line 300,col 18)",
        "(line 301,col 9)-(line 301,col 18)",
        "(line 302,col 9)-(line 302,col 32)",
        "(line 303,col 9)-(line 303,col 32)",
        "(line 304,col 9)-(line 304,col 46)",
        "(line 305,col 9)-(line 305,col 46)"
      ]
    }
  ]
}
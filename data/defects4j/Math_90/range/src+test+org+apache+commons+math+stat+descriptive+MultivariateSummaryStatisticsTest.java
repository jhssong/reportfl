{
  "filepath": "/tmp/Math-90b/src/test/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 258,
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
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.suite()",
      "begin_line": 40,
      "end_line": 44,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 81)",
        "(line 42,col 9)-(line 42,col 61)",
        "(line 43,col 9)-(line 43,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterInjection()",
      "begin_line": 46,
      "end_line": 68,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 85)",
        "(line 48,col 9)-(line 50,col 25)",
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 52,col 42)",
        "(line 53,col 9)-(line 53,col 47)",
        "(line 54,col 9)-(line 54,col 47)",
        "(line 55,col 9)-(line 55,col 18)",
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 57,col 42)",
        "(line 58,col 9)-(line 58,col 47)",
        "(line 59,col 9)-(line 59,col 47)",
        "(line 60,col 9)-(line 60,col 18)",
        "(line 61,col 9)-(line 63,col 25)",
        "(line 64,col 9)-(line 64,col 42)",
        "(line 65,col 9)-(line 65,col 42)",
        "(line 66,col 9)-(line 66,col 47)",
        "(line 67,col 9)-(line 67,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSetterIllegalState()",
      "begin_line": 70,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 85)",
        "(line 72,col 9)-(line 72,col 42)",
        "(line 73,col 9)-(line 73,col 42)",
        "(line 74,col 9)-(line 81,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "sumMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 88,
      "end_line": 119,
      "comment": "\n     * Bogus mean implementation to test setter injection.\n     * Returns the sum instead of the mean.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[], int, int)",
      "begin_line": 92,
      "end_line": 94,
      "comment": "",
      "child_ranges": [
        "(line 93,col 13)-(line 93,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.evaluate(double[])",
      "begin_line": 95,
      "end_line": 97,
      "comment": "",
      "child_ranges": [
        "(line 96,col 13)-(line 96,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.clear()",
      "begin_line": 98,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 99,col 11)-(line 99,col 18)",
        "(line 100,col 11)-(line 100,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getN()",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.getResult()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.increment(double)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "",
      "child_ranges": [
        "(line 109,col 13)-(line 109,col 21)",
        "(line 110,col 13)-(line 110,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[], int, int)",
      "begin_line": 112,
      "end_line": 113,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.incrementAll(double[])",
      "begin_line": 114,
      "end_line": 115,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.sumMean.copy()",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension()",
      "begin_line": 121,
      "end_line": 129,
      "comment": "",
      "child_ranges": [
        "(line 122,col 9)-(line 128,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testStats()",
      "begin_line": 132,
      "end_line": 162,
      "comment": " test stats ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 85)",
        "(line 134,col 9)-(line 134,col 34)",
        "(line 135,col 9)-(line 135,col 42)",
        "(line 136,col 9)-(line 136,col 42)",
        "(line 137,col 9)-(line 137,col 42)",
        "(line 138,col 9)-(line 138,col 42)",
        "(line 139,col 9)-(line 139,col 35)",
        "(line 140,col 9)-(line 140,col 49)",
        "(line 141,col 9)-(line 141,col 49)",
        "(line 142,col 9)-(line 142,col 51)",
        "(line 143,col 9)-(line 143,col 51)",
        "(line 144,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 145,col 49)",
        "(line 146,col 9)-(line 146,col 49)",
        "(line 147,col 9)-(line 147,col 49)",
        "(line 148,col 9)-(line 148,col 71)",
        "(line 149,col 9)-(line 149,col 71)",
        "(line 150,col 9)-(line 150,col 79)",
        "(line 151,col 9)-(line 151,col 79)",
        "(line 152,col 9)-(line 152,col 50)",
        "(line 153,col 9)-(line 153,col 50)",
        "(line 154,col 9)-(line 154,col 81)",
        "(line 155,col 9)-(line 155,col 81)",
        "(line 156,col 9)-(line 156,col 75)",
        "(line 157,col 9)-(line 157,col 75)",
        "(line 158,col 9)-(line 158,col 75)",
        "(line 159,col 9)-(line 159,col 75)",
        "(line 160,col 9)-(line 160,col 18)",
        "(line 161,col 9)-(line 161,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions()",
      "begin_line": 164,
      "end_line": 179,
      "comment": "",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 85)",
        "(line 166,col 9)-(line 166,col 49)",
        "(line 167,col 9)-(line 167,col 62)",
        "(line 170,col 9)-(line 170,col 39)",
        "(line 171,col 9)-(line 171,col 51)",
        "(line 172,col 9)-(line 172,col 60)",
        "(line 173,col 9)-(line 173,col 64)",
        "(line 176,col 9)-(line 176,col 39)",
        "(line 177,col 9)-(line 177,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts()",
      "begin_line": 181,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 85)",
        "(line 183,col 9)-(line 183,col 49)",
        "(line 184,col 9)-(line 184,col 48)",
        "(line 185,col 9)-(line 185,col 62)",
        "(line 186,col 9)-(line 186,col 58)",
        "(line 188,col 9)-(line 188,col 41)",
        "(line 189,col 9)-(line 189,col 50)",
        "(line 190,col 9)-(line 190,col 49)",
        "(line 191,col 9)-(line 191,col 63)",
        "(line 192,col 9)-(line 192,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization()",
      "begin_line": 196,
      "end_line": 215,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 85)",
        "(line 199,col 9)-(line 199,col 45)",
        "(line 200,col 9)-(line 200,col 107)",
        "(line 201,col 9)-(line 201,col 27)",
        "(line 204,col 9)-(line 204,col 44)",
        "(line 205,col 9)-(line 205,col 44)",
        "(line 206,col 9)-(line 206,col 44)",
        "(line 207,col 9)-(line 207,col 44)",
        "(line 208,col 9)-(line 208,col 44)",
        "(line 211,col 9)-(line 211,col 45)",
        "(line 212,col 9)-(line 212,col 77)",
        "(line 213,col 9)-(line 213,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode()",
      "begin_line": 217,
      "end_line": 256,
      "comment": "",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 85)",
        "(line 219,col 9)-(line 219,col 47)",
        "(line 220,col 9)-(line 220,col 37)",
        "(line 221,col 9)-(line 221,col 32)",
        "(line 222,col 9)-(line 222,col 33)",
        "(line 223,col 9)-(line 223,col 49)",
        "(line 224,col 9)-(line 224,col 55)",
        "(line 225,col 9)-(line 225,col 32)",
        "(line 226,col 9)-(line 226,col 32)",
        "(line 227,col 9)-(line 227,col 46)",
        "(line 230,col 9)-(line 230,col 44)",
        "(line 231,col 9)-(line 231,col 44)",
        "(line 232,col 9)-(line 232,col 44)",
        "(line 233,col 9)-(line 233,col 44)",
        "(line 234,col 9)-(line 234,col 44)",
        "(line 235,col 9)-(line 235,col 33)",
        "(line 236,col 9)-(line 236,col 33)",
        "(line 237,col 9)-(line 237,col 49)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 242,col 44)",
        "(line 243,col 9)-(line 243,col 44)",
        "(line 244,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 32)",
        "(line 246,col 9)-(line 246,col 32)",
        "(line 247,col 9)-(line 247,col 49)",
        "(line 250,col 9)-(line 250,col 18)",
        "(line 251,col 9)-(line 251,col 18)",
        "(line 252,col 9)-(line 252,col 32)",
        "(line 253,col 9)-(line 253,col 32)",
        "(line 254,col 9)-(line 254,col 46)",
        "(line 255,col 9)-(line 255,col 46)"
      ]
    }
  ]
}
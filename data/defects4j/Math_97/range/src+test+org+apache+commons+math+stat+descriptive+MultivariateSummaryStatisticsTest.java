{
  "filepath": "/tmp/Math-97b/src/test/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 255,
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
      "end_line": 116,
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
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testDimension()",
      "begin_line": 118,
      "end_line": 126,
      "comment": "",
      "child_ranges": [
        "(line 119,col 9)-(line 125,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testStats()",
      "begin_line": 129,
      "end_line": 159,
      "comment": " test stats ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 85)",
        "(line 131,col 9)-(line 131,col 34)",
        "(line 132,col 9)-(line 132,col 42)",
        "(line 133,col 9)-(line 133,col 42)",
        "(line 134,col 9)-(line 134,col 42)",
        "(line 135,col 9)-(line 135,col 42)",
        "(line 136,col 9)-(line 136,col 35)",
        "(line 137,col 9)-(line 137,col 49)",
        "(line 138,col 9)-(line 138,col 49)",
        "(line 139,col 9)-(line 139,col 51)",
        "(line 140,col 9)-(line 140,col 51)",
        "(line 141,col 9)-(line 141,col 49)",
        "(line 142,col 9)-(line 142,col 49)",
        "(line 143,col 9)-(line 143,col 49)",
        "(line 144,col 9)-(line 144,col 49)",
        "(line 145,col 9)-(line 145,col 71)",
        "(line 146,col 9)-(line 146,col 71)",
        "(line 147,col 9)-(line 147,col 79)",
        "(line 148,col 9)-(line 148,col 79)",
        "(line 149,col 9)-(line 149,col 50)",
        "(line 150,col 9)-(line 150,col 50)",
        "(line 151,col 9)-(line 151,col 81)",
        "(line 152,col 9)-(line 152,col 81)",
        "(line 153,col 9)-(line 153,col 75)",
        "(line 154,col 9)-(line 154,col 75)",
        "(line 155,col 9)-(line 155,col 75)",
        "(line 156,col 9)-(line 156,col 75)",
        "(line 157,col 9)-(line 157,col 18)",
        "(line 158,col 9)-(line 158,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testN0andN1Conditions()",
      "begin_line": 161,
      "end_line": 176,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 85)",
        "(line 163,col 9)-(line 163,col 49)",
        "(line 164,col 9)-(line 164,col 62)",
        "(line 167,col 9)-(line 167,col 39)",
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 60)",
        "(line 170,col 9)-(line 170,col 64)",
        "(line 173,col 9)-(line 173,col 39)",
        "(line 174,col 9)-(line 174,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testNaNContracts()",
      "begin_line": 178,
      "end_line": 191,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 85)",
        "(line 180,col 9)-(line 180,col 49)",
        "(line 181,col 9)-(line 181,col 48)",
        "(line 182,col 9)-(line 182,col 62)",
        "(line 183,col 9)-(line 183,col 58)",
        "(line 185,col 9)-(line 185,col 41)",
        "(line 186,col 9)-(line 186,col 50)",
        "(line 187,col 9)-(line 187,col 49)",
        "(line 188,col 9)-(line 188,col 63)",
        "(line 189,col 9)-(line 189,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testSerialization()",
      "begin_line": 193,
      "end_line": 212,
      "comment": "",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 85)",
        "(line 196,col 9)-(line 196,col 45)",
        "(line 197,col 9)-(line 197,col 107)",
        "(line 198,col 9)-(line 198,col 27)",
        "(line 201,col 9)-(line 201,col 44)",
        "(line 202,col 9)-(line 202,col 44)",
        "(line 203,col 9)-(line 203,col 44)",
        "(line 204,col 9)-(line 204,col 44)",
        "(line 205,col 9)-(line 205,col 44)",
        "(line 208,col 9)-(line 208,col 45)",
        "(line 209,col 9)-(line 209,col 77)",
        "(line 210,col 9)-(line 210,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatisticsTest.testEqualsAndHashCode()",
      "begin_line": 214,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 85)",
        "(line 216,col 9)-(line 216,col 47)",
        "(line 217,col 9)-(line 217,col 37)",
        "(line 218,col 9)-(line 218,col 32)",
        "(line 219,col 9)-(line 219,col 33)",
        "(line 220,col 9)-(line 220,col 49)",
        "(line 221,col 9)-(line 221,col 55)",
        "(line 222,col 9)-(line 222,col 32)",
        "(line 223,col 9)-(line 223,col 32)",
        "(line 224,col 9)-(line 224,col 46)",
        "(line 227,col 9)-(line 227,col 44)",
        "(line 228,col 9)-(line 228,col 44)",
        "(line 229,col 9)-(line 229,col 44)",
        "(line 230,col 9)-(line 230,col 44)",
        "(line 231,col 9)-(line 231,col 44)",
        "(line 232,col 9)-(line 232,col 33)",
        "(line 233,col 9)-(line 233,col 33)",
        "(line 234,col 9)-(line 234,col 49)",
        "(line 237,col 9)-(line 237,col 44)",
        "(line 238,col 9)-(line 238,col 44)",
        "(line 239,col 9)-(line 239,col 44)",
        "(line 240,col 9)-(line 240,col 44)",
        "(line 241,col 9)-(line 241,col 44)",
        "(line 242,col 9)-(line 242,col 32)",
        "(line 243,col 9)-(line 243,col 32)",
        "(line 244,col 9)-(line 244,col 49)",
        "(line 247,col 9)-(line 247,col 18)",
        "(line 248,col 9)-(line 248,col 18)",
        "(line 249,col 9)-(line 249,col 32)",
        "(line 250,col 9)-(line 250,col 32)",
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 252,col 46)"
      ]
    }
  ]
}
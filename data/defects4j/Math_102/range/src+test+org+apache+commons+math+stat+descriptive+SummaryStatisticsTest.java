{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/stat/descriptive/SummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "SummaryStatisticsAbstractTest"
      ],
      "begin_line": 33,
      "end_line": 105,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.SummaryStatisticsTest(java.lang.String)",
      "begin_line": 35,
      "end_line": 37,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.suite()",
      "begin_line": 39,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 69)",
        "(line 41,col 9)-(line 41,col 49)",
        "(line 42,col 9)-(line 42,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.createSummaryStatistics()",
      "begin_line": 45,
      "end_line": 47,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.testSetterInjection()",
      "begin_line": 49,
      "end_line": 60,
      "comment": "",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 37)",
        "(line 51,col 9)-(line 51,col 22)",
        "(line 52,col 9)-(line 52,col 22)",
        "(line 53,col 9)-(line 53,col 44)",
        "(line 54,col 9)-(line 54,col 18)",
        "(line 55,col 9)-(line 55,col 22)",
        "(line 56,col 9)-(line 56,col 22)",
        "(line 57,col 9)-(line 57,col 44)",
        "(line 58,col 9)-(line 58,col 18)",
        "(line 59,col 9)-(line 59,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.testSetterIllegalState()",
      "begin_line": 62,
      "end_line": 71,
      "comment": "",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 22)",
        "(line 64,col 9)-(line 64,col 22)",
        "(line 65,col 9)-(line 70,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "sumMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic"
      ],
      "begin_line": 77,
      "end_line": 104,
      "comment": "\n     * Bogus mean implementation to test setter injection.\n     * Returns the sum instead of the mean.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.evaluate(double[], int, int)",
      "begin_line": 80,
      "end_line": 82,
      "comment": "",
      "child_ranges": [
        "(line 81,col 13)-(line 81,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.evaluate(double[])",
      "begin_line": 83,
      "end_line": 85,
      "comment": "",
      "child_ranges": [
        "(line 84,col 13)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.clear()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "",
      "child_ranges": [
        "(line 87,col 11)-(line 87,col 18)",
        "(line 88,col 11)-(line 88,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.getN()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.getResult()",
      "begin_line": 93,
      "end_line": 95,
      "comment": "",
      "child_ranges": [
        "(line 94,col 13)-(line 94,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.increment(double)",
      "begin_line": 96,
      "end_line": 99,
      "comment": "",
      "child_ranges": [
        "(line 97,col 13)-(line 97,col 21)",
        "(line 98,col 13)-(line 98,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.incrementAll(double[], int, int)",
      "begin_line": 100,
      "end_line": 101,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatisticsTest.sumMean.incrementAll(double[])",
      "begin_line": 102,
      "end_line": 103,
      "comment": "",
      "child_ranges": []
    }
  ]
}
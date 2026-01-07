{
  "filepath": "/tmp/Math-102b/src/test/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "DescriptiveStatisticsAbstractTest"
      ],
      "begin_line": 29,
      "end_line": 135,
      "comment": "\n * Test cases for the DescriptiveStatistics class.\n * When DescriptiveStatisticsImpl is removed, this class should replace\n * DescriptiveStatisticsAbstractTest\n * \n * @version $Revision: 592121 $ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.DescriptiveStatisticsTest(java.lang.String)",
      "begin_line": 31,
      "end_line": 33,
      "comment": "",
      "child_ranges": [
        "(line 32,col 9)-(line 32,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.suite()",
      "begin_line": 35,
      "end_line": 39,
      "comment": "",
      "child_ranges": [
        "(line 36,col 9)-(line 36,col 73)",
        "(line 37,col 9)-(line 37,col 53)",
        "(line 38,col 9)-(line 38,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.createDescriptiveStatistics()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testSetterInjection()",
      "begin_line": 45,
      "end_line": 53,
      "comment": "",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 66)",
        "(line 47,col 9)-(line 47,col 26)",
        "(line 48,col 9)-(line 48,col 26)",
        "(line 49,col 9)-(line 49,col 48)",
        "(line 51,col 9)-(line 51,col 42)",
        "(line 52,col 9)-(line 52,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testPercentileSetter()",
      "begin_line": 55,
      "end_line": 77,
      "comment": "",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 66)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 26)",
        "(line 60,col 9)-(line 60,col 58)",
        "(line 63,col 9)-(line 63,col 54)",
        "(line 64,col 9)-(line 64,col 58)",
        "(line 67,col 9)-(line 67,col 53)",
        "(line 68,col 9)-(line 68,col 61)",
        "(line 71,col 9)-(line 76,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "deepMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 84,
      "end_line": 92,
      "comment": "\n     * A new way to compute the mean \n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[], int, int)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "",
      "child_ranges": [
        "(line 86,col 13)-(line 86,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[])",
      "begin_line": 89,
      "end_line": 91,
      "comment": "",
      "child_ranges": [
        "(line 90,col 13)-(line 90,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "goodPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 97,
      "end_line": 108,
      "comment": "\n     * Test percentile implementation - wraps a Percentile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.setQuantile(double)",
      "begin_line": 99,
      "end_line": 101,
      "comment": "",
      "child_ranges": [
        "(line 100,col 13)-(line 100,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[], int, int)",
      "begin_line": 102,
      "end_line": 104,
      "comment": "",
      "child_ranges": [
        "(line 103,col 13)-(line 103,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[])",
      "begin_line": 105,
      "end_line": 107,
      "comment": "",
      "child_ranges": [
        "(line 106,col 13)-(line 106,col 36)"
      ]
    },
    {
      "type": "class_interface",
      "name": "subPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.rank.Percentile"
      ],
      "begin_line": 114,
      "end_line": 121,
      "comment": "\n     * Test percentile subclass - another \"new math\" impl\n     * Always returns currently set quantile\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[], int, int)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[])",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 33)"
      ]
    },
    {
      "type": "class_interface",
      "name": "badPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 126,
      "end_line": 134,
      "comment": "\n     * \"Bad\" test percentile implementation - no setQuantile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[], int, int)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 36)"
      ]
    }
  ]
}
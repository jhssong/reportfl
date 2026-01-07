{
  "filepath": "/tmp/Math-96b/src/test/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 28,
      "end_line": 139,
      "comment": "\n * Test cases for the DescriptiveStatistics class.\n * \n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.DescriptiveStatisticsTest(java.lang.String)",
      "begin_line": 30,
      "end_line": 32,
      "comment": "",
      "child_ranges": [
        "(line 31,col 9)-(line 31,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.suite()",
      "begin_line": 34,
      "end_line": 38,
      "comment": "",
      "child_ranges": [
        "(line 35,col 9)-(line 35,col 73)",
        "(line 36,col 9)-(line 36,col 53)",
        "(line 37,col 9)-(line 37,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.createDescriptiveStatistics()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testSetterInjection()",
      "begin_line": 44,
      "end_line": 52,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 66)",
        "(line 46,col 9)-(line 46,col 26)",
        "(line 47,col 9)-(line 47,col 26)",
        "(line 48,col 9)-(line 48,col 48)",
        "(line 50,col 9)-(line 50,col 42)",
        "(line 51,col 9)-(line 51,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testPercentileSetter()",
      "begin_line": 54,
      "end_line": 76,
      "comment": "",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 66)",
        "(line 56,col 9)-(line 56,col 26)",
        "(line 57,col 9)-(line 57,col 26)",
        "(line 58,col 9)-(line 58,col 26)",
        "(line 59,col 9)-(line 59,col 58)",
        "(line 62,col 9)-(line 62,col 54)",
        "(line 63,col 9)-(line 63,col 58)",
        "(line 66,col 9)-(line 66,col 53)",
        "(line 67,col 9)-(line 67,col 61)",
        "(line 70,col 9)-(line 75,col 9)"
      ]
    },
    {
      "type": "class_interface",
      "name": "deepMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 83,
      "end_line": 93,
      "comment": "\n     * A new way to compute the mean \n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[], int, int)",
      "begin_line": 86,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 87,col 13)-(line 87,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[])",
      "begin_line": 90,
      "end_line": 92,
      "comment": "",
      "child_ranges": [
        "(line 91,col 13)-(line 91,col 22)"
      ]
    },
    {
      "type": "class_interface",
      "name": "goodPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 98,
      "end_line": 110,
      "comment": "\n     * Test percentile implementation - wraps a Percentile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.setQuantile(double)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "",
      "child_ranges": [
        "(line 102,col 13)-(line 102,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[], int, int)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "",
      "child_ranges": [
        "(line 105,col 13)-(line 105,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[])",
      "begin_line": 107,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 108,col 13)-(line 108,col 47)"
      ]
    },
    {
      "type": "class_interface",
      "name": "subPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.rank.Percentile"
      ],
      "begin_line": 116,
      "end_line": 124,
      "comment": "\n     * Test percentile subclass - another \"new math\" impl\n     * Always returns currently set quantile\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[], int, int)",
      "begin_line": 117,
      "end_line": 119,
      "comment": "",
      "child_ranges": [
        "(line 118,col 13)-(line 118,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[])",
      "begin_line": 120,
      "end_line": 122,
      "comment": "",
      "child_ranges": [
        "(line 121,col 13)-(line 121,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": ""
    },
    {
      "type": "class_interface",
      "name": "badPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 129,
      "end_line": 138,
      "comment": "\n     * \"Bad\" test percentile implementation - no setQuantile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[], int, int)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "",
      "child_ranges": [
        "(line 133,col 13)-(line 133,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[])",
      "begin_line": 135,
      "end_line": 137,
      "comment": "",
      "child_ranges": [
        "(line 136,col 13)-(line 136,col 47)"
      ]
    }
  ]
}
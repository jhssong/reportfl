{
  "filepath": "/tmp/Math-85b/src/test/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 181,
      "comment": "\n * Test cases for the DescriptiveStatistics class.\n * \n * @version $Revision$ $Date: 2007-08-16 15:36:33 -0500 (Thu, 16 Aug\n *          2007) $\n "
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
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testSetterInjection()",
      "begin_line": 41,
      "end_line": 49,
      "comment": "",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 66)",
        "(line 43,col 9)-(line 43,col 26)",
        "(line 44,col 9)-(line 44,col 26)",
        "(line 45,col 9)-(line 45,col 48)",
        "(line 47,col 9)-(line 47,col 42)",
        "(line 48,col 9)-(line 48,col 49)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testPercentileSetter()",
      "begin_line": 51,
      "end_line": 73,
      "comment": "",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 66)",
        "(line 53,col 9)-(line 53,col 26)",
        "(line 54,col 9)-(line 54,col 26)",
        "(line 55,col 9)-(line 55,col 26)",
        "(line 56,col 9)-(line 56,col 58)",
        "(line 59,col 9)-(line 59,col 54)",
        "(line 60,col 9)-(line 60,col 58)",
        "(line 63,col 9)-(line 63,col 53)",
        "(line 64,col 9)-(line 64,col 61)",
        "(line 67,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.testRemoval()",
      "begin_line": 74,
      "end_line": 84,
      "comment": "",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 72)",
        "(line 78,col 9)-(line 78,col 53)",
        "(line 79,col 9)-(line 79,col 46)",
        "(line 80,col 9)-(line 80,col 46)",
        "(line 81,col 9)-(line 81,col 46)",
        "(line 82,col 9)-(line 82,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.checkremoval(org.apache.commons.math.stat.descriptive.DescriptiveStatistics, int, double, double, double)",
      "begin_line": 86,
      "end_line": 102,
      "comment": "",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 35)",
        "(line 90,col 9)-(line 90,col 22)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 96,col 61)",
        "(line 97,col 9)-(line 97,col 40)",
        "(line 98,col 9)-(line 98,col 61)",
        "(line 99,col 9)-(line 99,col 38)",
        "(line 100,col 9)-(line 100,col 61)"
      ]
    },
    {
      "type": "class_interface",
      "name": "deepMean",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 109,
      "end_line": 121,
      "comment": "\n     * A new way to compute the mean \n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[], int, int)",
      "begin_line": 111,
      "end_line": 113,
      "comment": "",
      "child_ranges": [
        "(line 112,col 13)-(line 112,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[])",
      "begin_line": 115,
      "end_line": 117,
      "comment": "",
      "child_ranges": [
        "(line 116,col 13)-(line 116,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.copy()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "",
      "child_ranges": [
        "(line 119,col 13)-(line 119,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "goodPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 126,
      "end_line": 142,
      "comment": "\n     * Test percentile implementation - wraps a Percentile\n     "
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
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.setQuantile(double)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "",
      "child_ranges": [
        "(line 129,col 13)-(line 129,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[], int, int)",
      "begin_line": 131,
      "end_line": 133,
      "comment": "",
      "child_ranges": [
        "(line 132,col 13)-(line 132,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[])",
      "begin_line": 134,
      "end_line": 136,
      "comment": "",
      "child_ranges": [
        "(line 135,col 13)-(line 135,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.copy()",
      "begin_line": 137,
      "end_line": 141,
      "comment": "",
      "child_ranges": [
        "(line 138,col 13)-(line 138,col 57)",
        "(line 139,col 13)-(line 139,col 57)",
        "(line 140,col 13)-(line 140,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "subPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.rank.Percentile"
      ],
      "begin_line": 148,
      "end_line": 163,
      "comment": "\n     * Test percentile subclass - another \"new math\" impl\n     * Always returns currently set quantile\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[], int, int)",
      "begin_line": 149,
      "end_line": 152,
      "comment": "",
      "child_ranges": [
        "(line 151,col 13)-(line 151,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": "",
      "child_ranges": [
        "(line 155,col 13)-(line 155,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.copy()",
      "begin_line": 158,
      "end_line": 162,
      "comment": "",
      "child_ranges": [
        "(line 160,col 13)-(line 160,col 55)",
        "(line 161,col 13)-(line 161,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "badPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 168,
      "end_line": 179,
      "comment": "\n     * \"Bad\" test percentile implementation - no setQuantile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[], int, int)",
      "begin_line": 170,
      "end_line": 172,
      "comment": "",
      "child_ranges": [
        "(line 171,col 13)-(line 171,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[])",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.copy()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 39)"
      ]
    }
  ]
}
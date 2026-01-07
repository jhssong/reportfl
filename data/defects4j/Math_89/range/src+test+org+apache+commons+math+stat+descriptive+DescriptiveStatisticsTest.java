{
  "filepath": "/tmp/Math-89b/src/test/org/apache/commons/math/stat/descriptive/DescriptiveStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 29,
      "end_line": 184,
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
      "end_line": 122,
      "comment": "\n     * A new way to compute the mean \n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[], int, int)",
      "begin_line": 112,
      "end_line": 114,
      "comment": "",
      "child_ranges": [
        "(line 113,col 13)-(line 113,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.evaluate(double[])",
      "begin_line": 116,
      "end_line": 118,
      "comment": "",
      "child_ranges": [
        "(line 117,col 13)-(line 117,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.deepMean.copy()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "",
      "child_ranges": [
        "(line 120,col 13)-(line 120,col 34)"
      ]
    },
    {
      "type": "class_interface",
      "name": "goodPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 127,
      "end_line": 144,
      "comment": "\n     * Test percentile implementation - wraps a Percentile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.setQuantile(double)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "",
      "child_ranges": [
        "(line 131,col 13)-(line 131,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[], int, int)",
      "begin_line": 133,
      "end_line": 135,
      "comment": "",
      "child_ranges": [
        "(line 134,col 13)-(line 134,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.evaluate(double[])",
      "begin_line": 136,
      "end_line": 138,
      "comment": "",
      "child_ranges": [
        "(line 137,col 13)-(line 137,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.goodPercentile.copy()",
      "begin_line": 139,
      "end_line": 143,
      "comment": "",
      "child_ranges": [
        "(line 140,col 13)-(line 140,col 57)",
        "(line 141,col 13)-(line 141,col 57)",
        "(line 142,col 13)-(line 142,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "subPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.rank.Percentile"
      ],
      "begin_line": 150,
      "end_line": 165,
      "comment": "\n     * Test percentile subclass - another \"new math\" impl\n     * Always returns currently set quantile\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[], int, int)",
      "begin_line": 151,
      "end_line": 154,
      "comment": "",
      "child_ranges": [
        "(line 153,col 13)-(line 153,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.evaluate(double[])",
      "begin_line": 155,
      "end_line": 158,
      "comment": "",
      "child_ranges": [
        "(line 157,col 13)-(line 157,col 33)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.subPercentile.copy()",
      "begin_line": 160,
      "end_line": 164,
      "comment": "",
      "child_ranges": [
        "(line 162,col 13)-(line 162,col 55)",
        "(line 163,col 13)-(line 163,col 26)"
      ]
    },
    {
      "type": "class_interface",
      "name": "badPercentile",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.UnivariateStatistic"
      ],
      "begin_line": 170,
      "end_line": 182,
      "comment": "\n     * \"Bad\" test percentile implementation - no setQuantile\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "percentile"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[], int, int)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "",
      "child_ranges": [
        "(line 174,col 13)-(line 174,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.evaluate(double[])",
      "begin_line": 176,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 177,col 13)-(line 177,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatisticsTest.badPercentile.copy()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "",
      "child_ranges": [
        "(line 180,col 13)-(line 180,col 39)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-4b/src/test/java/org/apache/commons/math3/stat/descriptive/AggregateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 300,
      "comment": "\n * Test cases for {@link AggregateSummaryStatistics}\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregation()",
      "begin_line": 43,
      "end_line": 69,
      "comment": "\n     * Tests the standard aggregation behavior\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 80)",
        "(line 46,col 9)-(line 46,col 81)",
        "(line 47,col 9)-(line 47,col 81)",
        "(line 49,col 9)-(line 49,col 85)",
        "(line 50,col 9)-(line 50,col 85)",
        "(line 51,col 9)-(line 51,col 98)",
        "(line 53,col 9)-(line 53,col 32)",
        "(line 54,col 9)-(line 54,col 32)",
        "(line 55,col 9)-(line 55,col 32)",
        "(line 56,col 9)-(line 56,col 32)",
        "(line 57,col 9)-(line 57,col 33)",
        "(line 58,col 9)-(line 58,col 85)",
        "(line 59,col 9)-(line 59,col 106)",
        "(line 61,col 9)-(line 61,col 32)",
        "(line 62,col 9)-(line 62,col 32)",
        "(line 63,col 9)-(line 63,col 32)",
        "(line 64,col 9)-(line 64,col 85)",
        "(line 65,col 9)-(line 65,col 106)",
        "(line 67,col 9)-(line 67,col 85)",
        "(line 68,col 9)-(line 68,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregationConsistency()",
      "begin_line": 84,
      "end_line": 124,
      "comment": "\n     * Verify that aggregating over a partition gives the same results\n     * as direct computation.\n     *\n     *  1) Randomly generate a dataset of 10-100 values\n     *     from [-100, 100]\n     *  2) Divide the dataset it into 2-5 partitions\n     *  3) Create an AggregateSummaryStatistic and ContributingStatistics\n     *     for each partition\n     *  4) Compare results from the AggregateSummaryStatistic with values\n     *     returned by a single SummaryStatistics instance that is provided\n     *     the full dataset\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 48)",
        "(line 89,col 9)-(line 89,col 63)",
        "(line 90,col 9)-(line 90,col 41)",
        "(line 93,col 9)-(line 93,col 80)",
        "(line 94,col 9)-(line 94,col 63)",
        "(line 97,col 9)-(line 97,col 77)",
        "(line 99,col 9)-(line 108,col 9)",
        "(line 111,col 9)-(line 113,col 9)",
        "(line 122,col 9)-(line 122,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate()",
      "begin_line": 134,
      "end_line": 164,
      "comment": "\n     * Test aggregate function by randomly generating a dataset of 10-100 values\n     * from [-100, 100], dividing it into 2-5 partitions, computing stats for each\n     * partition and comparing the result of aggregate(...) applied to the collection\n     * of per-partition SummaryStatistics with a single SummaryStatistics computed\n     * over the full sample.\n     *\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 48)",
        "(line 139,col 9)-(line 139,col 63)",
        "(line 140,col 9)-(line 140,col 41)",
        "(line 143,col 9)-(line 143,col 63)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 149,col 9)-(line 149,col 77)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 153,col 9)-(line 153,col 85)",
        "(line 154,col 9)-(line 159,col 9)",
        "(line 162,col 9)-(line 162,col 93)",
        "(line 163,col 9)-(line 163,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateDegenerate()",
      "begin_line": 167,
      "end_line": 194,
      "comment": "",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 47)",
        "(line 170,col 9)-(line 170,col 58)",
        "(line 173,col 9)-(line 173,col 63)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 179,col 9)-(line 179,col 70)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 183,col 85)",
        "(line 184,col 9)-(line 189,col 9)",
        "(line 192,col 9)-(line 192,col 99)",
        "(line 193,col 9)-(line 193,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateSpecialValues()",
      "begin_line": 196,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 79)",
        "(line 199,col 9)-(line 199,col 88)",
        "(line 202,col 9)-(line 202,col 63)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 208,col 9)-(line 208,col 70)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 212,col 85)",
        "(line 213,col 9)-(line 218,col 9)",
        "(line 221,col 9)-(line 221,col 99)",
        "(line 222,col 9)-(line 222,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.assertEquals(org.apache.commons.math3.stat.descriptive.StatisticalSummary, org.apache.commons.math3.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 231,
      "end_line": 239,
      "comment": "\n     * Verifies that a StatisticalSummary and a StatisticalSummaryValues are equal up\n     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values\n     * have to agree exactly, delta is used only for sum, mean, variance, std dev.\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 72)",
        "(line 233,col 9)-(line 233,col 72)",
        "(line 234,col 9)-(line 234,col 62)",
        "(line 235,col 9)-(line 235,col 76)",
        "(line 236,col 9)-(line 236,col 78)",
        "(line 237,col 9)-(line 237,col 104)",
        "(line 238,col 9)-(line 238,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.generateSample()",
      "begin_line": 249,
      "end_line": 255,
      "comment": "\n     * Generates a random sample of double values.\n     * Sample size is random, between 10 and 100 and values are\n     * uniformly distributed over [-100, 100].\n     *\n     * @return array of random double values\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 81)",
        "(line 251,col 9)-(line 251,col 83)",
        "(line 252,col 9)-(line 252,col 45)",
        "(line 253,col 9)-(line 253,col 59)",
        "(line 254,col 9)-(line 254,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest.generatePartition(double[])",
      "begin_line": 264,
      "end_line": 298,
      "comment": "\n     * Generates a partition of \u003csample\u003e into up to 5 sequentially selected\n     * subsamples with randomly selected partition points.\n     *\n     * @param sample array to partition\n     * @return rectangular array with rows \u003d subsamples\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 41)",
        "(line 266,col 9)-(line 266,col 47)",
        "(line 267,col 9)-(line 267,col 20)",
        "(line 268,col 9)-(line 268,col 23)",
        "(line 269,col 9)-(line 269,col 28)",
        "(line 270,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 297,col 9)"
      ]
    }
  ]
}
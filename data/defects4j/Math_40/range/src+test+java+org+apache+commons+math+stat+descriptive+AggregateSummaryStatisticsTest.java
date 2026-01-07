{
  "filepath": "/tmp/Math-40b/src/test/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 36,
      "end_line": 297,
      "comment": "\n * Test cases for {@link AggregateSummaryStatistics}\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregation()",
      "begin_line": 41,
      "end_line": 67,
      "comment": "\n     * Tests the standard aggregation behavior\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 80)",
        "(line 44,col 9)-(line 44,col 81)",
        "(line 45,col 9)-(line 45,col 81)",
        "(line 47,col 9)-(line 47,col 85)",
        "(line 48,col 9)-(line 48,col 85)",
        "(line 49,col 9)-(line 49,col 98)",
        "(line 51,col 9)-(line 51,col 32)",
        "(line 52,col 9)-(line 52,col 32)",
        "(line 53,col 9)-(line 53,col 32)",
        "(line 54,col 9)-(line 54,col 32)",
        "(line 55,col 9)-(line 55,col 33)",
        "(line 56,col 9)-(line 56,col 85)",
        "(line 57,col 9)-(line 57,col 106)",
        "(line 59,col 9)-(line 59,col 32)",
        "(line 60,col 9)-(line 60,col 32)",
        "(line 61,col 9)-(line 61,col 32)",
        "(line 62,col 9)-(line 62,col 85)",
        "(line 63,col 9)-(line 63,col 106)",
        "(line 65,col 9)-(line 65,col 85)",
        "(line 66,col 9)-(line 66,col 96)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregationConsistency()",
      "begin_line": 82,
      "end_line": 122,
      "comment": "\n     * Verify that aggregating over a partition gives the same results\n     * as direct computation.\n     *\n     *  1) Randomly generate a dataset of 10-100 values\n     *     from [-100, 100]\n     *  2) Divide the dataset it into 2-5 partitions\n     *  3) Create an AggregateSummaryStatistic and ContributingStatistics\n     *     for each partition\n     *  4) Compare results from the AggregateSummaryStatistic with values\n     *     returned by a single SummaryStatistics instance that is provided\n     *     the full dataset\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 48)",
        "(line 87,col 9)-(line 87,col 63)",
        "(line 88,col 9)-(line 88,col 41)",
        "(line 91,col 9)-(line 91,col 80)",
        "(line 92,col 9)-(line 92,col 63)",
        "(line 95,col 9)-(line 95,col 77)",
        "(line 97,col 9)-(line 106,col 9)",
        "(line 109,col 9)-(line 111,col 9)",
        "(line 120,col 9)-(line 120,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate()",
      "begin_line": 133,
      "end_line": 163,
      "comment": "\n     * Test aggregate function by randomly generating a dataset of 10-100 values\n     * from [-100, 100], dividing it into 2-5 partitions, computing stats for each\n     * partition and comparing the result of aggregate(...) applied to the collection\n     * of per-partition SummaryStatistics with a single SummaryStatistics computed\n     * over the full sample.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 48)",
        "(line 138,col 9)-(line 138,col 63)",
        "(line 139,col 9)-(line 139,col 41)",
        "(line 142,col 9)-(line 142,col 63)",
        "(line 143,col 9)-(line 145,col 9)",
        "(line 148,col 9)-(line 148,col 77)",
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 85)",
        "(line 153,col 9)-(line 158,col 9)",
        "(line 161,col 9)-(line 161,col 93)",
        "(line 162,col 9)-(line 162,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateDegenerate()",
      "begin_line": 166,
      "end_line": 193,
      "comment": "",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 47)",
        "(line 169,col 9)-(line 169,col 58)",
        "(line 172,col 9)-(line 172,col 63)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 178,col 9)-(line 178,col 70)",
        "(line 179,col 9)-(line 181,col 9)",
        "(line 182,col 9)-(line 182,col 85)",
        "(line 183,col 9)-(line 188,col 9)",
        "(line 191,col 9)-(line 191,col 99)",
        "(line 192,col 9)-(line 192,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateSpecialValues()",
      "begin_line": 195,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 79)",
        "(line 198,col 9)-(line 198,col 88)",
        "(line 201,col 9)-(line 201,col 63)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 207,col 9)-(line 207,col 70)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 211,col 9)-(line 211,col 85)",
        "(line 212,col 9)-(line 217,col 9)",
        "(line 220,col 9)-(line 220,col 99)",
        "(line 221,col 9)-(line 221,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.assertEquals(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 230,
      "end_line": 238,
      "comment": "\n     * Verifies that a StatisticalSummary and a StatisticalSummaryValues are equal up\n     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values\n     * have to agree exactly, delta is used only for sum, mean, variance, std dev.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 72)",
        "(line 232,col 9)-(line 232,col 72)",
        "(line 233,col 9)-(line 233,col 62)",
        "(line 234,col 9)-(line 234,col 76)",
        "(line 235,col 9)-(line 235,col 78)",
        "(line 236,col 9)-(line 236,col 104)",
        "(line 237,col 9)-(line 237,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generateSample()",
      "begin_line": 248,
      "end_line": 256,
      "comment": "\n     * Generates a random sample of double values.\n     * Sample size is random, between 10 and 100 and values are\n     * uniformly distributed over [-100, 100].\n     *\n     * @return array of random double values\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 59)",
        "(line 250,col 9)-(line 250,col 58)",
        "(line 251,col 9)-(line 251,col 46)",
        "(line 252,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 255,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generatePartition(double[])",
      "begin_line": 265,
      "end_line": 295,
      "comment": "\n     * Generates a partition of \u003csample\u003e into up to 5 sequentially selected\n     * subsamples with randomly selected partition points.\n     *\n     * @param sample array to partition\n     * @return rectangular array with rows \u003d subsamples\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 41)",
        "(line 267,col 9)-(line 267,col 47)",
        "(line 268,col 9)-(line 268,col 59)",
        "(line 269,col 9)-(line 269,col 20)",
        "(line 270,col 9)-(line 270,col 23)",
        "(line 271,col 9)-(line 271,col 28)",
        "(line 272,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 294,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-70b/src/test/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 34,
      "end_line": 290,
      "comment": "\n * Test cases for {@link AggregateSummaryStatistics}\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregation()",
      "begin_line": 39,
      "end_line": 64,
      "comment": "\n     * Tests the standard aggregation behavior\n     ",
      "child_ranges": [
        "(line 40,col 9)-(line 40,col 80)",
        "(line 41,col 9)-(line 41,col 81)",
        "(line 42,col 9)-(line 42,col 81)",
        "(line 44,col 9)-(line 44,col 78)",
        "(line 45,col 9)-(line 45,col 78)",
        "(line 46,col 9)-(line 46,col 91)",
        "(line 48,col 9)-(line 48,col 32)",
        "(line 49,col 9)-(line 49,col 32)",
        "(line 50,col 9)-(line 50,col 32)",
        "(line 51,col 9)-(line 51,col 32)",
        "(line 52,col 9)-(line 52,col 33)",
        "(line 53,col 9)-(line 53,col 78)",
        "(line 54,col 9)-(line 54,col 80)",
        "(line 56,col 9)-(line 56,col 32)",
        "(line 57,col 9)-(line 57,col 32)",
        "(line 58,col 9)-(line 58,col 32)",
        "(line 59,col 9)-(line 59,col 78)",
        "(line 60,col 9)-(line 60,col 80)",
        "(line 62,col 9)-(line 62,col 78)",
        "(line 63,col 9)-(line 63,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregationConsistency()",
      "begin_line": 79,
      "end_line": 118,
      "comment": "\n     * Verify that aggregating over a partition gives the same results\n     * as direct computation.\n     *\n     *  1) Randomly generate a dataset of 10-100 values\n     *     from [-100, 100]\n     *  2) Divide the dataset it into 2-5 partitions\n     *  3) Create an AggregateSummaryStatistic and ContributingStatistics\n     *     for each partition\n     *  4) Compare results from the AggregateSummaryStatistic with values\n     *     returned by a single SummaryStatistics instance that is provided\n     *     the full dataset\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 48)",
        "(line 83,col 9)-(line 83,col 63)",
        "(line 84,col 9)-(line 84,col 41)",
        "(line 87,col 9)-(line 87,col 80)",
        "(line 88,col 9)-(line 88,col 63)",
        "(line 91,col 9)-(line 91,col 77)",
        "(line 93,col 9)-(line 102,col 9)",
        "(line 105,col 9)-(line 107,col 9)",
        "(line 116,col 9)-(line 116,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate()",
      "begin_line": 129,
      "end_line": 158,
      "comment": "\n     * Test aggregate function by randomly generating a dataset of 10-100 values\n     * from [-100, 100], dividing it into 2-5 partitions, computing stats for each\n     * partition and comparing the result of aggregate(...) applied to the collection\n     * of per-partition SummaryStatistics with a single SummaryStatistics computed\n     * over the full sample.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)",
        "(line 133,col 9)-(line 133,col 63)",
        "(line 134,col 9)-(line 134,col 41)",
        "(line 137,col 9)-(line 137,col 63)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 143,col 9)-(line 143,col 77)",
        "(line 144,col 9)-(line 146,col 9)",
        "(line 147,col 9)-(line 147,col 85)",
        "(line 148,col 9)-(line 153,col 9)",
        "(line 156,col 9)-(line 156,col 93)",
        "(line 157,col 9)-(line 157,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateDegenerate()",
      "begin_line": 161,
      "end_line": 187,
      "comment": "",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 47)",
        "(line 163,col 9)-(line 163,col 58)",
        "(line 166,col 9)-(line 166,col 63)",
        "(line 167,col 9)-(line 169,col 9)",
        "(line 172,col 9)-(line 172,col 70)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 85)",
        "(line 177,col 9)-(line 182,col 9)",
        "(line 185,col 9)-(line 185,col 99)",
        "(line 186,col 9)-(line 186,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateSpecialValues()",
      "begin_line": 189,
      "end_line": 216,
      "comment": "",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 79)",
        "(line 191,col 9)-(line 191,col 88)",
        "(line 194,col 9)-(line 194,col 63)",
        "(line 195,col 9)-(line 197,col 9)",
        "(line 200,col 9)-(line 200,col 70)",
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 85)",
        "(line 205,col 9)-(line 210,col 9)",
        "(line 213,col 9)-(line 213,col 99)",
        "(line 214,col 9)-(line 214,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.assertEquals(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 223,
      "end_line": 231,
      "comment": "\n     * Verifies that a StatisticalSummary and a StatisticalSummaryValues are equal up\n     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values\n     * have to agree exactly, delta is used only for sum, mean, variance, std dev.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 72)",
        "(line 225,col 9)-(line 225,col 72)",
        "(line 226,col 9)-(line 226,col 55)",
        "(line 227,col 9)-(line 227,col 76)",
        "(line 228,col 9)-(line 228,col 78)",
        "(line 229,col 9)-(line 229,col 104)",
        "(line 230,col 9)-(line 230,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generateSample()",
      "begin_line": 241,
      "end_line": 249,
      "comment": "\n     * Generates a random sample of double values.\n     * Sample size is random, between 10 and 100 and values are\n     * uniformly distributed over [-100, 100].\n     *\n     * @return array of random double values\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 59)",
        "(line 243,col 9)-(line 243,col 58)",
        "(line 244,col 9)-(line 244,col 46)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 248,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generatePartition(double[])",
      "begin_line": 258,
      "end_line": 288,
      "comment": "\n     * Generates a partition of \u003csample\u003e into up to 5 sequentially selected\n     * subsamples with randomly selected partition points.\n     *\n     * @param sample array to partition\n     * @return rectangular array with rows \u003d subsamples\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 259,col 41)",
        "(line 260,col 9)-(line 260,col 47)",
        "(line 261,col 9)-(line 261,col 59)",
        "(line 262,col 9)-(line 262,col 20)",
        "(line 263,col 9)-(line 263,col 23)",
        "(line 264,col 9)-(line 264,col 28)",
        "(line 265,col 9)-(line 276,col 9)",
        "(line 277,col 9)-(line 287,col 9)"
      ]
    }
  ]
}
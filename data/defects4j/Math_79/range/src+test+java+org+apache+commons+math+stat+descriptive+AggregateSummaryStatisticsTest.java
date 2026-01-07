{
  "filepath": "/tmp/Math-79b/src/test/java/org/apache/commons/math/stat/descriptive/AggregateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 304,
      "comment": "\n * Test cases for {@link AggregateSummaryStatistics}\n *\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.suite()",
      "begin_line": 44,
      "end_line": 48,
      "comment": "\n     * Creates and returns a {@code Test} representing all the test cases in this\n     * class\n     *\n     * @return a {@code Test} representing all the test cases in this class\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 78)",
        "(line 46,col 9)-(line 46,col 58)",
        "(line 47,col 9)-(line 47,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregation()",
      "begin_line": 53,
      "end_line": 78,
      "comment": "\n     * Tests the standard aggregation behavior\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 80)",
        "(line 55,col 9)-(line 55,col 81)",
        "(line 56,col 9)-(line 56,col 81)",
        "(line 58,col 9)-(line 58,col 78)",
        "(line 59,col 9)-(line 59,col 78)",
        "(line 60,col 9)-(line 60,col 91)",
        "(line 62,col 9)-(line 62,col 32)",
        "(line 63,col 9)-(line 63,col 32)",
        "(line 64,col 9)-(line 64,col 32)",
        "(line 65,col 9)-(line 65,col 32)",
        "(line 66,col 9)-(line 66,col 33)",
        "(line 67,col 9)-(line 67,col 78)",
        "(line 68,col 9)-(line 68,col 80)",
        "(line 70,col 9)-(line 70,col 32)",
        "(line 71,col 9)-(line 71,col 32)",
        "(line 72,col 9)-(line 72,col 32)",
        "(line 73,col 9)-(line 73,col 78)",
        "(line 74,col 9)-(line 74,col 80)",
        "(line 76,col 9)-(line 76,col 78)",
        "(line 77,col 9)-(line 77,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregationConsistency()",
      "begin_line": 93,
      "end_line": 132,
      "comment": "\n     * Verify that aggregating over a partition gives the same results\n     * as direct computation.\n     *\n     *  1) Randomly generate a dataset of 10-100 values\n     *     from [-100, 100]\n     *  2) Divide the dataset it into 2-5 partitions\n     *  3) Create an AggregateSummaryStatistic and ContributingStatistics\n     *     for each partition\n     *  4) Compare results from the AggregateSummaryStatistic with values\n     *     returned by a single SummaryStatistics instance that is provided\n     *     the full dataset\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 48)",
        "(line 97,col 9)-(line 97,col 63)",
        "(line 98,col 9)-(line 98,col 41)",
        "(line 101,col 9)-(line 101,col 80)",
        "(line 102,col 9)-(line 102,col 63)",
        "(line 105,col 9)-(line 105,col 77)",
        "(line 107,col 9)-(line 116,col 9)",
        "(line 119,col 9)-(line 121,col 9)",
        "(line 130,col 9)-(line 130,col 70)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate()",
      "begin_line": 143,
      "end_line": 172,
      "comment": "\n     * Test aggregate function by randomly generating a dataset of 10-100 values\n     * from [-100, 100], dividing it into 2-5 partitions, computing stats for each\n     * partition and comparing the result of aggregate(...) applied to the collection\n     * of per-partition SummaryStatistics with a single SummaryStatistics computed\n     * over the full sample.\n     *\n     * @throws Exception\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 48)",
        "(line 147,col 9)-(line 147,col 63)",
        "(line 148,col 9)-(line 148,col 41)",
        "(line 151,col 9)-(line 151,col 63)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 157,col 9)-(line 157,col 77)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 85)",
        "(line 162,col 9)-(line 167,col 9)",
        "(line 170,col 9)-(line 170,col 93)",
        "(line 171,col 9)-(line 171,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateDegenerate()",
      "begin_line": 175,
      "end_line": 201,
      "comment": "",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 47)",
        "(line 177,col 9)-(line 177,col 58)",
        "(line 180,col 9)-(line 180,col 63)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 186,col 9)-(line 186,col 70)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 85)",
        "(line 191,col 9)-(line 196,col 9)",
        "(line 199,col 9)-(line 199,col 99)",
        "(line 200,col 9)-(line 200,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregateSpecialValues()",
      "begin_line": 203,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 79)",
        "(line 205,col 9)-(line 205,col 88)",
        "(line 208,col 9)-(line 208,col 63)",
        "(line 209,col 9)-(line 211,col 9)",
        "(line 214,col 9)-(line 214,col 70)",
        "(line 215,col 9)-(line 217,col 9)",
        "(line 218,col 9)-(line 218,col 85)",
        "(line 219,col 9)-(line 224,col 9)",
        "(line 227,col 9)-(line 227,col 99)",
        "(line 228,col 9)-(line 228,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.assertEquals(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummary, double)",
      "begin_line": 237,
      "end_line": 245,
      "comment": "\n     * Verifies that a StatisticalSummary and a StatisticalSummaryValues are equal up\n     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values\n     * have to agree exactly, delta is used only for sum, mean, variance, std dev.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 72)",
        "(line 239,col 9)-(line 239,col 72)",
        "(line 240,col 9)-(line 240,col 55)",
        "(line 241,col 9)-(line 241,col 76)",
        "(line 242,col 9)-(line 242,col 78)",
        "(line 243,col 9)-(line 243,col 104)",
        "(line 244,col 9)-(line 244,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generateSample()",
      "begin_line": 255,
      "end_line": 263,
      "comment": "\n     * Generates a random sample of double values.\n     * Sample size is random, between 10 and 100 and values are\n     * uniformly distributed over [-100, 100].\n     *\n     * @return array of random double values\n     ",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 59)",
        "(line 257,col 9)-(line 257,col 58)",
        "(line 258,col 9)-(line 258,col 46)",
        "(line 259,col 9)-(line 261,col 9)",
        "(line 262,col 9)-(line 262,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generatePartition(double[])",
      "begin_line": 272,
      "end_line": 302,
      "comment": "\n     * Generates a partition of \u003csample\u003e into up to 5 sequentially selected\n     * subsamples with randomly selected partition points.\n     *\n     * @param sample array to partition\n     * @return rectangular array with rows \u003d subsamples\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 41)",
        "(line 274,col 9)-(line 274,col 47)",
        "(line 275,col 9)-(line 275,col 59)",
        "(line 276,col 9)-(line 276,col 20)",
        "(line 277,col 9)-(line 277,col 23)",
        "(line 278,col 9)-(line 278,col 28)",
        "(line 279,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 301,col 9)"
      ]
    }
  ]
}
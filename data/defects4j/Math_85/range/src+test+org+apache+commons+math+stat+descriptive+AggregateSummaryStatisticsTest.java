{
  "filepath": "/tmp/Math-85b/src/test/org/apache/commons/math/stat/descriptive/AggregateSummaryStatisticsTest.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "AggregateSummaryStatisticsTest",
      "is_interface": false,
      "parent_types": [
        "TestCase"
      ],
      "begin_line": 36,
      "end_line": 183,
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
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.testAggregate()",
      "begin_line": 80,
      "end_line": 109,
      "comment": "",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 48)",
        "(line 84,col 9)-(line 84,col 63)",
        "(line 85,col 9)-(line 85,col 41)",
        "(line 88,col 9)-(line 88,col 63)",
        "(line 89,col 9)-(line 91,col 9)",
        "(line 94,col 9)-(line 94,col 77)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 98,col 9)-(line 98,col 85)",
        "(line 99,col 9)-(line 104,col 9)",
        "(line 107,col 9)-(line 107,col 99)",
        "(line 108,col 9)-(line 108,col 71)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.assertEquals(org.apache.commons.math.stat.descriptive.StatisticalSummary, org.apache.commons.math.stat.descriptive.StatisticalSummaryValues, double)",
      "begin_line": 116,
      "end_line": 124,
      "comment": "\n     * Verifies that two StatisticalSummaryValues report the same values up\n     * to delta, with NaNs, infinities returned in the same spots. For max, min, n, values\n     * have to agree exactly, delta is used only for sum, mean, variance, std dev.\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 72)",
        "(line 118,col 9)-(line 118,col 72)",
        "(line 119,col 9)-(line 119,col 55)",
        "(line 120,col 9)-(line 120,col 76)",
        "(line 121,col 9)-(line 121,col 78)",
        "(line 122,col 9)-(line 122,col 104)",
        "(line 123,col 9)-(line 123,col 86)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generateSample()",
      "begin_line": 134,
      "end_line": 142,
      "comment": "\n     * Generates a random sample of double values.\n     * Sample size is random, between 10 and 100 and values are \n     * uniformly distributed over [-100, 100].\n     * \n     * @return array of random double values\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 59)",
        "(line 136,col 9)-(line 136,col 58)",
        "(line 137,col 9)-(line 137,col 46)",
        "(line 138,col 9)-(line 140,col 9)",
        "(line 141,col 9)-(line 141,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.AggregateSummaryStatisticsTest.generatePartition(double[])",
      "begin_line": 151,
      "end_line": 181,
      "comment": "\n     * Generates a partition of \u003csample\u003e into up to 5 sequentially selected\n     * subsamples with randomly selected partition points.\n     * \n     * @param sample array to partition\n     * @return rectangular array with rows \u003d subsamples\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 41)",
        "(line 153,col 9)-(line 153,col 47)",
        "(line 154,col 9)-(line 154,col 59)",
        "(line 155,col 9)-(line 155,col 20)",
        "(line 156,col 9)-(line 156,col 23)",
        "(line 157,col 9)-(line 157,col 28)",
        "(line 158,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 180,col 9)"
      ]
    }
  ]
}
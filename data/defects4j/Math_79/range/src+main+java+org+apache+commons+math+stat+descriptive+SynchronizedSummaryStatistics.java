{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 32,
      "end_line": 333,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.SummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics()",
      "begin_line": 40,
      "end_line": 42,
      "comment": "\n     * Construct a SynchronizedSummaryStatistics instance\n     ",
      "child_ranges": [
        "(line 41,col 9)-(line 41,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics(org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 49,
      "end_line": 51,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedSummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 56,
      "end_line": 59,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 64,
      "end_line": 67,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 72,
      "end_line": 75,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 80,
      "end_line": 83,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 88,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 96,
      "end_line": 99,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 104,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 112,
      "end_line": 115,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 120,
      "end_line": 123,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 128,
      "end_line": 131,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 138,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 152,
      "end_line": 155,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 160,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 168,
      "end_line": 171,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumImpl()",
      "begin_line": 176,
      "end_line": 179,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 178,col 9)-(line 178,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 184,
      "end_line": 187,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsqImpl()",
      "begin_line": 192,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMinImpl()",
      "begin_line": 208,
      "end_line": 211,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 216,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMaxImpl()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 232,
      "end_line": 235,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumLogImpl()",
      "begin_line": 240,
      "end_line": 243,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 248,
      "end_line": 251,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 256,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMeanImpl()",
      "begin_line": 272,
      "end_line": 275,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 280,
      "end_line": 283,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVarianceImpl()",
      "begin_line": 288,
      "end_line": 291,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 296,
      "end_line": 299,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.copy()",
      "begin_line": 307,
      "end_line": 313,
      "comment": "\n     * Returns a copy of this SynchronizedSummaryStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 310,col 48)",
        "(line 311,col 9)-(line 311,col 27)",
        "(line 312,col 9)-(line 312,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics, org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedSummaryStatistics to copy\n     * @param dest SynchronizedSummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 330,col 9)"
      ]
    }
  ]
}
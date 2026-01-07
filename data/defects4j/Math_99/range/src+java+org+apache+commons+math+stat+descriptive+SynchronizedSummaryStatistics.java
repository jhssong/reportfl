{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 32,
      "end_line": 301,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.SummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic. \n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
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
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     * \n     * @param original the {@code SynchronizedSummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 70,
      "end_line": 72,
      "comment": " \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 77,
      "end_line": 79,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 78,col 9)-(line 78,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 84,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 105,
      "end_line": 107,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 112,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 140,
      "end_line": 142,
      "comment": " \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 154,
      "end_line": 156,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumImpl()",
      "begin_line": 161,
      "end_line": 163,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsqImpl()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMinImpl()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMaxImpl()",
      "begin_line": 203,
      "end_line": 205,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 204,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumLogImpl()",
      "begin_line": 217,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMeanImpl()",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 252,
      "end_line": 254,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVarianceImpl()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.copy()",
      "begin_line": 276,
      "end_line": 281,
      "comment": "\n     * Returns a copy of this SynchronizedSummaryStatistics instance with the\n     * same internal state.\n     * \n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 278,col 48)",
        "(line 279,col 9)-(line 279,col 27)",
        "(line 280,col 9)-(line 280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics, org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 292,
      "end_line": 299,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     * \n     * @param source SynchronizedSummaryStatistics to copy\n     * @param dest SynchronizedSummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 298,col 9)"
      ]
    }
  ]
}
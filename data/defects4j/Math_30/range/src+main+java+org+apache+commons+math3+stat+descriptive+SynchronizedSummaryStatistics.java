{
  "filepath": "/tmp/Math-30b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 35,
      "end_line": 347,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.SummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Construct a SynchronizedSummaryStatistics instance\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedSummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 59,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 67,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 83,
      "end_line": 86,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 85,col 9)-(line 85,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 91,
      "end_line": 94,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 107,
      "end_line": 110,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 115,
      "end_line": 118,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getPopulationVariance()",
      "begin_line": 123,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 131,
      "end_line": 134,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 139,
      "end_line": 142,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 147,
      "end_line": 150,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 155,
      "end_line": 158,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 163,
      "end_line": 166,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 171,
      "end_line": 174,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 179,
      "end_line": 182,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumImpl()",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 195,
      "end_line": 198,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumsqImpl()",
      "begin_line": 203,
      "end_line": 206,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 205,col 9)-(line 205,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 211,
      "end_line": 214,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMinImpl()",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 227,
      "end_line": 230,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 229,col 9)-(line 229,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMaxImpl()",
      "begin_line": 235,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 243,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumLogImpl()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 259,
      "end_line": 262,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 267,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMeanImpl()",
      "begin_line": 283,
      "end_line": 286,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 291,
      "end_line": 294,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getVarianceImpl()",
      "begin_line": 299,
      "end_line": 302,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setVarianceImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy()",
      "begin_line": 318,
      "end_line": 324,
      "comment": "\n     * Returns a copy of this SynchronizedSummaryStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 321,col 48)",
        "(line 322,col 9)-(line 322,col 27)",
        "(line 323,col 9)-(line 323,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics, org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 335,
      "end_line": 345,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedSummaryStatistics to copy\n     * @param dest SynchronizedSummaryStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 39)",
        "(line 339,col 9)-(line 339,col 37)",
        "(line 340,col 9)-(line 344,col 9)"
      ]
    }
  ]
}
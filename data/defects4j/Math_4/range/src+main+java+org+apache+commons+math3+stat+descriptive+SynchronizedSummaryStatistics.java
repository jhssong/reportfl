{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 36,
      "end_line": 359,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.SummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 39,
      "end_line": 39,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics()",
      "begin_line": 44,
      "end_line": 46,
      "comment": "\n     * Construct a SynchronizedSummaryStatistics instance\n     ",
      "child_ranges": [
        "(line 45,col 9)-(line 45,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.SynchronizedSummaryStatistics(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SynchronizedSummaryStatistics} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 62,
      "end_line": 65,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 70,
      "end_line": 73,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 78,
      "end_line": 81,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 86,
      "end_line": 89,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 94,
      "end_line": 97,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 102,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 118,
      "end_line": 121,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getPopulationVariance()",
      "begin_line": 126,
      "end_line": 129,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 142,
      "end_line": 145,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 150,
      "end_line": 153,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 158,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 182,
      "end_line": 185,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumImpl()",
      "begin_line": 190,
      "end_line": 193,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 198,
      "end_line": 202,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumsqImpl()",
      "begin_line": 207,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 215,
      "end_line": 219,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMinImpl()",
      "begin_line": 224,
      "end_line": 227,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 232,
      "end_line": 236,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMaxImpl()",
      "begin_line": 241,
      "end_line": 244,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 249,
      "end_line": 253,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getSumLogImpl()",
      "begin_line": 258,
      "end_line": 261,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 266,
      "end_line": 270,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 275,
      "end_line": 278,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 283,
      "end_line": 287,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getMeanImpl()",
      "begin_line": 292,
      "end_line": 295,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 300,
      "end_line": 304,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.getVarianceImpl()",
      "begin_line": 309,
      "end_line": 312,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.setVarianceImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 317,
      "end_line": 321,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy()",
      "begin_line": 329,
      "end_line": 336,
      "comment": "\n     * Returns a copy of this SynchronizedSummaryStatistics instance with the\n     * same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 332,col 48)",
        "(line 334,col 9)-(line 334,col 27)",
        "(line 335,col 9)-(line 335,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics.copy(org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics, org.apache.commons.math3.stat.descriptive.SynchronizedSummaryStatistics)",
      "begin_line": 347,
      "end_line": 357,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \u003cp\u003eAcquires synchronization lock on source, then dest before copying.\u003c/p\u003e\n     *\n     * @param source SynchronizedSummaryStatistics to copy\n     * @param dest SynchronizedSummaryStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 39)",
        "(line 351,col 9)-(line 351,col 37)",
        "(line 352,col 9)-(line 356,col 9)"
      ]
    }
  ]
}
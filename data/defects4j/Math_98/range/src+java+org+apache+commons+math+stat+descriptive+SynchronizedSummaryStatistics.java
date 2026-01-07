{
  "filepath": "/tmp/Math-98b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.SummaryStatistics"
      ],
      "begin_line": 32,
      "end_line": 261,
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
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSummary()",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.addValue(double)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getN()",
      "begin_line": 61,
      "end_line": 63,
      "comment": " \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 62,col 9)-(line 62,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSum()",
      "begin_line": 68,
      "end_line": 70,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 69,col 9)-(line 69,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsq()",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMean()",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getStandardDeviation()",
      "begin_line": 89,
      "end_line": 91,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 90,col 9)-(line 90,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVariance()",
      "begin_line": 96,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMax()",
      "begin_line": 103,
      "end_line": 105,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMin()",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeometricMean()",
      "begin_line": 117,
      "end_line": 119,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.toString()",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.clear()",
      "begin_line": 131,
      "end_line": 133,
      "comment": " \n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 138,
      "end_line": 140,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 139,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.hashCode()",
      "begin_line": 145,
      "end_line": 147,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumImpl()",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 159,
      "end_line": 161,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumsqImpl()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMinImpl()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 187,
      "end_line": 189,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMaxImpl()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getSumLogImpl()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getMeanImpl()",
      "begin_line": 236,
      "end_line": 238,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 243,
      "end_line": 245,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.getVarianceImpl()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedSummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 44)"
      ]
    }
  ]
}
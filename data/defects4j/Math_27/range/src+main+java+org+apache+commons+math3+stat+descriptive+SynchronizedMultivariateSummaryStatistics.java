{
  "filepath": "/tmp/Math-27b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedMultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedMultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics"
      ],
      "begin_line": 33,
      "end_line": 289,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.SynchronizedMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "\n     * Construct a SynchronizedMultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 53,
      "end_line": 56,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 55,col 7)-(line 55,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getDimension()",
      "begin_line": 61,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getN()",
      "begin_line": 69,
      "end_line": 72,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 71,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSum()",
      "begin_line": 77,
      "end_line": 80,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 79,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumSq()",
      "begin_line": 85,
      "end_line": 88,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLog()",
      "begin_line": 93,
      "end_line": 96,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMean()",
      "begin_line": 101,
      "end_line": 104,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 103,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 109,
      "end_line": 112,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getCovariance()",
      "begin_line": 117,
      "end_line": 120,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMax()",
      "begin_line": 125,
      "end_line": 128,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMin()",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.toString()",
      "begin_line": 149,
      "end_line": 152,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.clear()",
      "begin_line": 157,
      "end_line": 160,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 165,
      "end_line": 168,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.hashCode()",
      "begin_line": 173,
      "end_line": 176,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 181,
      "end_line": 184,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 197,
      "end_line": 200,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 205,
      "end_line": 208,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 213,
      "end_line": 216,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 221,
      "end_line": 224,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 229,
      "end_line": 232,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 237,
      "end_line": 240,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 245,
      "end_line": 248,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 253,
      "end_line": 256,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 261,
      "end_line": 264,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 269,
      "end_line": 272,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 277,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 36)"
      ]
    }
  ]
}
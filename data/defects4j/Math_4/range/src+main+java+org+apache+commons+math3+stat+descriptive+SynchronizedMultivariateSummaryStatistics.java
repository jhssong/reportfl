{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/SynchronizedMultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedMultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics"
      ],
      "begin_line": 35,
      "end_line": 298,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n * @since 1.2\n * @version $Id$\n "
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
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.SynchronizedMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Construct a SynchronizedMultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 55,
      "end_line": 58,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 57,col 7)-(line 57,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getDimension()",
      "begin_line": 63,
      "end_line": 66,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getN()",
      "begin_line": 71,
      "end_line": 74,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSum()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumSq()",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 89,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLog()",
      "begin_line": 95,
      "end_line": 98,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 97,col 9)-(line 97,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMean()",
      "begin_line": 103,
      "end_line": 106,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 111,
      "end_line": 114,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getCovariance()",
      "begin_line": 119,
      "end_line": 122,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMax()",
      "begin_line": 127,
      "end_line": 130,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMin()",
      "begin_line": 135,
      "end_line": 138,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.toString()",
      "begin_line": 151,
      "end_line": 154,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.clear()",
      "begin_line": 159,
      "end_line": 162,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 167,
      "end_line": 170,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.hashCode()",
      "begin_line": 175,
      "end_line": 178,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 183,
      "end_line": 186,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 185,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 191,
      "end_line": 195,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 200,
      "end_line": 203,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 208,
      "end_line": 212,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 217,
      "end_line": 220,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 225,
      "end_line": 229,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 242,
      "end_line": 246,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 251,
      "end_line": 254,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 259,
      "end_line": 263,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 268,
      "end_line": 271,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 276,
      "end_line": 280,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 285,
      "end_line": 288,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 293,
      "end_line": 297,
      "comment": "\n     * {@inheritDoc}\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 36)"
      ]
    }
  ]
}
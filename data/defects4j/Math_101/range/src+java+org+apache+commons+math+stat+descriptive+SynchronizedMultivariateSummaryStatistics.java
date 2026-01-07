{
  "filepath": "/tmp/Math-101b/src/java/org/apache/commons/math/stat/descriptive/SynchronizedMultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SynchronizedMultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics"
      ],
      "begin_line": 34,
      "end_line": 269,
      "comment": "\n * Implementation of\n * {@link org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics} that\n * is safe to use in a multithreaded environment.  Multiple threads can safely\n * operate on a single instance without causing runtime exceptions due to race\n * conditions.  In effect, this implementation makes modification and access\n * methods atomic operations for a single instance.  That is to say, as one\n * thread is computing a statistic from the instance, no other thread can modify\n * the instance nor compute another statistic.\n * @since 1.2\n * @version $Revision: 618097 $ $Date: 2008-02-03 22:39:08 +0100 (dim., 03 févr. 2008) $\n "
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
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.SynchronizedMultivariateSummaryStatistics(int, boolean)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Construct a SynchronizedMultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 54,
      "end_line": 57,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#addValue(double[])\n     ",
      "child_ranges": [
        "(line 56,col 7)-(line 56,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getDimension()",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getDimension()\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getN()",
      "begin_line": 69,
      "end_line": 71,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getN()\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSum()",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSum()\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumSq()",
      "begin_line": 83,
      "end_line": 85,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSumSq()\n     ",
      "child_ranges": [
        "(line 84,col 9)-(line 84,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLog()",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSumLog()\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMean()",
      "begin_line": 97,
      "end_line": 99,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMean()\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 98,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getStandardDeviation()\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getCovariance()",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getCovariance()\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMax()",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMax()\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMin()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMin()\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getGeometricMean()\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.toString()",
      "begin_line": 139,
      "end_line": 141,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#toString()\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 140,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.clear()",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#clear()\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#equals(Object)\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.hashCode()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#hashCode()\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 167,
      "end_line": 169,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSumImpl()\n     ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 174,
      "end_line": 177,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setSumImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 182,
      "end_line": 184,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSumsqImpl()\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 189,
      "end_line": 192,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setSumsqImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMinImpl()\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 204,
      "end_line": 207,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setMinImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 212,
      "end_line": 214,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMaxImpl()\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 213,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 219,
      "end_line": 222,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setMaxImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 227,
      "end_line": 229,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getSumLogImpl()\n     ",
      "child_ranges": [
        "(line 228,col 9)-(line 228,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setSumLogImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 242,
      "end_line": 244,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getGeoMeanImpl()\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 249,
      "end_line": 252,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setGeoMeanImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 257,
      "end_line": 259,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#getMeanImpl()\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SynchronizedMultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 264,
      "end_line": 267,
      "comment": "\n     * @see org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics#setMeanImpl(StorelessUnivariateStatistic[])\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 36)"
      ]
    }
  ]
}
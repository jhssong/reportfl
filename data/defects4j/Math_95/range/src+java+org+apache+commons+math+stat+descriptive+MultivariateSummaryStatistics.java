{
  "filepath": "/tmp/Math-95b/src/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary",
        "java.io.Serializable"
      ],
      "begin_line": 67,
      "end_line": 629,
      "comment": "\n * \u003cp\u003eComputes summary statistics for a stream of n-tuples added using the \n * {@link #addValue(double[]) addValue} method. The data values are not stored\n * in memory, so this class can be used to compute statistics for very large\n * n-tuple streams.\u003c/p\u003e\n * \n * \u003cp\u003eThe {@link StorelessUnivariateStatistic} instances used to maintain\n * summary state and compute statistics are configurable via setters.\n * For example, the default implementation for the mean can be overridden by\n * calling {@link #setMeanImpl(StorelessUnivariateStatistic[])}. Actual\n * parameters to these methods must implement the \n * {@link StorelessUnivariateStatistic} interface and configuration must be\n * completed before \u003ccode\u003eaddValue\u003c/code\u003e is called. No configuration is\n * necessary to use the default, commons-math provided implementations.\u003c/p\u003e\n * \n * \u003cp\u003eTo compute statistics for a stream of n-tuples, construct a\n * MultivariateStatistics instance with dimension n and then use \n * {@link #addValue(double[])} to add n-tuples. The \u003ccode\u003egetXxx\u003c/code\u003e\n * methods where Xxx is a statistic return an array of \u003ccode\u003edouble\u003c/code\u003e\n * values, where for \u003ccode\u003ei \u003d 0,...,n-1\u003c/code\u003e the i\u003csup\u003eth\u003c/sup\u003e array element is the\n * value of the given statistic for data range consisting of the i\u003csup\u003eth\u003c/sup\u003e element of\n * each of the input n-tuples.  For example, if \u003ccode\u003eaddValue\u003c/code\u003e is called\n * with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},\n * \u003ccode\u003egetSum\u003c/code\u003e will return a three-element array with values\n * {0+3+6, 1+4+7, 2+5+8}\u003c/p\u003e\n * \n * \u003cp\u003eNote: This class is not thread-safe. Use \n * {@link SynchronizedMultivariateSummaryStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " Serialization UID "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.MultivariateSummaryStatistics(int, boolean)",
      "begin_line": 80,
      "end_line": 104,
      "comment": "\n     * Construct a MultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 19)",
        "(line 83,col 9)-(line 83,col 58)",
        "(line 84,col 9)-(line 84,col 58)",
        "(line 85,col 9)-(line 85,col 58)",
        "(line 86,col 9)-(line 86,col 58)",
        "(line 87,col 9)-(line 87,col 58)",
        "(line 88,col 9)-(line 88,col 58)",
        "(line 89,col 9)-(line 89,col 58)",
        "(line 91,col 9)-(line 99,col 9)",
        "(line 101,col 9)-(line 102,col 66)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Dimension of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumSqImpl"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceImpl"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " Covariance statistic implementation - cannot be reset. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 143,
      "end_line": 158,
      "comment": "\n     * Add an n-tuple to the data\n     * \n     * @param value  the n-tuple to add\n     * @throws DimensionMismatchException if the length of the array\n     * does not match the one used at construction\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 37)",
        "(line 146,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 40)",
        "(line 157,col 9)-(line 157,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getDimension()",
      "begin_line": 164,
      "end_line": 166,
      "comment": " \n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getN()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getResults(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * Returns an array of the results of a statistic.\n     * @param stats univariate statistic array\n     * @return results array\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 52)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 186,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSum()",
      "begin_line": 196,
      "end_line": 198,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component sums\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 197,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumSq()",
      "begin_line": 207,
      "end_line": 209,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of squares of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component sums of squares\n     ",
      "child_ranges": [
        "(line 208,col 9)-(line 208,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLog()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of logs of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component log sums\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMean()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component means\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 240,
      "end_line": 253,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the standard deviation of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component standard deviations\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 40)",
        "(line 242,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getCovariance()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the covariance matrix of the values that have been added.\n     *\n     * @return the covariance matrix \n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMax()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the maximum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component maxima\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMin()",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the minimum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component minima\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 293,
      "end_line": 295,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the geometric mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using \n     * {@link #addValue(double[])}\n     * \n     * @return the array of component geometric means\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.toString()",
      "begin_line": 303,
      "end_line": 316,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 52)",
        "(line 305,col 9)-(line 305,col 61)",
        "(line 306,col 9)-(line 306,col 48)",
        "(line 307,col 9)-(line 307,col 57)",
        "(line 308,col 9)-(line 308,col 57)",
        "(line 309,col 9)-(line 309,col 59)",
        "(line 310,col 9)-(line 310,col 78)",
        "(line 311,col 9)-(line 311,col 70)",
        "(line 312,col 9)-(line 312,col 74)",
        "(line 313,col 9)-(line 313,col 86)",
        "(line 314,col 9)-(line 314,col 77)",
        "(line 315,col 9)-(line 315,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.append(java.lang.StringBuffer, double[], java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 326,
      "end_line": 336,
      "comment": "\n     * Append a text representation of an array to a buffer.\n     * @param buffer buffer to fill\n     * @param data data array\n     * @param prefix text prefix\n     * @param separator elements separator\n     * @param suffix text suffix\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 30)",
        "(line 329,col 9)-(line 334,col 9)",
        "(line 335,col 9)-(line 335,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.clear()",
      "begin_line": 341,
      "end_line": 353,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 19)",
        "(line 343,col 9)-(line 351,col 9)",
        "(line 352,col 9)-(line 352,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 361,
      "end_line": 379,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 364,col 9)",
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 84)",
        "(line 369,col 9)-(line 378,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.hashCode()",
      "begin_line": 386,
      "end_line": 398,
      "comment": "\n     * Returns hash code based on values of statistics\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 387,col 9)-(line 387,col 61)",
        "(line 388,col 9)-(line 388,col 66)",
        "(line 389,col 9)-(line 389,col 56)",
        "(line 390,col 9)-(line 390,col 57)",
        "(line 391,col 9)-(line 391,col 56)",
        "(line 392,col 9)-(line 392,col 54)",
        "(line 393,col 9)-(line 393,col 56)",
        "(line 394,col 9)-(line 394,col 58)",
        "(line 395,col 9)-(line 395,col 59)",
        "(line 396,col 9)-(line 396,col 58)",
        "(line 397,col 9)-(line 397,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[], org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 410,
      "end_line": 416,
      "comment": "\n     * Sets statistics implementations.\n     * @param newImpl new implementations for statistics\n     * @param oldImpl old implementations for statistics\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 21)",
        "(line 414,col 9)-(line 414,col 39)",
        "(line 415,col 9)-(line 415,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the sum\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 440,
      "end_line": 443,
      "comment": "\n     * \u003cp\u003eSets the implementation for the Sum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumImpl the StorelessUnivariateStatistic instance to use\n     * for computing the Sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 450,
      "end_line": 452,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 477,
      "end_line": 479,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the minimum\n     ",
      "child_ranges": [
        "(line 478,col 9)-(line 478,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 494,
      "end_line": 497,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param minImpl the StorelessUnivariateStatistic instance to use\n     * for computing the minimum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 504,
      "end_line": 506,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the maximum\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 64)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 521,
      "end_line": 524,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param maxImpl the StorelessUnivariateStatistic instance to use\n     * for computing the maximum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 67)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 548,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added \n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 550,col 9)-(line 550,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 68)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 575,
      "end_line": 578,
      "comment": "\n     * \u003cp\u003eSets the implementation for the geometric mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 577,col 9)-(line 577,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * Returns the currently configured mean implementation\n     * \n     * @return the StorelessUnivariateStatistic implementing the mean\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 602,
      "end_line": 605,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data; \n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     * \n     * @param meanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkEmpty()",
      "begin_line": 610,
      "end_line": 615,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 611,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkDimension(int)",
      "begin_line": 622,
      "end_line": 627,
      "comment": "\n     * Throws DimensionMismatchException if dimension !\u003d k.\n     * @param dimension dimension to check\n     * @throws DimensionMismatchException if dimension !\u003d k\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)"
      ]
    }
  ]
}
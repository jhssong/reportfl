{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary",
        "java.io.Serializable"
      ],
      "begin_line": 68,
      "end_line": 633,
      "comment": "\n * \u003cp\u003eComputes summary statistics for a stream of n-tuples added using the\n * {@link #addValue(double[]) addValue} method. The data values are not stored\n * in memory, so this class can be used to compute statistics for very large\n * n-tuple streams.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link StorelessUnivariateStatistic} instances used to maintain\n * summary state and compute statistics are configurable via setters.\n * For example, the default implementation for the mean can be overridden by\n * calling {@link #setMeanImpl(StorelessUnivariateStatistic[])}. Actual\n * parameters to these methods must implement the\n * {@link StorelessUnivariateStatistic} interface and configuration must be\n * completed before \u003ccode\u003eaddValue\u003c/code\u003e is called. No configuration is\n * necessary to use the default, commons-math provided implementations.\u003c/p\u003e\n *\n * \u003cp\u003eTo compute statistics for a stream of n-tuples, construct a\n * MultivariateStatistics instance with dimension n and then use\n * {@link #addValue(double[])} to add n-tuples. The \u003ccode\u003egetXxx\u003c/code\u003e\n * methods where Xxx is a statistic return an array of \u003ccode\u003edouble\u003c/code\u003e\n * values, where for \u003ccode\u003ei \u003d 0,...,n-1\u003c/code\u003e the i\u003csup\u003eth\u003c/sup\u003e array element is the\n * value of the given statistic for data range consisting of the i\u003csup\u003eth\u003c/sup\u003e element of\n * each of the input n-tuples.  For example, if \u003ccode\u003eaddValue\u003c/code\u003e is called\n * with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},\n * \u003ccode\u003egetSum\u003c/code\u003e will return a three-element array with values\n * {0+3+6, 1+4+7, 2+5+8}\u003c/p\u003e\n *\n * \u003cp\u003eNote: This class is not thread-safe. Use\n * {@link SynchronizedMultivariateSummaryStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Dimension of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumSqImpl"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceImpl"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Covariance statistic implementation - cannot be reset. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.MultivariateSummaryStatistics(int, boolean)",
      "begin_line": 111,
      "end_line": 135,
      "comment": "\n     * Construct a MultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 19)",
        "(line 114,col 9)-(line 114,col 58)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 58)",
        "(line 122,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 133,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 144,
      "end_line": 159,
      "comment": "\n     * Add an n-tuple to the data\n     *\n     * @param value  the n-tuple to add\n     * @throws DimensionMismatchException if the length of the array\n     * does not match the one used at construction\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 157,col 40)",
        "(line 158,col 9)-(line 158,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getDimension()",
      "begin_line": 165,
      "end_line": 167,
      "comment": "\n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getN()",
      "begin_line": 173,
      "end_line": 175,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getResults(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 182,
      "end_line": 188,
      "comment": "\n     * Returns an array of the results of a statistic.\n     * @param stats univariate statistic array\n     * @return results array\n     ",
      "child_ranges": [
        "(line 183,col 9)-(line 183,col 52)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 187,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSum()",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumSq()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of squares of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums of squares\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLog()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of logs of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component log sums\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMean()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component means\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 241,
      "end_line": 254,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the standard deviation of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component standard deviations\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 40)",
        "(line 243,col 9)-(line 252,col 9)",
        "(line 253,col 9)-(line 253,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getCovariance()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the covariance matrix of the values that have been added.\n     *\n     * @return the covariance matrix\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMax()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the maximum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component maxima\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMin()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the minimum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component minima\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the geometric mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component geometric means\n     ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.toString()",
      "begin_line": 304,
      "end_line": 318,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 52)",
        "(line 307,col 9)-(line 307,col 61)",
        "(line 308,col 9)-(line 308,col 48)",
        "(line 309,col 9)-(line 309,col 57)",
        "(line 310,col 9)-(line 310,col 57)",
        "(line 311,col 9)-(line 311,col 59)",
        "(line 312,col 9)-(line 312,col 78)",
        "(line 313,col 9)-(line 313,col 70)",
        "(line 314,col 9)-(line 314,col 74)",
        "(line 315,col 9)-(line 315,col 86)",
        "(line 316,col 9)-(line 316,col 77)",
        "(line 317,col 9)-(line 317,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.append(java.lang.StringBuffer, double[], java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 328,
      "end_line": 338,
      "comment": "\n     * Append a text representation of an array to a buffer.\n     * @param buffer buffer to fill\n     * @param data data array\n     * @param prefix text prefix\n     * @param separator elements separator\n     * @param suffix text suffix\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 30)",
        "(line 331,col 9)-(line 336,col 9)",
        "(line 337,col 9)-(line 337,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.clear()",
      "begin_line": 343,
      "end_line": 355,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 19)",
        "(line 345,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 363,
      "end_line": 381,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 84)",
        "(line 372,col 9)-(line 380,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.hashCode()",
      "begin_line": 388,
      "end_line": 401,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 61)",
        "(line 391,col 9)-(line 391,col 66)",
        "(line 392,col 9)-(line 392,col 56)",
        "(line 393,col 9)-(line 393,col 57)",
        "(line 394,col 9)-(line 394,col 56)",
        "(line 395,col 9)-(line 395,col 54)",
        "(line 396,col 9)-(line 396,col 56)",
        "(line 397,col 9)-(line 397,col 58)",
        "(line 398,col 9)-(line 398,col 59)",
        "(line 399,col 9)-(line 399,col 58)",
        "(line 400,col 9)-(line 400,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[], org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 413,
      "end_line": 419,
      "comment": "\n     * Sets statistics implementations.\n     * @param newImpl new implementations for statistics\n     * @param oldImpl old implementations for statistics\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 416,col 9)-(line 416,col 21)",
        "(line 417,col 9)-(line 417,col 39)",
        "(line 418,col 9)-(line 418,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Returns the currently configured Sum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\n     * \u003cp\u003eSets the implementation for the Sum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumImpl the StorelessUnivariateStatistic instance to use\n     * for computing the Sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 470,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Returns the currently configured minimum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 497,
      "end_line": 500,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param minImpl the StorelessUnivariateStatistic instance to use\n     * for computing the minimum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 507,
      "end_line": 509,
      "comment": "\n     * Returns the currently configured maximum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     ",
      "child_ranges": [
        "(line 508,col 9)-(line 508,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 524,
      "end_line": 527,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param maxImpl the StorelessUnivariateStatistic instance to use\n     * for computing the maximum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 526,col 9)-(line 526,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 534,
      "end_line": 536,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 561,
      "end_line": 563,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     ",
      "child_ranges": [
        "(line 562,col 9)-(line 562,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 578,
      "end_line": 581,
      "comment": "\n     * \u003cp\u003eSets the implementation for the geometric mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n     * Returns the currently configured mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the mean\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 605,
      "end_line": 608,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param meanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkEmpty()",
      "begin_line": 613,
      "end_line": 619,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 618,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkDimension(int)",
      "begin_line": 626,
      "end_line": 631,
      "comment": "\n     * Throws DimensionMismatchException if dimension !\u003d k.\n     * @param dimension dimension to check\n     * @throws DimensionMismatchException if dimension !\u003d k\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 630,col 9)"
      ]
    }
  ]
}
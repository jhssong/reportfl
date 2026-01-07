{
  "filepath": "/tmp/Math-65b/src/main/java/org/apache/commons/math/stat/descriptive/MultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary",
        "java.io.Serializable"
      ],
      "begin_line": 69,
      "end_line": 636,
      "comment": "\n * \u003cp\u003eComputes summary statistics for a stream of n-tuples added using the\n * {@link #addValue(double[]) addValue} method. The data values are not stored\n * in memory, so this class can be used to compute statistics for very large\n * n-tuple streams.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link StorelessUnivariateStatistic} instances used to maintain\n * summary state and compute statistics are configurable via setters.\n * For example, the default implementation for the mean can be overridden by\n * calling {@link #setMeanImpl(StorelessUnivariateStatistic[])}. Actual\n * parameters to these methods must implement the\n * {@link StorelessUnivariateStatistic} interface and configuration must be\n * completed before \u003ccode\u003eaddValue\u003c/code\u003e is called. No configuration is\n * necessary to use the default, commons-math provided implementations.\u003c/p\u003e\n *\n * \u003cp\u003eTo compute statistics for a stream of n-tuples, construct a\n * MultivariateStatistics instance with dimension n and then use\n * {@link #addValue(double[])} to add n-tuples. The \u003ccode\u003egetXxx\u003c/code\u003e\n * methods where Xxx is a statistic return an array of \u003ccode\u003edouble\u003c/code\u003e\n * values, where for \u003ccode\u003ei \u003d 0,...,n-1\u003c/code\u003e the i\u003csup\u003eth\u003c/sup\u003e array element is the\n * value of the given statistic for data range consisting of the i\u003csup\u003eth\u003c/sup\u003e element of\n * each of the input n-tuples.  For example, if \u003ccode\u003eaddValue\u003c/code\u003e is called\n * with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},\n * \u003ccode\u003egetSum\u003c/code\u003e will return a three-element array with values\n * {0+3+6, 1+4+7, 2+5+8}\u003c/p\u003e\n *\n * \u003cp\u003eNote: This class is not thread-safe. Use\n * {@link SynchronizedMultivariateSummaryStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Dimension of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumSqImpl"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceImpl"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Covariance statistic implementation - cannot be reset. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.MultivariateSummaryStatistics(int, boolean)",
      "begin_line": 112,
      "end_line": 136,
      "comment": "\n     * Construct a MultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 19)",
        "(line 115,col 9)-(line 115,col 58)",
        "(line 116,col 9)-(line 116,col 58)",
        "(line 117,col 9)-(line 117,col 58)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 58)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 123,col 9)-(line 131,col 9)",
        "(line 133,col 9)-(line 134,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 145,
      "end_line": 160,
      "comment": "\n     * Add an n-tuple to the data\n     *\n     * @param value  the n-tuple to add\n     * @throws DimensionMismatchException if the length of the array\n     * does not match the one used at construction\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 37)",
        "(line 148,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 40)",
        "(line 159,col 9)-(line 159,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getDimension()",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getN()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getResults(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Returns an array of the results of a statistic.\n     * @param stats univariate statistic array\n     * @return results array\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 52)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSum()",
      "begin_line": 198,
      "end_line": 200,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumSq()",
      "begin_line": 209,
      "end_line": 211,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of squares of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums of squares\n     ",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLog()",
      "begin_line": 220,
      "end_line": 222,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of logs of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component log sums\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 221,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMean()",
      "begin_line": 231,
      "end_line": 233,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component means\n     ",
      "child_ranges": [
        "(line 232,col 9)-(line 232,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 242,
      "end_line": 255,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the standard deviation of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component standard deviations\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 40)",
        "(line 244,col 9)-(line 253,col 9)",
        "(line 254,col 9)-(line 254,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getCovariance()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the covariance matrix of the values that have been added.\n     *\n     * @return the covariance matrix\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMax()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the maximum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component maxima\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMin()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the minimum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component minima\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the geometric mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component geometric means\n     ",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.toString()",
      "begin_line": 305,
      "end_line": 321,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 38)",
        "(line 308,col 9)-(line 308,col 67)",
        "(line 309,col 9)-(line 309,col 52)",
        "(line 310,col 9)-(line 310,col 68)",
        "(line 311,col 9)-(line 311,col 50)",
        "(line 312,col 9)-(line 312,col 64)",
        "(line 313,col 9)-(line 313,col 64)",
        "(line 314,col 9)-(line 314,col 66)",
        "(line 315,col 9)-(line 315,col 85)",
        "(line 316,col 9)-(line 316,col 77)",
        "(line 317,col 9)-(line 317,col 81)",
        "(line 318,col 9)-(line 318,col 93)",
        "(line 319,col 9)-(line 319,col 79)",
        "(line 320,col 9)-(line 320,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.append(java.lang.StringBuffer, double[], java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 331,
      "end_line": 341,
      "comment": "\n     * Append a text representation of an array to a buffer.\n     * @param buffer buffer to fill\n     * @param data data array\n     * @param prefix text prefix\n     * @param separator elements separator\n     * @param suffix text suffix\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 30)",
        "(line 334,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.clear()",
      "begin_line": 346,
      "end_line": 358,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 19)",
        "(line 348,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 357,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 366,
      "end_line": 384,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eMultivariateSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 374,col 84)",
        "(line 375,col 9)-(line 383,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.hashCode()",
      "begin_line": 391,
      "end_line": 404,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 61)",
        "(line 394,col 9)-(line 394,col 66)",
        "(line 395,col 9)-(line 395,col 56)",
        "(line 396,col 9)-(line 396,col 57)",
        "(line 397,col 9)-(line 397,col 56)",
        "(line 398,col 9)-(line 398,col 54)",
        "(line 399,col 9)-(line 399,col 56)",
        "(line 400,col 9)-(line 400,col 58)",
        "(line 401,col 9)-(line 401,col 59)",
        "(line 402,col 9)-(line 402,col 58)",
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[], org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 416,
      "end_line": 422,
      "comment": "\n     * Sets statistics implementations.\n     * @param newImpl new implementations for statistics\n     * @param oldImpl old implementations for statistics\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 420,col 39)",
        "(line 421,col 9)-(line 421,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Returns the currently configured Sum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003eSets the implementation for the Sum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumImpl the StorelessUnivariateStatistic instance to use\n     * for computing the Sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 473,
      "end_line": 476,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 483,
      "end_line": 485,
      "comment": "\n     * Returns the currently configured minimum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param minImpl the StorelessUnivariateStatistic instance to use\n     * for computing the minimum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Returns the currently configured maximum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 527,
      "end_line": 530,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param maxImpl the StorelessUnivariateStatistic instance to use\n     * for computing the maximum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 537,
      "end_line": 539,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 554,
      "end_line": 557,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 581,
      "end_line": 584,
      "comment": "\n     * \u003cp\u003eSets the implementation for the geometric mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 591,
      "end_line": 593,
      "comment": "\n     * Returns the currently configured mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the mean\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 608,
      "end_line": 611,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param meanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws IllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkEmpty()",
      "begin_line": 616,
      "end_line": 622,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 621,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.MultivariateSummaryStatistics.checkDimension(int)",
      "begin_line": 629,
      "end_line": 634,
      "comment": "\n     * Throws DimensionMismatchException if dimension !\u003d k.\n     * @param dimension dimension to check\n     * @throws DimensionMismatchException if dimension !\u003d k\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 633,col 9)"
      ]
    }
  ]
}
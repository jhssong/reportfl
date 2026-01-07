{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/MultivariateSummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "MultivariateSummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.StatisticalMultivariateSummary",
        "java.io.Serializable"
      ],
      "begin_line": 72,
      "end_line": 636,
      "comment": "\n * \u003cp\u003eComputes summary statistics for a stream of n-tuples added using the\n * {@link #addValue(double[]) addValue} method. The data values are not stored\n * in memory, so this class can be used to compute statistics for very large\n * n-tuple streams.\u003c/p\u003e\n *\n * \u003cp\u003eThe {@link StorelessUnivariateStatistic} instances used to maintain\n * summary state and compute statistics are configurable via setters.\n * For example, the default implementation for the mean can be overridden by\n * calling {@link #setMeanImpl(StorelessUnivariateStatistic[])}. Actual\n * parameters to these methods must implement the\n * {@link StorelessUnivariateStatistic} interface and configuration must be\n * completed before \u003ccode\u003eaddValue\u003c/code\u003e is called. No configuration is\n * necessary to use the default, commons-math provided implementations.\u003c/p\u003e\n *\n * \u003cp\u003eTo compute statistics for a stream of n-tuples, construct a\n * MultivariateStatistics instance with dimension n and then use\n * {@link #addValue(double[])} to add n-tuples. The \u003ccode\u003egetXxx\u003c/code\u003e\n * methods where Xxx is a statistic return an array of \u003ccode\u003edouble\u003c/code\u003e\n * values, where for \u003ccode\u003ei \u003d 0,...,n-1\u003c/code\u003e the i\u003csup\u003eth\u003c/sup\u003e array element is the\n * value of the given statistic for data range consisting of the i\u003csup\u003eth\u003c/sup\u003e element of\n * each of the input n-tuples.  For example, if \u003ccode\u003eaddValue\u003c/code\u003e is called\n * with actual parameters {0, 1, 2}, then {3, 4, 5} and finally {6, 7, 8},\n * \u003ccode\u003egetSum\u003c/code\u003e will return a three-element array with values\n * {0+3+6, 1+4+7, 2+5+8}\u003c/p\u003e\n *\n * \u003cp\u003eNote: This class is not thread-safe. Use\n * {@link SynchronizedMultivariateSummaryStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @since 1.2\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "k"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " Dimension of the data. "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " Count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumSqImpl"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "covarianceImpl"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Covariance statistic implementation - cannot be reset. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.MultivariateSummaryStatistics(int, boolean)",
      "begin_line": 115,
      "end_line": 139,
      "comment": "\n     * Construct a MultivariateSummaryStatistics instance\n     * @param k dimension of the data\n     * @param isCovarianceBiasCorrected if true, the unbiased sample\n     * covariance is computed, otherwise the biased population covariance\n     * is computed\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 19)",
        "(line 118,col 9)-(line 118,col 58)",
        "(line 119,col 9)-(line 119,col 58)",
        "(line 120,col 9)-(line 120,col 58)",
        "(line 121,col 9)-(line 121,col 58)",
        "(line 122,col 9)-(line 122,col 58)",
        "(line 123,col 9)-(line 123,col 58)",
        "(line 124,col 9)-(line 124,col 58)",
        "(line 126,col 9)-(line 134,col 9)",
        "(line 136,col 9)-(line 137,col 66)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.addValue(double[])",
      "begin_line": 148,
      "end_line": 162,
      "comment": "\n     * Add an n-tuple to the data\n     *\n     * @param value  the n-tuple to add\n     * @throws DimensionMismatchException if the length of the array\n     * does not match the one used at construction\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 37)",
        "(line 150,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 160,col 40)",
        "(line 161,col 9)-(line 161,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getDimension()",
      "begin_line": 168,
      "end_line": 170,
      "comment": "\n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": [
        "(line 169,col 9)-(line 169,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getN()",
      "begin_line": 176,
      "end_line": 178,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 177,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getResults(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 185,
      "end_line": 191,
      "comment": "\n     * Returns an array of the results of a statistic.\n     * @param stats univariate statistic array\n     * @return results array\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 52)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 190,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSum()",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSumSq()",
      "begin_line": 211,
      "end_line": 213,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of squares of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component sums of squares\n     ",
      "child_ranges": [
        "(line 212,col 9)-(line 212,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSumLog()",
      "begin_line": 222,
      "end_line": 224,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the sum of logs of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component log sums\n     ",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMean()",
      "begin_line": 233,
      "end_line": 235,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component means\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getStandardDeviation()",
      "begin_line": 244,
      "end_line": 257,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the standard deviation of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component standard deviations\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 40)",
        "(line 246,col 9)-(line 255,col 9)",
        "(line 256,col 9)-(line 256,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getCovariance()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns the covariance matrix of the values that have been added.\n     *\n     * @return the covariance matrix\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMax()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the maximum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component maxima\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMin()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the minimum of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component minima\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getGeometricMean()",
      "begin_line": 297,
      "end_line": 299,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the geometric mean of the\n     * i\u003csup\u003eth\u003c/sup\u003e entries of the arrays that have been added using\n     * {@link #addValue(double[])}\n     *\n     * @return the array of component geometric means\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 298,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.toString()",
      "begin_line": 307,
      "end_line": 323,
      "comment": "\n     * Generates a text report displaying\n     * summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 38)",
        "(line 310,col 9)-(line 310,col 67)",
        "(line 311,col 9)-(line 311,col 54)",
        "(line 312,col 9)-(line 312,col 68)",
        "(line 313,col 9)-(line 313,col 50)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 64)",
        "(line 316,col 9)-(line 316,col 66)",
        "(line 317,col 9)-(line 317,col 85)",
        "(line 318,col 9)-(line 318,col 77)",
        "(line 319,col 9)-(line 319,col 81)",
        "(line 320,col 9)-(line 320,col 93)",
        "(line 321,col 9)-(line 321,col 79)",
        "(line 322,col 9)-(line 322,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.append(java.lang.StringBuilder, double[], java.lang.String, java.lang.String, java.lang.String)",
      "begin_line": 333,
      "end_line": 343,
      "comment": "\n     * Append a text representation of an array to a buffer.\n     * @param buffer buffer to fill\n     * @param data data array\n     * @param prefix text prefix\n     * @param separator elements separator\n     * @param suffix text suffix\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 30)",
        "(line 336,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 342,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.clear()",
      "begin_line": 348,
      "end_line": 360,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 349,col 9)-(line 349,col 19)",
        "(line 350,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.equals(java.lang.Object)",
      "begin_line": 368,
      "end_line": 386,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eMultivariateSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 370,col 9)-(line 372,col 9)",
        "(line 373,col 9)-(line 375,col 9)",
        "(line 376,col 9)-(line 376,col 84)",
        "(line 377,col 9)-(line 385,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.hashCode()",
      "begin_line": 393,
      "end_line": 406,
      "comment": "\n     * Returns hash code based on values of statistics\n     *\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 61)",
        "(line 396,col 9)-(line 396,col 66)",
        "(line 397,col 9)-(line 397,col 56)",
        "(line 398,col 9)-(line 398,col 57)",
        "(line 399,col 9)-(line 399,col 56)",
        "(line 400,col 9)-(line 400,col 54)",
        "(line 401,col 9)-(line 401,col 56)",
        "(line 402,col 9)-(line 402,col 58)",
        "(line 403,col 9)-(line 403,col 59)",
        "(line 404,col 9)-(line 404,col 58)",
        "(line 405,col 9)-(line 405,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[], org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 418,
      "end_line": 424,
      "comment": "\n     * Sets statistics implementations.\n     * @param newImpl new implementations for statistics\n     * @param oldImpl old implementations for statistics\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     * (i.e. if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 21)",
        "(line 422,col 9)-(line 422,col 39)",
        "(line 423,col 9)-(line 423,col 65)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSumImpl()",
      "begin_line": 431,
      "end_line": 433,
      "comment": "\n     * Returns the currently configured Sum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 448,
      "end_line": 451,
      "comment": "\n     * \u003cp\u003eSets the implementation for the Sum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumImpl the StorelessUnivariateStatistic instance to use\n     * for computing the Sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSumsqImpl()",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMinImpl()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Returns the currently configured minimum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 502,
      "end_line": 505,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param minImpl the StorelessUnivariateStatistic instance to use\n     * for computing the minimum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMaxImpl()",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * Returns the currently configured maximum implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 529,
      "end_line": 532,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param maxImpl the StorelessUnivariateStatistic instance to use\n     * for computing the maximum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getSumLogImpl()",
      "begin_line": 539,
      "end_line": 541,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     ",
      "child_ranges": [
        "(line 540,col 9)-(line 540,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 556,
      "end_line": 559,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of logs.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use\n     * for computing the log sum\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 558,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getGeoMeanImpl()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 583,
      "end_line": 586,
      "comment": "\n     * \u003cp\u003eSets the implementation for the geometric mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.getMeanImpl()",
      "begin_line": 593,
      "end_line": 595,
      "comment": "\n     * Returns the currently configured mean implementation\n     *\n     * @return the StorelessUnivariateStatistic implementing the mean\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic[])",
      "begin_line": 610,
      "end_line": 613,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \u003cp\u003eThis method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double[]) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\u003c/p\u003e\n     *\n     * @param meanImpl the StorelessUnivariateStatistic instance to use\n     * for computing the mean\n     * @throws DimensionMismatchException if the array dimension\n     * does not match the one used at construction\n     * @throws MathIllegalStateException if data has already been added\n     *  (i.e if n \u003e 0)\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 612,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.checkEmpty()",
      "begin_line": 619,
      "end_line": 624,
      "comment": "\n     * Throws MathIllegalStateException if the statistic is not empty.\n     * @throws MathIllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.MultivariateSummaryStatistics.checkDimension(int)",
      "begin_line": 631,
      "end_line": 635,
      "comment": "\n     * Throws DimensionMismatchException if dimension !\u003d k.\n     * @param dimension dimension to check\n     * @throws DimensionMismatchException if dimension !\u003d k\n     ",
      "child_ranges": [
        "(line 632,col 9)-(line 634,col 9)"
      ]
    }
  ]
}
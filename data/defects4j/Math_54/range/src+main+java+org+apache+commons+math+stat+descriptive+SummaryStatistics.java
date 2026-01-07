{
  "filepath": "/tmp/Math-54b/src/main/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 59,
      "end_line": 717,
      "comment": "\n * \u003cp\u003e\n * Computes summary statistics for a stream of data values added using the\n * {@link #addValue(double) addValue} method. The data values are not stored in\n * memory, so this class can be used to compute statistics for very large data\n * streams.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link StorelessUnivariateStatistic} instances used to maintain summary\n * state and compute statistics are configurable via setters. For example, the\n * default implementation for the variance can be overridden by calling\n * {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual parameters to\n * these methods must implement the {@link StorelessUnivariateStatistic}\n * interface and configuration must be completed before \u003ccode\u003eaddValue\u003c/code\u003e\n * is called. No configuration is necessary to use the default, commons-math\n * provided implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note: This class is not thread-safe. Use\n * {@link SynchronizedSummaryStatistics} if concurrent access from multiple\n * threads is required.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 65,
      "end_line": 65,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 121,
      "end_line": 122,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 138,
      "end_line": 141,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * @return Current values of statistics\n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 140,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 147,
      "end_line": 166,
      "comment": "\n     * Add a value to the data\n     * @param value the value to add\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 149,col 35)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 36)",
        "(line 153,col 9)-(line 153,col 38)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 165,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 172,
      "end_line": 174,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the sum of the values that have been added\n     * @return The sum or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 191,
      "end_line": 193,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 192,col 9)-(line 192,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 202,
      "end_line": 208,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the mean\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 207,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 217,
      "end_line": 227,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 35)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 236,
      "end_line": 242,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the variance\n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 241,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the maximum\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 262,
      "end_line": 264,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the minimum\n     ",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 273,
      "end_line": 275,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the geometric mean\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs()",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Returns the sum of the logs of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the sum of logs\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment()",
      "begin_line": 300,
      "end_line": 302,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the values that have been added.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n     * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n     * \u003cp\u003e\n     * @return second central moment statistic\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 301,col 9)-(line 301,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 310,
      "end_line": 327,
      "comment": "\n     * Generates a text report displaying summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 54)",
        "(line 313,col 9)-(line 313,col 27)",
        "(line 314,col 9)-(line 314,col 60)",
        "(line 315,col 9)-(line 315,col 60)",
        "(line 316,col 9)-(line 316,col 64)",
        "(line 317,col 9)-(line 317,col 64)",
        "(line 318,col 9)-(line 318,col 66)",
        "(line 319,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 74)",
        "(line 322,col 9)-(line 322,col 77)",
        "(line 323,col 9)-(line 324,col 26)",
        "(line 325,col 9)-(line 325,col 78)",
        "(line 326,col 9)-(line 326,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 332,
      "end_line": 347,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 333,col 9)-(line 333,col 19)",
        "(line 334,col 9)-(line 334,col 24)",
        "(line 335,col 9)-(line 335,col 24)",
        "(line 336,col 9)-(line 336,col 24)",
        "(line 337,col 9)-(line 337,col 27)",
        "(line 338,col 9)-(line 338,col 26)",
        "(line 339,col 9)-(line 339,col 28)",
        "(line 340,col 9)-(line 340,col 29)",
        "(line 341,col 9)-(line 343,col 9)",
        "(line 344,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 356,
      "end_line": 373,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n     * same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 358,col 9)-(line 360,col 9)",
        "(line 361,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 364,col 59)",
        "(line 365,col 9)-(line 372,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 379,
      "end_line": 391,
      "comment": "\n     * Returns hash code based on values of statistics\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 61)",
        "(line 382,col 9)-(line 382,col 66)",
        "(line 383,col 9)-(line 383,col 56)",
        "(line 384,col 9)-(line 384,col 57)",
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 386,col 54)",
        "(line 387,col 9)-(line 387,col 56)",
        "(line 388,col 9)-(line 388,col 58)",
        "(line 389,col 9)-(line 389,col 61)",
        "(line 390,col 9)-(line 390,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 399,
      "end_line": 401,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * @return the StorelessUnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 418,
      "end_line": 421,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the Sum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the Sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 21)",
        "(line 420,col 9)-(line 420,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 447,
      "end_line": 450,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of squares.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the sum of squares\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 21)",
        "(line 449,col 9)-(line 449,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 476,
      "end_line": 479,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the minimum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param minImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the minimum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 477,col 9)-(line 477,col 21)",
        "(line 478,col 9)-(line 478,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 505,
      "end_line": 508,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the maximum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param maxImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the maximum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 506,col 9)-(line 506,col 21)",
        "(line 507,col 9)-(line 507,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 534,
      "end_line": 538,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of logs.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the log sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 535,col 21)",
        "(line 536,col 9)-(line 536,col 37)",
        "(line 537,col 9)-(line 537,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 564,
      "end_line": 567,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the geometric mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the geometric mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 21)",
        "(line 566,col 9)-(line 566,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 574,
      "end_line": 576,
      "comment": "\n     * Returns the currently configured mean implementation\n     * @return the StorelessUnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 593,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param meanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 21)",
        "(line 595,col 9)-(line 595,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Returns the currently configured variance implementation\n     * @return the StorelessUnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 622,
      "end_line": 625,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the variance.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param varianceImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the variance\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 623,col 9)-(line 623,col 21)",
        "(line 624,col 9)-(line 624,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 630,
      "end_line": 636,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 635,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy()",
      "begin_line": 643,
      "end_line": 647,
      "comment": "\n     * Returns a copy of this SummaryStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 644,col 9)-(line 644,col 59)",
        "(line 645,col 9)-(line 645,col 27)",
        "(line 646,col 9)-(line 646,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 657,
      "end_line": 716,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SummaryStatistics to copy\n     * @param dest SummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 45)",
        "(line 659,col 9)-(line 659,col 47)",
        "(line 660,col 9)-(line 660,col 45)",
        "(line 661,col 9)-(line 661,col 45)",
        "(line 662,col 9)-(line 662,col 55)",
        "(line 663,col 9)-(line 663,col 51)",
        "(line 664,col 9)-(line 664,col 49)",
        "(line 665,col 9)-(line 670,col 9)",
        "(line 671,col 9)-(line 671,col 66)",
        "(line 672,col 9)-(line 672,col 26)",
        "(line 676,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 685,col 9)",
        "(line 686,col 9)-(line 690,col 9)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 700,col 9)",
        "(line 701,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 710,col 9)",
        "(line 711,col 9)-(line 715,col 9)"
      ]
    }
  ]
}
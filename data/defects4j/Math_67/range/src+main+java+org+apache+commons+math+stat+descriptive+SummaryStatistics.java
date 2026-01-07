{
  "filepath": "/tmp/Math-67b/src/main/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 58,
      "end_line": 716,
      "comment": "\n * \u003cp\u003e\n * Computes summary statistics for a stream of data values added using the\n * {@link #addValue(double) addValue} method. The data values are not stored in\n * memory, so this class can be used to compute statistics for very large data\n * streams.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link StorelessUnivariateStatistic} instances used to maintain summary\n * state and compute statistics are configurable via setters. For example, the\n * default implementation for the variance can be overridden by calling\n * {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual parameters to\n * these methods must implement the {@link StorelessUnivariateStatistic}\n * interface and configuration must be completed before \u003ccode\u003eaddValue\u003c/code\u003e\n * is called. No configuration is necessary to use the default, commons-math\n * provided implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note: This class is not thread-safe. Use\n * {@link SynchronizedSummaryStatistics} if concurrent access from multiple\n * threads is required.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 120,
      "end_line": 121,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 128,
      "end_line": 130,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 129,col 9)-(line 129,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 137,
      "end_line": 140,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * @return Current values of statistics\n     ",
      "child_ranges": [
        "(line 138,col 9)-(line 139,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 146,
      "end_line": 165,
      "comment": "\n     * Add a value to the data\n     * @param value the value to add\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 33)",
        "(line 148,col 9)-(line 148,col 35)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 33)",
        "(line 151,col 9)-(line 151,col 36)",
        "(line 152,col 9)-(line 152,col 38)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 171,
      "end_line": 173,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 172,col 9)-(line 172,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 179,
      "end_line": 181,
      "comment": "\n     * Returns the sum of the values that have been added\n     * @return The sum or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added\n     ",
      "child_ranges": [
        "(line 180,col 9)-(line 180,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 201,
      "end_line": 207,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the mean\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 216,
      "end_line": 226,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 35)",
        "(line 218,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 235,
      "end_line": 241,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the variance\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 240,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the maximum\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the minimum\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the geometric mean\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "\n     * Returns the sum of the logs of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the sum of logs\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the values that have been added.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n     * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n     * \u003cp\u003e\n     * @return second central moment statistic\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 309,
      "end_line": 326,
      "comment": "\n     * Generates a text report displaying summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 52)",
        "(line 312,col 9)-(line 312,col 27)",
        "(line 313,col 9)-(line 313,col 60)",
        "(line 314,col 9)-(line 314,col 60)",
        "(line 315,col 9)-(line 315,col 64)",
        "(line 316,col 9)-(line 316,col 64)",
        "(line 317,col 9)-(line 317,col 66)",
        "(line 318,col 9)-(line 319,col 26)",
        "(line 320,col 9)-(line 320,col 74)",
        "(line 321,col 9)-(line 321,col 77)",
        "(line 322,col 9)-(line 323,col 26)",
        "(line 324,col 9)-(line 324,col 78)",
        "(line 325,col 9)-(line 325,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 331,
      "end_line": 346,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 19)",
        "(line 333,col 9)-(line 333,col 24)",
        "(line 334,col 9)-(line 334,col 24)",
        "(line 335,col 9)-(line 335,col 24)",
        "(line 336,col 9)-(line 336,col 27)",
        "(line 337,col 9)-(line 337,col 26)",
        "(line 338,col 9)-(line 338,col 28)",
        "(line 339,col 9)-(line 339,col 29)",
        "(line 340,col 9)-(line 342,col 9)",
        "(line 343,col 9)-(line 345,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 355,
      "end_line": 372,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n     * same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 359,col 9)",
        "(line 360,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 363,col 59)",
        "(line 364,col 9)-(line 371,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 378,
      "end_line": 390,
      "comment": "\n     * Returns hash code based on values of statistics\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 61)",
        "(line 381,col 9)-(line 381,col 66)",
        "(line 382,col 9)-(line 382,col 56)",
        "(line 383,col 9)-(line 383,col 57)",
        "(line 384,col 9)-(line 384,col 56)",
        "(line 385,col 9)-(line 385,col 54)",
        "(line 386,col 9)-(line 386,col 56)",
        "(line 387,col 9)-(line 387,col 58)",
        "(line 388,col 9)-(line 388,col 61)",
        "(line 389,col 9)-(line 389,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * @return the StorelessUnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 417,
      "end_line": 420,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the Sum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the Sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 21)",
        "(line 419,col 9)-(line 419,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 446,
      "end_line": 449,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of squares.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the sum of squares\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 21)",
        "(line 448,col 9)-(line 448,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 475,
      "end_line": 478,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the minimum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param minImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the minimum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 21)",
        "(line 477,col 9)-(line 477,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 485,
      "end_line": 487,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 504,
      "end_line": 507,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the maximum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param maxImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the maximum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 505,col 9)-(line 505,col 21)",
        "(line 506,col 9)-(line 506,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 533,
      "end_line": 537,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of logs.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the log sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 534,col 9)-(line 534,col 21)",
        "(line 535,col 9)-(line 535,col 37)",
        "(line 536,col 9)-(line 536,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 563,
      "end_line": 566,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the geometric mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the geometric mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 21)",
        "(line 565,col 9)-(line 565,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * Returns the currently configured mean implementation\n     * @return the StorelessUnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param meanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 21)",
        "(line 594,col 9)-(line 594,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 602,
      "end_line": 604,
      "comment": "\n     * Returns the currently configured variance implementation\n     * @return the StorelessUnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 603,col 9)-(line 603,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 621,
      "end_line": 624,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the variance.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param varianceImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the variance\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 622,col 9)-(line 622,col 21)",
        "(line 623,col 9)-(line 623,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 629,
      "end_line": 635,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 634,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy()",
      "begin_line": 642,
      "end_line": 646,
      "comment": "\n     * Returns a copy of this SummaryStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 643,col 9)-(line 643,col 59)",
        "(line 644,col 9)-(line 644,col 27)",
        "(line 645,col 9)-(line 645,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 656,
      "end_line": 715,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SummaryStatistics to copy\n     * @param dest SummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 45)",
        "(line 658,col 9)-(line 658,col 47)",
        "(line 659,col 9)-(line 659,col 45)",
        "(line 660,col 9)-(line 660,col 45)",
        "(line 661,col 9)-(line 661,col 55)",
        "(line 662,col 9)-(line 662,col 51)",
        "(line 663,col 9)-(line 663,col 49)",
        "(line 664,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 670,col 66)",
        "(line 671,col 9)-(line 671,col 26)",
        "(line 675,col 9)-(line 679,col 9)",
        "(line 680,col 9)-(line 684,col 9)",
        "(line 685,col 9)-(line 689,col 9)",
        "(line 690,col 9)-(line 694,col 9)",
        "(line 695,col 9)-(line 699,col 9)",
        "(line 700,col 9)-(line 704,col 9)",
        "(line 705,col 9)-(line 709,col 9)",
        "(line 710,col 9)-(line 714,col 9)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-79b/src/main/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 57,
      "end_line": 715,
      "comment": "\n * \u003cp\u003e\n * Computes summary statistics for a stream of data values added using the\n * {@link #addValue(double) addValue} method. The data values are not stored in\n * memory, so this class can be used to compute statistics for very large data\n * streams.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link StorelessUnivariateStatistic} instances used to maintain summary\n * state and compute statistics are configurable via setters. For example, the\n * default implementation for the variance can be overridden by calling\n * {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual parameters to\n * these methods must implement the {@link StorelessUnivariateStatistic}\n * interface and configuration must be completed before \u003ccode\u003eaddValue\u003c/code\u003e\n * is called. No configuration is necessary to use the default, commons-math\n * provided implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note: This class is not thread-safe. Use\n * {@link SynchronizedSummaryStatistics} if concurrent access from multiple\n * threads is required.\n * \u003c/p\u003e\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 60,
      "end_line": 60,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 63,
      "end_line": 63,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 119,
      "end_line": 120,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 136,
      "end_line": 139,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * @return Current values of statistics\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 138,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 145,
      "end_line": 164,
      "comment": "\n     * Add a value to the data\n     * @param value the value to add\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 146,col 33)",
        "(line 147,col 9)-(line 147,col 35)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 149,col 9)-(line 149,col 33)",
        "(line 150,col 9)-(line 150,col 36)",
        "(line 151,col 9)-(line 151,col 38)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 170,
      "end_line": 172,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 178,
      "end_line": 180,
      "comment": "\n     * Returns the sum of the values that have been added\n     * @return The sum or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added\n     ",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 200,
      "end_line": 206,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the mean\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 215,
      "end_line": 225,
      "comment": "\n     * Returns the standard deviation of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the standard deviation\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 35)",
        "(line 217,col 9)-(line 223,col 9)",
        "(line 224,col 9)-(line 224,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 234,
      "end_line": 240,
      "comment": "\n     * Returns the variance of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the variance\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 239,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 249,
      "end_line": 251,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the maximum\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the minimum\n     ",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the geometric mean\n     ",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumOfLogs()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the sum of the logs of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the sum of logs\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSecondMoment()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the values that have been added.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n     * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n     * \u003cp\u003e\n     * @return second central moment statistic\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 308,
      "end_line": 325,
      "comment": "\n     * Generates a text report displaying summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 310,col 9)-(line 310,col 52)",
        "(line 311,col 9)-(line 311,col 27)",
        "(line 312,col 9)-(line 312,col 60)",
        "(line 313,col 9)-(line 313,col 60)",
        "(line 314,col 9)-(line 314,col 64)",
        "(line 315,col 9)-(line 315,col 64)",
        "(line 316,col 9)-(line 316,col 66)",
        "(line 317,col 9)-(line 318,col 26)",
        "(line 319,col 9)-(line 319,col 74)",
        "(line 320,col 9)-(line 320,col 77)",
        "(line 321,col 9)-(line 322,col 26)",
        "(line 323,col 9)-(line 323,col 78)",
        "(line 324,col 9)-(line 324,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 330,
      "end_line": 345,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 19)",
        "(line 332,col 9)-(line 332,col 24)",
        "(line 333,col 9)-(line 333,col 24)",
        "(line 334,col 9)-(line 334,col 24)",
        "(line 335,col 9)-(line 335,col 27)",
        "(line 336,col 9)-(line 336,col 26)",
        "(line 337,col 9)-(line 337,col 28)",
        "(line 338,col 9)-(line 338,col 29)",
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 354,
      "end_line": 371,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n     * same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 361,col 9)",
        "(line 362,col 9)-(line 362,col 59)",
        "(line 363,col 9)-(line 370,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 377,
      "end_line": 389,
      "comment": "\n     * Returns hash code based on values of statistics\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 61)",
        "(line 380,col 9)-(line 380,col 66)",
        "(line 381,col 9)-(line 381,col 56)",
        "(line 382,col 9)-(line 382,col 57)",
        "(line 383,col 9)-(line 383,col 56)",
        "(line 384,col 9)-(line 384,col 54)",
        "(line 385,col 9)-(line 385,col 56)",
        "(line 386,col 9)-(line 386,col 58)",
        "(line 387,col 9)-(line 387,col 61)",
        "(line 388,col 9)-(line 388,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * @return the StorelessUnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 416,
      "end_line": 419,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the Sum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the Sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 417,col 9)-(line 417,col 21)",
        "(line 418,col 9)-(line 418,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 445,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of squares.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the sum of squares\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 21)",
        "(line 447,col 9)-(line 447,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 455,
      "end_line": 457,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 456,col 9)-(line 456,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 474,
      "end_line": 477,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the minimum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param minImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the minimum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 21)",
        "(line 476,col 9)-(line 476,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 484,
      "end_line": 486,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 503,
      "end_line": 506,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the maximum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param maxImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the maximum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 21)",
        "(line 505,col 9)-(line 505,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 513,
      "end_line": 515,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 514,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 532,
      "end_line": 536,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of logs.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the log sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 533,col 9)-(line 533,col 21)",
        "(line 534,col 9)-(line 534,col 37)",
        "(line 535,col 9)-(line 535,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 543,
      "end_line": 545,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 544,col 9)-(line 544,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 562,
      "end_line": 565,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the geometric mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the geometric mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 21)",
        "(line 564,col 9)-(line 564,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 572,
      "end_line": 574,
      "comment": "\n     * Returns the currently configured mean implementation\n     * @return the StorelessUnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 591,
      "end_line": 594,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param meanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 592,col 9)-(line 592,col 21)",
        "(line 593,col 9)-(line 593,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 601,
      "end_line": 603,
      "comment": "\n     * Returns the currently configured variance implementation\n     * @return the StorelessUnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 602,col 9)-(line 602,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 620,
      "end_line": 623,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the variance.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param varianceImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the variance\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 621,col 21)",
        "(line 622,col 9)-(line 622,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 628,
      "end_line": 634,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 629,col 9)-(line 633,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy()",
      "begin_line": 641,
      "end_line": 645,
      "comment": "\n     * Returns a copy of this SummaryStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 59)",
        "(line 643,col 9)-(line 643,col 27)",
        "(line 644,col 9)-(line 644,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 655,
      "end_line": 714,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SummaryStatistics to copy\n     * @param dest SummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 45)",
        "(line 657,col 9)-(line 657,col 47)",
        "(line 658,col 9)-(line 658,col 45)",
        "(line 659,col 9)-(line 659,col 45)",
        "(line 660,col 9)-(line 660,col 55)",
        "(line 661,col 9)-(line 661,col 51)",
        "(line 662,col 9)-(line 662,col 49)",
        "(line 663,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 66)",
        "(line 670,col 9)-(line 670,col 26)",
        "(line 674,col 9)-(line 678,col 9)",
        "(line 679,col 9)-(line 683,col 9)",
        "(line 684,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 698,col 9)",
        "(line 699,col 9)-(line 703,col 9)",
        "(line 704,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 713,col 9)"
      ]
    }
  ]
}
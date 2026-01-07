{
  "filepath": "/tmp/Math-91b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
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
      "end_line": 698,
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
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 65,
      "end_line": 66,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.SummaryStatistics(org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     * \n     * @param original the {@code SummaryStatistics} instance to copy\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Variance statistic implementation - can be reset by setter. "
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
        "(line 224,col 9)-(line 224,col 24)"
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
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 293,
      "end_line": 309,
      "comment": "\n     * Generates a text report displaying summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 294,col 9)-(line 294,col 52)",
        "(line 295,col 9)-(line 295,col 27)",
        "(line 296,col 9)-(line 296,col 60)",
        "(line 297,col 9)-(line 297,col 60)",
        "(line 298,col 9)-(line 298,col 64)",
        "(line 299,col 9)-(line 299,col 64)",
        "(line 300,col 9)-(line 300,col 66)",
        "(line 301,col 9)-(line 302,col 26)",
        "(line 303,col 9)-(line 303,col 74)",
        "(line 304,col 9)-(line 304,col 77)",
        "(line 305,col 9)-(line 306,col 26)",
        "(line 307,col 9)-(line 307,col 78)",
        "(line 308,col 9)-(line 308,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 314,
      "end_line": 329,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 19)",
        "(line 316,col 9)-(line 316,col 24)",
        "(line 317,col 9)-(line 317,col 24)",
        "(line 318,col 9)-(line 318,col 24)",
        "(line 319,col 9)-(line 319,col 27)",
        "(line 320,col 9)-(line 320,col 26)",
        "(line 321,col 9)-(line 321,col 28)",
        "(line 322,col 9)-(line 322,col 29)",
        "(line 323,col 9)-(line 325,col 9)",
        "(line 326,col 9)-(line 328,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 338,
      "end_line": 355,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n     * same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 341,col 9)",
        "(line 342,col 9)-(line 344,col 9)",
        "(line 345,col 9)-(line 345,col 59)",
        "(line 346,col 9)-(line 354,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 361,
      "end_line": 372,
      "comment": "\n     * Returns hash code based on values of statistics\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 61)",
        "(line 363,col 9)-(line 363,col 66)",
        "(line 364,col 9)-(line 364,col 56)",
        "(line 365,col 9)-(line 365,col 57)",
        "(line 366,col 9)-(line 366,col 56)",
        "(line 367,col 9)-(line 367,col 54)",
        "(line 368,col 9)-(line 368,col 56)",
        "(line 369,col 9)-(line 369,col 58)",
        "(line 370,col 9)-(line 370,col 61)",
        "(line 371,col 9)-(line 371,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * @return the StorelessUnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the Sum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the Sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 21)",
        "(line 401,col 9)-(line 401,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 409,
      "end_line": 411,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 428,
      "end_line": 431,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of squares.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the sum of squares\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 21)",
        "(line 430,col 9)-(line 430,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 457,
      "end_line": 460,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the minimum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param minImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the minimum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 21)",
        "(line 459,col 9)-(line 459,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 467,
      "end_line": 469,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 486,
      "end_line": 489,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the maximum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param maxImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the maximum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 21)",
        "(line 488,col 9)-(line 488,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 496,
      "end_line": 498,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 497,col 9)-(line 497,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 515,
      "end_line": 519,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of logs.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the log sum\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 21)",
        "(line 517,col 9)-(line 517,col 37)",
        "(line 518,col 9)-(line 518,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 526,
      "end_line": 528,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 527,col 9)-(line 527,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 545,
      "end_line": 548,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the geometric mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the geometric mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 21)",
        "(line 547,col 9)-(line 547,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Returns the currently configured mean implementation\n     * @return the StorelessUnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 574,
      "end_line": 577,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param meanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the mean\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 21)",
        "(line 576,col 9)-(line 576,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 584,
      "end_line": 586,
      "comment": "\n     * Returns the currently configured variance implementation\n     * @return the StorelessUnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 603,
      "end_line": 606,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the variance.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param varianceImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the variance\n     * @throws IllegalStateException if data has already been added (i.e if n \u003e\n     *         0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 21)",
        "(line 605,col 9)-(line 605,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 611,
      "end_line": 617,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     ",
      "child_ranges": [
        "(line 612,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy()",
      "begin_line": 624,
      "end_line": 628,
      "comment": "\n     * Returns a copy of this SummaryStatistics instance with the same internal state.\n     * \n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 625,col 59)",
        "(line 626,col 9)-(line 626,col 27)",
        "(line 627,col 9)-(line 627,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math.stat.descriptive.SummaryStatistics, org.apache.commons.math.stat.descriptive.SummaryStatistics)",
      "begin_line": 638,
      "end_line": 697,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source SummaryStatistics to copy\n     * @param dest SummaryStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 45)",
        "(line 640,col 9)-(line 640,col 47)",
        "(line 641,col 9)-(line 641,col 45)",
        "(line 642,col 9)-(line 642,col 45)",
        "(line 643,col 9)-(line 643,col 55)",
        "(line 644,col 9)-(line 644,col 51)",
        "(line 645,col 9)-(line 645,col 49)",
        "(line 646,col 9)-(line 651,col 9)",
        "(line 652,col 9)-(line 652,col 66)",
        "(line 653,col 9)-(line 653,col 26)",
        "(line 657,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 671,col 9)",
        "(line 672,col 9)-(line 676,col 9)",
        "(line 677,col 9)-(line 681,col 9)",
        "(line 682,col 9)-(line 686,col 9)",
        "(line 687,col 9)-(line 691,col 9)",
        "(line 692,col 9)-(line 696,col 9)"
      ]
    }
  ]
}
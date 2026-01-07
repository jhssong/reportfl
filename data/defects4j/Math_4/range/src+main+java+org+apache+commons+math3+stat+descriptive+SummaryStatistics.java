{
  "filepath": "/tmp/Math-4b/src/main/java/org/apache/commons/math3/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 743,
      "comment": "\n * \u003cp\u003e\n * Computes summary statistics for a stream of data values added using the\n * {@link #addValue(double) addValue} method. The data values are not stored in\n * memory, so this class can be used to compute statistics for very large data\n * streams.\n * \u003c/p\u003e\n * \u003cp\u003e\n * The {@link StorelessUnivariateStatistic} instances used to maintain summary\n * state and compute statistics are configurable via setters. For example, the\n * default implementation for the variance can be overridden by calling\n * {@link #setVarianceImpl(StorelessUnivariateStatistic)}. Actual parameters to\n * these methods must implement the {@link StorelessUnivariateStatistic}\n * interface and configuration must be completed before \u003ccode\u003eaddValue\u003c/code\u003e\n * is called. No configuration is necessary to use the default, commons-math\n * provided implementations.\n * \u003c/p\u003e\n * \u003cp\u003e\n * Note: This class is not thread-safe. Use\n * {@link SynchronizedSummaryStatistics} if concurrent access from multiple\n * threads is required.\n * \u003c/p\u003e\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 64,
      "end_line": 64,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "n"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " count of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "secondMoment"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " SecondMoment is used to compute the mean and variance "
    },
    {
      "type": "field",
      "varNames": [
        "sum"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " sum of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumsq"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " sum of the square of each value that has been added "
    },
    {
      "type": "field",
      "varNames": [
        "min"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " min of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "max"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " max of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumLog"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " sumLog of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "geoMean"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " geoMean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "mean"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " mean of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "variance"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " variance of values that have been added "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumLogImpl"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Sum of log statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geoMeanImpl"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.SummaryStatistics()",
      "begin_line": 123,
      "end_line": 124,
      "comment": "\n     * Construct a SummaryStatistics instance\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.SummaryStatistics(org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * A copy constructor. Creates a deep-copy of the {@code original}.\n     *\n     * @param original the {@code SummaryStatistics} instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * @return Current values of statistics\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 143,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 150,
      "end_line": 169,
      "comment": "\n     * Add a value to the data\n     * @param value the value to add\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 33)",
        "(line 152,col 9)-(line 152,col 35)",
        "(line 153,col 9)-(line 153,col 33)",
        "(line 154,col 9)-(line 154,col 33)",
        "(line 155,col 9)-(line 155,col 36)",
        "(line 156,col 9)-(line 156,col 38)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 168,col 12)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 183,
      "end_line": 185,
      "comment": "\n     * Returns the sum of the values that have been added\n     * @return The sum or \u003ccode\u003eDouble.NaN\u003c/code\u003e if no values have been added\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 194,
      "end_line": 196,
      "comment": "\n     * Returns the sum of the squares of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return The sum of squares\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 195,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns the mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the mean\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getStandardDeviation()",
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
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns the (sample) variance of the available values.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #getPopulationVariance()} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     *\n     * \u003cp\u003eDouble.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the variance\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getPopulationVariance()",
      "begin_line": 251,
      "end_line": 255,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the values that have been added.\n     *\n     * \u003cp\u003eDouble.NaN is returned if no values have been added.\u003c/p\u003e\n     *\n     * @return the population variance\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 65)",
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 254,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Returns the maximum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the maximum\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns the minimum of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the minimum\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns the geometric mean of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the geometric mean\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSumOfLogs()",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Returns the sum of the logs of the values that have been added.\n     * \u003cp\u003e\n     * Double.NaN is returned if no values have been added.\n     * \u003c/p\u003e\n     * @return the sum of logs\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSecondMoment()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Returns a statistic related to the Second Central Moment.  Specifically,\n     * what is returned is the sum of squared deviations from the sample mean\n     * among the values that have been added.\n     * \u003cp\u003e\n     * Returns \u003ccode\u003eDouble.NaN\u003c/code\u003e if no data values have been added and\n     * returns \u003ccode\u003e0\u003c/code\u003e if there is just one value in the data set.\u003c/p\u003e\n     * \u003cp\u003e\n     * @return second central moment statistic\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.toString()",
      "begin_line": 323,
      "end_line": 340,
      "comment": "\n     * Generates a text report displaying summary statistics from values that\n     * have been added.\n     * @return String with line feeds displaying statistics\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 54)",
        "(line 326,col 9)-(line 326,col 27)",
        "(line 327,col 9)-(line 327,col 60)",
        "(line 328,col 9)-(line 328,col 60)",
        "(line 329,col 9)-(line 329,col 64)",
        "(line 330,col 9)-(line 330,col 64)",
        "(line 331,col 9)-(line 331,col 66)",
        "(line 332,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 334,col 74)",
        "(line 335,col 9)-(line 335,col 77)",
        "(line 336,col 9)-(line 337,col 26)",
        "(line 338,col 9)-(line 338,col 78)",
        "(line 339,col 9)-(line 339,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 345,
      "end_line": 360,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 19)",
        "(line 347,col 9)-(line 347,col 24)",
        "(line 348,col 9)-(line 348,col 24)",
        "(line 349,col 9)-(line 349,col 24)",
        "(line 350,col 9)-(line 350,col 27)",
        "(line 351,col 9)-(line 351,col 26)",
        "(line 352,col 9)-(line 352,col 28)",
        "(line 353,col 9)-(line 353,col 29)",
        "(line 354,col 9)-(line 356,col 9)",
        "(line 357,col 9)-(line 359,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 369,
      "end_line": 386,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a\n     * \u003ccode\u003eSummaryStatistics\u003c/code\u003e instance and all statistics have the\n     * same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 377,col 59)",
        "(line 378,col 9)-(line 385,col 84)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 392,
      "end_line": 404,
      "comment": "\n     * Returns hash code based on values of statistics\n     * @return hash code\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 61)",
        "(line 395,col 9)-(line 395,col 66)",
        "(line 396,col 9)-(line 396,col 56)",
        "(line 397,col 9)-(line 397,col 57)",
        "(line 398,col 9)-(line 398,col 56)",
        "(line 399,col 9)-(line 399,col 54)",
        "(line 400,col 9)-(line 400,col 56)",
        "(line 401,col 9)-(line 401,col 58)",
        "(line 402,col 9)-(line 402,col 61)",
        "(line 403,col 9)-(line 403,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSumImpl()",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Returns the currently configured Sum implementation\n     * @return the StorelessUnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 430,
      "end_line": 434,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the Sum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the Sum\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 21)",
        "(line 433,col 9)-(line 433,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSumsqImpl()",
      "begin_line": 441,
      "end_line": 443,
      "comment": "\n     * Returns the currently configured sum of squares implementation\n     * @return the StorelessUnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 442,col 9)-(line 442,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 459,
      "end_line": 463,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of squares.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumsqImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the sum of squares\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 21)",
        "(line 462,col 9)-(line 462,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMinImpl()",
      "begin_line": 470,
      "end_line": 472,
      "comment": "\n     * Returns the currently configured minimum implementation\n     * @return the StorelessUnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 471,col 9)-(line 471,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 488,
      "end_line": 492,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the minimum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param minImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the minimum\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 21)",
        "(line 491,col 9)-(line 491,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMaxImpl()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Returns the currently configured maximum implementation\n     * @return the StorelessUnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 517,
      "end_line": 521,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the maximum.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param maxImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the maximum\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 519,col 9)-(line 519,col 21)",
        "(line 520,col 9)-(line 520,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getSumLogImpl()",
      "begin_line": 528,
      "end_line": 530,
      "comment": "\n     * Returns the currently configured sum of logs implementation\n     * @return the StorelessUnivariateStatistic implementing the log sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 529,col 9)-(line 529,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setSumLogImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 546,
      "end_line": 551,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the sum of logs.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param sumLogImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the log sum\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 21)",
        "(line 549,col 9)-(line 549,col 37)",
        "(line 550,col 9)-(line 550,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getGeoMeanImpl()",
      "begin_line": 558,
      "end_line": 560,
      "comment": "\n     * Returns the currently configured geometric mean implementation\n     * @return the StorelessUnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 559,col 9)-(line 559,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setGeoMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 576,
      "end_line": 580,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the geometric mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param geoMeanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the geometric mean\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 21)",
        "(line 579,col 9)-(line 579,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getMeanImpl()",
      "begin_line": 587,
      "end_line": 589,
      "comment": "\n     * Returns the currently configured mean implementation\n     * @return the StorelessUnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 605,
      "end_line": 609,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the mean.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param meanImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the mean\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 607,col 21)",
        "(line 608,col 9)-(line 608,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.getVarianceImpl()",
      "begin_line": 616,
      "end_line": 618,
      "comment": "\n     * Returns the currently configured variance implementation\n     * @return the StorelessUnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 617,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.setVarianceImpl(org.apache.commons.math3.stat.descriptive.StorelessUnivariateStatistic)",
      "begin_line": 634,
      "end_line": 638,
      "comment": "\n     * \u003cp\u003e\n     * Sets the implementation for the variance.\n     * \u003c/p\u003e\n     * \u003cp\u003e\n     * This method must be activated before any data has been added - i.e.,\n     * before {@link #addValue(double) addValue} has been used to add data;\n     * otherwise an IllegalStateException will be thrown.\n     * \u003c/p\u003e\n     * @param varianceImpl the StorelessUnivariateStatistic instance to use for\n     *        computing the variance\n     * @throws MathIllegalStateException if data has already been added (i.e if n \u003e 0)\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 636,col 9)-(line 636,col 21)",
        "(line 637,col 9)-(line 637,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.checkEmpty()",
      "begin_line": 644,
      "end_line": 649,
      "comment": "\n     * Throws IllegalStateException if n \u003e 0.\n     * @throws MathIllegalStateException if data has been added\n     ",
      "child_ranges": [
        "(line 645,col 9)-(line 648,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.copy()",
      "begin_line": 656,
      "end_line": 661,
      "comment": "\n     * Returns a copy of this SummaryStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 657,col 9)-(line 657,col 59)",
        "(line 659,col 9)-(line 659,col 27)",
        "(line 660,col 9)-(line 660,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.SummaryStatistics.copy(org.apache.commons.math3.stat.descriptive.SummaryStatistics, org.apache.commons.math3.stat.descriptive.SummaryStatistics)",
      "begin_line": 671,
      "end_line": 742,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source SummaryStatistics to copy\n     * @param dest SummaryStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 39)",
        "(line 674,col 9)-(line 674,col 37)",
        "(line 675,col 9)-(line 675,col 45)",
        "(line 676,col 9)-(line 676,col 45)",
        "(line 677,col 9)-(line 677,col 45)",
        "(line 678,col 9)-(line 678,col 51)",
        "(line 679,col 9)-(line 679,col 49)",
        "(line 680,col 9)-(line 680,col 55)",
        "(line 681,col 9)-(line 681,col 26)",
        "(line 684,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 693,col 9)",
        "(line 694,col 9)-(line 698,col 9)",
        "(line 702,col 9)-(line 706,col 9)",
        "(line 707,col 9)-(line 711,col 9)",
        "(line 712,col 9)-(line 716,col 9)",
        "(line 717,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 741,col 9)"
      ]
    }
  ]
}
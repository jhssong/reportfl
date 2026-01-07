{
  "filepath": "/tmp/Math-51b/src/main/java/org/apache/commons/math/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 60,
      "end_line": 726,
      "comment": "\n * Maintains a dataset of values of a single variable and computes descriptive\n * statistics based on stored data. The {@link #getWindowSize() windowSize}\n * property sets a limit on the number of values that can be stored in the\n * dataset.  The default value, INFINITE_WINDOW, puts no limit on the size of\n * the dataset.  This value should be used with caution, as the backing store\n * will grow without bound in this case.  For very large datasets,\n * {@link SummaryStatistics}, which does not store the dataset, should be used\n * instead of this class. If \u003ccode\u003ewindowSize\u003c/code\u003e is not INFINITE_WINDOW and\n * more values are added than can be stored in the dataset, new values are\n * added in a \"rolling\" manner, with new values replacing the \"oldest\" values\n * in the dataset.\n *\n * \u003cp\u003eNote: this class is not threadsafe.  Use\n * {@link SynchronizedDescriptiveStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Represents an infinite window size.  When the {@link #getWindowSize()}\n     * returns this value, there is no limit to the number of data values\n     * that can be stored in the dataset.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "SET_QUANTILE_METHOD_NAME"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": " Name of the setQuantile method. "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     *  Stored data values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geometricMeanImpl"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "kurtosisImpl"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Kurtosis statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "percentileImpl"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " Percentile statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "skewnessImpl"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " Skewness statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics()",
      "begin_line": 116,
      "end_line": 117,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(int)",
      "begin_line": 124,
      "end_line": 126,
      "comment": "\n     * Construct a DescriptiveStatistics instance with the specified window\n     *\n     * @param window the window size.\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(double[])",
      "begin_line": 136,
      "end_line": 140,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     * and the initial data values in double[] initialDoubleArray.\n     * If initialDoubleArray is null, then this constructor corresponds to\n     * DescriptiveStatistics()\n     *\n     * @param initialDoubleArray the initial double[].\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 139,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(org.apache.commons.math.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 148,
      "end_line": 150,
      "comment": "\n     * Copy constructor.  Construct a new DescriptiveStatistics instance that\n     * is a copy of original.\n     *\n     * @param original DescriptiveStatistics instance to copy\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 149,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 160,
      "end_line": 170,
      "comment": "\n     * Adds the value to the dataset. If the dataset is at the maximum size\n     * (i.e., the number of stored elements equals the currently configured\n     * windowSize), the first (oldest) element in the dataset is discarded\n     * to make room for the new value.\n     *\n     * @param v the value to be added\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 169,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.removeMostRecentValue()",
      "begin_line": 175,
      "end_line": 177,
      "comment": "\n     * Removes the most recent value from the dataset.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.replaceMostRecentValue(double)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Replaces the most recently stored value with the given value.\n     * There must be at least one element stored to call this method.\n     *\n     * @param v the value to replace the most recent stored value\n     * @return replaced value\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 195,
      "end_line": 197,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values\n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 196,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added,\n     * or if the product of the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 214,
      "end_line": 216,
      "comment": "\n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added\n     * or 0.0 for a single value set.\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 223,
      "end_line": 233,
      "comment": "\n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added\n     * or 0.0 for a single value set.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 35)",
        "(line 225,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 232,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a\n     * measure of the asymmetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added\n     * or 0.0 for a value set \u0026lt;\u003d2.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a\n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0\n     * for a value set \u0026lt;\u003d3.\n     ",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no\n     * values have been added.\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns the maximum number of values that can be stored in the\n     * dataset, or INFINITE_WINDOW (-1) if there is no limit.\n     *\n     * @return The current window size or -1 if its Infinite.\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 323,
      "end_line": 339,
      "comment": "\n     * WindowSize controls the number of values which contribute\n     * to the reported statistics.  For example, if\n     * windowSize is set to 3 and the values {1,2,3,4,5}\n     * have been added \u003cstrong\u003e in that order\u003c/strong\u003e\n     * then the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all\n     * reported statistics will be based on these values\n     * @param windowSize sets the size of the window.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 331,col 37)",
        "(line 336,col 9)-(line 338,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Returns the current set of values in an array of double primitives.\n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     *\n     * @return returns the current set of numbers in the order in which they\n     *         were added to this set\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 362,
      "end_line": 366,
      "comment": "\n     * Returns the current set of values in an array of double primitives,\n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of\n     * numbers sorted in ascending order\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 36)",
        "(line 364,col 9)-(line 364,col 26)",
        "(line 365,col 9)-(line 365,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 396,
      "end_line": 417,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values.\n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026le; 100\u003c/code\u003e (otherwise an\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data\n     * @throws IllegalStateException if percentile implementation has been\n     *  overridden and the supplied implementation does not support setQuantile\n     * values\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 426,
      "end_line": 441,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     *\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 54)",
        "(line 429,col 9)-(line 429,col 27)",
        "(line 430,col 9)-(line 430,col 64)",
        "(line 431,col 9)-(line 431,col 60)",
        "(line 432,col 9)-(line 432,col 64)",
        "(line 433,col 9)-(line 433,col 64)",
        "(line 434,col 9)-(line 434,col 66)",
        "(line 435,col 9)-(line 436,col 26)",
        "(line 437,col 9)-(line 437,col 76)",
        "(line 438,col 9)-(line 438,col 74)",
        "(line 439,col 9)-(line 439,col 74)",
        "(line 440,col 9)-(line 440,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMeanImpl()",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n     * Returns the currently configured mean implementation.\n     *\n     * @return the UnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     *\n     * @param meanImpl the UnivariateStatistic instance to use\n     * for computing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMeanImpl()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Returns the currently configured geometric mean implementation.\n     *\n     * @return the UnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setGeometricMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 492,
      "end_line": 495,
      "comment": "\n     * \u003cp\u003eSets the implementation for the gemoetric mean.\u003c/p\u003e\n     *\n     * @param geometricMeanImpl the UnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosisImpl()",
      "begin_line": 503,
      "end_line": 505,
      "comment": "\n     * Returns the currently configured kurtosis implementation.\n     *\n     * @return the UnivariateStatistic implementing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 504,col 9)-(line 504,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setKurtosisImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 514,
      "end_line": 516,
      "comment": "\n     * \u003cp\u003eSets the implementation for the kurtosis.\u003c/p\u003e\n     *\n     * @param kurtosisImpl the UnivariateStatistic instance to use\n     * for computing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMaxImpl()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Returns the currently configured maximum implementation.\n     *\n     * @return the UnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 535,
      "end_line": 537,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     *\n     * @param maxImpl the UnivariateStatistic instance to use\n     * for computing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMinImpl()",
      "begin_line": 545,
      "end_line": 547,
      "comment": "\n     * Returns the currently configured minimum implementation.\n     *\n     * @return the UnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 546,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     *\n     * @param minImpl the UnivariateStatistic instance to use\n     * for computing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentileImpl()",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * Returns the currently configured percentile implementation.\n     *\n     * @return the UnivariateStatistic implementing the percentile\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setPercentileImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 581,
      "end_line": 599,
      "comment": "\n     * Sets the implementation to be used by {@link #getPercentile(double)}.\n     * The supplied \u003ccode\u003eUnivariateStatistic\u003c/code\u003e must provide a\n     * \u003ccode\u003esetQuantile(double)\u003c/code\u003e method; otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param percentileImpl the percentileImpl to set\n     * @throws IllegalArgumentException if the supplied implementation does not\n     *  provide a \u003ccode\u003esetQuantile\u003c/code\u003e method\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewnessImpl()",
      "begin_line": 607,
      "end_line": 609,
      "comment": "\n     * Returns the currently configured skewness implementation.\n     *\n     * @return the UnivariateStatistic implementing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSkewnessImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 618,
      "end_line": 621,
      "comment": "\n     * \u003cp\u003eSets the implementation for the skewness.\u003c/p\u003e\n     *\n     * @param skewnessImpl the UnivariateStatistic instance to use\n     * for computing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVarianceImpl()",
      "begin_line": 629,
      "end_line": 631,
      "comment": "\n     * Returns the currently configured variance implementation.\n     *\n     * @return the UnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 630,col 9)-(line 630,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 640,
      "end_line": 643,
      "comment": "\n     * \u003cp\u003eSets the implementation for the variance.\u003c/p\u003e\n     *\n     * @param varianceImpl the UnivariateStatistic instance to use\n     * for computing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsqImpl()",
      "begin_line": 651,
      "end_line": 653,
      "comment": "\n     * Returns the currently configured sum of squares implementation.\n     *\n     * @return the UnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 652,col 9)-(line 652,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 662,
      "end_line": 664,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     *\n     * @param sumsqImpl the UnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumImpl()",
      "begin_line": 672,
      "end_line": 674,
      "comment": "\n     * Returns the currently configured sum implementation.\n     *\n     * @return the UnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 673,col 9)-(line 673,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 683,
      "end_line": 685,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum.\u003c/p\u003e\n     *\n     * @param sumImpl the UnivariateStatistic instance to use\n     * for computing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy()",
      "begin_line": 692,
      "end_line": 696,
      "comment": "\n     * Returns a copy of this DescriptiveStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 693,col 67)",
        "(line 694,col 9)-(line 694,col 27)",
        "(line 695,col 9)-(line 695,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy(org.apache.commons.math.stat.descriptive.DescriptiveStatistics, org.apache.commons.math.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 706,
      "end_line": 725,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source DescriptiveStatistics to copy\n     * @param dest DescriptiveStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 708,col 9)-(line 708,col 39)",
        "(line 709,col 9)-(line 709,col 37)",
        "(line 711,col 9)-(line 711,col 37)",
        "(line 712,col 9)-(line 712,col 44)",
        "(line 715,col 9)-(line 715,col 45)",
        "(line 716,col 9)-(line 716,col 47)",
        "(line 717,col 9)-(line 717,col 45)",
        "(line 718,col 9)-(line 718,col 45)",
        "(line 719,col 9)-(line 719,col 55)",
        "(line 720,col 9)-(line 720,col 49)",
        "(line 721,col 9)-(line 721,col 65)",
        "(line 722,col 9)-(line 722,col 48)",
        "(line 723,col 9)-(line 723,col 48)",
        "(line 724,col 9)-(line 724,col 52)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-15b/src/main/java/org/apache/commons/math3/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math3.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 61,
      "end_line": 765,
      "comment": "\n * Maintains a dataset of values of a single variable and computes descriptive\n * statistics based on stored data. The {@link #getWindowSize() windowSize}\n * property sets a limit on the number of values that can be stored in the\n * dataset.  The default value, INFINITE_WINDOW, puts no limit on the size of\n * the dataset.  This value should be used with caution, as the backing store\n * will grow without bound in this case.  For very large datasets,\n * {@link SummaryStatistics}, which does not store the dataset, should be used\n * instead of this class. If \u003ccode\u003ewindowSize\u003c/code\u003e is not INFINITE_WINDOW and\n * more values are added than can be stored in the dataset, new values are\n * added in a \"rolling\" manner, with new values replacing the \"oldest\" values\n * in the dataset.\n *\n * \u003cp\u003eNote: this class is not threadsafe.  Use\n * {@link SynchronizedDescriptiveStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": "\n     * Represents an infinite window size.  When the {@link #getWindowSize()}\n     * returns this value, there is no limit to the number of data values\n     * that can be stored in the dataset.\n     "
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
      "type": "field",
      "varNames": [
        "SET_QUANTILE_METHOD_NAME"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": " Name of the setQuantile method. "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     *  Stored data values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geometricMeanImpl"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "kurtosisImpl"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " Kurtosis statistic implementation - can be reset by setter. "
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
        "minImpl"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "percentileImpl"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " Percentile statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "skewnessImpl"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " Skewness statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics()",
      "begin_line": 117,
      "end_line": 118,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(int)",
      "begin_line": 127,
      "end_line": 129,
      "comment": "\n     * Construct a DescriptiveStatistics instance with the specified window\n     *\n     * @param window the window size.\n     * @throws MathIllegalArgumentException if window size is less than 1 but\n     * not equal to {@link #INFINITE_WINDOW}\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(double[])",
      "begin_line": 139,
      "end_line": 143,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     * and the initial data values in double[] initialDoubleArray.\n     * If initialDoubleArray is null, then this constructor corresponds to\n     * DescriptiveStatistics()\n     *\n     * @param initialDoubleArray the initial double[].\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 142,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(org.apache.commons.math3.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 152,
      "end_line": 154,
      "comment": "\n     * Copy constructor.  Construct a new DescriptiveStatistics instance that\n     * is a copy of original.\n     *\n     * @param original DescriptiveStatistics instance to copy\n     * @throws NullArgumentException if original is null\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 153,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 164,
      "end_line": 174,
      "comment": "\n     * Adds the value to the dataset. If the dataset is at the maximum size\n     * (i.e., the number of stored elements equals the currently configured\n     * windowSize), the first (oldest) element in the dataset is discarded\n     * to make room for the new value.\n     *\n     * @param v the value to be added\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 173,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.removeMostRecentValue()",
      "begin_line": 181,
      "end_line": 187,
      "comment": "\n     * Removes the most recent value from the dataset.\n     *\n     * @throws MathIllegalStateException if there are no elements stored\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 186,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.replaceMostRecentValue(double)",
      "begin_line": 197,
      "end_line": 199,
      "comment": "\n     * Replaces the most recently stored value with the given value.\n     * There must be at least one element stored to call this method.\n     *\n     * @param v the value to replace the most recent stored value\n     * @return replaced value\n     * @throws MathIllegalStateException if there are no elements stored\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 206,
      "end_line": 208,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values\n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 216,
      "end_line": 218,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added,\n     * or if the product of the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 230,
      "end_line": 232,
      "comment": "\n     * Returns the (sample) variance of the available values.\n     *\n     * \u003cp\u003eThis method returns the bias-corrected sample variance (using {@code n - 1} in\n     * the denominator).  Use {@link #getPopulationVariance()} for the non-bias-corrected\n     * population variance.\u003c/p\u003e\n     *\n     * @return The variance, Double.NaN if no values have been added\n     * or 0.0 for a single value set.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getPopulationVariance()",
      "begin_line": 241,
      "end_line": 243,
      "comment": "\n     * Returns the \u003ca href\u003d\"http://en.wikibooks.org/wiki/Statistics/Summary/Variance\"\u003e\n     * population variance\u003c/a\u003e of the available values.\n     *\n     * @return The population variance, Double.NaN if no values have been added,\n     * or 0.0 for a single value set.\n     ",
      "child_ranges": [
        "(line 242,col 9)-(line 242,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 250,
      "end_line": 260,
      "comment": "\n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added\n     * or 0.0 for a single value set.\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 35)",
        "(line 252,col 9)-(line 258,col 9)",
        "(line 259,col 9)-(line 259,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a\n     * measure of the asymmetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added\n     * or 0.0 for a value set \u0026lt;\u003d2.\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 278,
      "end_line": 280,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a\n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0\n     * for a value set \u0026lt;\u003d3.\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 286,
      "end_line": 288,
      "comment": "\n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 287,col 9)-(line 287,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "\n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no\n     * values have been added.\n     ",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 337,
      "end_line": 339,
      "comment": "\n     * Returns the maximum number of values that can be stored in the\n     * dataset, or INFINITE_WINDOW (-1) if there is no limit.\n     *\n     * @return The current window size or -1 if its Infinite.\n     ",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 355,
      "end_line": 371,
      "comment": "\n     * WindowSize controls the number of values that contribute to the\n     * reported statistics.  For example, if windowSize is set to 3 and the\n     * values {1,2,3,4,5} have been added \u003cstrong\u003e in that order\u003c/strong\u003e then\n     * the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all reported statistics will\n     * be based on these values. If {@code windowSize} is decreased as a result\n     * of this call and there are more than the new value of elements in the\n     * current dataset, values from the front of the array are discarded to\n     * reduce the dataset to {@code windowSize} elements.\n     *\n     * @param windowSize sets the size of the window.\n     * @throws MathIllegalArgumentException if window size is less than 1 but\n     * not equal to {@link #INFINITE_WINDOW}\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 361,col 9)",
        "(line 363,col 9)-(line 363,col 37)",
        "(line 368,col 9)-(line 370,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Returns the current set of values in an array of double primitives.\n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     *\n     * @return returns the current set of numbers in the order in which they\n     *         were added to this set\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 394,
      "end_line": 398,
      "comment": "\n     * Returns the current set of values in an array of double primitives,\n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of\n     * numbers sorted in ascending order\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 36)",
        "(line 396,col 9)-(line 396,col 26)",
        "(line 397,col 9)-(line 397,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 405,
      "end_line": 407,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": [
        "(line 406,col 9)-(line 406,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 428,
      "end_line": 449,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values.\n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026le; 100\u003c/code\u003e (otherwise an\n     * \u003ccode\u003eMathIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     *\n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data\n     * @throws MathIllegalStateException if percentile implementation has been\n     *  overridden and the supplied implementation does not support setQuantile\n     * @throws MathIllegalArgumentException if p is not a valid quantile\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 447,col 9)",
        "(line 448,col 9)-(line 448,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 458,
      "end_line": 478,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     *\n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 460,col 9)-(line 460,col 54)",
        "(line 461,col 9)-(line 461,col 27)",
        "(line 462,col 9)-(line 462,col 64)",
        "(line 463,col 9)-(line 463,col 60)",
        "(line 464,col 9)-(line 464,col 64)",
        "(line 465,col 9)-(line 465,col 64)",
        "(line 466,col 9)-(line 466,col 66)",
        "(line 467,col 9)-(line 468,col 26)",
        "(line 469,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 475,col 74)",
        "(line 476,col 9)-(line 476,col 74)",
        "(line 477,col 9)-(line 477,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 485,
      "end_line": 488,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMeanImpl()",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Returns the currently configured mean implementation.\n     *\n     * @return the UnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setMeanImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     *\n     * @param meanImpl the UnivariateStatistic instance to use\n     * for computing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getGeometricMeanImpl()",
      "begin_line": 519,
      "end_line": 521,
      "comment": "\n     * Returns the currently configured geometric mean implementation.\n     *\n     * @return the UnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setGeometricMeanImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 530,
      "end_line": 533,
      "comment": "\n     * \u003cp\u003eSets the implementation for the gemoetric mean.\u003c/p\u003e\n     *\n     * @param geometricMeanImpl the UnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getKurtosisImpl()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Returns the currently configured kurtosis implementation.\n     *\n     * @return the UnivariateStatistic implementing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setKurtosisImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 552,
      "end_line": 554,
      "comment": "\n     * \u003cp\u003eSets the implementation for the kurtosis.\u003c/p\u003e\n     *\n     * @param kurtosisImpl the UnivariateStatistic instance to use\n     * for computing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMaxImpl()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Returns the currently configured maximum implementation.\n     *\n     * @return the UnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setMaxImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     *\n     * @param maxImpl the UnivariateStatistic instance to use\n     * for computing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getMinImpl()",
      "begin_line": 583,
      "end_line": 585,
      "comment": "\n     * Returns the currently configured minimum implementation.\n     *\n     * @return the UnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setMinImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     *\n     * @param minImpl the UnivariateStatistic instance to use\n     * for computing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getPercentileImpl()",
      "begin_line": 604,
      "end_line": 606,
      "comment": "\n     * Returns the currently configured percentile implementation.\n     *\n     * @return the UnivariateStatistic implementing the percentile\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setPercentileImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 619,
      "end_line": 637,
      "comment": "\n     * Sets the implementation to be used by {@link #getPercentile(double)}.\n     * The supplied \u003ccode\u003eUnivariateStatistic\u003c/code\u003e must provide a\n     * \u003ccode\u003esetQuantile(double)\u003c/code\u003e method; otherwise\n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     *\n     * @param percentileImpl the percentileImpl to set\n     * @throws MathIllegalArgumentException if the supplied implementation does not\n     *  provide a \u003ccode\u003esetQuantile\u003c/code\u003e method\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 621,col 9)-(line 635,col 9)",
        "(line 636,col 9)-(line 636,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSkewnessImpl()",
      "begin_line": 645,
      "end_line": 647,
      "comment": "\n     * Returns the currently configured skewness implementation.\n     *\n     * @return the UnivariateStatistic implementing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 646,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setSkewnessImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 656,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003eSets the implementation for the skewness.\u003c/p\u003e\n     *\n     * @param skewnessImpl the UnivariateStatistic instance to use\n     * for computing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getVarianceImpl()",
      "begin_line": 667,
      "end_line": 669,
      "comment": "\n     * Returns the currently configured variance implementation.\n     *\n     * @return the UnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setVarianceImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 678,
      "end_line": 681,
      "comment": "\n     * \u003cp\u003eSets the implementation for the variance.\u003c/p\u003e\n     *\n     * @param varianceImpl the UnivariateStatistic instance to use\n     * for computing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 680,col 9)-(line 680,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSumsqImpl()",
      "begin_line": 689,
      "end_line": 691,
      "comment": "\n     * Returns the currently configured sum of squares implementation.\n     *\n     * @return the UnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setSumsqImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 700,
      "end_line": 702,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     *\n     * @param sumsqImpl the UnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 701,col 9)-(line 701,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.getSumImpl()",
      "begin_line": 710,
      "end_line": 712,
      "comment": "\n     * Returns the currently configured sum implementation.\n     *\n     * @return the UnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 711,col 9)-(line 711,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.setSumImpl(org.apache.commons.math3.stat.descriptive.UnivariateStatistic)",
      "begin_line": 721,
      "end_line": 723,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum.\u003c/p\u003e\n     *\n     * @param sumImpl the UnivariateStatistic instance to use\n     * for computing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 722,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.copy()",
      "begin_line": 730,
      "end_line": 735,
      "comment": "\n     * Returns a copy of this DescriptiveStatistics instance with the same internal state.\n     *\n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 731,col 9)-(line 731,col 67)",
        "(line 733,col 9)-(line 733,col 27)",
        "(line 734,col 9)-(line 734,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math3.stat.descriptive.DescriptiveStatistics.copy(org.apache.commons.math3.stat.descriptive.DescriptiveStatistics, org.apache.commons.math3.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 745,
      "end_line": 764,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     *\n     * @param source DescriptiveStatistics to copy\n     * @param dest DescriptiveStatistics to copy to\n     * @throws NullArgumentException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 747,col 9)-(line 747,col 39)",
        "(line 748,col 9)-(line 748,col 37)",
        "(line 750,col 9)-(line 750,col 37)",
        "(line 751,col 9)-(line 751,col 44)",
        "(line 754,col 9)-(line 754,col 45)",
        "(line 755,col 9)-(line 755,col 47)",
        "(line 756,col 9)-(line 756,col 45)",
        "(line 757,col 9)-(line 757,col 45)",
        "(line 758,col 9)-(line 758,col 55)",
        "(line 759,col 9)-(line 759,col 49)",
        "(line 760,col 9)-(line 760,col 65)",
        "(line 761,col 9)-(line 761,col 48)",
        "(line 762,col 9)-(line 762,col 48)",
        "(line 763,col 9)-(line 763,col 52)"
      ]
    }
  ]
}
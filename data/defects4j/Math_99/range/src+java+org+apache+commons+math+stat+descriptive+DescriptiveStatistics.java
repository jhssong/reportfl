{
  "filepath": "/tmp/Math-99b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 55,
      "end_line": 697,
      "comment": "\n * Maintains a dataset of values of a single variable and computes descriptive\n * statistics based on stored data. The {@link #getWindowSize() windowSize}\n * property sets a limit on the number of values that can be stored in the \n * dataset.  The default value, INFINITE_WINDOW, puts no limit on the size of\n * the dataset.  This value should be used with caution, as the backing store\n * will grow without bound in this case.  For very large datasets, \n * {@link SummaryStatistics}, which does not store the dataset, should be used\n * instead of this class. If \u003ccode\u003ewindowSize\u003c/code\u003e is not INFINITE_WINDOW and\n * more values are added than can be stored in the dataset, new values are\n * added in a \"rolling\" manner, with new values replacing the \"oldest\" values \n * in the dataset.\n * \n * \u003cp\u003eNote: this class is not threadsafe.  Use \n * {@link SynchronizedDescriptiveStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 61,
      "end_line": 61,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": " \n     *  Stored data values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": " Mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "geometricMeanImpl"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": " Geometric mean statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "kurtosisImpl"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": " Kurtosis statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " Maximum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " Minimum statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "percentileImpl"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " Percentile statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "skewnessImpl"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " Skewness statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " Variance statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " Sum of squares statistic implementation - can be reset by setter. "
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " Sum statistic implementation - can be reset by setter. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics()",
      "begin_line": 101,
      "end_line": 102,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(int)",
      "begin_line": 109,
      "end_line": 111,
      "comment": "\n     * Construct a DescriptiveStatistics instance with the specified window\n     * \n     * @param window the window size.\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 110,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(org.apache.commons.math.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Copy constructor.  Construct a new DescriptiveStatistics instance that\n     * is a copy of original.\n     * \n     * @param original DescriptiveStatistics instance to copy\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Represents an infinite window size.  When the {@link #getWindowSize()}\n     * returns this value, there is no limit to the number of data values\n     * that can be stored in the dataset.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 138,
      "end_line": 148,
      "comment": "\n     * Adds the value to the dataset. If the dataset is at the maximum size\n     * (i.e., the number of stored elements equals the currently configured\n     * windowSize), the first (oldest) element in the dataset is discarded\n     * to make room for the new value.\n     * \n     * @param v the value to be added \n     ",
      "child_ranges": [
        "(line 139,col 9)-(line 147,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.removeMostRecentValue()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Removes the most recent value from the dataset.\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.replaceMostRecentValue(double)",
      "begin_line": 164,
      "end_line": 166,
      "comment": "\n     * Replaces the most recently stored value with the given value.\n     * There must be at least one element stored to call this method.\n     * \n     * @param v the value to replace the most recent stored value\n     * @return replaced value\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 173,
      "end_line": 175,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 174,col 9)-(line 174,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 183,
      "end_line": 185,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the product of the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 184,col 9)-(line 184,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 192,
      "end_line": 194,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 201,
      "end_line": 211,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 35)",
        "(line 203,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 210,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 219,
      "end_line": 221,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a \n     * measure of the asymmetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added \n     * or 0.0 for a value set \u0026lt;\u003d2. \n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 229,
      "end_line": 231,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a \n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0 \n     * for a value set \u0026lt;\u003d3. \n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 237,
      "end_line": 239,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 245,
      "end_line": 247,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 253,
      "end_line": 255,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 261,
      "end_line": 263,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 270,
      "end_line": 272,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 277,
      "end_line": 279,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 288,
      "end_line": 290,
      "comment": "\n     * Returns the maximum number of values that can be stored in the\n     * dataset, or INFINITE_WINDOW (-1) if there is no limit.\n     * \n     * @return The current window size or -1 if its Infinite.\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 289,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 301,
      "end_line": 316,
      "comment": "\n     * WindowSize controls the number of values which contribute \n     * to the reported statistics.  For example, if \n     * windowSize is set to 3 and the values {1,2,3,4,5} \n     * have been added \u003cstrong\u003e in that order\u003c/strong\u003e \n     * then the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all\n     * reported statistics will be based on these values\n     * @param windowSize sets the size of the window.\n     ",
      "child_ranges": [
        "(line 302,col 9)-(line 306,col 9)",
        "(line 308,col 9)-(line 308,col 37)",
        "(line 313,col 9)-(line 315,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Returns the current set of values in an array of double primitives.  \n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * \n     * @return returns the current set of numbers in the order in which they \n     *         were added to this set\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 339,
      "end_line": 343,
      "comment": "\n     * Returns the current set of values in an array of double primitives,  \n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of \n     * numbers sorted in ascending order        \n     ",
      "child_ranges": [
        "(line 340,col 9)-(line 340,col 36)",
        "(line 341,col 9)-(line 341,col 26)",
        "(line 342,col 9)-(line 342,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 350,
      "end_line": 352,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 373,
      "end_line": 393,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values. \n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003c/p\u003e\u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026le; 100\u003c/code\u003e (otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\u003c/p\u003e\n     * \n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data \n     * @throws IllegalStateException if percentile implementation has been\n     *  overridden and the supplied implementation does not support setQuantile\n     * values\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 391,col 9)",
        "(line 392,col 9)-(line 392,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 402,
      "end_line": 416,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 52)",
        "(line 404,col 9)-(line 404,col 27)",
        "(line 405,col 9)-(line 405,col 64)",
        "(line 406,col 9)-(line 406,col 60)",
        "(line 407,col 9)-(line 407,col 64)",
        "(line 408,col 9)-(line 408,col 64)",
        "(line 409,col 9)-(line 409,col 66)",
        "(line 410,col 9)-(line 411,col 26)",
        "(line 412,col 9)-(line 412,col 76)",
        "(line 413,col 9)-(line 413,col 74)",
        "(line 414,col 9)-(line 414,col 74)",
        "(line 415,col 9)-(line 415,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 423,
      "end_line": 425,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 424,col 9)-(line 424,col 89)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMeanImpl()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * Returns the currently configured mean implementation.\n     * \n     * @return the UnivariateStatistic implementing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 446,
      "end_line": 448,
      "comment": "\n     * \u003cp\u003eSets the implementation for the mean.\u003c/p\u003e\n     * \n     * @param meanImpl the UnivariateStatistic instance to use\n     * for computing the mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 447,col 9)-(line 447,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMeanImpl()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Returns the currently configured geometric mean implementation.\n     * \n     * @return the UnivariateStatistic implementing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setGeometricMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 467,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003eSets the implementation for the gemoetric mean.\u003c/p\u003e\n     * \n     * @param geometricMeanImpl the UnivariateStatistic instance to use\n     * for computing the geometric mean\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosisImpl()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Returns the currently configured kurtosis implementation.\n     * \n     * @return the UnivariateStatistic implementing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setKurtosisImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n     * \u003cp\u003eSets the implementation for the kurtosis.\u003c/p\u003e\n     * \n     * @param kurtosisImpl the UnivariateStatistic instance to use\n     * for computing the kurtosis\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMaxImpl()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Returns the currently configured maximum implementation.\n     * \n     * @return the UnivariateStatistic implementing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * \u003cp\u003eSets the implementation for the maximum.\u003c/p\u003e\n     * \n     * @param maxImpl the UnivariateStatistic instance to use\n     * for computing the maximum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMinImpl()",
      "begin_line": 520,
      "end_line": 522,
      "comment": "\n     * Returns the currently configured minimum implementation.\n     * \n     * @return the UnivariateStatistic implementing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 521,col 9)-(line 521,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * \u003cp\u003eSets the implementation for the minimum.\u003c/p\u003e\n     * \n     * @param minImpl the UnivariateStatistic instance to use\n     * for computing the minimum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentileImpl()",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Returns the currently configured percentile implementation.\n     * \n     * @return the UnivariateStatistic implementing the percentile\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setPercentileImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 556,
      "end_line": 573,
      "comment": "\n     * Sets the implementation to be used by {@link #getPercentile(double)}.\n     * The supplied \u003ccode\u003eUnivariateStatistic\u003c/code\u003e must provide a\n     * \u003ccode\u003esetQuantile(double)\u003c/code\u003e method; otherwise \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param percentileImpl the percentileImpl to set\n     * @throws IllegalArgumentException if the supplied implementation does not\n     *  provide a \u003ccode\u003esetQuantile\u003c/code\u003e method\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 558,col 9)-(line 571,col 9)",
        "(line 572,col 9)-(line 572,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewnessImpl()",
      "begin_line": 581,
      "end_line": 583,
      "comment": "\n     * Returns the currently configured skewness implementation.\n     * \n     * @return the UnivariateStatistic implementing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSkewnessImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 592,
      "end_line": 595,
      "comment": "\n     * \u003cp\u003eSets the implementation for the skewness.\u003c/p\u003e\n     * \n     * @param skewnessImpl the UnivariateStatistic instance to use\n     * for computing the skewness\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVarianceImpl()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Returns the currently configured variance implementation.\n     * \n     * @return the UnivariateStatistic implementing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 614,
      "end_line": 617,
      "comment": "\n     * \u003cp\u003eSets the implementation for the variance.\u003c/p\u003e\n     * \n     * @param varianceImpl the UnivariateStatistic instance to use\n     * for computing the variance\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 616,col 9)-(line 616,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsqImpl()",
      "begin_line": 625,
      "end_line": 627,
      "comment": "\n     * Returns the currently configured sum of squares implementation.\n     * \n     * @return the UnivariateStatistic implementing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum of squares.\u003c/p\u003e\n     * \n     * @param sumsqImpl the UnivariateStatistic instance to use\n     * for computing the sum of squares\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumImpl()",
      "begin_line": 646,
      "end_line": 648,
      "comment": "\n     * Returns the currently configured sum implementation.\n     * \n     * @return the UnivariateStatistic implementing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 647,col 9)-(line 647,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 657,
      "end_line": 659,
      "comment": "\n     * \u003cp\u003eSets the implementation for the sum.\u003c/p\u003e\n     * \n     * @param sumImpl the UnivariateStatistic instance to use\n     * for computing the sum\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 658,col 9)-(line 658,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy()",
      "begin_line": 666,
      "end_line": 670,
      "comment": "\n     * Returns a copy of this DescriptiveStatistics instance with the same internal state.\n     * \n     * @return a copy of this\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 667,col 67)",
        "(line 668,col 9)-(line 668,col 27)",
        "(line 669,col 9)-(line 669,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.copy(org.apache.commons.math.stat.descriptive.DescriptiveStatistics, org.apache.commons.math.stat.descriptive.DescriptiveStatistics)",
      "begin_line": 680,
      "end_line": 696,
      "comment": "\n     * Copies source to dest.\n     * \u003cp\u003eNeither source nor dest can be null.\u003c/p\u003e\n     * \n     * @param source DescriptiveStatistics to copy\n     * @param dest DescriptiveStatistics to copy to\n     * @throws NullPointerException if either source or dest is null\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 37)",
        "(line 683,col 9)-(line 683,col 44)",
        "(line 686,col 9)-(line 686,col 45)",
        "(line 687,col 9)-(line 687,col 47)",
        "(line 688,col 9)-(line 688,col 45)",
        "(line 689,col 9)-(line 689,col 45)",
        "(line 690,col 9)-(line 690,col 55)",
        "(line 691,col 9)-(line 691,col 49)",
        "(line 692,col 9)-(line 692,col 65)",
        "(line 693,col 9)-(line 693,col 48)",
        "(line 694,col 9)-(line 694,col 48)",
        "(line 695,col 9)-(line 695,col 52)"
      ]
    }
  ]
}
{
  "filepath": "/tmp/Math-102b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 56,
      "end_line": 583,
      "comment": "\n * Maintains a dataset of values of a single variable and computes descriptive\n * statistics based on stored data. The {@link #getWindowSize() windowSize}\n * property sets a limit on the number of values that can be stored in the \n * dataset.  The default value, INFINITE_WINDOW, puts no limit on the size of\n * the dataset.  This value should be used with caution, as the backing store\n * will grow without bound in this case.  For very large datasets, \n * {@link SummaryStatistics}, which does not store the dataset, should be used\n * instead of this class. If \u003ccode\u003ewindowSize\u003c/code\u003e is not INFINITE_WINDOW and\n * more values are added than can be stored in the dataset, new values are\n * added in a \"rolling\" manner, with new values replacing the \"oldest\" values \n * in the dataset.\n * \n * \u003cp\u003eNote: this class is not threadsafe.  Use \n * {@link SynchronizedDescriptiveStatistics} if concurrent access from multiple\n * threads is required.\u003c/p\u003e\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " Serialization UID "
    },
    {
      "type": "field",
      "varNames": [
        "windowSize"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": " hold the window size *"
    },
    {
      "type": "field",
      "varNames": [
        "eDA"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": " \n     *  Stored data values\n     "
    },
    {
      "type": "field",
      "varNames": [
        "meanImpl"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": " UnivariateStatistic stats implementations - can be reset by setters"
    },
    {
      "type": "field",
      "varNames": [
        "geometricMeanImpl"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "kurtosisImpl"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "maxImpl"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "minImpl"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "percentileImpl"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "skewnessImpl"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "varianceImpl"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sumsqImpl"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sumImpl"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics()",
      "begin_line": 84,
      "end_line": 85,
      "comment": "\n     * Construct a DescriptiveStatistics instance with an infinite window\n     ",
      "child_ranges": []
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.DescriptiveStatistics(int)",
      "begin_line": 92,
      "end_line": 95,
      "comment": "\n     * Construct a DescriptiveStatistics instance with the specified window\n     * \n     * @param window the window size.\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 16)",
        "(line 94,col 9)-(line 94,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance(java.lang.Class)",
      "begin_line": 108,
      "end_line": 110,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @param cls the type of \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new instance. \n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     * @deprecated to be removed in commons-math 2.0\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance()",
      "begin_line": 117,
      "end_line": 128,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @return a new DescriptiveStatistics instance. \n     * @deprecated to be removed in commons-math 2.0\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 118,col 45)",
        "(line 119,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 127,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": "\n     * Represents an infinite window size.  When the {@link #getWindowSize()}\n     * returns this value, there is no limit to the number of data values\n     * that can be stored in the dataset.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 145,
      "end_line": 155,
      "comment": "\n     * Adds the value to the dataset. If the dataset is at the maximum size\n     * (i.e., the number of stored elements equals the currently configured\n     * windowSize), the first (oldest) element in the dataset is discarded\n     * to make room for the new value.\n     * \n     * @param v the value to be added \n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 154,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 162,
      "end_line": 164,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 163,col 9)-(line 163,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 172,
      "end_line": 174,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the productof the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 173,col 9)-(line 173,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 181,
      "end_line": 183,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 190,
      "end_line": 200,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 35)",
        "(line 192,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 208,
      "end_line": 210,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a \n     * measure of the asymmetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added \n     * or 0.0 for a value set \u0026lt;\u003d2. \n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 218,
      "end_line": 220,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a \n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0 \n     * for a value set \u0026lt;\u003d3. \n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 226,
      "end_line": 228,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 234,
      "end_line": 236,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 242,
      "end_line": 244,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": [
        "(line 243,col 9)-(line 243,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 250,
      "end_line": 252,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 251,col 9)-(line 251,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 266,
      "end_line": 268,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 277,
      "end_line": 279,
      "comment": "\n     * Returns the maximum number of values that can be stored in the\n     * dataset, or INFINITE_WINDOW (-1) if there is no limit.\n     * \n     * @return The current window size or -1 if its Infinite.\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 290,
      "end_line": 305,
      "comment": "\n     * WindowSize controls the number of values which contribute \n     * to the reported statistics.  For example, if \n     * windowSize is set to 3 and the values {1,2,3,4,5} \n     * have been added \u003cstrong\u003e in that order\u003c/strong\u003e \n     * then the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all\n     * reported statistics will be based on these values\n     * @param windowSize sets the size of the window.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 295,col 9)",
        "(line 297,col 9)-(line 297,col 37)",
        "(line 302,col 9)-(line 304,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 316,
      "end_line": 321,
      "comment": "\n     * Returns the current set of values in an array of double primitives.  \n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * \n     * @return returns the current set of numbers in the order in which they \n     *         were added to this set\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 64)",
        "(line 318,col 9)-(line 319,col 37)",
        "(line 320,col 9)-(line 320,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 331,
      "end_line": 335,
      "comment": "\n     * Returns the current set of values in an array of double primitives,  \n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of \n     * numbers sorted in ascending order        \n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 36)",
        "(line 333,col 9)-(line 333,col 26)",
        "(line 334,col 9)-(line 334,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 365,
      "end_line": 385,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values. \n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026lt; 100\u003c/code\u003e (otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data \n     * @throws IllegalStateException if percentile implementation has been\n     *  overridden and the supplied implementation does not support setQuantile\n     * values\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 383,col 9)",
        "(line 384,col 9)-(line 384,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 394,
      "end_line": 406,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 52)",
        "(line 396,col 9)-(line 396,col 53)",
        "(line 397,col 9)-(line 397,col 48)",
        "(line 398,col 9)-(line 398,col 52)",
        "(line 399,col 9)-(line 399,col 52)",
        "(line 400,col 9)-(line 400,col 54)",
        "(line 401,col 9)-(line 401,col 70)",
        "(line 402,col 9)-(line 402,col 64)",
        "(line 403,col 9)-(line 403,col 62)",
        "(line 404,col 9)-(line 404,col 62)",
        "(line 405,col 9)-(line 405,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 413,
      "end_line": 415,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 81)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMeanImpl()",
      "begin_line": 422,
      "end_line": 424,
      "comment": "\n     * @return the meanImpl\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * @param meanImpl the meanImpl to set\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMeanImpl()",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * @return the geometricMeanImpl\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setGeometricMeanImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 443,
      "end_line": 446,
      "comment": "\n     * @param geometricMeanImpl the geometricMeanImpl to set\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosisImpl()",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * @return the kurtosisImpl\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setKurtosisImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 458,
      "end_line": 460,
      "comment": "\n     * @param kurtosisImpl the kurtosisImpl to set\n     ",
      "child_ranges": [
        "(line 459,col 9)-(line 459,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMaxImpl()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * @return the maxImpl\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMaxImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * @param maxImpl the maxImpl to set\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMinImpl()",
      "begin_line": 479,
      "end_line": 481,
      "comment": "\n     * @return the minImpl\n     ",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setMinImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 486,
      "end_line": 488,
      "comment": "\n     * @param minImpl the minImpl to set\n     ",
      "child_ranges": [
        "(line 487,col 9)-(line 487,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentileImpl()",
      "begin_line": 493,
      "end_line": 495,
      "comment": "\n     * @return the percentileImpl\n     ",
      "child_ranges": [
        "(line 494,col 9)-(line 494,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setPercentileImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 507,
      "end_line": 524,
      "comment": "\n     * Sets the implementation to be used by {@link #getPercentile(double)}.\n     * The supplied \u003ccode\u003eUnivariateStatistic\u003c/code\u003e must provide a\n     * \u003ccode\u003esetQuantile(double)\u003c/code\u003e method; otherwise \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown.\n     * \n     * @param percentileImpl the percentileImpl to set\n     * @throws IllegalArgumentException if the supplied implementation does not\n     *  provide a \u003ccode\u003esetQuantile\u003c/code\u003e method\n     ",
      "child_ranges": [
        "(line 509,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 523,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewnessImpl()",
      "begin_line": 529,
      "end_line": 531,
      "comment": "\n     * @return the skewnessImpl\n     ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSkewnessImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 536,
      "end_line": 539,
      "comment": "\n     * @param skewnessImpl the skewnessImpl to set\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVarianceImpl()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * @return the varianceImpl\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setVarianceImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 551,
      "end_line": 554,
      "comment": "\n     * @param varianceImpl the varianceImpl to set\n     ",
      "child_ranges": [
        "(line 553,col 9)-(line 553,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsqImpl()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * @return the sumsqImpl\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumsqImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 566,
      "end_line": 568,
      "comment": "\n     * @param sumsqImpl the sumsqImpl to set\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 567,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumImpl()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * @return the sumImpl\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setSumImpl(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 580,
      "end_line": 582,
      "comment": "\n     * @param sumImpl the sumImpl to set\n     ",
      "child_ranges": [
        "(line 581,col 9)-(line 581,col 31)"
      ]
    }
  ]
}
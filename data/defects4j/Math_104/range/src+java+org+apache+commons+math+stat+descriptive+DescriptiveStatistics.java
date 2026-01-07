{
  "filepath": "/tmp/Math-104b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 40,
      "end_line": 299,
      "comment": "\n * Abstract factory class for univariate statistical summaries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance(java.lang.Class)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @param cls the type of \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new factory. \n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance()",
      "begin_line": 63,
      "end_line": 74,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 45)",
        "(line 65,col 9)-(line 72,col 9)",
        "(line 73,col 9)-(line 73,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * This constant signals that a Univariate implementation\n     * takes into account the contributions of an infinite number of\n     * elements.  In other words, if getWindow returns this\n     * constant, there is, in effect, no \"window\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Adds the value to the set of numbers\n     * @param v the value to be added \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 95,
      "end_line": 97,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 105,
      "end_line": 107,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the productof the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 106,col 9)-(line 106,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 114,
      "end_line": 116,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 123,
      "end_line": 133,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 35)",
        "(line 125,col 9)-(line 131,col 9)",
        "(line 132,col 9)-(line 132,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 141,
      "end_line": 143,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a \n     * measure of the assymetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added \n     * or 0.0 for a value set \u0026lt;\u003d2. \n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a \n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0 \n     * for a value set \u0026lt;\u003d3. \n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 159,
      "end_line": 161,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 167,
      "end_line": 169,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 168,col 9)-(line 168,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 175,
      "end_line": 175,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 181,
      "end_line": 183,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 197,
      "end_line": 197,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 205,
      "end_line": 205,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 216,
      "end_line": 216,
      "comment": "\n     * WindowSize controls the number of values which contribute \n     * to the values returned by Univariate.  For example, if \n     * windowSize is set to 3 and the values {1,2,3,4,5} \n     * have been added \u003cstrong\u003e in that order\u003c/strong\u003e \n     * then the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all\n     * reported statistics will be based on these values\n     * @param windowSize sets the size of the window.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 227,
      "end_line": 227,
      "comment": "\n     * Returns the current set of values in an array of double primitives.  \n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * \n     * @return returns the current set of numbers in the order in which they \n     *         were added to this set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 237,
      "end_line": 241,
      "comment": "\n     * Returns the current set of values in an array of double primitives,  \n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of \n     * numbers sorted in ascending order        \n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 36)",
        "(line 239,col 9)-(line 239,col 26)",
        "(line 240,col 9)-(line 240,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 248,
      "end_line": 248,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 267,
      "end_line": 269,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values. \n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026lt; 100\u003c/code\u003e (otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data \n     * values\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 278,
      "end_line": 290,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 279,col 9)-(line 279,col 52)",
        "(line 280,col 9)-(line 280,col 53)",
        "(line 281,col 9)-(line 281,col 48)",
        "(line 282,col 9)-(line 282,col 52)",
        "(line 283,col 9)-(line 283,col 52)",
        "(line 284,col 9)-(line 284,col 54)",
        "(line 285,col 9)-(line 285,col 70)",
        "(line 286,col 9)-(line 286,col 64)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 288,col 62)",
        "(line 289,col 9)-(line 289,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 297,
      "end_line": 297,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": []
    }
  ]
}
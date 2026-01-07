{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/DescriptiveStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DescriptiveStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 39,
      "end_line": 298,
      "comment": "\n * Abstract factory class for univariate statistical summaries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance(java.lang.Class)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @param cls the type of \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new factory. \n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 56)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.newInstance()",
      "begin_line": 62,
      "end_line": 73,
      "comment": "\n     * Create an instance of a \u003ccode\u003eDescriptiveStatistics\u003c/code\u003e\n     * @return a new factory. \n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 45)",
        "(line 64,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 23)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "INFINITE_WINDOW"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * This constant signals that a Univariate implementation\n     * takes into account the contributions of an infinite number of\n     * elements.  In other words, if getWindow returns this\n     * constant, there is, in effect, no \"window\".\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.addValue(double)",
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Adds the value to the set of numbers\n     * @param v the value to be added \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMean()",
      "begin_line": 94,
      "end_line": 96,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 95,col 9)-(line 95,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getGeometricMean()",
      "begin_line": 104,
      "end_line": 106,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the productof the available values is less than or equal to 0.\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getVariance()",
      "begin_line": 113,
      "end_line": 115,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getStandardDeviation()",
      "begin_line": 122,
      "end_line": 132,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 35)",
        "(line 124,col 9)-(line 130,col 9)",
        "(line 131,col 9)-(line 131,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSkewness()",
      "begin_line": 140,
      "end_line": 142,
      "comment": "\n     * Returns the skewness of the available values. Skewness is a \n     * measure of the assymetry of a given distribution.\n     * @return The skewness, Double.NaN if no values have been added \n     * or 0.0 for a value set \u0026lt;\u003d2. \n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 141,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getKurtosis()",
      "begin_line": 150,
      "end_line": 152,
      "comment": "\n     * Returns the Kurtosis of the available values. Kurtosis is a \n     * measure of the \"peakedness\" of a distribution\n     * @return The kurtosis, Double.NaN if no values have been added, or 0.0 \n     * for a value set \u0026lt;\u003d3. \n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 151,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMax()",
      "begin_line": 158,
      "end_line": 160,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getMin()",
      "begin_line": 166,
      "end_line": 168,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getN()",
      "begin_line": 174,
      "end_line": 174,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSum()",
      "begin_line": 180,
      "end_line": 182,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSumsq()",
      "begin_line": 189,
      "end_line": 191,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 190,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.clear()",
      "begin_line": 196,
      "end_line": 196,
      "comment": " \n     * Resets all statistics and storage\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getWindowSize()",
      "begin_line": 204,
      "end_line": 204,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.setWindowSize(int)",
      "begin_line": 215,
      "end_line": 215,
      "comment": "\n     * WindowSize controls the number of values which contribute \n     * to the values returned by Univariate.  For example, if \n     * windowSize is set to 3 and the values {1,2,3,4,5} \n     * have been added \u003cstrong\u003e in that order\u003c/strong\u003e \n     * then the \u003ci\u003eavailable values\u003c/i\u003e are {3,4,5} and all\n     * reported statistics will be based on these values\n     * @param windowSize sets the size of the window.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getValues()",
      "begin_line": 226,
      "end_line": 226,
      "comment": "\n     * Returns the current set of values in an array of double primitives.  \n     * The order of addition is preserved.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * \n     * @return returns the current set of numbers in the order in which they \n     *         were added to this set\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getSortedValues()",
      "begin_line": 236,
      "end_line": 240,
      "comment": "\n     * Returns the current set of values in an array of double primitives,  \n     * sorted in ascending order.  The returned array is a fresh\n     * copy of the underlying data -- i.e., it is not a reference to the\n     * stored data.\n     * @return returns the current set of \n     * numbers sorted in ascending order        \n     ",
      "child_ranges": [
        "(line 237,col 9)-(line 237,col 36)",
        "(line 238,col 9)-(line 238,col 26)",
        "(line 239,col 9)-(line 239,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getElement(int)",
      "begin_line": 247,
      "end_line": 247,
      "comment": "\n     * Returns the element at the specified index\n     * @param index The Index of the element\n     * @return return the element at the specified index\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.getPercentile(double)",
      "begin_line": 266,
      "end_line": 268,
      "comment": "\n     * Returns an estimate for the pth percentile of the stored values. \n     * \u003cp\u003e\n     * The implementation provided here follows the first estimation procedure presented\n     * \u003ca href\u003d\"http://www.itl.nist.gov/div898/handbook/prc/section2/prc252.htm\"\u003ehere.\u003c/a\u003e\n     * \u003cp\u003e\n     * \u003cstrong\u003ePreconditions\u003c/strong\u003e:\u003cul\u003e\n     * \u003cli\u003e\u003ccode\u003e0 \u0026lt; p \u0026lt; 100\u003c/code\u003e (otherwise an \n     * \u003ccode\u003eIllegalArgumentException\u003c/code\u003e is thrown)\u003c/li\u003e\n     * \u003cli\u003eat least one value must be stored (returns \u003ccode\u003eDouble.NaN\n     *     \u003c/code\u003e otherwise)\u003c/li\u003e\n     * \u003c/ul\u003e\n     * \n     * @param p the requested percentile (scaled from 0 - 100)\n     * @return An estimate for the pth percentile of the stored data \n     * values\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.toString()",
      "begin_line": 277,
      "end_line": 289,
      "comment": "\n     * Generates a text report displaying univariate statistics from values\n     * that have been added.  Each statistic is displayed on a separate\n     * line.\n     * \n     * @return String with line feeds displaying statistics\n     ",
      "child_ranges": [
        "(line 278,col 9)-(line 278,col 52)",
        "(line 279,col 9)-(line 279,col 53)",
        "(line 280,col 9)-(line 280,col 48)",
        "(line 281,col 9)-(line 281,col 52)",
        "(line 282,col 9)-(line 282,col 52)",
        "(line 283,col 9)-(line 283,col 54)",
        "(line 284,col 9)-(line 284,col 70)",
        "(line 285,col 9)-(line 285,col 64)",
        "(line 286,col 9)-(line 286,col 62)",
        "(line 287,col 9)-(line 287,col 62)",
        "(line 288,col 9)-(line 288,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.DescriptiveStatistics.apply(org.apache.commons.math.stat.descriptive.UnivariateStatistic)",
      "begin_line": 296,
      "end_line": 296,
      "comment": "\n     * Apply the given statistic to the data associated with this set of statistics.\n     * @param stat the statistic to apply\n     * @return the computed value of the statistic.\n     ",
      "child_ranges": []
    }
  ]
}
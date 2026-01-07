{
  "filepath": "/tmp/Math-105b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 28,
      "end_line": 193,
      "comment": "\n * Abstract factory class for univariate statistical summaries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance(java.lang.Class)",
      "begin_line": 44,
      "end_line": 47,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @param cls the type of \u003ccode\u003eSummaryStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new factory. \n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     ",
      "child_ranges": [
        "(line 46,col 9)-(line 46,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance()",
      "begin_line": 54,
      "end_line": 65,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @return a new SummaryStatistics instance. \n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 42)",
        "(line 56,col 9)-(line 63,col 9)",
        "(line 64,col 9)-(line 64,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 74,
      "end_line": 77,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * \n     * @return Current values of statistics \n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 76,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Adds the value to the data to be summarized\n     * @param v the value to be added \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 90,
      "end_line": 90,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 98,
      "end_line": 98,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the productof the available values is less than or equal to 0.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 105,
      "end_line": 105,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 112,
      "end_line": 112,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 118,
      "end_line": 118,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 124,
      "end_line": 124,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 130,
      "end_line": 130,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 143,
      "end_line": 143,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 148,
      "end_line": 148,
      "comment": " \n     * Resets all statistics\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 156,
      "end_line": 173,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 159,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 163,col 60)",
        "(line 164,col 9)-(line 172,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 180,
      "end_line": 191,
      "comment": "\n     * Returns hash code based on values of statistics\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 61)",
        "(line 182,col 9)-(line 182,col 66)",
        "(line 183,col 9)-(line 183,col 56)",
        "(line 184,col 9)-(line 184,col 57)",
        "(line 185,col 9)-(line 185,col 56)",
        "(line 186,col 9)-(line 186,col 54)",
        "(line 187,col 9)-(line 187,col 56)",
        "(line 188,col 9)-(line 188,col 58)",
        "(line 189,col 9)-(line 189,col 61)",
        "(line 190,col 9)-(line 190,col 22)"
      ]
    }
  ]
}
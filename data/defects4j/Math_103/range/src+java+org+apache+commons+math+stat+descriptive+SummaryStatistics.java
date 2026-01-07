{
  "filepath": "/tmp/Math-103b/src/java/org/apache/commons/math/stat/descriptive/SummaryStatistics.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SummaryStatistics",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.math.stat.descriptive.StatisticalSummary",
        "java.io.Serializable"
      ],
      "begin_line": 29,
      "end_line": 194,
      "comment": "\n * Abstract factory class for univariate statistical summaries.\n *\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization UID "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance(java.lang.Class)",
      "begin_line": 45,
      "end_line": 48,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @param cls the type of \u003ccode\u003eSummaryStatistics\u003c/code\u003e object to\n     *        create. \n     * @return a new factory. \n     * @throws InstantiationException is thrown if the object can not be\n     *            created.\n     * @throws IllegalAccessException is thrown if the type\u0027s default\n     *            constructor is not accessible.\n     ",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.newInstance()",
      "begin_line": 55,
      "end_line": 66,
      "comment": "\n     * Create an instance of a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * \n     * @return a new SummaryStatistics instance. \n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 42)",
        "(line 57,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSummary()",
      "begin_line": 75,
      "end_line": 78,
      "comment": "\n     * Return a {@link StatisticalSummaryValues} instance reporting current\n     * statistics.\n     * \n     * @return Current values of statistics \n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 77,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.addValue(double)",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Adds the value to the data to be summarized\n     * @param v the value to be added \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMean()",
      "begin_line": 91,
      "end_line": 91,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getGeometricMean()",
      "begin_line": 99,
      "end_line": 99,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/geometric_mean.htm\"\u003e\n     * geometric mean \u003c/a\u003e of the available values\n     * @return The geometricMean, Double.NaN if no values have been added, \n     * or if the productof the available values is less than or equal to 0.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getVariance()",
      "begin_line": 106,
      "end_line": 106,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getStandardDeviation()",
      "begin_line": 113,
      "end_line": 113,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMax()",
      "begin_line": 119,
      "end_line": 119,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getMin()",
      "begin_line": 125,
      "end_line": 125,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getN()",
      "begin_line": 131,
      "end_line": 131,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSum()",
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.getSumsq()",
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Returns the sum of the squares of the available values.\n     * @return The sum of the squares or Double.NaN if no \n     * values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.clear()",
      "begin_line": 149,
      "end_line": 149,
      "comment": " \n     * Resets all statistics\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.equals(java.lang.Object)",
      "begin_line": 157,
      "end_line": 174,
      "comment": "\n     * Returns true iff \u003ccode\u003eobject\u003c/code\u003e is a \u003ccode\u003eSummaryStatistics\u003c/code\u003e\n     * instance and all statistics have the same values as this.\n     * @param object the object to test equality against.\n     * @return true if object equals this\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 60)",
        "(line 165,col 9)-(line 173,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.SummaryStatistics.hashCode()",
      "begin_line": 181,
      "end_line": 192,
      "comment": "\n     * Returns hash code based on values of statistics\n     * \n     * @return hash code\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 61)",
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 184,col 56)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 56)",
        "(line 187,col 9)-(line 187,col 54)",
        "(line 188,col 9)-(line 188,col 56)",
        "(line 189,col 9)-(line 189,col 58)",
        "(line 190,col 9)-(line 190,col 61)",
        "(line 191,col 9)-(line 191,col 22)"
      ]
    }
  ]
}
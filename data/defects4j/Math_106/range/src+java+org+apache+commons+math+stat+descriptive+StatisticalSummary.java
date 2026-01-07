{
  "filepath": "/tmp/Math-106b/src/java/org/apache/commons/math/stat/descriptive/StatisticalSummary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalSummary",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 23,
      "end_line": 62,
      "comment": "\n *  Reporting interface for basic univariate statistics.\n *\n  * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getMean()",
      "begin_line": 29,
      "end_line": 29,
      "comment": " \n     * Returns the \u003ca href\u003d\"http://www.xycoon.com/arithmetic_mean.htm\"\u003e\n     * arithmetic mean \u003c/a\u003e of the available values \n     * @return The mean or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getVariance()",
      "begin_line": 35,
      "end_line": 35,
      "comment": " \n     * Returns the variance of the available values.\n     * @return The variance, Double.NaN if no values have been added \n     * or 0.0 for a single value set.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getStandardDeviation()",
      "begin_line": 41,
      "end_line": 41,
      "comment": " \n     * Returns the standard deviation of the available values.\n     * @return The standard deviation, Double.NaN if no values have been added \n     * or 0.0 for a single value set. \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getMax()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " \n     * Returns the maximum of the available values\n     * @return The max or Double.NaN if no values have been added.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getMin()",
      "begin_line": 51,
      "end_line": 51,
      "comment": " \n    * Returns the minimum of the available values\n    * @return The min or Double.NaN if no values have been added.\n    ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getN()",
      "begin_line": 56,
      "end_line": 56,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalSummary.getSum()",
      "begin_line": 61,
      "end_line": 61,
      "comment": "\n     * Returns the sum of the values that have been added to Univariate.\n     * @return The sum or Double.NaN if no values have been added\n     ",
      "child_ranges": []
    }
  ]
}
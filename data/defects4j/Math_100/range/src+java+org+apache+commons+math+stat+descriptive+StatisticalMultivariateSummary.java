{
  "filepath": "/tmp/Math-100b/src/java/org/apache/commons/math/stat/descriptive/StatisticalMultivariateSummary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalMultivariateSummary",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 108,
      "comment": "\n *  Reporting interface for basic multivariate statistics.\n *\n * @since 1.2\n * @version $Revision: 480440 $ $Date: 2006-11-29 08:14:12 +0100 (mer., 29 nov. 2006) $\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getDimension()",
      "begin_line": 32,
      "end_line": 32,
      "comment": " \n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMean()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * mean of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component means\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getCovariance()",
      "begin_line": 46,
      "end_line": 46,
      "comment": " \n     * Returns the covariance of the available values.\n     * @return The covariance, null if no multivariate sample\n     * have been added or a zeroed matrix for a single value set.  \n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getStandardDeviation()",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * standard deviation of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component standard deviations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMax()",
      "begin_line": 62,
      "end_line": 62,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * maximum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component maxima\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMin()",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * minimum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component minima\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getN()",
      "begin_line": 75,
      "end_line": 75,
      "comment": " \n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getGeometricMean()",
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * geometric mean of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component geometric means\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSum()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component sums\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSumSq()",
      "begin_line": 99,
      "end_line": 99,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of squares of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component sums of squares\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSumLog()",
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of logs of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     * \n     * @return the array of component log sums\n     ",
      "child_ranges": []
    }
  ]
}
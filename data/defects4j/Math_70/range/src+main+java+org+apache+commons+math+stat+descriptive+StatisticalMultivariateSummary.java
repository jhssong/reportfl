{
  "filepath": "/tmp/Math-70b/src/main/java/org/apache/commons/math/stat/descriptive/StatisticalMultivariateSummary.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "StatisticalMultivariateSummary",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 27,
      "end_line": 120,
      "comment": "\n *  Reporting interface for basic multivariate statistics.\n *\n * @since 1.2\n * @version $Revision$ $Date$\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getDimension()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Returns the dimension of the data\n     * @return The dimension of the data\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMean()",
      "begin_line": 42,
      "end_line": 42,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * mean of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component means\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getCovariance()",
      "begin_line": 49,
      "end_line": 49,
      "comment": "\n     * Returns the covariance of the available values.\n     * @return The covariance, null if no multivariate sample\n     * have been added or a zeroed matrix for a single value set.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getStandardDeviation()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * standard deviation of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component standard deviations\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMax()",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * maximum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component maxima\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getMin()",
      "begin_line": 76,
      "end_line": 76,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * minimum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component minima\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getN()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Returns the number of available values\n     * @return The number of available values\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getGeometricMean()",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * geometric mean of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component geometric means\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSum()",
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component sums\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSumSq()",
      "begin_line": 109,
      "end_line": 109,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of squares of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component sums of squares\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.math.stat.descriptive.StatisticalMultivariateSummary.getSumLog()",
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Returns an array whose i\u003csup\u003eth\u003c/sup\u003e entry is the\n     * sum of logs of the i\u003csup\u003eth\u003c/sup\u003e entries of the arrays\n     * that correspond to each multivariate sample\n     *\n     * @return the array of component log sums\n     ",
      "child_ranges": []
    }
  ]
}